import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseBaGuTest {


    /**
     * 测试八股第15页第21题, 3 * 0.1 与 0.3 是否相等
     */
    @Test
    public void Times_20_test(){
        System.out.println(3*0.1 == 0.3);
        // 解决方法: 通过断言的方式采用误差范围比较浮点数
        assertEquals(3 * 0.1, 0.3, 1e-9);
    }


    /**
     * 测试 try catch finally中含有return时的执行顺序
     * @return 测试结果
     */
    private String testTryCatchFinally(){
        try {
            System.out.println("try is running");
            return "try";
        } catch (Exception e){
            System.out.println("catch is running");
            return "catch";
        } finally {
            System.out.println("finally is running");
            // return "finally";
        }
    }


    @Test
    public void testTryCatchFinallyTest(){
        System.out.println("return : " + testTryCatchFinally());
    }
}
