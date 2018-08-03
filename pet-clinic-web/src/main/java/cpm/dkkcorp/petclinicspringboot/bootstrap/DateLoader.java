package cpm.dkkcorp.petclinicspringboot.bootstrap;


import cpm.dkkcorp.petclinicspringboot.model.Owner;
import cpm.dkkcorp.petclinicspringboot.model.Vet;
import cpm.dkkcorp.petclinicspringboot.services.OwnerService;
import cpm.dkkcorp.petclinicspringboot.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DateLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DateLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner o1=new Owner();
        o1.setFirstName("david");
        o1.setLastName("kaps");
        ownerService.save(o1);

        Owner o2=new Owner();
        o2.setFirstName("glo");
        o2.setLastName("Muks");
        ownerService.save(o2);

        Owner o3=new Owner();
        o3.setFirstName("zak");
        o3.setLastName("Mpoyi");
        ownerService.save(o3);

        Vet v1=new Vet();
        v1.setFirstName("jean");
        v1.setLastName("kiko");
        vetService.save(v1);

        Vet v2=new Vet();
        v2.setFirstName("kitana");
        v2.setLastName("nikal");
        vetService.save(v2);

    }
}
