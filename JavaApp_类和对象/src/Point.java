public class Point {
    int x,y;
    void setX(int x) {
        // 前缀没有this的是参数，加this是类的变量
        this.x=x;
    }
    int getX(){
        return x;
    }
    void setY(int y) {
        // 前缀没有this的是参数，加this是类的变量
        this.y=y;
    }
    int getY(){
        return y;
    }
}

