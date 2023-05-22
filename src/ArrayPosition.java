import java.sql.Array;

public class ArrayPosition {

    private int[] array;

    public ArrayPosition()
    {
        array = new int[10];
        for(int i = 0 ; i < array.length ; i++)
        {
            array[i]= i*10;

        }
    }

    public int position (int position)
    {
        int value = 0;
        if(position >= array.length)
        {
            throw new ArrayIndexOutOfBoundsException("Out of bounds, mate.");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if(position == i){
                    value =array[i];
                }
            }
        }
        return value;
    }

}
