package pckg_uml_abs;

public class TestClient {

    public static void main(String[] args) {
        SportGPMotor mot1 = new SportGPMotor("Ducati", "H1000");
        SportCar spc = new SportCar("Mercedes", "SLK");
        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();

        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();
    }
}
