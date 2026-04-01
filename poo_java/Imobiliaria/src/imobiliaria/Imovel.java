/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author katia
 */
public abstract class Imovel {
    private String endereco, nomeProprietario, corretor;
    private int cep;
    private double valorMinimo;
    private boolean dispAluguel;

    public Imovel() {
    }

    public Imovel(String endereco, String nomeProprietario,String corretor, int cep, double valorMinimo, boolean dispAluguel) {
        this.endereco = endereco;
        this.nomeProprietario = nomeProprietario;
        this.cep = cep;
        this.valorMinimo = valorMinimo;
        this.dispAluguel = dispAluguel;
        this.corretor = corretor;
    }

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }
    
    public boolean alugar (String corretor, double valor){
        if(dispAluguel == true){
            corretor = this.corretor;
        }
        if(dispAluguel == false || valor < valorMinimo){
            System.out.println("Nao esta disponivel para aluguel");
        }
        return false;
    }
    public boolean cancelarAluguel(){
        if(dispAluguel == false){
            dispAluguel = true;
            return true;
        }
        System.out.println("Erro! Imovel ja disponivel");
        return false;
    }
    public boolean disponivelAluguel(){
         return true;
    }
    public void imprimir(){
        System.out.println("Endereço: " + endereco +
                            "CEP: " + cep + 
                            "Nome do proprietario: " + nomeProprietario +
                            "Valor ALuguel: " + valorMinimo +
                            "Disponivel: " + (dispAluguel?"Sim":"Nao"));
        if(dispAluguel == true){
            System.out.println("Corretor: " + corretor);
        }
    }
}
