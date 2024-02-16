import java.util.ArrayList;

public class Algorm {
    public static void removeConsecutiveDuplicates(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i); 
            }
        }
    }
    public static void removeElement(ArrayList<Integer> list, int elementToRemove) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(elementToRemove)) {
                list.remove(i);
            }
        }
    }
    public static void addToAscendingOrder(ArrayList<Integer> list, int elementToAdd) {
        int index = 0;
        while (index < list.size() && list.get(index) < elementToAdd) {
            index++;
        }
    }
    public static boolean checkReverseOrder(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0, j = list2.size() - 1; i < list1.size(); i++, j--) {
            if (!list1.get(i).equals(list2.get(j))) {
                return false;
            }
        }
        return true;
    }
    public static int findMaximum(ArrayList<Integer> list) {
        int maxNumber = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        return maxNumber;
    }
    public static int findMinimum(ArrayList<Integer> list) {
        int minNumber = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        return minNumber;
    }
    public static String findShortestString(ArrayList<String> list) {
        String shortestString = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            String currentString = list.get(i);
            if (currentString.length() < shortestString.length()) {
                shortestString = currentString;
            }
        }
        return shortestString;
    }
    public static String longestString(ArrayList<String> strings) {
        if(strings.isEmpty())
        {
            return "";
        }
        String longest = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            String currentString = strings.get(i);
            if (currentString.length() > longest.length()) {
                longest = currentString;
            }
        }
        return longest;
    }
    public static int absDiff(ArrayList<Integer> ar1, ArrayList<Integer> ar2) {
        if (ar1.isEmpty() || ar2.isEmpty() || ar1.size() != ar2.size()) {
            return 0;
        }
        int maxDiff = 0;
        for (int i = 0; i < ar1.size(); i++) {
            int diff = Math.abs(ar1.get(i) - ar2.get(i));
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
    public static double calcMean(ArrayList<Double> nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }
    public static void reverseEle(ArrayList<Integer> nums) {
        int size = nums.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(size - 1 - i));
            nums.set(size - 1 - i, temp);
        }
    }
    public static boolean hasConsec(ArrayList<Integer> nums) {
        int size = nums.size();
        for (int i = 0; i < size - 1; i++) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                return true;
            }
        }
        return false;
    }
    public static int findNegative(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                return i;
            }
        }
        return -1;
    }
    public static boolean twoSame(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
