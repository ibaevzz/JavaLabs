package computer.monitor;

public class Monitor {
    private BrandMonitor brand;
    public Monitor(BrandMonitor brand){
        this.brand = brand;
    }

    public void setImage(){
        System.out.println("Изображение выведено на монитор");
    }

    public BrandMonitor getBrand() {
        return brand;
    }
    public void setBrand(BrandMonitor brand) {
        this.brand = brand;
    }
}
