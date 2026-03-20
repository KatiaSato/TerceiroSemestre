import entities.Calculadora;
import exception.DataInvalidaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws DataInvalidaException {
        Scanner ler = new Scanner(System.in);
       try {
           System.out.print("Digite o dia: ");
           int dia = ler.nextInt();
           System.out.print("Digite o mes: ");
           int mes = ler.nextInt();
           System.out.print("Digite o ano: ");
           int ano = ler.nextInt();
        Calculadora calculadora = new Calculadora(dia, mes, ano);
           System.out.println(calculadora);

            String resultado = calculadora.diasDaSemana(dia, mes, ano);
        } catch (DataInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
        }catch (InputMismatchException e) {
           System.err.println("Digite um valor valido: " + e.getMessage());
           ler.nextLine();
       }catch (RuntimeException e) {
           System.err.println("Erro inesperado: " + e.getMessage());
       }
    }
}
