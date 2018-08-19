package cpm.dkkcorp.petclinicspringboot.services.map;

import cpm.dkkcorp.petclinicspringboot.model.Speciality;
import cpm.dkkcorp.petclinicspringboot.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delet(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
