class Solution{
    public int findKthPositive(int[] arr, int k) {
        int missing = 0, i = 0, n = 1;
        while (k > 0) {
            if (i < arr.length && arr[i] == n) i++;
            else k--;
            n++;
        }
        return n - 1;
    }
}