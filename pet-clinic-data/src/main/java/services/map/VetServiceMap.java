package services.map;

import model.Vet;
import services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deletById(Long id) {
        super.deletById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delet(object);
    }
}
