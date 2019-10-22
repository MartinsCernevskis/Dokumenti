package com.company;

public class Person extends Record {

    private String name;
    private String surname;
    private String phone;


    @Override
    public void askInfo() {
        System.out.println("Name ");
        name = Main.scan.next();
        System.out.println("Surename ");
        surname = Main.scan.next();
        System.out.println("Phone ");
        phone = Main.scan.next();

    }



    @Override
    public boolean contains(String str) {
        return super.contains(str)
        name.contains(str) || surname.contains(str) || phone.contains(str)
            return true;

        return false;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
