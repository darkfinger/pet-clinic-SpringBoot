package cpm.dkkcorp.petclinicspringboot.services.map;

import cpm.dkkcorp.petclinicspringboot.model.Visit;
import cpm.dkkcorp.petclinicspringboot.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit object){
    if (object.getPet()==null||object.getPet().getId()==null||object.getPet().getOwner()==null||object.getPet().getOwner().getId()==null){
        throw new RuntimeException("not enought imformation to save the visit");
    }else {
        return super.save(object);
    }
    }

    @Override
    public void delete(Visit object) {
        super.delet(object);
    }

    @Override
    public void deleteById(Long aLong) {
super.deleteById(aLong);
    }
}
