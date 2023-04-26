/**
 * 模拟网站的账户(用于测试方法的重载)
 */
public class User {
    int id;
    String uname;//username
    String pwd;//password
    User(){

    }
    public User(int _id){
        id = _id;
    }
    public  User(int _id, String _uname,String _pwd){
        id = _id;
        uname = _uname;
        pwd = _pwd;
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(1001);
        User u3 = new User(1002,"Happy","7355608");
    }
}
