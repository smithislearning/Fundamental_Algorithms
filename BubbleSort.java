/**
Worst case: O(n^2)
Best case: O(n^2)
Average: O(n^2)
**/
private static int[] bubbleSort(int[] inPut) {
	for(int i = 1; i < inPut.length; i++) {
		for(int j = i; j > 0; j--) {
			int tmp = inPut[j];
			if(inPut[j] < inPut[j - 1]) {
				inPut[j] = inPut[j - 1];
				inPut[j - 1] = tmp;
			}
		}
	}
	return inPut;
}