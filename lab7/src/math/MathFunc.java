package math;

public class MathFunc implements MathCalculable{
    @Override
    public double step(double ch, int step) {
        for(int i = 0; i<step; i++){
            ch*=ch;
        }
        return ch;
    }

    @Override
    public double abs(double ch) {
        return ch<0?-ch:ch;
    }

    @Override
    public double dlinOkr(double r) {
        return 2*PI*r;
    }

    @Override
    public double plOkr(double r) {
        return PI*step(r, 2);
    }
}
