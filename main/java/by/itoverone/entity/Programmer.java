package by.itoverone.entity;

import java.util.Objects;

public class Programmer extends by.itoverone.entity.Human {
    private String nameOfPr;
    private String prLang;
    private int yearsOfPro;

    public Programmer(String programmingLanguage) {
        prLang = programmingLanguage;
    }

    public Programmer(String programer, String programmingLanguage) {
        this.nameOfPr = programer;
        prLang = programmingLanguage;
    }


    public Programmer() {
    }

    public Programmer(int yearsOfPro) {
        this.yearsOfPro = yearsOfPro;
    }

    public String getPrLang() {
        return prLang;
    }

    public void setPrLang(String prLang) {
        this.prLang = prLang;
    }

    public int getYearsOfPro() {
        return yearsOfPro;
    }

    public void setYearsOfPro(int yearsOfPro) {
        this.yearsOfPro = yearsOfPro;
    }

    public String getNameOfPr() {
        return nameOfPr;
    }

    public void setNameOfPr(String nameOfPr) {
        this.nameOfPr = nameOfPr;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return yearsOfPro == that.yearsOfPro && Objects.equals(prLang, that.prLang);
    }
    @Override
    public int hashCode() {
        return Objects.hash(prLang, yearsOfPro);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "nameOfPr='" + nameOfPr + '\'' +
                ", prLang='" + prLang + '\'' +
                ", yearsOfPro=" + yearsOfPro +
                '}';
    }
}

