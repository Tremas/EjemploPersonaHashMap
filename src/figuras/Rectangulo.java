package figuras;

public class Rectangulo extends FiguraGeometrica{

    private double base; //private hace que no se pueda acceder externamente
    private double altura;

    public Rectangulo(int id, double base, double altura) {
        super(id);
        this.base = base;
        this.altura = altura;
    }



    @Override
    public double calculaArea()
    {
        return (base*altura);
    }


    public double calculaPerimetro()
    {
        return (2*base)+(2*altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "id="+id+
                "base=" + base +
                ", altura=" + altura +
                '}';
    }


    //    public static void main(String[] args) {
//
//        System.out.println("Hello World!");
//
//        Scanner sc = new Scanner(System.in);
//
//        Rectangulo[] array = new Rectangulo[3];
//
//        for(int i=0; i<3; i++)
//
//        {
//            System.out.println("Introduce los datos del rectangulo "+i);
//            System.out.println("Introduce la base:");
//            double base = sc.nextDouble();
//            System.out.println("Introduce la altura:");
//            double altura = sc.nextDouble();
//
//            Rectangulo rectangulo = new Rectangulo(base,altura,i);
//            array[i]= rectangulo; // guardamos el rect creado en la pos que toca
//        }
//
//
//        for(int i =0; i < 3; i++) // recorremos el array
//        {
//            Rectangulo rectangulo = array[i];
//            System.out.println("El area es= "+rectangulo.calculaArea());
//
//        }
//
//
//
//    }


}
