import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad <= 0) {

            System.out.println("Usted no existe");

        } else {
            
        System.out.println("ingrese su sexo (f/m): ");

        char sex = scanner.next().charAt(0);
         //para pedir un solo caracter
        System.out.println("porta armas? Si (y), No (n)");
        
        char arma = scanner.next().charAt(0);

        }
        
        if (arma == 1 || edad < 18) {

            System.out.println(" usted no puede pasar ");

        } else if (sex == 'f' && edad >= 18) {

            System.out.println("Puede pasar y tomar bebidas");

        } else if (sex == 'm' && edad >= 18 && edad <=21) {

            System.out.println("Puede pasar pero no puedes tomar bebidas");

        } else if (sex == 'm' && edad > 21) {

            System.out.println("Puede pasar y tomar bebidas");
        }
            
        
        
        /*
         * operadores relacionales 
         * <, >, <=, >= , ==, != 
         */
    }
}
