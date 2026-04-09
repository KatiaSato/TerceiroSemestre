package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        /*
        Sem a interface Comparable
         */
        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\katia\\Documents\\Projetos\\TerceiroSemestre\\poo_java\\Comparable\\nomes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine(); //Lê a linha do arquivo
            while (name != null) {
                list.add(name); //adiciono o valor na lista
                name = br.readLine(); //Lê a proxima linha
            }
            Collections.sort(list); //Ordena a lista
            for (String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /*
            Com a interface Comparable
        */
        System.out.println();

        List<Employee> employees = new ArrayList<>();
        String path2 = "C:\\Users\\katia\\Documents\\Projetos\\TerceiroSemestre\\poo_java\\Comparable\\employees.txt";

        try (BufferedReader br2 = new BufferedReader(new FileReader(path2))) {

            String employee = br2.readLine();
            while (employee != null) {
                String[] fields = employee.split(",");
                employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employee = br2.readLine();
            }
            Collections.sort(employees);
            for (Employee emp : employees) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
