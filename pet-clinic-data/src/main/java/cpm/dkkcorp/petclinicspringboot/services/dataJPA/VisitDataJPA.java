package cpm.dkkcorp.petclinicspringboot.services.dataJPA;

import cpm.dkkcorp.petclinicspringboot.model.Visit;
import cpm.dkkcorp.petclinicspringboot.repository.VisitRepository;
import cpm.dkkcorp.petclinicspringboot.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("dataJPA")
public class VisitDataJPA implements VisitService {

    private final VisitRepository visitRepository;

    public VisitDataJPA(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits=new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        Optional<Visit> visitOptional=visitRepository.findById(aLong);
        if (visitOptional.isPresent()){
            return visitOptional.get();
        }else {
        return null;
    }}

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
visitRepository.deleteById(aLong);
    }
}
