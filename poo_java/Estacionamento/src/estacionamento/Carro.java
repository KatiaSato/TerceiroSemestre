/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author katia
 */
public abstract class Carro {
    private int placa;
    private int anoFabricacao;
    private String model, vendedor;
    private boolean disponivel;

    public Carro() {
    }

    public Carro(int placa, int anoFabricacao, String model, String vendedor) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.model = model;
        this.vendedor = vendedor;

        disponivel = true;
        vendedor  = "";
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public boolean disponivel() {
        return true;
    }

    public void imprimeDados() {
        System.out.println("Placa: " + placa + "Ano de Fabricacao: " + anoFabricacao + "Model: " + model + "Disponivel: " + (disponivel?"Sim":"Nao"));
        if (disponivel == true) {
            System.out.println("vendido" + vendedor);
        }
    }

    public abstract boolean oferta(double valor);

    public boolean venderCarro(String vendedor, double valorVenda, double valor) {
        if (!disponivel) return false;
        if(!oferta(valorVenda)) return false;
        disponivel = false;
        this.vendedor = vendedor;
        return true;
    }
}
