package cpm.dkkcorp.petclinicspringboot.model;

import javax.persistence.Entity;

@Entity
public class Speciality extends BaseEntity {

    private String descrition;

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }
}
