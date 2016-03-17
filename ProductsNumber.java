import java.util.Arrays;

public class ProductsNumber {

	public static void main(String args[]){
		ProductsNumber pn = new ProductsNumber();
		int nums[] = {1,2,6,5,9};

		pn.getProductsOfAllIntsExceptAtIndex(nums);
	}

	public void getProductsOfAllIntsExceptAtIndex(int nums[]) {
		
		int[] prodsExceptIndex = new int[nums.length];

		int prodSoFar = 1;
		for(int i = 0; i < prodsExceptIndex.length; i++) {
			prodsExceptIndex[i] = prodSoFar;
			prodSoFar *= nums[i];
		}

		prodSoFar = 1;
		for(int i = prodsExceptIndex.length - 1; i >= 0; i--){
			prodsExceptIndex[i] *= prodSoFar;
			prodSoFar *= nums[i];
		}

		System.out.println(Arrays.toString(prodsExceptIndex));
	}

}