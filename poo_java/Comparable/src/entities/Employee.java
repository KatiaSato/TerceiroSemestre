package entities;
/*Implementa a interface Comparable
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        /*usa o metodo da interface Comparable<T> para comparar os valores de uma lista, talvez uma
        analogia ao strcmp() do C.
        Para comparar por ordem descrescente, basta colocar o sinal "-" antes do objeto que
        quer comparar.
         */
        return name.compareTo(other.getName());
    }
}
