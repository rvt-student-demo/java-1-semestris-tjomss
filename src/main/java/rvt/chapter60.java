
class Exercise1
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 

    int sum = val[0] + val[1] + val[2] + val[3];
 
    System.out.println( "Sum of all numbers = " + sum );
  }
}
class Exercise2
{
  public static void main ( String[] args )
  {
    int[] val = {13, -4, 82, 17}; 
    int[] twice = new int[4]; // Create new array

    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    twice[0] = 2 * val[0];
    twice[1] = 2 * val[1];
    twice[2] = 2 * val[2];
    twice[3] = 2 * val[3];
 
    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
   }
}
class Exercise3
{
  public static void main ( String[] args )
  {
    int[] valA = {13, -22, 82, 17}; 
    int[] valB = {-12, 24, -79, -13};
    int[] sum  = {0, 0, 0, 0};
    
    sum[0] = valA[0] + valB[0];
    sum[1] = valA[1] + valB[1];
    sum[2] = valA[2] + valB[2];
    sum[3] = valA[3] + valB[3];
 
    System.out.println( "sum: " 
        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
   }
}
class Exercise4
{
  public static void main ( String[] args )
  {
    int[] valA = {13, -22, 82, 17}; 
    int[] valB = {0, 0, 0, 0};
    
    valB[0] = 25 - valA[0];
    valB[1] = 25 - valA[1];
    valB[2] = 25 - valA[2];
    valB[3] = 25 - valA[3];
 
    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
   }
}
