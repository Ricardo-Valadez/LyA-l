import java.util.regex.*;

public class Ejemplo1 {
    
    public static void main(String[] args) {
        String patron1 = "a[mp]";
        Pattern p1 = Pattern.compile(patron1);

        String texto1 = "Estamos aprendiendo a usar expresiones regulares";
        Matcher m = p1.matcher(texto1);

        String resultado = m.replaceAll("x");
        System.out.println(resultado);
    }
}