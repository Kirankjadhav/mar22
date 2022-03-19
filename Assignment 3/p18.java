/*
Pattern 18
A B C D E F
A B C D E
A B C D
A B C
A B
A

*/
class p18
{            
    public static void main(String[] args)
{   
 for (int i = 5; i >= 0; i--)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
}}}