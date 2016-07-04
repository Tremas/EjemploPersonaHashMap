package persona.socialnetwork;

/**
 * Created by professor on 28/06/2016.
 */
public class Persona implements Comparable<Persona> {
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

    private String nombre;
    private String apellido;


    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido +
                '}'+System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (!getId().equals(persona.getId())) return false;
        if (!getNombre().equals(persona.getNombre())) return false;
        return getApellido().equals(persona.getApellido());

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getNombre().hashCode();
        result = 31 * result + getApellido().hashCode();
        return result;
    }

    @Override
    public int compareTo(Persona persona) {
        if(this.getId()>persona.getId()){return 1;}
        else if(this.getId()<persona.getId()){return -1;}
        else {
            return 0;
        }
    }
}
