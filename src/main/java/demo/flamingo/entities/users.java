package demo.flamingo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Date hire_date;

    private double salary;


    public users() {
    }

    public users(int id, String name, Date hire_date, double salary) {
        this.id = id;
        this.name = name;
        this.hire_date = hire_date;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHire_date() {
        return this.hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public users id(int id) {
        setId(id);
        return this;
    }

    public users name(String name) {
        setName(name);
        return this;
    }

    public users hire_date(Date hire_date) {
        setHire_date(hire_date);
        return this;
    }

    public users salary(double salary) {
        setSalary(salary);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", hire_date='" + getHire_date() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }

}
