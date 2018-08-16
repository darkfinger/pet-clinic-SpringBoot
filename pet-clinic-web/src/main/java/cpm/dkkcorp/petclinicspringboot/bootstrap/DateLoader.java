package cpm.dkkcorp.petclinicspringboot.bootstrap;


import cpm.dkkcorp.petclinicspringboot.model.Owner;
import cpm.dkkcorp.petclinicspringboot.model.Pet;
import cpm.dkkcorp.petclinicspringboot.model.PetType;
import cpm.dkkcorp.petclinicspringboot.model.Vet;
import cpm.dkkcorp.petclinicspringboot.services.OwnerService;
import cpm.dkkcorp.petclinicspringboot.services.PetTypeService;
import cpm.dkkcorp.petclinicspringboot.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DateLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DateLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog=petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCat=petTypeService.save(cat);


        Owner o1=new Owner();
        o1.setFirstName("david");
        o1.setLastName("kaps");
        o1.setAddress("palais");
        o1.setCity("kin");
        o1.setTelephon("123456");
        ownerService.save(o1);

        Owner o2=new Owner();
        o2.setFirstName("glo");
        o2.setLastName("Muks");
        o2.setAddress("palais");
        o2.setCity("kin");
        o2.setTelephon("123456");
        ownerService.save(o2);

        Owner o3=new Owner();
        o3.setFirstName("zak");
        o3.setLastName("Mpoyi");
        o3.setAddress("palais");
        o3.setCity("kin");
        o3.setTelephon("123456");
        ownerService.save(o3);

        Vet v1=new Vet();
        v1.setFirstName("jean");
        v1.setLastName("kiko");
        vetService.save(v1);

        Vet v2=new Vet();
        v2.setFirstName("kitana");
        v2.setLastName("nikal");
        vetService.save(v2);


        Pet pet1=new Pet();
        pet1.setName("rosco");
        pet1.setPetType(savedDog);
        pet1.setOwner(o1);
        o1.getPets().add(pet1);
        pet1.setBirthDate(LocalDate.now());

        Pet pet2=new Pet();
        pet2.setName("kitty");
        pet2.setPetType(savedCat);
        pet2.setOwner(o2);
        o2.getPets().add(pet2);
        pet2.setBirthDate(LocalDate.now());

        Pet pet3=new Pet();
        pet3.setName("doggy");
        pet3.setPetType(savedDog);
        pet3.setOwner(o3);
        o3.getPets().add(pet3);
        pet3.setBirthDate(LocalDate.now());
    }
}
