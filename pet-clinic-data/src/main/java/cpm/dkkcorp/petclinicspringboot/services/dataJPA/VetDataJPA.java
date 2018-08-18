package cpm.dkkcorp.petclinicspringboot.services.dataJPA;

import cpm.dkkcorp.petclinicspringboot.model.Vet;
import cpm.dkkcorp.petclinicspringboot.repository.VetRepository;
import cpm.dkkcorp.petclinicspringboot.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("dataJPA")
public class VetDataJPA implements VetService {

    private final VetRepository vetRepository;

    public VetDataJPA(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets=new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        Optional<Vet> vetOptional=vetRepository.findById(aLong);
        if(vetOptional.isPresent()){
            return vetOptional.get();
        }else {
            return null;
        }
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
