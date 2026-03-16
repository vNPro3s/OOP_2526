package pckg_static_cls;

public class Test {

    public static void main(String[] args) {
        USER us1 = new USER("IVANA", "ivana_123@gmail.com");
        System.out.println(us1);
        us1.performSomeStudyAction();
        AUX_CLS.printSomeMSG("This is good msg!!!!");
        SuperUser sup1 = new SuperUser("Petar Spasitelj", "petar.spasitelj@golmanipo.com", 23);
        System.out.println(sup1);
        sup1.performSomeStudyAction();
    }
}
