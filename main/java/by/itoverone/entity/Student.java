package by.itoverone.entity;

import java.util.*;

public class Student extends by.itoverone.entity.Human {
    private int group;
    private Map<String, List<Integer>> marks;
    private String speciality;



    public Student(int group) {
        this.group = group;
    }

//    public Student(int id, Map<String, ArrayList<Integer>> marks, String speciality) {
//        super(id);
//        this.marks = marks;
//        this.speciality = speciality;
//    }

    public Student() {
    }
//        public Student(String name,Map<String, ArrayList<Integer>> marks) {
//        this.name = name;
//        this.marks=marks;
//    }


    public Student(String name, Map<String, List<Integer>> marks) {
        super(name);
        this.marks = marks;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

//    public Map<String, ArrayList<Integer>> getMarks() {
//        return marks;
//    }

//    public void setMarks(Map<String, ArrayList<Integer>> marks) {
//        this.marks = marks;
//    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Student student = (Student) o;
//        return group == student.group && Objects.equals(name, student.name) && Objects.equals(marks, student.marks) && Objects.equals(speciality, student.speciality);
//    }
    public Map<String, List<Integer>> getMarks(){
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", group=" + group +
          ", marks=" + marks +
                ", speciality='" + speciality + '\'' +
                '}';
    }


}


