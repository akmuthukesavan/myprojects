package array;

public class Arraysix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int[] ar={10,20,30,40,50};
		System.out.println("Before changes");
		for(i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		int temp = ar[i];
		System.out.println("hi" +temp);
		//int i = 0;
		//while(i<ar.length-2)
			//{
				//ar[i] = ar[i];
				//System.out.println("Assambled Value are "+ar[i]);
				//i++;
			//}
		ar[i] = temp;
		System.out.println("Assambled Value are ");
		//System.out.println(temp);
		
		for(i=0;i<ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		//System.out.println("Value are  " +i);
	}

}
