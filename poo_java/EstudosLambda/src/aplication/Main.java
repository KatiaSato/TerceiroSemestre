package aplication;

import entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Estrutura lambda

        (argumento) -> expression               um argumento
        (argumento, argumento) -> expression    dois ou mais argumentos
        () -> expression {bloco}                nenhum argumento/ pode ter ter bloco de codigo se precisar
         */

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Raziel", 2000));
        clientes.add(new Cliente("Vorador", 2500));
        clientes.add(new Cliente("Kain", 3000));
        clientes.add(new Cliente("Juan", 4000));
        clientes.add(new Cliente("Ariel", 3030));

        clientes.forEach(c -> System.out.println(c.getNome()));

        /*
        Esta filtrando a lista de clientes por idade e retornando a quantidade
         */
        long v = clientes.stream().filter(c -> c.getIdade() < 3000).count();
        System.out.println(v);
    }
}
