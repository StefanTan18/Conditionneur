/*
  We created an array ranging from size 100 to 9900, incremented by 100, 
  to represent the situation for the average case, best case, and worst case.
  Next we timed the quicksort of the array for 20 trials for each array and we 
  found the average of the 20 trials.  
*/


public class QuickSortTester{
    public static void main(String[] args){
	/*
	//average case
        int sum1 = 0;
	for (int i = 0; i < 10000; i += 100){
	int[] arr1 = (QuickSort.buildArray(i, i));
	    	
	for (int a = 0; a < 20; a++){
	QuickSort.shuffle(arr1);
	long timeInit = System.nanoTime();
		
	QuickSort.qsort( arr1 );
		
	long timeFinal = System.nanoTime();
	long timeOne = (timeFinal - timeInit);
	sum1 += timeOne;
	}
	System.out.print(i + "," + (sum1 / 20.) + "\n");
	}


	//best case: The pivot is the median of the array.
	int sum2 = 0;
	for (int i = 0; i < 10000; i += 100){
	int[] arr2 = new int[i];
	for (int x = 0; x < i; x++) {
	arr2[x] = x;
	}
	for (int a = 0; a < 20; a++){
	long timeInit = System.nanoTime();
		
	QuickSort.qsort( arr2 );
		
	long timeFinal = System.nanoTime();
	long timeOne = (timeFinal - timeInit);
	sum2 += timeOne;
	}
	System.out.print(i + "," + (sum2 / 20.) + "\n");
	}
	*/
	//worst case: The pivot is the smallest or largest element of the array. 
        int sum3 = 0;
        for (int i = 0; i < 10000; i += 100){
	    int[] arr3 = new int[i];
	    for (int x = 0; x < i; x++) {
		arr3[x] = x;
	    }
	    for (int a = 0; a < 20; a++){
		long timeInit = System.nanoTime();
		
		QuickSort.qsortL( arr3 );
		
		long timeFinal = System.nanoTime();
		long timeOne = (timeFinal - timeInit);
		sum3 += timeOne;
	    }
	    System.out.print(i + "," + (sum3 / 20.) + "\n");
	}
    }
}
