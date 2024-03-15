// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
        
//     }
// }

class Solution {
    public static ArrayList<Integer> findDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                set1.add(arr[i]);
            }
        }
        
        // Convert HashSet to ArrayList
        ArrayList<Integer> duplicatesList = new ArrayList<>(set1);
        
        return duplicatesList;
    }
}
