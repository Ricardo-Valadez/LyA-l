import java.util.regex.*;


public class Ejemplo4 {

    public static void main(String[] args) {

        String patron1 = "[a-m&&h-z]";
        Pattern p1 = Pattern.compile(patron1);
    
        String texto1 = "h";
        Matcher m = p1.matcher(texto1);
    
        if (m.matches()){
            System.out.println("Coincide");
        } 
        else {
            System.out.println("No coincide");
        }
    }
}
