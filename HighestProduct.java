import java.lang.Math;

public class HighestProduct {

	public static void main(String args[]) {
		HighestProduct hp = new HighestProduct();

		int list_of_ints[] = {-10,-10,3,2,4,200};

		hp.highestProductofThree(list_of_ints);
	}

	public void highestProductofThree(int list_of_ints[]) {

		if(list_of_ints.length < 4) {
			throw new IllegalArgumentException("Less than 4 items");
		}

		int highest = Math.max(list_of_ints[0],list_of_ints[1]); //10
		int lowest = Math.min(list_of_ints[0],list_of_ints[1]);	//9

		int highest_productOf2 = list_of_ints[0] * list_of_ints[1]; //90
		int lowest_productOf2 = list_of_ints[0] * list_of_ints[1];	//90

		int highest_productOf3 = list_of_ints[0] * list_of_ints[1] * list_of_ints[2]; //360

		for(int i = 2; i < list_of_ints.length; i++) {

			int current = list_of_ints[i];

			highest_productOf3 = Math.max(Math.max(current * highest_productOf2, current * lowest_productOf2),highest_productOf3);

			highest_productOf2 = Math.max((current * highest), highest_productOf2);
			lowest_productOf2 = Math.min((current * lowest), lowest_productOf2);

			highest = Math.max(current, highest);
			lowest = Math.min(current, lowest);
		}

		System.out.println(Integer.toString(highest_productOf3));
	}

}