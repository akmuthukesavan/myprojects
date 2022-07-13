package array;

public class Arrayseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,60,70,80};
		int[] b = {40,50};
		int len = a.length>b.length?a.length:b.length;
		int small = a.length<b.length?a.length:b.length;
		int[] c = new int[len];
		int i = 0;
		for(i=0;i<small;i++)
		{
			c[i] = a[i] + b[i];
		}
		while(i<len)
		{
			c[i] = a[i];
			i++;
		}
		//c[i] = a[i];
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
}