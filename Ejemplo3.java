import java.util.regex.*;

public class Ejemplo3 {

    public static void main(String[] args) {
        String patron1 = "[s]";
        Pattern p1 = Pattern.compile(patron1);

        String texto1 = "Estamos aprendiendo a usar expresiones regulares";
        Matcher m = p1.matcher(texto1);

        while (m.find()){
            System.out.printf(
                "Econtrado %s en la posicion %d y acaba en %d\n",
                m.group(),m.start(),m.end()
            );
        }
    }
}
