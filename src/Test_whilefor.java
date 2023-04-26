public class Test_whilefor {
    public static void main(String[] args) {
//        for(int i=0;i<6;i++){
//            for(int n=0;n<6;n++){
//                if(i%2==1&&n%2==1){
//                    System.out.print("*"+"\t");
//                }else if(i%2==1&&n%2==0){
//                    System.out.print("#"+"\t");
//                }else if (i%2==0&&n%2==1) {
//                    System.out.print("*"+"\t");
//                }else {
//                    System.out.print("#"+"\t");
//                }
//            }
//            System.out.println();
//        }
////         System.out.println();
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
//                if (i%2==1&&n%2==1){
//                System.out.println("*");}
//                else;{
//                System.out.println("#");}
    }
}




