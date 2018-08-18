package cpm.dkkcorp.petclinicspringboot.services.dataJPA;

import cpm.dkkcorp.petclinicspringboot.model.Owner;
import cpm.dkkcorp.petclinicspringboot.repository.OwnerRepository;
import cpm.dkkcorp.petclinicspringboot.repository.PetRepository;
import cpm.dkkcorp.petclinicspringboot.repository.PetTypeRepository;
import cpm.dkkcorp.petclinicspringboot.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("dataJPA")
public class OwnerDataJPA implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerDataJPA(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Owner findByLastName(String name) {
        return ownerRepository.findByLastName(name);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners =new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        Optional<Owner> optionalOwner= ownerRepository.findById(aLong);
        if(optionalOwner.isPresent()){
            return optionalOwner.get();
        }else {
            return null;
        }
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
