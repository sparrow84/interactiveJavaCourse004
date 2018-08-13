package com.company;

// Task 1
public class Worker {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

// Task 2
    public Worker(String fio, String position, String email, String phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

// Task 3
    public void printWorker(){
        System.out.println("==============================================");
        System.out.println("fio:         " + fio);
        System.out.println("position:    " + position);
        System.out.println("email:       " + email);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("salary:      " + salary);
        System.out.println("age:         " + age);
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
