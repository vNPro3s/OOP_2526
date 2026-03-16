package pckg_uml_abs;

public class TestClient {

    public static void main(String[] args) {
        SportGPMotor mot1 = new SportGPMotor("Ducati", "H1000");
        SportCar spc = new SportCar("Mercedes", "SLK", new Driver("Luka"));
        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();
        mot1.chageTires();

        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();
        spc.chageTires();
    }
}
