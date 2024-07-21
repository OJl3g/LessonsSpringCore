package org.ojl3g.lessonsspringcore.springCreateBean;

public class Student {
    private int id;
    private int group;
    private String name;
    private String lastName;

    public Student(int id, int group, String name, String lastName) {
        this.id = id;
        this.group = group;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", group=" + group +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
