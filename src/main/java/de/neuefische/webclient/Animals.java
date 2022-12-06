package de.neuefische.webclient;

public class Animals {
    private String animal;
    private String description;

    public Animals() {
    }

    public Animals(String animal, String description) {
        this.animal = animal;
        this.description = description;
    }



    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animal='" + animal + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
