package com.javaprops.props;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private StringProperty name;
    private IntegerProperty salary;
    public Employee(String name, int salary){
        this.name = new SimpleStringProperty(name);
        this.salary = new SimpleIntegerProperty(salary);
    }
    public String getName(){
        return this.name.getValue();
    }
    public int getSalary(){
        return this.salary.get();
    }
    public IntegerProperty getSalaryProperty(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary.set(salary);
    }

}
