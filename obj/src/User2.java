/**
 * @author SeaStar
 */
public class User2 {
    int id;
    String name;
    String pwd;
    public User2(){
    }
    public User2(int id, String name, String pwd){
        this(id, name);
        this.pwd = pwd;
    }

    public User2(int id,String name){
        this.id =id;
        this.name = name;
    }
    public void show(){
        System.out.println("登录名:"+this.name+"\tid:"+this.id+"\t密码"+this.pwd);
    }

    public static void main(String[] args) {
        User2 u = new User2(100,"海星");
        u.show();
        User2 u0 = new User2(101,"happy","123456");
        u0.show();

    }


}
