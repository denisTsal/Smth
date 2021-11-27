package LogicTask.A;

public class A {
    public static void Task2(){
        int b=5;
        int c=5;;
        int a= 4*(b+c-1)/2;
        System.out.println(a);
    }
    public static void Task3(){
        int n=99;
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void Task4(){
        double n=5.3;
        System.out.println(Math.round(n));
    }
    public static void Task5(){
        int q=21;
        int w=5;
        System.out.println(q/w+" "+"остаток"+" "+q%w);
    }

}
