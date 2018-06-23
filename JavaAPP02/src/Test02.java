public class Test02 {
    public static void main(String [] args) {
//        八个基本数据类型包装器
        char a = 'h';
        Character cobj = a; //自动装箱
        //每一个对象都有自己的方法拆箱装箱
        a=cobj.charValue();
        a = cobj;// 自动拆箱
        byte b= 6;
        Byte bobj;
        int i = 100;
        Integer iobj ;
        long l= 555L; // 不加L当成int类型
        Long lobj;
        float f =8.99f; // 不加f当成double
        double d =4.433;
        short s=22;
        boolean bool=true;

        int aa = a+i;// 转换为int char2字节，int4字节
        long ll = l-aa; //
        float ff =f*b;
        double dd = d/aa+d;
        System.out.println("aa="+aa);
        System.out.println("ll="+ll);
        System.out.println("ff="+ff);
        System.out.println("dd="+dd);

//        强制类型转换
        long lll = (int)l-aa; //可能丢失精度
    }
}
