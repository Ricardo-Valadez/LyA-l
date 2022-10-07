import java.util.regex.*;

public class Ejemplo2 {

    public static void main(String[] args) {
        String patron = "[0-9]+";
        Pattern p = Pattern.compile(patron);

        String texto = "uno1dos2tres3cuatro4";

        String[] coicidencias = p.split(texto);

        for (String s : coicidencias){
            System.out.println(s);
        }
    }
}
