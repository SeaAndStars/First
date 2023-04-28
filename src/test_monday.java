/**
 * @author SeaStar
 */
public class test_monday {
    public static void main(String[] args) {
        int week = (int) (Math.random() * 8);
        System.out.println("今天是星期" + week);
        switch (week) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
                break;


        }
    }
}
