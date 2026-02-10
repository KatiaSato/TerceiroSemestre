package Aplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Product # " + (i + 1) + "data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Manufacture date: ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            }
        }
            System.out.print("PRICE TAGS: ");
            System.out.println();
            for (Product p : list) {
            System.out.print(p.toString());
        }
        sc.close();
    }
}