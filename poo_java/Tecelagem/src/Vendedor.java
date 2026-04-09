public class Vendedor extends Funcionario {
   

    private double vendaMes;
    public Vendedor(){}

    @Override
    public double salarioLiquido() {
        return 0;
    }


    public Vendedor(double vendaMes, String nome, String rg, double salarioBase) {

        super(nome, rg, salarioBase);
        this.vendaMes = 0;
    }

    public double getVendaMes() {
        return vendaMes;
    }
    public void setVendaMes(int vendaMes) {
        this.vendaMes = vendaMes;
    }
    public void registrarVenda(double vendaMes) {

        this.vendaMes += vendaMes;

    }
    @Override
    public double salarioLiquido (double salario){
        return getSalarioBase()+vendaMes*0.03;
    }

    @Override
    public void novoMes() {
        vendaMes = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Vendas no mes"+vendaMes);
    }
}
