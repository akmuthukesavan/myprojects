package array;

public class Arrayfour {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sm= {10,-200,-30,-40,-50};
//System.out.println(Integer.MAX_VALUE);
//System.out.println(Integer.MIN_VALUE);

		int i=0;
		int max = Integer.MIN_VALUE, secondmax = Integer.MIN_VALUE;
		while(i<sm.length) {
			if(sm[i]>max)
			{
				secondmax=max;
				max=sm[i];
			}
			else if(sm[i]>secondmax)
			{
				secondmax = sm[i];
			}
			i++;
		}
		System.out.println("Second Maximum is " + secondmax);
		System.out.println("Maximum is " + max);
	}

}
