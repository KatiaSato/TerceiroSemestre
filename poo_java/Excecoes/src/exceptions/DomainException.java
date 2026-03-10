package exceptions;
/*Excecao personalizada*/
public class DomainException extends Exception {
    /*"Exception: compilador obriga a tratar a excecao*/
    private static final long serialVersionUID = 1L;
    public DomainException(String message) {
        super(message);
    }
}
