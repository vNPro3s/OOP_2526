package pckg_uml_abs;

public class SportCar implements Veh{

    private static int  cntID = 20;
    private int id;
    private String brand;
    private String model;

    public SportCar(String brand, String model){
        this.id = cntID++;
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void startVeh() {
        System.out.println("Starting in specific car way: " + this.getClass().getSimpleName() + "- " + this.id);
    }

    @Override
    public void stopVeh() {
        System.out.println("Stop in specific car way: " + this.getClass().getSimpleName() + "- " + this.id);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }
}
