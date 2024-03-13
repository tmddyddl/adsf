package 제네릭프린터;

public class GenericP {
    public static void main(String[] args) {
        GenericPrint<Powder> powderPrinter = new GenericPrint<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);
        System.out.println(powder);

        GenericPrint<Plastic> plasticPrint = new GenericPrint<>();
        plasticPrint.setMaterial(new Plastic());
        Plastic plastic = plasticPrint.getMaterial();
        System.out.println(powderPrinter);
    }
}
