/*
Pattern 5
1
22
333
4444
55555
*/
class p5
{
	public static void main(String args [])

{
int ch=65;	
	for(int i=0;i<=4;i++)//Row
		{
			for(int j=0;j<=i;j++)//Column
			{
				System.out.print((char)(ch + i)+" ");
			}
			System.out.println();
		}
		
	}
}