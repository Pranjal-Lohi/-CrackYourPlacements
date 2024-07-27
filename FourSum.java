import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        if (arr == null || arr.length < 4) return new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long)arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        res.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(res;
	}
}
