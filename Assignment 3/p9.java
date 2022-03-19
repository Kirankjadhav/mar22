/*
Pattern 9
     A
    A B
   A B C
  A B C D
 A B C D E
*/
class p9
{            
    public static void main(String[] args)
{
        for (int i = 0; i < 5; i++) 
		{ int ch = 65; for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++)
        {
            System.out.print((char) (ch + k) + " ");
        }
        System.out.println();
    }
}
}