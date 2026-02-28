package entities;

public class Calculadora {
    private int dia;
    private int mes;
    private int ano;
    public Calculadora(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String diasDaSemana (int dia, int mes, int ano)throws DataInvalidaException{
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            throw new DataInvalidaException("Data fora dos limites reais.");
        }
        int d = this.dia;
        int m = this.mes;
        int a = this.ano;
        if(mes == 1){
            m = 13;
            a --;
        }
        else if(mes == 2){
            m = 14;
            a --;
        }
        int k = a % 100;
        int j = a / 100;
        int h = (dia + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j));
        System.out.println(h);
        int resultado = ((h % 7) + 7) % 7;
        System.out.println(h);
        System.out.println(resultado);
        String[] dias = {
                "Sábado", "Domingo", "Segunda-feira",
                "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"
        };
        return dias[resultado];
    }
    public String nomeMes (int mes) {
        String [] meses = {
                "", "Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"
        };
        return meses[mes];
    }
}
