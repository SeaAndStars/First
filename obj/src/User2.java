public class User2 {
    int id;
    String name;
    String pwd;
    public User2(){
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

    }


}
