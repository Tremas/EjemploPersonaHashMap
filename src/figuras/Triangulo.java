package figuras;

/**
 * Created by professor on 15/06/2016.
 */
public class Triangulo  extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(int id, double base, double altura) {
        super(id);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {

        return (base*altura)/2;
    }

    @Override
    public double calculaPerimetro() {
        return base*3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "id=" +id+
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
