package file;

import java.io.Serializable;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 10:19
 */
public class Student implements Serializable {
    private String number;
    private String name;
    private int grade;


    public Student() {
    }
    public Student(String n,String na,int g){
        super();
        this.number=n;
        this.name=na;
        this.grade=g;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [stuno="+number+"stuname="+name+"stugrade="+grade+"]";
    }
}
