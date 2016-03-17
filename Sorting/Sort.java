import java.util.Arrays;
import java.util.Random; 

public class Sort {

	public static void main(String args[]){
		Sort sort = new Sort();
		Random rndm = new Random();
		int[] num = new int[rndm.nextInt(16)];

		intitializeNum(num);

		sort.insertion(num);
	}

	public void insertion(int num[]) {
		int j,i,key;

		for(j=1; j < num.length; j++) {
			key = num[j];
			for(i=j-1; (i>=0) && (num[i] > key); i--) {
				num[i+1] = num[i];
			}
			num[i+1] = key;
		}

		System.out.println(Arrays.toString(num));
	}

	public static void intitializeNum(int num[]) {
		Random rndm = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = rndm.nextInt(100);
		}

		System.out.println(Arrays.toString(num));
	}

}