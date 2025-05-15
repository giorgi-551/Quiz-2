package oop.q3;

public class Student {
    public String name, surname, country, info;
    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student other)) return false;
        return name.equals(other.name) && surname.equals(other.surname);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }
}
