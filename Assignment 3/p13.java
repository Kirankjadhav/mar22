/*
Pattern 13
    A
   B B
  C C C
 D D D D
E E E E E
*/
class p13
{            
    public static void main(String[] args)
{
char ch=64;
        for (int i = 1; i <= 5; i++) 
		{  for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++)
        {
            System.out.print ((char) (ch + i) + " ");
        }
        System.out.println();
    }
}
}