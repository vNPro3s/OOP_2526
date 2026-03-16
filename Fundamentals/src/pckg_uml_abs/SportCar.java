package pckg_uml_abs;

public class SportCar extends VehCommon{

    private Driver driver;
    protected SportCar(String brand, String model, Driver driver) {
        super(brand, model);
        this.driver = driver;
    }

    @Override
    public void startVeh() {
        System.out.println("Starting in specific way: " + this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void stopVeh() {
        System.out.println("Stop in specific way: " + this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }

    @Override
    protected void chageTires() {
        System.out.println("Changing 4 tires!!!");
    }
}
