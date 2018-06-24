public class BankAccouont {
    // 私有的
    private double yue;
    // 构造方法
    public BankAccouont(double chuShiYeE){
        yue = chuShiYeE;
    }
    public BankAccouont(){
        yue=0;
    }
    // 方法成员
    public void CunQian(double cunKuanJinE){
        yue+=cunKuanJinE;
        System.out.println("你存入了"+cunKuanJinE+"元,现金额是："+yue);
    }
    public void QuKuan(double quKuanJinE){
        if(yue>=quKuanJinE){
            yue-=quKuanJinE;
            System.out.println("你取了"+quKuanJinE+"元,现金额是："+yue);
        }else {
         System.out.println("余额不足不能取款");
        }
    }

    public void ChaKanYuE(){
        System.out.println("你的余额："+yue);
    }
    public static void main(String[] args){
        BankAccouont accouont = new BankAccouont(10);
        accouont.QuKuan(100);
        accouont.CunQian(1000);
        accouont.ChaKanYuE();
        accouont.QuKuan(100);
    }
}
