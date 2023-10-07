import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for(String str: args){
            System.out.println(str);
        }
    }

    private static void sum(){
        System.out.println("Количество элементов");
        int[] mass = new int[sc.nextInt()];
        for(int i = 0; i< mass.length; i++){
            mass[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i: mass){
            sum+=i;
        }
        System.out.println("Сумма: "+sum+"\n"+"Среднее арифметическое :"+ (double) sum /mass.length);
    }

    private static void maxAndMin(){
        System.out.println("Количество элементов");
        int[] mass = new int[sc.nextInt()];
        for(int i = 0; i< mass.length; i++){
            mass[i] = sc.nextInt();
        }

        int sum = 0;
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        do{
            min = Math.min(mass[i], min);
            max = Math.max(mass[i], max);
            sum+=mass[i];
            i++;
        }while(i<mass.length);
        System.out.println("Сумма: "+sum+ "\n" +
                "Min: "+min+"\n"+
                "Max: "+max);
    }

    private static void garmon(){
        for(int i = 1; i<=10; i++){
            System.out.printf("%.2f", 1.0/i);
            System.out.println();
        }
    }

    private static void factorial(){
        int n = sc.nextInt();

        int f = 1;
        for(int i = 2; i<=n; i++){
            f*=i;
        }
        System.out.println(f);
    }
}