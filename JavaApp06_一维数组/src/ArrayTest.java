public class ArrayTest {
    public static void main(String[] args){
        // 静态初始化
        int [] myIntArray = {1,2,3,4,5,8,2,5};
        System.out.println(myIntArray[2]);
        // 动态初始化
        int [] myIntArray2 = new int [10];
        for(int i=0;i<myIntArray2.length;i++){
            // 可以使用根据类型默认赋值
            System.out.println(myIntArray2[i]);
        }
        boolean [] myArrayBool = new boolean[5];
        for(int i=0;i<myArrayBool.length;i++){
            System.out.println(myArrayBool[i]);
        }
        // 对象类型默认都是null，基本数据类型根据类型初始化
    }
}