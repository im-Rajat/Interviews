class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        int n = time.length;
        int arr[] = new int[60];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int duration = time[i] % 60;
            int toPairDuration = (60 - duration) % 60;
            if (arr[toPairDuration] > 0) {
                count = count + arr[toPairDuration];
            }
            arr[duration] = arr[duration] + 1;
        }

        return count;
    }
}