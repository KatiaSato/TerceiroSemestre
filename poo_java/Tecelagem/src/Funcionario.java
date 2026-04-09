public abstract class Funcionario {
    private String nome;
    private String rg;
    private Double salarioBase;

    public Funcionario() {
    }
    public Funcionario(String nome, String rg, Double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double salarioLiquido();
    public void hollerith(double salarioBase) {
        System.out.println("Nome"+rg + "RG"+nome + "Salario Base"+salarioBase + "Salario Liquido" + salarioLiquido());
    }

    public abstract double salarioLiquido(double salario);

    public abstract void novoMes();

    public void hollerith() {
    }
}
