class iterative{
  int binarySearch(int[] array, int number){
    int lowestValue = 0, highestValue = array.length - 1;
		while (lowestValue <= highestValue){
			int middleValue = (lowestValue+ highestValue) / 2;
			if (number == array[middleValue]) {
				return middleValue;
			}
			else if (number < array[middleValue]) {
				highestValue = middleValue - 1;
			}
			else {
				lowestValue = middleValue + 1;
			}
		}
		return -1;
	}
  public  void iterativeSearch(){
	
		int[] array = { 2, 5, 6, 8, 9, 10 };
		int searchElement = 10;

		int indexNumber = binarySearch(array, searchElement);

		if (indexNumber != -1) {
			System.out.println("Entered element is at index Number" +" "+ indexNumber);
		} else {
			System.out.println("Element not found in the array");
		}
  }
  }
