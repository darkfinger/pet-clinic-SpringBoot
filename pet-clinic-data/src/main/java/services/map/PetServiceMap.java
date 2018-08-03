package services.map;

import model.Pet;
import services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deletById(Long id) {
        super.deletById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delet(object);
    }
}
