package array;

public class Arrayten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,40,50,60};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int i = 0, j = a.length-1;
		System.out.println(j);
		System.out.println(i);
		//int j = a.length-1;
		//int temp = a[i];
		while(i!=j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
