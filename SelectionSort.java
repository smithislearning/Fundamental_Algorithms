/**
Worst case: O(n^2)
Best case: O(n^2)
Average: O(n^2)
**/
private static int[] selectionSort(int[] inPut) {
	for(int i = 0; i < inPut.length; i++) {
		int smallest = Integer.MAX_VALUE;
		int jSmallest = 0;
		for(int j = i; j < inPut.length; j++) {
			if(smallest > inPut[j]) {
				smallest = inPut[j];
				jSmallest = j;
				inPut[j] = inPut[i];
				inPut[i] = smallest;
			}
			
		}
	}
	return inPut;
}
