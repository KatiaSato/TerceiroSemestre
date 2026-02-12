/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package primeiroprojetosemestre;

/**
 * Primeira aula do Semestre - Programação Orientada a Objetos 
 * @author katia
 */
public class PrimeiroProjetoSemestre {

    public static void main(String[] args) {
        //cria um instancia
        Aluno aluno = new Aluno();
        aluno.setNome("Katia");
        aluno.setRa("0040482421037");
        aluno.setFaltas(0);
        aluno.setMedia(10);
        
        aluno.print();
    }
}
