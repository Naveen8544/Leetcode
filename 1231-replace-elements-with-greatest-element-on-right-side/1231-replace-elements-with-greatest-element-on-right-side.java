class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                result[i] = -1;
            } else {
                int maxVal = arr[i + 1];
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > maxVal) {
                        maxVal = arr[j];
                    }
                }
                result[i] = maxVal;
            }
        }

        return result;
    }
}
