package com.example.coches;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocheService
{
    @Autowired
    private CocheRepository cocheRepository;

    public void testCoche(){
        Coche coche = new Coche();
        coche.setMarca("Seat");
        coche.setModelo("850");
        coche.setMatriculacion(1973);
        coche.setPrecio(2300);
        coche.setMatricula("AB-42303");
        cocheRepository.save(coche);

        Coche coche1 = new Coche();
        coche1.setMarca("Renault");
        coche1.setModelo("8");
        coche1.setMatriculacion(1965);
        coche1.setPrecio(5200);
        coche1.setMatricula("B-8293-AU");
        cocheRepository.save(coche1);

        Coche coche2 = new Coche();
        coche2.setMarca("Seat");
        coche2.setModelo("600");
        coche2.setMatriculacion(1972);
        coche2.setPrecio(2600);
        coche2.setMatricula("B-0234-K");
        cocheRepository.save(coche2);

        Coche coche3 = new Coche();
        coche3.setMarca("Seat");
        coche3.setModelo("1500");
        coche3.setMatriculacion(1968);
        coche3.setPrecio(6000);
        coche3.setMatricula("Z-79411");
        cocheRepository.save(coche3);

        Coche coche4 = new Coche();
        coche4.setMarca("Renault");
        coche4.setModelo("5");
        coche4.setMatriculacion(1988);
        coche4.setPrecio(4800);
        coche4.setMatricula("B-5438-IY");
        cocheRepository.save(coche4);

        Coche coche5 = new Coche();
        coche5.setMarca("Renault");
        coche5.setModelo("4");
        coche5.setMatriculacion(1985);
        coche5.setPrecio(2000);
        coche5.setMatricula("B-0685-GY");
        cocheRepository.save(coche5);

        Coche coche6 = new Coche();
        coche6.setMarca("Seat");
        coche6.setModelo("127");
        coche6.setMatriculacion(1979);
        coche6.setPrecio(2300);
        coche6.setMatricula("SE-0109-T");
        cocheRepository.save(coche6);

        Coche coche7 = new Coche();
        coche7.setMarca("Seat");
        coche7.setModelo("1430");
        coche7.setMatriculacion(1977);
        coche7.setPrecio(3500);
        coche7.setMatricula("M-6515-CB");
        cocheRepository.save(coche7);

        Coche coche8 = new Coche();
        coche8.setMarca("Renault");
        coche8.setModelo("Gordini");
        coche8.setMatriculacion(1965);
        coche8.setPrecio(7500);
        coche8.setMatricula("M-474757");
        cocheRepository.save(coche8);

        Coche coche9 = new Coche();
        coche9.setMarca("Renault");
        coche9.setModelo("12");
        coche9.setMatriculacion(1979);
        coche9.setPrecio(2000);
        coche9.setMatricula("TO-2015-F");
        cocheRepository.save(coche9);

        System.out.println("Mostramos todos los coches cuya matriculacion es anterior al 1975");
        System.out.println(cocheRepository.findByMatriculacionLessThan(1975));

        System.out.println("Mostramos todos los coches cuya matriculacion es posterior al 1975");
        System.out.println(cocheRepository.findByMatriculacionGreaterThan(1975));

        System.out.println("Mostramos todos los coches cuya matriculacion esta entre 1970 y 1980");
        System.out.println(cocheRepository.findByMatriculacionBetween(1970 , 1980));

        System.out.println("Mostramos todos los coches cuyo precio este entre 3000 y 5000");
        System.out.println(cocheRepository.findByPrecioBetween(3000 , 5000));

        System.out.println("Mostramos todos los coches cuya matricula corresponda a M-474757");
        System.out.println(cocheRepository.findByMatricula("M-474757"));

        System.out.println("Mostramos todos los coches de la Marca Seat");
        System.out.println(cocheRepository.findByMarca("Seat"));

        System.out.println("Mostramos todos los coches de Marca y Modelo Renault Gordini");
        System.out.println(cocheRepository.findByMarcaAndModelo("Renault", "Gordini"));

        System.out.println("Precio medio de los coches de la Marca Seat");
        System.out.println(cocheRepository.findByMediaPrecioMarca("Seat"));

        System.out.println("Mostramos todos los coches de la Marca Renault que valen 2000");
        System.out.println(cocheRepository.findByMarcaAndPrecio("Renault", 2000));

        System.out.println("Mostramos todos los coches de Marca y Modelo Renault Gordini que valen 7500");
        System.out.println(cocheRepository.findByMarcaAndModeloAndPrecio("Renault", "Gordini", 7500));

    }
}
