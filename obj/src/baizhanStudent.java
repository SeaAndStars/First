public class baizhanStudent {
    int id;
    String sname;
    int age;
    Computer computer;
    void study(){
        System.out.println("我正在学习，使用的电脑是："+computer.brand);
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.brand ="联想";
        c1.price = 6000;

        Computer c2 = new Computer();
        c2.brand = "戴尔";
        c2.price = 5000;

        baizhanStudent stu01 = new baizhanStudent();
        stu01.id = 1001;
        stu01.sname = "Happy";
        stu01.age = 18;
        stu01.computer = c1;

        stu01.study();

    }
}
