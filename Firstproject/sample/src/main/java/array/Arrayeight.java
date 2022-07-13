package array;

public class Arrayeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {-10,20,30,40,-50,-60};
		int i = 0;
		int negative = 0;
		int j = 0;
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
				negative++;
				//System.out.println(i);
			}
		int[] b = new int[negative];
		//System.out.println("hi");
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				//System.out.println(i);
				b[j] = a[i];
				j++;
			}
		}
		
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
