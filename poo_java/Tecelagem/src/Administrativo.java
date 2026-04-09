public class Administrativo extends Funcionario {
    private int faltas;
    private Funcionario funcionario;

    public Administrativo() {}

    @Override
    public double salarioLiquido() {
        return 0;
    }

    @Override
    public double salarioLiquido(double salario) {
        return 0;
    }

    @Override
    public void novoMes() {

    }

    @Override
    public void hollerith() {

    }

    public Administrativo(int faltas, String nome, String rg, double salarioBase) {
        this.faltas = faltas;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public void registrarFalta (int faltas) {
        faltas ++;

    }

}
