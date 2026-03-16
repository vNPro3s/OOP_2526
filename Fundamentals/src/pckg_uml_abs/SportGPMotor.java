package pckg_uml_abs;

public class SportGPMotor extends VehCommon{


    protected SportGPMotor(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startVeh() {
        System.out.println("Starting motor - " + this.id);
    }

    @Override
    public void stopVeh() {
        System.out.println("Stop motor - " + this.id);
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }

    @Override
    protected void chageTires() {
        System.out.println("Changing 2 tires!");
    }
}
