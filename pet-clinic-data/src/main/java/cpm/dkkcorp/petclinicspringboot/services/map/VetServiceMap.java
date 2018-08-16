package cpm.dkkcorp.petclinicspringboot.services.map;

import cpm.dkkcorp.petclinicspringboot.model.Speciality;
import cpm.dkkcorp.petclinicspringboot.model.Vet;
import cpm.dkkcorp.petclinicspringboot.services.SpecialityService;
import cpm.dkkcorp.petclinicspringboot.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()!=null){
                    Speciality specialitySaved=specialityService.save(speciality);
                    speciality.setId(specialitySaved.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delet(object);
    }
}
