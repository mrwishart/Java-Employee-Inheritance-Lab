package staff;

public abstract class Employee {

    private String name, NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if (raise >= 0){
        this.salary += raise;}
    }

    public double payBonus(){
        return salary * 0.01;
    }

    public void setName(String name) {
        if (name != null){
        this.name = name;}
    }
}
