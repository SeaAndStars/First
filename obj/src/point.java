/**
 * 描述2维点
 */
public class point {
    final double x;
    final double y;

    public point(double _x, double _y){
    x = _x;
    y = _y;

    }
    public static void main(String[] args) {
    point p1 = new point(3.0,4.0);
        System.out.println(p1.x);
    }
}
