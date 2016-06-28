package poliedros;

/**
 * Created by professor on 16/06/2016.
 */
public class Icosaedro  extends Poliedro{

    public Icosaedro(long id, double arista, String color) {
        super(id, arista, color);
    }

    public Icosaedro(long id, double arista) {
        super(id, arista);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public double calculaAreaTotal() {
        double RaizQuadrada=Math.sqrt(3);
        double PotenciaA2=Math.pow(arista,2);

        double Area=5*RaizQuadrada*PotenciaA2;
        return Area;
    }

    @Override
    public double calculaVolumen() {

        double RaizQuadrada=Math.sqrt(5);
        double PotenciaA3=Math.pow(arista,3);

        double Volumen=(5/12)*(3+RaizQuadrada)*PotenciaA3;
        return Volumen;
    }
}
