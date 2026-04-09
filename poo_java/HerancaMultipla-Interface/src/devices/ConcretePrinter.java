package devices;

//Herda de Device e implementa a interface Printer
public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processsing: " + doc);
    }
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
