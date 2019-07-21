package CourseList;

import java.util.Objects;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 15:30
 */
public class Course {
    private int num;
    private String name;

    public Course(int num,String name){
        this.num=num;
        this.name=name;
    }
    public Course(){}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getName().equals(course.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
