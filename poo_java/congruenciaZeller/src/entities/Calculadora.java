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
        if (!isDataValida(dia, mes, ano)) {
            throw new DataInvalidaException("Este dia não existe neste mês específico.");
        }
        int d = this.dia;
        int m = this.mes;
        int k = this.ano % 100;
        int j = this.ano / 100;

        if(mes == 1){
            m = 13;
            k = k -1;
        }
        else if(mes == 2){
            m = 14;
            k = k -1;
        }

        int h = (dia + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j));
        int resultado = ((h % 7) + 7) % 7;
        String[] dias = {
                "Sábado", "Domingo", "Segunda-feira",
                "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"
        };

        return dias[resultado];
    }
    private boolean isDataValida(int dia, int mes, int ano) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajuste para ano bissexto
        if (mes == 2 && (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))) {
            diasPorMes[2] = 29;
        }

        return dia <= diasPorMes[mes];
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
