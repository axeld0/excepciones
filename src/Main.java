import javax.print.attribute.standard.NumberUp;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            /**1**/
            Division d = new Division(10,2);
           d.dividir();
            /**2**/
            StringTester st = new StringTester();
            System.out.println(st.stringLength("ojo"));
            /**3**/
            ArrayPosition ap = new ArrayPosition();
            System.out.println(ap.position(9));
            /**4**/
            CircleRadius cr = new CircleRadius();
            System.out.println(cr.calculateArea(12));
            /**5**/
            BankAccount ba = new BankAccount();
            System.out.println(ba.extract(10000));
            /**6**/

        }
        catch (ArithmeticException e)
        {
            /**1**/
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            /**2**/
            System.out.println(e.getMessage());
        }
        catch (IndexOutOfBoundsException e)
        {
            /**3**/
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e)
        {
            /**4**/
            System.out.println(e.getMessage());
        }
        catch (SaldoInsuficienteException e)
        {
            /**5**/
            System.out.println(e.getMessage());
        }




    }
}
