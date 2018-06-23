import java.math.*;

public class Test03 {
    public static void main(String[] args){
        float f1 = 123.01f+2.01f;
        System.out.println("f1="+f1);// 不精确
        // double类型
        System.out.println(123.01+2.01);
//        高精度数字
        高精度整数测试();
        高精度小数测试();
    }
    public static void 高精度整数测试(){
        BigInteger bint1 = new BigInteger("125");
        BigInteger bint2 = new BigInteger("999");
        BigInteger result = bint1.add(bint2);
        System.out.println("高精度"+result);
        result = bint2.subtract(bint1);
        System.out.println("高精度减"+result);
        result = bint1.multiply(bint2);
        System.out.println("高精度乘"+result);
        result = bint2.divide(bint1);
        System.out.println("高精度除"+result);
    }
    public static void 高精度小数测试 () {
        BigDecimal bdl = new BigDecimal(123.01);
        BigDecimal bd2 = new BigDecimal(2.01);
        bdl.setScale(5,5);
        bd2.setScale(5, RoundingMode.CEILING);
        BigDecimal result;
        result = bdl.add(bd2).setScale(5,RoundingMode.DOWN);
        System.out.println("加="+result);
    }
}
