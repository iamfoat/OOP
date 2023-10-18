class l7_Employee {
    public static void main(String[] args) {
        Employee emp = new Manager(101, "Lisa", 50000, "Bangkok",11);
        System.out.println(emp.getDetails());
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee Address: " + emp.getAddress());
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;

    public Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Address: " + address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Manager extends Employee {
    private int parkingNo;

    public Manager(int id, String name, double salary, String address, int parkingNo) {
        super(id, name, salary, address);
        this.parkingNo = parkingNo;
    }

    public int getParkingNo() {
        return parkingNo;
    }

    public void setParkingNo(int parkingNo) {
        this.parkingNo = parkingNo;
    }

    @Override
    public String getDetails() {
        return "Manager Details - " + super.getDetails() + ", Parking Number: " + parkingNo;
    }
}
