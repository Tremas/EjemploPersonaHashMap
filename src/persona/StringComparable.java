package persona;

/**
 * Created by professor on 29/06/2016.
 */
public class StringComparable {
    public static void main(String[] args) {

        String oscar="Oscar";
        String judith="Judith";

        int resultado =oscar.compareTo(judith);
       // System.out.println(resultado);

        Integer x=1;
        Integer y =-3;
        //System.out.println(x.compareTo(y));
        Persona ivan = new Persona(1L,"111111","Ivan",11);
        Persona koko = new Persona(2L,"222222","Koko",35);

        System.out.println(ivan.compareTo(koko));

    }
}
