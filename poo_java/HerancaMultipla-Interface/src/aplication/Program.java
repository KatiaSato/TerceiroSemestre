package aplication;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter printer = new ConcretePrinter("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");
        System.out.println();
        ConcreteScanner scan = new ConcreteScanner("2002");
        scan.processDoc("My Email");
        System.out.println("Scan result: " + scan.scan());
        System.out.println();
        ComboDevice combo = new ComboDevice("123");
        combo.print("My dissertation");
        combo.processDoc("My dissertation");
        System.out.println("Combo result: " + combo.scan());
    }
}
