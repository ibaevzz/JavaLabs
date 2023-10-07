import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    }
    private static void massByFuncRandom(){
        int n = (int) (Math.random() * 20);

        double[] mass = new double[n];
        for(int i = 0; i<mass.length; i++){
            mass[i] = Math.random()*1000;
        }

        System.out.println(Arrays.toString(mass));

        for(int i = 0; i<mass.length; i++){
            for(int ii = 0; ii<mass.length-1; ii++){
                if(mass[ii]>mass[ii+1]){
                    double ch = mass[ii];
                    mass[ii] = mass[ii+1];
                    mass[ii+1] = ch;
                }
            }
        }

        System.out.println(Arrays.toString(mass));
    }
    private static void massByClassRandom(){
        Random rand = new Random();
        int n = rand.nextInt(20);

        double[] mass = new double[n];
        for(int i = 0; i<mass.length; i++){
            mass[i] = rand.nextDouble()*1000;
        }

        System.out.println(Arrays.toString(mass));

        for(int i = 0; i<mass.length; i++){
            for(int ii = 0; ii<mass.length-1; ii++){
                if(mass[ii]>mass[ii+1]){
                    double ch = mass[ii];
                    mass[ii] = mass[ii+1];
                    mass[ii+1] = ch;
                }
            }
        }

        System.out.println(Arrays.toString(mass));
    }
}