import javax.swing.*;
import java.util.Arrays;

public class lotteryDrawing {
    public static void main(String [] args){
        String input = JOptionPane.showInputDialog("请输入数组的大小");
        int arrNum = Integer.parseInt(input);
        int [] randomArray = new int[arrNum];
        input = JOptionPane.showInputDialog("请输入随机数最大值");
        int max = Integer.parseInt(input);
        for(int i=0;i<randomArray.length;i++){
            randomArray[i] = (int)(Math.random()*max);
        }
        System.out.println("初始状态");
        for(int i=0;i<randomArray.length;i++){
            System.out.println("随机数["+i+"]"+randomArray[i]);
        }
        System.out.println("排序后");
        Arrays.sort(randomArray);
        for(int i=0;i<randomArray.length;i++){
            System.out.println("随机数["+i+"]"+randomArray[i]);
        }
    }
}
