import java.util.ArrayList;

public class UniquePermutationsOfArray {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        arr.sort(null);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[n];
        
        solve(arr, used, temp, result);
        return result;
    }
    
    private static void solve(ArrayList<Integer> arr, boolean[] used, 
    ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result){
        if(temp.size() == arr.size()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i<arr.size(); i++){
            if(used[i] || (i>0 && arr.get(i).equals(arr.get(i-1)) && used[i-1])) {
                continue;
            }
            used[i] = true;
            temp.add(arr.get(i));
            solve(arr, used, temp, result);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
};

