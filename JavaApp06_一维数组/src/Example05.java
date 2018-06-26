public class Example05 {
    public static void main(String [] args){
        int [] firstArray = {1,2,3,6};
        int [] secondArray = {7,8,9};
        int [] myrray;
        // 引用传递（引用累心传递的是地址）
        // 操作时是同一个对象
        myrray = firstArray;

        System.out.println("原始数据=");
        for (int i=0;i<firstArray.length;i++){
            System.out.println("firstArray"+i+"="+firstArray[i]);
        }
        myrray[0] = 100;
        myrray[1] =200;
        System.out.println("第二次数据=");
        for (int i=0;i<firstArray.length;i++){
            System.out.println("firstArray"+i+"="+firstArray[i]);
        }
    }
}
