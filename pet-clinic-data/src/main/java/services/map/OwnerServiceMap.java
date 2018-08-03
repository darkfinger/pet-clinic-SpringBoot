package services.map;

import model.Owner;
import services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deletById(Long id) {
        super.deletById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delet(object);
    }

    @Override
    public Owner findByLastName(String name) {
        return null;
    }
}
