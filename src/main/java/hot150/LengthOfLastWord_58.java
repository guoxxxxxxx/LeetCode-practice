package hot150;

public class LengthOfLastWord_58 {

    public int lengthOfLastWord(String s) {
        String[] split = s.split(" +");
        return split[split.length - 1].length();
    }
}
