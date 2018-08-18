package cpm.dkkcorp.petclinicspringboot.services.dataJPA;

import cpm.dkkcorp.petclinicspringboot.model.Speciality;
import cpm.dkkcorp.petclinicspringboot.repository.SpecialityRepository;
import cpm.dkkcorp.petclinicspringboot.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("dataJPA")
public class SpecialityDataJPA implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityDataJPA(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities=new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        Optional<Speciality> optionalSpeciality=specialityRepository.findById(aLong);
        if (optionalSpeciality.isPresent()){
            return optionalSpeciality.get();
        }else {
        return null;
    }}

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
specialityRepository.deleteById(aLong);
    }
}
