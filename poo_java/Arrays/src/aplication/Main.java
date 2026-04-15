package aplication;

import entities.Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long vetor[] = new long[50];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        long n1 = input.nextLong();
        Fibonacci fibonacci = new Fibonacci(vetor);

        for (int i = 0; i <= n1; i++) {
            vetor[i] = fibonacci.fibonacci(i);
            System.out.println(vetor[i]);
        }
    }
}
