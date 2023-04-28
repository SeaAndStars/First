/**
 * @author SeaStar
 */
public class student {
    int id;
    String name;
    int score;
    int age;
    public void study(){
        System.out.println(name+"正在学习");
    }

    public static void main(String[] args) {
        student stu01 = new student();
        student stu02 = new student();
        stu01.id = 1001;
        stu01.name = "Happy";
        stu01.score = 90;
        stu01.age = 18;


        stu02.id = 1002;
        stu02.name = "Happyn0body";
        stu02.score = 80;
        stu02.age = 19;


        stu01.study();
        stu02.study();
    }
}
