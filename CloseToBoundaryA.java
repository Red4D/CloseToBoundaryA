import java.util.*;
public class CloseToBoundaryA
{
    public static void main (String [] args)
    {
      double[] inputs = {0, 0.000027535691114583473, 0.004070137715896128, 0.18242552380635635, 0.2689414213699951, 0.425557483188341, 0.47178002201963243, 0.5, 0.5768852611320463, 0.6813537337890256, 0.7858349830425586, 0.8797431375322491, 0.9993891206405656, 1, 1};
      System.out.print(boundaryArray(inputs));
    }

    public static double closeToBoundary(double input)
    {
      double num = input;
      if(input >= .5)
      {
        num = 1 - input;
      }
      return num/2;
    }

    public static String boundaryArray(double[] array)
    {
      String output="";
      for (int i=0; i < array.length; i++)
      {
        output += ("Input: " + array[i] + "   Output: " + closeToBoundary(array[i]) + "\n");
      }
      return output;
    }
}
