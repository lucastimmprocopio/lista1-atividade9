import java.util.Scanner;

public class lt1_at9
{
    public static void main(String[] args) throws Exception {
        //Req_1: Peça uma temperatura em graus Fahrenheit.
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        //Req_2: Transforme e exiba em graus Celcius.

        double celcius = 5 * ((fahrenheit - 32 ) / 9);

        System.out.println(fahrenheit + " graus fahrenheit, equivalente a " + celcius + " graus Celcius");

    }
}
