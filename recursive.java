class recursive{
public static int binarySearch(int[] element, int lowestValue, int highestValue, int  number){
	
		if (lowestValue > highestValue) {
			return -1;
		}


		int middleValue = (lowestValue + highestValue) / 2;

		if ( number == element[middleValue]) {
			return middleValue;
		}
  
		else if ( number < element[middleValue]) {
			return binarySearch(element,lowestValue,middleValue - 1,  number);
		}

		else {
			return binarySearch(element, middleValue + 1,highestValue,  number);
		}
	}

	public static void recursiveSearch(){
	
		int[] element = { 2, 5, 6, 8, 9, 10 };
		int searchElement = 5;
    int lowestValue = 0;
		int highestValue= element.length - 1;
		int indexNumber = binarySearch(element, lowestValue, highestValue,searchElement);

		if (indexNumber != -1) {
			System.out.println("Entered element found at index Number " + indexNumber);
		} else {
			System.out.println("Entered element not found in the array");
		}
	}
}
