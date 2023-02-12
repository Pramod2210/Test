package Test4;

public class BoolearArray {
	//8. Create an array of 5 Boolean values . Hardcode array is fine. Count how many of them are
	//‘true’ . [1m]

		public static void main(String[] args) {

			boolean b[] = {true,false,true,false,true};
			int cnt = 0;
			for(int i = 0;i<b.length;i++)
			{
				if(b[i] == true)
				{
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

