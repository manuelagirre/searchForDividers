package searchForDividers;


public class SearchForDivider {
	public static void main(String[] args){
		long time = System.currentTimeMillis();
		getDividers(791999999);
		System.out.println("System time consumption: " + (System.currentTimeMillis() - time) + "ms");
	}
	
	private static void getDividers(int num){
		System.out.println("Dividers of number " + num + ":");
		int upperLimit = num;
		for (int i = 1; i < upperLimit; i++){
			if (num%i == 0){
				System.out.print(i + " ");
				System.out.print(num/i + " ");
				upperLimit = num/i;
			}
		}
		System.out.println();
	}
}
