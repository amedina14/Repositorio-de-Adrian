import Familia.Padre;
import Familia.Hijo;

public class Main {

    public static void main(String[] args) {
	    Padre p1 = new Padre();
        Hijo h1 = new Hijo();
        p1.mostrar();
        p1.setA("Andres");
        System.out.println("Padre\n"+p1.getA());
        h1.mostrar();
        h1.decir();
        h1.setA("Andres");
        h1.setB("AndresJr");
        System.out.println("Hijo\n"+ h1.getA() +" "+ h1.getB());
    }
}
