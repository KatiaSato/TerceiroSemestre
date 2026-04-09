public class Producao extends Funcionario {
    private int horasTrabalhadasDia;
    private int horasTrabalhadasNoite;
    private Funcionario funcionario;

    public Producao() {
    }

    public Producao(int horasTrabalhadasDia, int horasTrabalhadasNoite, String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.horasTrabalhadasDia = 0;
        this.horasTrabalhadasNoite = 0;
    }

    public double getHorasTrabalhadasDia() {
        return horasTrabalhadasDia;
    }

    public void setHorasTrabalhadasDia(int horasTrabalhadasDia) {
        this.horasTrabalhadasDia = horasTrabalhadasDia;
    }

    public double getHorasTrabalhadasNoite() {
        return horasTrabalhadasNoite;
    }

    public void setHorasTrabalhadasNoite(int horasTrabalhadasNoite) {
        this.horasTrabalhadasNoite = horasTrabalhadasNoite;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public void registrarHorasDiurnas(double horas) {
        this.horasTrabalhadasDia += horas;
    }
    public void registrarHorasNoite(double horas) {
        this.horasTrabalhadasNoite += horas;
    }
        @Override
        public double salarioLiquido() {
        return horasTrabalhadasDia * getSalarioBase()+horasTrabalhadasNoite*getSalarioBase()*1.3;
    }

    @Override
    public double salarioLiquido(double salario) {
        return 0;
    }

    @Override
    public void novoMes() {
        horasTrabalhadasDia = 0;
        horasTrabalhadasNoite = 0;
    }

    @Override
    public Double getSalarioBase() {
        return super.getSalarioBase();
    }
     @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Horas diurnas"+horasTrabalhadasDia+"Horas noturnas"+horasTrabalhadasNoite);
    }
}
