public enum Seasons {
    Winter(-20), Summer(30), Spring(20), Autumn(10);

    private final int temp;
    Seasons(int temp){
        this.temp = temp;
    }
    public int getTemp() {
        return temp;
    }
    public void getDescription(){
        if(this==Summer || this==Spring){
            System.out.println("Теплое время года");
        }else{
            System.out.println("Холодное время года");
        }
    }
}
