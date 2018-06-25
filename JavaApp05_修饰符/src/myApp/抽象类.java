package myApp;
// 抽象类可以没有抽象方法，类里有抽象方法必须是抽象类
public abstract class 抽象类 {
    // 不能被创建，只能被声明
    public String var1;
    public String var2;
    // 有方法体的方法
    public void 抽象类的tMethod(){

    }
    // 抽象的方法没有方法体,没有大括号，用分号结束，目的：规定子类的方法
    public abstract void abstractMethod();
}
