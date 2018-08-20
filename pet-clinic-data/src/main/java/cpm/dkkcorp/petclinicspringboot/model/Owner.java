package cpm.dkkcorp.petclinicspringboot.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Owner extends Person {

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city, String telephon, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephon = telephon;
        this.pets = pets;
    }

    private String address;
    private String city;
    private String telephon;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Owner")
    private Set<Pet> pets=new HashSet<>();
}
