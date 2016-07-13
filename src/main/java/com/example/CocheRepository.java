package com.example;

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

    @Query("SELECT AVG (c.precio) FROM Coche c WHERE c.marca = :marca")
    Double findByMediaPrecioMarca(@Param("marca") String marca);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.propietario = :propietario")
    List<Coche> findByPropietario(@Param("propietario") Persona propietario);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.propietario = :propietario AND coche.precio >= :precio")
    List<Coche> findByPropietarioAndPrecioLessThan (@Param("propietario")Persona propietario, @Param("precio") Integer precio);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.propietario = :propietario AND coche.matriculacion >= :matriculacionMin AND coche.matriculacion <= :matriculacionMax")
    List<Coche> findByPropietarioAndMatriculacionBetween (@Param("propietario")Persona propietario, @Param("matriculacionMin") Integer matriculacionMin, @Param("matriculacionMax") Integer matriculacionMax);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.propietario.age >= :años")
    List<Coche> findByPropietarioAndEdadMore (@Param("años") Integer años);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.propietario.age >= :añosMin AND coche.propietario.age <= :añosMax")
    List<Coche> findByPropietarioAndEdadMaxMin (@Param("añosMin")Integer añosMin, @Param("añosMax") Integer añosMax);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.matricula LIKE(CONCAT('%',:string,'%'))")
    List<Coche> findByMatriculaContains (@Param("string") String string);

    @Query("SELECT (coche.marca), AVG (coche.precio), MAX (coche.precio), MIN (coche.precio) FROM Coche coche GROUP BY coche.marca")
    List<Object[]> findByMaxMinMediaPrecioMarca();

    @Query("SELECT (coche)")
}
