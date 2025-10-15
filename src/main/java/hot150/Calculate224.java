package hot150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Time: 2025/10/8 18:16
 * @Author: guo_x
 * @File: Calculate224
 * @Description:
 */
public class Calculate224 {

    public int calculate(String s) {
        Stack<String> symbolStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();

        char[] charArray = s.toCharArray();

        List<String> list = new ArrayList<>();
        for (int i=0; i<charArray.length; i++){
            if (charArray[i] == '(' || charArray[i] == ')' || charArray[i] == '+'){
                list.add(String.valueOf(charArray[i]));
            }
            else if (charArray[i] == '-' && charArray[i+1] == '('){
                list.add(String.valueOf(charArray[i]));
            }
            else if (charArray[i] == ' '){
                continue;
            }
            else {
                if (charArray[i] == '-') {
                    symbolStack.push("+");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(charArray[i]);
                while(i+1 < charArray.length && charArray[i+1] >= '0' && charArray[i+1] <= '9'){
                    i++;
                    sb.append(charArray[i]);
                }
                list.add(sb.toString());
            }
        }

        for (int i=0; i<list.size(); i++){
            if (list.get(i).equals("+") || list.get(i).equals("-") || list.get(i).equals("(")){
                symbolStack.push(list.get(i));
            }
            else if (list.get(i).equals(")")){
                while(!symbolStack.peek().equals("(")){
                    int rightOpt = numStack.pop();
                    int leftOpt = numStack.pop();
                    String op = symbolStack.pop();
                    if ("+".equals(op)){
                        numStack.push(rightOpt + leftOpt);
                    }
                    else if ("-".equals(op)){
                        numStack.push(rightOpt - leftOpt);
                    }
                }
                symbolStack.pop();
            }
            else {
                if (symbolStack.isEmpty() || symbolStack.peek().equals("(")){
                    numStack.push(Integer.parseInt(list.get(i)));
                }
                else{
                    int leftOpt = numStack.pop();
                    String op = symbolStack.pop();
                    if ("+".equals(op)){
                        numStack.push(leftOpt + Integer.parseInt(list.get(i)));
                    }
                    else if ("-".equals(op)){
                        numStack.push(leftOpt - Integer.parseInt(list.get(i)));
                    }
                }
            }
        }

        if (!symbolStack.isEmpty()){
            String op = symbolStack.pop();
            int rightOpt = numStack.pop();
            int leftOpt = numStack.pop();
            if ("-".equals(op)){
                numStack.push(leftOpt - rightOpt);
            }
            else if ("+".equals(op)){
                numStack.push(leftOpt + rightOpt);
            }
        }
        return numStack.pop();
    }
}
