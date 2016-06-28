package poliedros;

 /**
 * Created by professor on 16/06/2016.
 */
public abstract class Poliedro implements Comparable<Poliedro> {
    //Class poliedro (id,color)-2constructores -getid - metodo abstact calcularvolumen
    // Class Tetaedro voluemen area total, i lateral
    // calcular el volumen del poliedro area ,clases tetaedro,
    // hexaedro calcular area calcular volumen, calcular diagonal
    // , octaedro calcular area i volumen,
    //dodeacaedro


    //Poliedro con el volumen maximo
    //media del volumen de todos los poliedros
    //min del volumen de todos los poiedros
    //extra:
    // metodos a especificos como la diagonal
    // i utilizar el intance of cuando solo s enecesite esa clase
    //numero de poliedros que tiene un volumen meno de 20
    //numero de poliedros que tengan el volumen entre 20 i 100
    //numero dep oliedos que tengan un voluemn superior a 100

    /**
     * Extension del programa:
     *  -Ade                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      v                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        los colores
     *  - aparte de acer el getId ay que hacer un getColor
     *  -especificar 5 colores en el switch
     *  -mosntrar cuantas figuras de cada color hay
     *  - String color Seleccionado
     *
     *
     */



    protected long id;
    protected double arista;
    private String color;

    public Poliedro(long id, double arista, String color) {
        this.id = id;
        this.arista = arista;
        this.color = color;
    }

    public Poliedro(long id, double arista) {
        this.id = id;
        this.arista = arista;
        this.color ="Black";
    }



    public long getId() {
        return id;
    }
    public String getColor() {return color;}
    public abstract double calculaAreaTotal();
    public abstract double calculaVolumen();

    @Override
    public int compareTo(Poliedro poliedro) {
        if (this.calculaVolumen() > poliedro.calculaVolumen()) {
            return 1;
        }
        else if (this.calculaVolumen() < poliedro.calculaVolumen()) {
            return -1;
        }
        else {//if (this.calculaVolumen() == poliedro.calculaVolumen())
            return 0;
        }
    }

     @Override
     public String toString() {
         return "" +
                 "id=" + id +
                 ", arista=" + arista +
                 ", color='" + color + '\'' +
                 "";
     }
 }
