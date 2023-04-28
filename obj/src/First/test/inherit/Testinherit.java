package First.test.inherit;

/**
 * 测试继承基本用法
 */
public class Testinherit {
    public static void main(String[] args) {
        student s = new student("Happy",175.5,"java");
        s.rest();
    }
}
class person{
    String name;
    double height;
    public void rest(){
        System.out.println("休息一下");
    }
}
class student extends person {


    String major;
    public student(String name,double height,String major){
        this.major = major;
        this.name = name;
        this.height = height;
//        this.rest();
    }



}
