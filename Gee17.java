import java.util.Arrays;

public class Gee17{
  public static void main(String[] args){

    //Declare and initilizing ray
    int[][] ray = new int[7][7];
    ArrayAverages twoDee = new ArrayAverages(ray);

    //Setting the Values of the Array
    int count =1;
    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[0].length; col++)
      {
        ray[row][col]=count;
        count++;
      }

    //Printing out all of the ints in the 2D Array | Couldnt get toString to work idk
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    } 
    //Method Printing
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
