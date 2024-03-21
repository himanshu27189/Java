package LoopingStatements;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j%2==0) 
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
	
			}
		System.out.println();
	}

}
}
