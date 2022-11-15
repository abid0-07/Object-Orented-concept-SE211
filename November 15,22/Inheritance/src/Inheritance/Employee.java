package Inheritance;
public class Employee {

    private String name;
    private String id;
    private String department;
    private String exLvl;
    private float salary;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExLvl() {
        return exLvl;
    }

    public void setExLvl(String exLvl) {
        this.exLvl = exLvl;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: "+id);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
        System.out.println("Experience: "+exLvl);
        System.out.println("Gender: "+gender);
    }


}
