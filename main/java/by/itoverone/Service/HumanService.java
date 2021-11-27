package by.itoverone.Service;

import by.itoverone.entity.Human;
import by.itoverone.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class HumanService extends Human {
    public static void sortOfHumans(){
        Scanner sc=new Scanner(System.in);
        System.out.println("введите кол-во объектов в human");
        int n1 = sc.nextInt();
        ArrayList<Human> human1= new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            System.out.println("введите имя человека");
            String name = sc.next();
            human1.add(new Human(name));
        }

        System.out.println("имена людей,которые начинаются на букву В : ");
        for (int i = 0; i < n1; i++) {
            if (human1.get(i).getName().startsWith("В")) System.out.println(human1.get(i).getName());
        }

            for (int i = 0; i < n1; i++) {
                for (int j = 1; j < n1 - 1; j++) {
                    if (human1.get(j).getName().compareTo(human1.get(j+1).getName()) > 0) {
                        Human temp = human1.get(j);
                        human1.set(j, human1.get(j+1));
                        human1.set(j+1,temp);
                    }
                }
            }
        System.out.println("отсортированые по именам люди : ");
            for(int i=0;i< n1;i++){
                System.out.println(human1.get(i).getName());
            }

    }
    }

