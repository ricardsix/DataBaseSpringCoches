package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CocheService
{
    @Autowired
    private CocheRepository cocheRepository;
    @Autowired
    private PersonaRepository personaRepository;
    @Transactional

    public void testCoche(){

        Persona ivan = personaRepository.findOne(1L);
        Persona dimple = personaRepository.findOne(2L);
        Persona noelia = personaRepository.findOne(3L);
        Persona jordi = personaRepository.findOne(4L);
        Persona ricard = personaRepository.findOne(5L);

        Coche coche = new Coche();
        coche.setMarca("Seat");
        coche.setModelo("850");
        coche.setMatriculacion(1973);
        coche.setPrecio(2300);
        coche.setMatricula("AB-42303");
        coche.setPropietario(ivan);
        cocheRepository.save(coche);

        Coche coche1 = new Coche();
        coche1.setMarca("Renault");
        coche1.setModelo("8");
        coche1.setMatriculacion(1965);
        coche1.setPrecio(5200);
        coche1.setMatricula("B-8293-AU");
        coche1.setPropietario(dimple);
        cocheRepository.save(coche1);

        Coche coche2 = new Coche();
        coche2.setMarca("Seat");
        coche2.setModelo("600");
        coche2.setMatriculacion(1972);
        coche2.setPrecio(2600);
        coche2.setMatricula("B-0234-K");
        coche2.setPropietario(noelia);
        cocheRepository.save(coche2);

        Coche coche3 = new Coche();
        coche3.setMarca("Seat");
        coche3.setModelo("1500");
        coche3.setMatriculacion(1968);
        coche3.setPrecio(6000);
        coche3.setMatricula("Z-79411");
        coche3.setPropietario(jordi);
        cocheRepository.save(coche3);

        Coche coche4 = new Coche();
        coche4.setMarca("Renault");
        coche4.setModelo("5");
        coche4.setMatriculacion(1988);
        coche4.setPrecio(4800);
        coche4.setMatricula("B-5438-IY");
        coche4.setPropietario(ricard);
        cocheRepository.save(coche4);

        Coche coche5 = new Coche();
        coche5.setMarca("Renault");
        coche5.setModelo("4");
        coche5.setMatriculacion(1985);
        coche5.setPrecio(2000);
        coche5.setMatricula("B-0685-GY");
        coche5.setPropietario(ivan);
        cocheRepository.save(coche5);

        Coche coche6 = new Coche();
        coche6.setMarca("Seat");
        coche6.setModelo("127");
        coche6.setMatriculacion(1979);
        coche6.setPrecio(2300);
        coche6.setMatricula("SE-0109-T");
        coche6.setPropietario(dimple);
        cocheRepository.save(coche6);

        Coche coche7 = new Coche();
        coche7.setMarca("Seat");
        coche7.setModelo("1430");
        coche7.setMatriculacion(1977);
        coche7.setPrecio(3500);
        coche7.setMatricula("M-6515-CB");
        coche7.setPropietario(noelia);
        cocheRepository.save(coche7);

        Coche coche8 = new Coche();
        coche8.setMarca("Renault");
        coche8.setModelo("Gordini");
        coche8.setMatriculacion(1965);
        coche8.setPrecio(7500);
        coche8.setMatricula("M-474757");
        coche8.setPropietario(jordi);
        cocheRepository.save(coche8);

        Coche coche9 = new Coche();
        coche9.setMarca("Renault");
        coche9.setModelo("12");
        coche9.setMatriculacion(1979);
        coche9.setPrecio(2000);
        coche9.setMatricula("TO-2015-F");
        coche9.setPropietario(ricard);
        cocheRepository.save(coche9);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuya matriculacion es anterior al 1975");
        System.out.println("");
        System.out.println(cocheRepository.findByMatriculacionLessThan(1975));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuya matriculacion es posterior al 1975");
        System.out.println("");
        System.out.println(cocheRepository.findByMatriculacionGreaterThan(1975));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuya matriculacion esta entre 1970 y 1980");
        System.out.println("");
        System.out.println(cocheRepository.findByMatriculacionBetween(1970 , 1980));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyo precio este entre 3000 y 5000");
        System.out.println("");
        System.out.println(cocheRepository.findByPrecioBetween(3000 , 5000));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuya matricula corresponda a M-474757");
        System.out.println("");
        System.out.println(cocheRepository.findByMatricula("M-474757"));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches de la Marca Seat");
        System.out.println("");
        System.out.println(cocheRepository.findByMarca("Seat"));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches de Marca y Modelo Renault Gordini");
        System.out.println("");
        System.out.println(cocheRepository.findByMarcaAndModelo("Renault", "Gordini"));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Precio medio de los coches de la Marca Seat");
        System.out.println("");
        System.out.println(cocheRepository.findByMediaPrecioMarca("Seat"));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches de la Marca Renault que valen 2000");
        System.out.println("");
        System.out.println(cocheRepository.findByMarcaAndPrecio("Renault", 2000));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches de Marca y Modelo Renault Gordini que valen 7500");
        System.out.println("");
        System.out.println(cocheRepository.findByMarcaAndModeloAndPrecio("Renault", "Gordini", 7500));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyo propietario sea Ricard");
        System.out.println("");
        System.out.println(cocheRepository.findByPropietario(ricard));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyo propietario sea Ricard y valen menos de 3000");
        System.out.println("");
        System.out.println(cocheRepository.findByPropietarioAndPrecioLessThan(ricard, 3000));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyo propietario sea Ricard y esten matriculados entre el 1970 y el 1980");
        System.out.println("");
        System.out.println(cocheRepository.findByPropietarioAndMatriculacionBetween(ricard, 1970, 1980));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyos propietarios tengan mas de 25 años");
        System.out.println("");
        System.out.println(cocheRepository.findByPropietarioAndEdadMore(25));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyos propietarios tengan mas de 25 años y menos de 26 años");
        System.out.println("");
        System.out.println(cocheRepository.findByPropietarioAndEdadMaxMin(25,26));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos todos los coches cuyas matriculas contengan B");
        System.out.println("");
        System.out.println(cocheRepository.findByMatriculaContains("B"));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mostramos el MAXIMO / MINIMO / MEDIA de los precios de los coches por marca");
        System.out.println("");
        List<Object[]> findByMaxMinMediaPrecioMarcaList = cocheRepository.findByMaxMinMediaPrecioMarca();
        {
            for (Object[] findByMaxMinMediaPrecioMarca : findByMaxMinMediaPrecioMarcaList)
            {
                System.out.println("marca: " + findByMaxMinMediaPrecioMarca[0]);
                System.out.println("media: " + findByMaxMinMediaPrecioMarca[1]);
                System.out.println("max: " + findByMaxMinMediaPrecioMarca[2]);
                System.out.println("min: " + findByMaxMinMediaPrecioMarca[3]);
            }
        }
    }
}
