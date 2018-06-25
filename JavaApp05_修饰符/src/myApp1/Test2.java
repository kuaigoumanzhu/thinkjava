package myApp1;

import myApp.MyClass;

public class Test2 {
    public static void main(String [] args){
        MyClass obj = new MyClass();
        // 不同包下public可用
        obj.MyPublicMethod();
    }
}
