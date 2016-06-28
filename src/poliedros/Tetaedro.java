package poliedros;

/**
 * Created by professor on 16/06/2016.
 */
public class Tetaedro extends Poliedro {


    public Tetaedro(long id, double arista, String color) {
        super(id, arista, color);
    }

    public Tetaedro(long id, double arista) {
        super(id, arista);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public double calculaAreaTotal() {
        double RaizQuadrada=Math.sqrt(3);
        double Area=RaizQuadrada*arista;
        return Area;
    }

    @Override
    public double calculaVolumen() {
        double RaizQuadrada=Math.sqrt(2);
        double Potencia=Math.pow(arista,2);
        double Volumen=(RaizQuadrada/12)*Potencia;
        return Volumen;
    }
}
