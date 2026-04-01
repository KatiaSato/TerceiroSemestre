/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author katia
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comercial comercial = new Comercial(45.000, "Av Faria Lima", "Katia", "Renato", 13471240, 150000, true );
        comercial.imprimir();
        
        Comercial comercial2 = new Comercial(45.000, "Av Paulista", "Leonardo", "Sibela", 15471240, 350000, false );
        comercial2.imprimir();
        
        Residencial residencial = new Residencial(2, 1, 150000, true, "Av Paulista", "Leonardo", "Sibela", 15471240, 350000, true);
        residencial.imprimir();
    }
    
    
}
