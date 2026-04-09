public class Tecelagem {
    public static void main(String[] args) {
        Administrativo administrativo = new Administrativo(3, "Katia", "404016091", 3000);
        Producao producao = new Producao(40, 40, "Katia", "404016091", 3000);
        Vendedor vendedor = new Vendedor(5000, "Katia", "404016091", 3000);

        System.out.println(administrativo);
        System.out.println(producao);
        System.out.println(vendedor);

        producao.hollerith();
        vendedor.hollerith();
    }
}
