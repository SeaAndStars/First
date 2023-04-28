public class teststatic {
    int id;
    static String Company = "Happy";
     static void printcompany(){
         System.out.println(Company);
     }
     static {
         System.out.println("类被初始化时调用");
     }
     void login(){
         System.out.println("Login Successful");
     }

    public static void main(String[] args) {
        teststatic.printcompany();

        teststatic t1 = new teststatic();
        t1.login();
    }
}
