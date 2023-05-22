import java.util.Scanner;

public class Division {


    /**Escribe un programa que pida al usuario dos números enteros y muestre el resultado de la división del primer número por el segundo.
     *   Si el segundo número es cero, el programa debe lanzar una excepción de tipo ArithmeticException.
     */

    int num1;
    int num2;


    public Division()
    {
        num1 = 0;
        num2 = 0;
    }

    public Division(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }


      public float dividir ()
      {
          if(num2 == 0)
          {
              throw new ArithmeticException("No se puede dividir por cero compa.");
          }
          else {
              return (float)num1/(float) num2;
          }
      }

}
