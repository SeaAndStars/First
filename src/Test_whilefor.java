/**
 * @author SeaStar
 */
public class Test_whilefor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("#\t");
                }
            }
            System.out.println();

        }
    }
}




