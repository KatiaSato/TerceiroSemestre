public class Funcionario extends Pessoa implements NameFormatInterface {

    public Funcionario(String nome, String sobrenome, String rg) {
        super(nome, sobrenome, rg);
    }

    @Override
    public String nameLastName() {
        return getNome() + " " + getSobrenome() + "\n";
    }

    @Override
    public String lastNameName() {
        return  getSobrenome() + ", " + getNome() + "\n";
    }

    @Override
    public String lastNameDocument() {
        return getSobrenome() + ": " + getRg() + "\n";
    }
}
