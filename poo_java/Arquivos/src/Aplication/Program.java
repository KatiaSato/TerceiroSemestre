package Aplication;

import entities.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List <Products> products = new ArrayList<>();
        System.out.println("Enter file path: ");
        String path = sc.nextLine();
        File file = new File(path);
        String sourceFolder = file.getParent();

        boolean success = new File(sourceFolder + "\\out").mkdir();
        String targetFolder = sourceFolder + "\\out\\summary.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String csv = br.readLine();
            while (csv != null) {
                String[] line = csv.split(",");
                String name = line[0];
                double price = Double.parseDouble(line[1]);
                int quantity = Integer.parseInt(line[2]);
                products.add(new Products(name, price, quantity));


                csv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFolder))) {
                for (Products p : products) {
                    bw.write(p.getName() + "," + String.format("%.2f", p.totalPrice()));
                    bw.newLine();
                }
                System.out.println("Created" + targetFolder);
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }

        sc.close();
    }
}
