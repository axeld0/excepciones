public class CircleRadius {
    /**Escribe un programa que pida al usuario el radio de un círculo y muestre su área.
     *   Si el usuario introduce un valor negativo, el programa debe lanzar una excepción de tipo IllegalArgumentException.
     */


    public double radius;


    public CircleRadius()
    {
        radius = 0;
    }




    public double calculateArea(double radius) throws IllegalArgumentException
    {
        if( radius < 0)
        {
            throw new IllegalArgumentException("Nope, no negative numbers.");

        }
        else {
            double area = Math.PI * Math.pow(radius, 2);
            return area;
        }
    }
}
