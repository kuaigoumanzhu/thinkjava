/**
 * java 类和对象
 * 类定义
 * 1. 类声明
 * 2. 类的变量和成员
 * 3. 类的方法成员
 * 4. 类的构造方法
 * 5. 方法重载
 * 对象
 */
// 所有类都是Object的子类
public class Student {
    // 变量成员
    String name,sex,no;
    float height,weight;

    // 构造方法不谢默认是空的构造方法
    public Student(){
        // 构造方法不需要返回类型
        // 构造方法名称必须与类名相同
        // 构造函数（方法）
    }
    // 有参数构造方法会替换空构造方法（不写空构造方法时）
    Student(String name,String sex,String no){
        // 构造方法重载
        this.name=name;
        this.sex = sex;
        this.no = no;
    }
    public void Student(){
        // 只是一个普通的方法
    }
    //方法
    void setStudent(String name,String sex,String no){
        this.name=name;
        this.sex = sex;
        this.no = no;
    }
    public static void main(String[] args){
        A obj;
        // 类的主要成员：变量成员、方法成员、
    }
}
//  不能实例化
abstract class A{

}
//
class B {

}
