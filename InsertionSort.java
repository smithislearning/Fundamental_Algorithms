private static int[] insertionSort(int[] inPut) {
	for(int j = 1; j < inPut.length; j++) {
		int key = inPut[j];
		int i = j - 1;
		while(i >= 0 && inPut[i] > key) {
			inPut[i + 1] = inPut[i];
			inPut[i] = key;
			i--;
		}
	}
	return inPut;
}
