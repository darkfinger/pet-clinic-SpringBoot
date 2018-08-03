package cpm.dkkcorp.petclinicspringboot.services.map;

import cpm.dkkcorp.petclinicspringboot.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);

        } else {
            throw new RuntimeException("object cant be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delet(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    Long getNextId() {
        Long nextId;
        try {
            nextId = Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
