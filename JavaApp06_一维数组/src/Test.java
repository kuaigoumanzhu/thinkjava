public class Test {
    public static void main(String[] args){
        // 数组:相同数据类型的集合
        int int1;
        int int2;
        // 声明数组两种格式
        // 类型[] 数组名称;
        // 类型 数组名称[];
        int [] myIntArray;
        String [] myStringArray;
        char charArrary [];

        student [] studentArrary;
        // 创建格式:数组名称 = new 类型[数组大小]
        myIntArray = new int[9];
        myStringArray = new String[8];
        studentArrary = new student[7];
        // 使用：下标赋值
        myIntArray[0] = 1;// 数组中第一个元素赋值1
        System.out.println("myIntArray[0]="+myIntArray[0]);
        // 循环赋值
        int a [] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = i;
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    class student{
        String name;
        int no;
    }
}
