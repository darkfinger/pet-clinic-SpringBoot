package model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private PetType petType;
    private Owner Owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public model.Owner getOwner() {
        return Owner;
    }

    public void setOwner(model.Owner owner) {
        Owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
