package org.example;

public class Main {
    public static void main(String[] args) {
        Database empDir= new Database();
        empDir.addEmployee("tim", "9752563287", 3);
        empDir.addEmployee("nesh", "94211561324", 4);
        empDir.addEmployee("lora", "9583651246", 7);
        empDir.addEmployee("Олег", "93125543254", 12);

        System.out.println(empDir.findByExpirience(4));
        System.out.println(empDir.findPhoneByName("Олег"));
        System.out.println(empDir.findByTabNum(2));

    }
}