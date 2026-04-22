public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Katia", "Sato", "404016091");
        Funcionario funcionario2 = new Funcionario ("Leonardo", "Sibelula", "12345679");

        System.out.println(funcionario.nameLastName() + funcionario.lastNameName() + funcionario.lastNameDocument());
        System.out.println(funcionario2.nameLastName() + funcionario2.lastNameName() + funcionario2.lastNameDocument());
    }
}
