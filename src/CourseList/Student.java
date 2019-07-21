package CourseList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author : 猕猴桃
 * @create 2019/7/12 15:30
 */
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    public Set<Course> courses;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
        this.courses=new HashSet<Course>();
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
