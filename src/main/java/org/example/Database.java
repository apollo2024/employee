package org.example;

import java.util.List;
import java.util.ArrayList;

public class Database {
    private List<Employee> employeeList;
    public Database(){
        this.employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        if(!employeeList.contains(employee)){
            employeeList.add(employee);
        }
    }
    public void addEmployee(String firstName, String phone, int expirience){
        addEmployee(new Employee(firstName, phone, expirience));
    }
    public List<Employee> findByExpirience(int expirience){
        return employeeList.stream().filter(x -> x.getExperience() == expirience).toList();
    }
    public List<String> findPhoneByName(String firstName){
        return employeeList.stream()
                .filter(x->x.getFirstname().toLowerCase().equals(firstName.toLowerCase()))
                .map(x->x.getPhone())
                .toList();
    }
    public Employee findByTabNum(int tabNum){
        return employeeList.stream()
                .filter(x->x.getTabNumber() == tabNum)
                .toList()
                .get(0);
    }
}
