package poliedros;

/**
 * Created by professor on 16/06/2016.
 */
public class Hexaedro extends Poliedro {

    public Hexaedro(long id, double arista, String color) {
        super(id, arista, color);
    }

    public Hexaedro(long id, double arista) {
        super(id, arista);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public double calculaAreaTotal() {
        double Potencia=Math.pow(arista,2);
        double Area=6*Potencia;
        return Area;
    }

    @Override
    public double calculaVolumen() {
        double Volumen=Math.pow(arista,3);
        return Volumen;
    }

    public double calculaAreaLateral(){
        double Potencia=Math.pow(arista,2);
        double Area=4*Potencia;
        return Area;
    }
    public double Diagonal(){
        double RaizQuadrada=Math.sqrt(3);
        double Diagonal=RaizQuadrada*arista;
        return Diagonal;

    }
}
