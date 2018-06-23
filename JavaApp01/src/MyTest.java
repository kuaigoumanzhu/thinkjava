public class MyTest {
    public static void main(String [] args){
        // 声明变量语法：类型、变量名称
        // 变量：保存数据的存储单元（容器）
        int i;
        int number = 123;
        String name = "java";
        String str;
        // 基本数据类型:原始数据类型，系统事先规定好的
        //   整型、浮点数、字符类型、布尔型
        // 非基本数据类型：由基本类型组合成的新类型，例如：数组、字符串、类、接口

        // 整型
        int int10 = -123;
        int int8 = 012;//八进制0开头 代表十进制的10
        System.out.println("int8="+int8);
        int int16 = 0xff;//16进制 255
        System.out.println("int16="+int16);
        byte byte1 = -128;//一个字节，-128到-127
        System.out.println("byte类型存储的最大值："+Byte.MAX_VALUE);//Byte包装类
        System.out.println("byte类型存储的最小值："+Byte.MIN_VALUE);
        short short1=4212; //2个字节
        System.out.println("short类型存储的最大值："+Short.MAX_VALUE);
        System.out.println("short类型存储的最小值："+Short.MIN_VALUE);
        int int1 = 2333; //4个字节
        System.out.println("int类型存储的最大值："+Integer.MAX_VALUE);
        System.out.println("int类型存储的最小值："+Integer.MIN_VALUE);
        long long1 = 33333;//八个字节
        System.out.println("long类型存储的最大值："+Long.MAX_VALUE);
        System.out.println("long类型存储的最小值："+Long.MIN_VALUE);

        //上溢或下溢
        int1 = Integer.MAX_VALUE+1;//超出最大值为上溢(就会变为最小值)
        System.out.println("int类型上溢"+int1);
        int1 = Integer.MIN_VALUE-1;//超出最小值为下溢（就会变为最大值）

//        浮点数类型：float 单精度浮点小数      double 双精度浮点小数
        float float1 = 233.343f; //不加符号会被当成double
        float float2 = 233.343F; //4个字节
        System.out.println("float类型存储的最大值："+Float.MAX_VALUE);
        System.out.println("float类型存储的最小值："+Float.MIN_VALUE);
        double double1 = 12.333;//八个字节
        double double2 = 12.333e2D;

        //布尔类型（逻辑）
        boolean bool1 = true; // 1个字节
        boolean bool2; //默认false
        // 字符（两个字节）可以转为int 0-65535
        char char1 = 'A';
        char char2 = '喔';
        char char回车= '\r'; //回车
        char char4单引号 = '\''; // '
        System.out.println("A的编码"+(int)char1);

        int A = char1; //隐式转换
        char1 = (char)A;// 丢失精度强制转换
        A = char1 + int1;
    }
}
