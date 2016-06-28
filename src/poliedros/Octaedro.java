package poliedros;

/**
 * Created by professor on 16/06/2016.
 */
public class Octaedro extends Poliedro {
    public Octaedro(long id, double arista, String color) {
        super(id, arista, color);
    }

    public Octaedro(long id, double arista) {
        super(id, arista);
    }

    @Override
    public double calculaVolumen() {
        double RaizQuadrada=Math.sqrt(2);
        double PotenciaA3=Math.pow(arista,3);
        double Volumen=(RaizQuadrada/3)*PotenciaA3;
        return Volumen;
    }

    @Override
    public double calculaAreaTotal() {
        double RaizQuadrada=Math.sqrt(3);
        double PotenciaA2=Math.pow(arista,2);
        double Area=2*RaizQuadrada*PotenciaA2;
        return Area;
    }

    @Override
    public long getId() {
        return super.getId();
    }


}
