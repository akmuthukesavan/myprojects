package array;

public class Arraythird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sslc = {90,91,92,93,94};
		int i=0;
		int max=0;
		while(i<sslc.length)
			{
				if(sslc[i]>=max)
					max=sslc[i];
				i++;
			}
		System.out.println("Maximum Marks of SSLC  " + max);	
	}


	}