package pckg_uml;

public class SportCar extends Vehicle{

    public SportCar(String model, String brand){
        super(model, brand);
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting in specific way: " + this.getClass().getSimpleName() + ": " + this.vehID);
    }

    @Override
    public String toString() {
        return "SportCar - {" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", date='" + date + '\'' +
                ", vehID=" + vehID +
                '}';
    }
}
