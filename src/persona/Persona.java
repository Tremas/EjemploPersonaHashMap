package persona;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by professor on 28/06/2016.
 */
public class Persona {
    /*id long, dni string, nom string , edad int
    *
    * 11 personsa
    *
    * 3 hasmaps 1 por id key id
    *           1 con nombre id nombre
    *           1  por dni
    *
    *
    * */
    private Long id;;
    private String dni;
    private String nom;
    private Integer edad;

    public Persona(Long id, String dni, String nom, Integer edad) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nom='" + nom + '\'' +
                ", edad=" + edad +
                '}';
    }
}
