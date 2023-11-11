public class Main {
    public static void main(String[] args) {

    }

    public static void tPosl(int n, int s){
        if(n<=0) return;
        for(int i = 0; i<Math.min(n, s); i++){
            System.out.print(s+" ");
        }
        tPosl(n-s, s+1);
    }

    public static void printN(int s, int n){
        if(n<s) return;
        System.out.println(s);
        printN(s+1, n);
    }

    public static void printAB(int a, int b){
        if(a==b){
            System.out.println(b);
            return;
        }
        System.out.println(a);
        printAB(a<b?a+1:a-1, b);
    }

    public static int sum(int n){
        if(n==0) return 0;
        for(int i = 1;;i*=10){
            if(n/i==0){
                return Math.abs(n/(i/10))+sum(n%(i/10));
            }
        }
    }
}
