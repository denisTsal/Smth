package LogicTask.B;

import java.util.Scanner;

public class B {
    public static void Task1(){
        int a=1;
        while(a<=10){
            if(a%2==0){
                System.out.println(a+" четное");
            }
            else{
                System.out.println(a+" нечетное");
            }
            a++;
        }
    }
    public static void Task2(){
        int a=1;
        while(a<=7){
            System.out.println(a);
            a+=3;
        }
    }
    public static void Task3(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fac=1;
        for(int i=1;i<=a;i++){
            fac*=i;
        }
        System.out.println(fac);
    }
    public static void Task4(){
        int n=1;
        int counter=1;
        do{
           n*=2;
           System.out.println(n);
           counter++;
        }while(counter<=10);
    }
    public static void Task5(){
        int sum=0;
        for(int i=-20;i<=20;i++){
            if(i%2==0){
                sum+=i;
            };
        }
        System.out.println(sum);
    }

}
