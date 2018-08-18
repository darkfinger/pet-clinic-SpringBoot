package cpm.dkkcorp.petclinicspringboot.services.dataJPA;

import cpm.dkkcorp.petclinicspringboot.model.PetType;
import cpm.dkkcorp.petclinicspringboot.repository.PetTypeRepository;
import cpm.dkkcorp.petclinicspringboot.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("dataJPA")
public class PetTypeDataJPA implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeDataJPA(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        Optional<PetType> petTypeOptional = petTypeRepository.findById(aLong);
        if (petTypeOptional.isPresent()) {
            return petTypeOptional.get();
        } else {
            return null;
        }
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
