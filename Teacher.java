class Teacher extends Person {

    private double salary;


    public Teacher(String name, int age, char gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    // getter for salary attribute
    public double getSalary() {
        return salary;
    }
    // setter for salary attribute
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
