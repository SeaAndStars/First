package First.test.inherit;

public class Testoverride {
    public static void main(String[] args) {
     horse h1 = new horse();
     h1.run();
     plane p1 = new plane();
     p1.run();
     p1.stop();
    }
}
class Vehicle{
    public void run(){
        System.out.println("run...");
    }
    public  void  stop(){
        System.out.println("stop.....");
    }
}
class horse extends Vehicle{
    @Override
    public void run() {
        System.out.println("四蹄翻飞");
    }
}
class plane extends Vehicle{
    @Override
    public void run() {
        System.out.println("起飞");
    }

    @Override
    public void stop() {
        System.out.println("着陆");
    }
}