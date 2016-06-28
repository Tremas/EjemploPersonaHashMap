package poliedros;

/**
 * Created by professor on 16/06/2016.
 */
public class Dodecaedro extends Poliedro {
    public Dodecaedro(long id, double arista, String color) {
        super(id, arista, color);
    }

    public Dodecaedro(long id, double arista) {
        super(id, arista);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public double calculaAreaTotal() {
        double angulo=360/30;
        double division_angulo=angulo/2;
        double Apotema=arista/Math.tan(division_angulo);

        double Area=30*arista*Apotema;
        return Area;
    }

    @Override
    public double calculaVolumen() {
        double RaizQuadrada=Math.sqrt(5);
       // System.out.println("Raiz"+RaizQuadrada);
        double PotenciaA3=Math.pow(arista,3);
      //  System.out.println("Potencia"+PotenciaA3);
        double pt1=1.0/4.0;
      //  System.out.println("pt1"+pt1);
        double pt2=5+(7*RaizQuadrada);
      //  System.out.println("pt2"+pt2);

       // double Volumen=pt1*(pt2*PotenciaA3);
        double Volumen=((1.0/4.0)*(15+(7*RaizQuadrada))*PotenciaA3);
        //System.out.println("Volumen"+Volumen);
        return Volumen;
    }
}
