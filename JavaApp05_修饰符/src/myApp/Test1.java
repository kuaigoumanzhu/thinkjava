package myApp;

public class Test1 {
    public static void main(String[] args){
        MyClass obj = new MyClass();
        // 实例方法和变量只能在创建出来的实例对象中调用
        obj.MyPublicMethod();
        obj.公共变量="abc";
        MyClass obj1 = new MyClass();
        obj1.公共变量 = "aaa";
        System.out.println("ojb="+obj.公共变量);
        System.out.println("ojb1="+obj1.公共变量);
        // 静态方法和静态变量不属于实例对象，使用时通过类名直接调用
        MyClass.静态变量 = "静态值";
        MyClass.MyStaticMethod();
        MyClass.静态变量 = "静态值1";
        MyClass.MyStaticMethod();

        抽象类 obj3 = new 抽象类的子类();
    }
}
