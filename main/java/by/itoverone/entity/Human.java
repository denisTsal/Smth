package by.itoverone.entity;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Human {
    private int id;
    private String name;
    private String gender;
    private int hei;
    private int len;


    public Human(int id) {
        this.id = id;
    }

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Human(int hei, int len) {
        this.hei = hei;
        this.len = len;
    }

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHei() {
        return hei;
    }

    public void setHei(int hei) {
        this.hei = hei;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && hei == human.hei && len == human.len && Objects.equals(name, human.name) && Objects.equals(gender, human.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, hei, len);
    }
}

