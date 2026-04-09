package devices;

import java.awt.print.Printable;

//Essa classe herda de Device e implementa as interfaces Scanner e Printer
public class ComboDevice extends Device implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo Scan result";
    }
}
