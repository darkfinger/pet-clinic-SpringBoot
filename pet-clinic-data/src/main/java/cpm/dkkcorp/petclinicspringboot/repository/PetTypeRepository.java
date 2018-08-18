package cpm.dkkcorp.petclinicspringboot.repository;

import cpm.dkkcorp.petclinicspringboot.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
