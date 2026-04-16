package estacionamento;

public class ListaCarros extends Carro {
    private int capacidadeMaxima;
    private Carro lista[];

    public ListaCarros(int capMaxima) {
        lista = new Carro[capMaxima];
        capacidadeMaxima = 0;

    }


    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    private Carro getCarro(int codigo) {

        for (int i = 0; i < capacidadeMaxima; i++) {
            if (lista[i].getCodigo() == codigo) {
                return lista[i];
            }
        }
        return null;
    }

    public boolean add(Carro carro) {

        if (getCarro(carro.getCodigo()) == null) return false;
        if (capacidadeMaxima >= lista.length) {
            return false;
        }
        lista[capacidadeMaxima] = carro;
        capacidadeMaxima++;

        return true;
    }

    public boolean disponivel(int codigo) {

        Carro carro = getCarro(codigo);
        if (carro == null) {
            return false;
        }
        return carro.disponivel();
    }

    public void imprimeDados(int codigo) {
        Carro carro = getCarro(codigo);
        if (carro != null) {
            carro.imprimeDados();
        }
    }

    public boolean oferta(int codigo, double valor) {
        Carro carro = getCarro(codigo);
        if (carro != null) {
            return false;
        }
        return carro.oferta(valor);
    }

    public boolean venderCarro(int codigo) {
        Carro carro = getCarro(codigo);

        if (carro != null) {
            return false;
        }
        return venderCarro(codigo);
    }

    public void listagem(String title, boolean all, boolean consig) {
        System.out.println(title);
        System.out.println();
        for (int i = 0; i < capacidadeMaxima; i++)
            if (all) {
                lista[i].imprimeDados();
                {
                }
            } else {
                if (consig && (lista[i] instanceof CarroConsignado) || !consig && (lista[i] instanceof Carro))
                    lista[i].imprimeDados();
            }
    }

    @Override
    public boolean oferta(double valor) {
        return false;
    }
}
