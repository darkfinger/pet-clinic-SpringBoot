package cpm.dkkcorp.petclinicspringboot.bootstrap;


import cpm.dkkcorp.petclinicspringboot.model.*;
import cpm.dkkcorp.petclinicspringboot.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DateLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;
    @Autowired
    public DateLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {
        int count=vetService.findAll().size();
        if(count==0){
            localData();
        }
    }
    public void localData(){

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


        Owner o2=new Owner();
        o2.setFirstName("glo");
        o2.setLastName("Muks");
        o2.setAddress("palais");
        o2.setCity("kin");
        o2.setTelephon("123456");

        Owner o3=new Owner();
        o3.setFirstName("zak");
        o3.setLastName("Mpoyi");
        o3.setAddress("palais");
        o3.setCity("kin");
        o3.setTelephon("123456");

        Speciality speciality1=new Speciality();
        speciality1.setDescrition("Radiology");
        Speciality savedSpecial1 = specialityService.save(speciality1);

        Speciality speciality2=new Speciality();
        speciality1.setDescrition("surgery");
        Speciality savedSpecial2 = specialityService.save(speciality2);


        Speciality speciality3=new Speciality();
        speciality1.setDescrition("Dentistry");
        Speciality savedSpecial3 = specialityService.save(speciality3);

        Vet v1=new Vet();
        v1.setFirstName("jean");
        v1.setLastName("kiko");
        v1.getSpecialities().add(savedSpecial1);
        v1.getSpecialities().add(savedSpecial3);
        vetService.save(v1);

        Vet v2=new Vet();
        v2.setFirstName("kitana");
        v2.setLastName("nikal");
        v2.getSpecialities().add(savedSpecial2);
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

        ownerService.save(o1);
        ownerService.save(o2);
        ownerService.save(o3);

        Visit visit1=new Visit();
        visit1.setDate(LocalDate.now());
        visit1.setDescription("sneez");
        visit1.setPet(pet1);
        visitService.save(visit1);


        Visit visit2=new Visit();
        visit2.setDate(LocalDate.now());
        visit2.setDescription("rage");
        visit2.setPet(pet2);
        visitService.save(visit2);


        Visit visit3=new Visit();
        visit3.setDate(LocalDate.now());
        visit3.setDescription("aza na ba sili");
        visit3.setPet(pet3);
        visitService.save(visit3);

    }
}
