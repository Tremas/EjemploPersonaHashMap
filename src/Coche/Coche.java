package Coche;

/**
 * Created by professor on 29/06/2016.
 */
public class Coche implements Comparable<Coche>{
    private Long id;
    private String marca;
    private String modelo;
    private int año;
    private String matricula;

    public Coche(Long id, String marca, String modelo, int año, String matricula) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coche coche) {
        /*if(this.matricula.compareTo(coche.matricula)>=1){
                return 1;
        }else if (this.matricula.compareTo(coche.matricula)<=-1){
            return -1;
        }else{return 0;}*/
        return this.matricula.compareTo(coche.matricula);
    }
}
