package Reflect;

/**
 * @author : 猕猴桃
 * @create 2019/7/30 9:27
 */
public class Person {
    //属性
    private String name;
    private String id;
    //无参构造方法
    public Person(){}
    //有参构造方法
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    //普通方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}
