package searchAlgorithm;

public class LinearSearch {
    public static int linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí của phần tử tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy phần tử
    }
}
