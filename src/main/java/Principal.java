
/**
 * Programa principal.
 *
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {

        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota", 500);

        severino.start();
        raimundo.start();
    }
}
