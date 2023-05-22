public class StringTester {

    /** Escribe un programa que pida al usuario que introduzca una cadena de texto y muestre su longitud.
     *  Si el usuario introduce un número en lugar de una cadena, el programa debe lanzar una excepción de tipo NumberFormatException.
     **/

    Object stringSolicited;

    public StringTester()
    {
        stringSolicited = new Object();
    }


    public int stringLength(Object o) throws NumberFormatException
    {
        int length = 0;
        if ( o instanceof  Integer || o instanceof Double || o instanceof Float)
        {
            throw new NumberFormatException("That was a number, not a string");
        }
        else if (o instanceof String)
        {
           length =  ((String) o).length();
        }
        return length;
    }

}
