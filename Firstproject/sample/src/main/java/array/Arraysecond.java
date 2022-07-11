package array;

public class Arraysecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the marks");
		int[] sslc = {90,91,92,93,94};
	int count=0;
		for(int i=0; i<sslc.length; i=i+2)
			{
				if(sslc[i]==100)
					count++;
			}
		System.out.println("No. of Centum  " +count);	
	}

}
