package pl.sdacademy.pet;

import java.util.Objects;

public class Pet {
    private String name;
    private int age;
    private String breed;
    private String location;

    public Pet() {
    }

    public Pet(String name, int age, String breed, String location) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                Objects.equals(breed, pet.breed) &&
                Objects.equals(location, pet.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, location);
    }
}
