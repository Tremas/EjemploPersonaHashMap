package figuras;

/**
 * Created by professor on 14/06/2016.
 */
public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    protected Long id;
    private String color;

    public FiguraGeometrica(long id) {
        this.id = id;
        this.color="blue";
    }

    public FiguraGeometrica(long id, String color) {
        this.id = id;
        this.color = color;
    }

    public abstract double calculaArea();
    public abstract double calculaPerimetro();
    @Override
    public int compareTo(FiguraGeometrica figuraGeometrica) {

        if (this.calculaArea() > figuraGeometrica.calculaArea()) {
            return 1;
        }
        else if (this.calculaArea() < figuraGeometrica.calculaArea()) {
            return -1;
        }
        else  {//if (this.calculaArea() == figuraGeometrica.calculaArea())
            return 0;
        }
    }
}
