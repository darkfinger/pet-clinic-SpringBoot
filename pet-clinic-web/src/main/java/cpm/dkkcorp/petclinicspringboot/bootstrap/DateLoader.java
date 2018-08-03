package cpm.dkkcorp.petclinicspringboot.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetServiceMap;

@Component
public class DateLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    public DateLoader() {
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner o1=new Owner();
        o1.setId(1L);
        o1.setFirstName("david");
        o1.setLastName("kaps");
        ownerService.save(o1);

        Owner o2=new Owner();
        o1.setId(2L);
        o1.setFirstName("dvd");
        o1.setLastName("kapanga");
        ownerService.save(o2);

        Vet v1=new Vet();
        v1.setId(1L);
        v1.setFirstName("jean");
        v1.setLastName("kiko");
        vetService.save(v1);


        Vet v2=new Vet();
        v2.setId(2L);
        v2.setFirstName("kitana");
        v2.setLastName("nikal");
        vetService.save(v2);

    }
}
