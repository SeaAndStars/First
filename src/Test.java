public class Test {
    public static void main(String[] args) {
    int score = (int)(Math.random()*100);
        System.out.println("分数:"+score);
    if  (score<60){
        System.out.println("不及格");
    }else if (score<70){
        System.out.println("一般");
    } else if (score<80) {
        System.out.println("良好");
    } else if (score<90) {
        System.out.println("优秀");
    }else {
        System.out.println("天才");}
    }
}