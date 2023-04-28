/**
 * 描述2维点
 * @author SeaStar
 */
public class point {
    final double x;
    final double y;

    public point(double x, double y){
    this.x = x;
    this.y = y;

    }
    public static void main(String[] args) {
    point p1 = new point(3.0,4.0);
        System.out.println(p1.x);
    }
}
