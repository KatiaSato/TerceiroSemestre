/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;

/**
 *
 * @author katia
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarroConsignado cc = new CarroConsignado(15879, 1991, "Ford", "Katis", "Noel", 50.000);
        cc.imprimeDados();

        CarroProprio carroProprio = new CarroProprio(1587, 1990, "Toyota","Katia", 30.000, "20/01/2000");
        carroProprio.imprimeDados();

    }
}
