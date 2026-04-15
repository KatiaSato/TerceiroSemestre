package entities;

public class Fibonacci {
    long vet [] = new long[50];

    public Fibonacci(long[] vet) {
        this.vet = vet;
    }

    public long  fibonacci(int n){
        if(n<=1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
