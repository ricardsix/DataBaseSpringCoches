package com.example;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by professor on 20/06/2016.
 */
@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public void testPersonas(){
        Persona ivan = new Persona();
        ivan.setNombre("Ivan");
        ivan.setApellido ("Hernandez");
        ivan.setAge(23);
        personaRepository.save(ivan);

        Persona dimple = new Persona();
        dimple.setNombre("Dimple");
        dimple.setApellido ("");
        dimple.setAge(26);
        personaRepository.save(dimple);

        Persona noelia = new Persona();
        noelia.setNombre("Noelia");
        noelia.setApellido ("Villa");
        noelia.setAge(25);
        personaRepository.save(noelia);

        Persona jordi = new Persona();
        jordi.setNombre("Jordi");
        jordi.setApellido ("");
        jordi.setAge(25);
        personaRepository.save(jordi);

        Persona ricard = new Persona();
        ricard.setNombre("Ricard");
        ricard.setApellido ("Sole");
        ricard.setAge(22);
        personaRepository.save(ricard);

        System.out.println(personaRepository.findOne(2L));
        System.out.println(personaRepository.findByNombre("Noelia"));

        System.out.println("Mostramos todas las personas cuya edad es >= 23");
        System.out.println(personaRepository.findByAgeGreaterThanEqual(23));

        System.out.println("Mostramos todas las personas cuyo nombre y apellido son Noelia Villa");
        System.out.println(personaRepository.findByNombreAndApellido("Noelia", "Villa"));

        System.out.println("Mostramos todas las personas cuyo nombre es Noelia o su apellido es Villa");
        System.out.println(personaRepository.findByNombreOrApellido("Noelia", "Villa"));

    }
}
