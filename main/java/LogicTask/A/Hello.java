package LogicTask.A;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ваше имя?");
        String name=sc.next();
        System.out.println("Приветствую"+" "+name);
    }
}
