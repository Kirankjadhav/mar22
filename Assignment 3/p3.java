/*
Pattern 3
*
**
***
****
*****
*/
class p3
{
	public static void main(String args [])

{
	
	for(int i=0;i<=4;i++)//Row
		{
			for(int j=0;j<=i;j++)//Column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}