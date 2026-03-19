package Aplication;

import entities.Circulo;
import entities.Ponto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite um ponto: ");
        int x = ler.nextInt();
        System.out.println("Digite um ponto: ");
        int y = ler.nextInt();
        Ponto ponto = new Ponto(x,y);

        System.out.println(ponto);*/

        Circulo circulo = new Circulo();
        circulo.print();
        System.out.println("Area de circulo: " + circulo.area());
        System.out.println("Perimetro do circulo: " + circulo.perimetro());
    }
}
