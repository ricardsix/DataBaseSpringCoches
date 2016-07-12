package com.example.coches;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String modelo;
    private Integer matriculacion;
    private Integer precio;
    private String matricula;

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public Integer getMatriculacion()
    {
        return matriculacion;
    }
    public void setMatriculacion(Integer matriculacion)
    {
        this.matriculacion = matriculacion;
    }
    public Integer getPrecio()
    {
        return precio;
    }
    public void setPrecio(Integer precio)
    {
        this.precio = precio;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    @Override
    public String toString()
    {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matriculacion=" + matriculacion +
                ", precio=" + precio +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}