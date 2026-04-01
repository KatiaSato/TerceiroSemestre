/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioprova;

/**
 *
 * @author katia
 */
public class ExercicioProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlunoAssistente alunAssistente = new AlunoAssistente("1235468", true, "Joaozinho", 1);
        alunAssistente.historico();
        
        AlunoRegular alunoRegular = new AlunoRegular("65", 10, 10, 2, "Maria", 20);
        alunoRegular.historico();
    }
    
}
