import entities.Calculadora;
import entities.DataInvalidaException;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws DataInvalidaException {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = ler.nextInt();
        System.out.print("Digite o mes: ");
        int mes = ler.nextInt();
        System.out.print("Digite o ano: ");
        int ano = ler.nextInt();
        Calculadora calculadora = new Calculadora(dia, mes, ano);
        try {
            String resultado = calculadora.diasDaSemana(dia, mes, ano);
        } catch (DataInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        System.out.print(calculadora.diasDaSemana(dia, mes, ano) + ", " + calculadora.getDia() + " de " + calculadora.nomeMes(mes)
                + " de " + calculadora.getAno());
    }
}
