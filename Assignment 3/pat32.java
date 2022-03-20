/*
Pattern 32
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *
*/
class pat32{
          
 
    public static void main(String args[])   
    {   
    int row=5,r,c,d;
    for ( r= 0; r<= row -1 ; r++)
       {
            for (  c=0; c <r; c++)
                  System.out.print(" ");
            for (  c=r; c<=row -1; c++) 
                 System.out.print("* "); 
            System.out.println();
        } 
        
    for (  r= row -1; r>= 0; r--)
       {
            for (  c=0; c< r ;c++)
                System.out.print(" ");
             for (  c=r; c<=row -1; c++)
                System.out.print("* ");
            System.out.println();
        }
    } 
}  