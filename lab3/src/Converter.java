public class Converter {
    private Currency currency;
    private double money;
    public Converter(double money, Currency currency){
        this.money = money;
        this.currency = currency;
    }
    public void convertToDollar(){
        switch(currency){
            case RUB:
                System.out.printf("%.3f", money/100);
                break;
            case EURO:
                System.out.printf("%.3f", money*0.94);
                break;
            case DOLLAR:
                System.out.printf("%.3f", money);
                break;
        }
    }
    public void convertToEuro(){
        switch(currency){
            case RUB:
                System.out.printf("%.3f", money*0.0094);
                break;
            case EURO:
                System.out.printf("%.3f", money);
                break;
            case DOLLAR:
                System.out.printf("%.3f", money/0.94);
                break;
        }
    }
    public void convertToRub(){
        switch(currency){
            case RUB:
                System.out.printf("%.3f", money);
                break;
            case EURO:
                System.out.printf("%.3f", money*107);
            case DOLLAR:
                System.out.printf("%.3f", money*100);
        }
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    public Currency getCurrency() {
        return currency;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public double getMoney() {
        return money;
    }
}