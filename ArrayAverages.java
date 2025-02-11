//import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    //Goes through each row and prints out the average for each row
    System.out.println("\nRow Averages\n");
    int rowCount = 0;
    for(int[] row: ray)
    {
      rowCount++;
      int rowTotal = 0;
      for(int col: row)
        rowTotal+= col;
      System.out.println("Row " + rowCount + " Average: " + rowTotal/ray[0].length);
    }

  }

  public void columnAverages(){
    //Creates an array that will be used as the sums of each column | Really the easiest solution and did it yesterday on the intro 
    System.out.println("\nColumn Averages\n");
    int[] colSums = new int[ray[0].length];
    
    //Its the same as going through rows but instead just tracks the sums of each row using the new array "colSums"
    for(int[] row: ray)
     { 
    
      int colNum  = 0;

      for(int num: row)
      {
        colSums[colNum]+=num;
        colNum++;
      }
     }

    //Printing out each average 
    int colNum  = 0;
    for(int x: colSums)
    {
      colNum++;
      System.out.println("Col " + colNum + " Average: " + x/ray.length);
    }

  }

  public void arrayAverage(){
    //Add em all up and print the average
    System.out.println("\nArray Average\n");

    int sum = 0;
    for(int[] row: ray)
      for(int col: row)
        sum+= col;
    System.out.println("Average: " + sum/(ray.length*ray[0].length) + "\n");
  }


//For some reason it wouldnt print out my Arrays. Im commenting it and moving it to main

/*
  public String toString(){
    
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "" ;
  }

*/
}
