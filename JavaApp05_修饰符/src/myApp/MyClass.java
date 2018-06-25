package myApp;

// final 类不能被继承 扩展

public class MyClass {
    // 实例变量
    // 私有变量
    private String 私有变量;// 最小范围，当前类内部可以访问
    public String 公共变量;// 最大范围
    protected String 受保护的变量;// 同包下的类，和不同包的子类
    String 默认包变量; // 自己类中和同包下的类
    // 静态变量也是全局变量
    public static String 静态变量;
    // 用在变量上表示常量，一经赋值，不能改变
    public final double Pi = 3.1415926;

    // 静态方法
    public static void MyStaticMethod(){
        System.out.println("我的Static方法被调用，静态变量值="+静态变量);
    }

    // 实例方法
    public void  MyPublicMethod(){
        System.out.println("我的public方法被调用");
    }

    private void  MyPrivateMethod(){
        System.out.println("我的Private方法被调用");
    }

    void  MyDefaultMethod(){
        System.out.println("我的Default方法被调用");
    }
    // 表示同步 多次调用锁
    protected synchronized void  MyProtectedMethod(){
        System.out.println("我的proctected方法被调用");
    }
    // 不能被子类重写
    public final void 我的final实例方法(){
        //
    }
}
// 不能被继承
final class MyClass2{

}
