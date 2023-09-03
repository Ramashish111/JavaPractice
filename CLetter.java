
public class CLetter {

	public static void main(String[] args) {
		
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>1 && i==0 || j==0 && (i>1 && i<n-2) || j>1 && i==(n-1) || i==1&&j==1 || i==n-2&&j==1)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
			
			System.out.println();
		}

	}

}
