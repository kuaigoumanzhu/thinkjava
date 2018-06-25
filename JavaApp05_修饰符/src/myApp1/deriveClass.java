package myApp1;

import myApp.MyClass;

// 子类 派生类
public class deriveClass extends MyClass {
    public void 子类的方法(){
        // 公共
        this.MyPublicMethod();
        // 不同包下的子类可访问
        this.MyProtectedMethod();
    }


    @Override
    // 重写父类方法
    protected synchronized void MyProtectedMethod() {
        super.MyProtectedMethod();
    }

    // 父类方法加final修饰符后，子类不能再重写
}
