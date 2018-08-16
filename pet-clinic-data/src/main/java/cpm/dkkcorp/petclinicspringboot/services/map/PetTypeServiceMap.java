package cpm.dkkcorp.petclinicspringboot.services.map;

import cpm.dkkcorp.petclinicspringboot.model.PetType;
import cpm.dkkcorp.petclinicspringboot.services.PetTypeService;

import java.util.Set;

public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delet(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
