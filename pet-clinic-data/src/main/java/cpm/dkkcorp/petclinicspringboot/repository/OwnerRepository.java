package cpm.dkkcorp.petclinicspringboot.repository;

import cpm.dkkcorp.petclinicspringboot.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    public Owner findByLastName(String LastName);
}
