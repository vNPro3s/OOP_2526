package pckg_poli_dynamic;

public class Tiger extends Animal{

    @Override
    public void makeSomeSound(){
        super.makeSomeSound();
        System.out.println("Additionaly " + this.getClass().getSimpleName() + " produces some ROARRROARRRRRRR!");
    }
}
