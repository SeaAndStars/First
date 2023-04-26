public class person {
    String name;
    int age;

    public void show(){
        System.out.println("姓名:"+name+"\t年龄:"+age);
    }
    person(String _name,int _age){
        name = _name;
        age = _age;
    }
    public static void main(String[] args) {
        person p1 = new person("张三",18);
        person p2 = new person("李四",30);

        p1.show();
        p2.show();
    }
}
