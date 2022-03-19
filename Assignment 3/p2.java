/*
Pattern 2
A
A B
A B C
A B C D
A B C D E
*/
class p2
{
	public static void main(String args [])

{
int ch=65;	
	for(int i=0;i<=4;i++)//Row
		{
			for(int j=0;j<=i;j++)//Column
			{
				System.out.print((char)(ch + j)+" ");
			}
			System.out.println();
		}
		
	}
}