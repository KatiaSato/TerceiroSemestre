/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author katia
 */
public class Residencial extends Imovel{
    private int quartos, numVagasGaragem;
    private double valorMinimoVenda;
    private boolean dispVenda;

    public Residencial() {
    }

    public Residencial(int quartos, int numVagasGaragem, double valorMinimoVenda, boolean dispVenda, String endereco, String nomeProprietario, String corretor, int cep, double valorMinimo, boolean dispAluguel) {
        super(endereco, nomeProprietario, corretor, cep, valorMinimo, dispAluguel);
        this.quartos = quartos;
        this.numVagasGaragem = numVagasGaragem;
        this.valorMinimoVenda = valorMinimoVenda;
        this.dispVenda = dispVenda;
    }
    
    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getNumVagasGaragem() {
        return numVagasGaragem;
    }

    public void setNumVagasGaragem(int numVagasGaragem) {
        this.numVagasGaragem = numVagasGaragem;
    }

    public double getValorMinimoVenda() {
        return valorMinimoVenda;
    }

    public void setValorMinimoVenda(double valorMinimoVenda) {
        this.valorMinimoVenda = valorMinimoVenda;
    }
    
    public boolean vender(String corretor, double valor){
        
        if(dispVenda == true || valor < valorMinimoVenda){
            System.out.println("Nao esta disponivel para venda");
        }
        return false;  
    }
    public boolean disponivelVenda(){
       
            return true;
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de imovel Residencial\n"+
                            "Numero de quartos: " + quartos + "\n" +
                            "Numero da vagas de garagem: " + numVagasGaragem + "\n" +
                            "Valor minimo de venda: " + valorMinimoVenda + "\n" +
                            "Disponivel Venda: " + (dispVenda?"Sim":"Nao"));
        if(dispVenda == true)
            System.out.println("Corretor: " + super.getCorretor());
    }
}
