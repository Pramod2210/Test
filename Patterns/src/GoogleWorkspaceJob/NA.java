package GoogleWorkspaceJob;

public class NA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a1[] = {'A','B','C','D'};
		char a2[] = {'P','Q','A','D'};
	
		
		for(int i = 0;i< a1.length;i++)
		{
			int count = 0;
			int k = 0;
			for(int j = 0;j< a2.length;j++)
			{
				if(a1[i] == a2[j])
				{
					count++;
					k=j;
				}
			}
		
				if(count ==  1 )
				{
					System.out.println(a1[i]+"-"+k);
				}
				else
				{
					System.out.println(a1[i]+"-"+"NA");
				}	
			}
			}
}
	


