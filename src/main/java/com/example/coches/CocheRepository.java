package com.example.coches;

import com.example.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CocheRepository extends JpaRepository<Coche,Long> {
    List<Coche> findByMarca(String marca);

    List<Coche> findByMarcaAndModelo(String marca, String modelo);

    List<Coche> findByMatricula(String matricula);

    List<Coche> findByMarcaAndModeloAndPrecio(String marca, String modelo, Integer precio);

    List<Coche> findByMatriculacionLessThan(Integer matriculacion);

    List<Coche> findByMatriculacionGreaterThan(Integer matriculacion);

    List<Coche> findByMatriculacionBetween(Integer matriculacionMin, Integer matriculacionMax);

    List<Coche> findByPrecioBetween(Integer precioMin, Integer precioMax);

    List<Coche> findByMarcaAndPrecio(String marca, Integer precio);

    @Query("SELECT AVG (c.precio) from Coche c where c.marca = :marca")
    Double findByMediaPrecioMarca(@Param("marca") String marca);
}
