package aplication;

import entities.Printer;
import entities.Scanner;

public class Program {
    public static void main(String[] args) {
        Printer printer = new Printer("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");
        System.out.println();
        Scanner scan = new Scanner("2002");
        scan.processDoc("My Email");
        System.out.println("Scan result: " + scan.scan());
    }
}
