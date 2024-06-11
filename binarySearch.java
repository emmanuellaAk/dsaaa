public class binarySearch {

  public static int binarySearch(int[] arr, int target) {
      int left = 0;
      int right = arr.length - 1;

      while (left <= right) {
          int mid = left + (right - left) / 2; // To prevent potential overflow
          
          if (arr[mid] == target) {
              return mid; // target found
          } else if (arr[mid] < target) {
              left = mid + 1; // search in the right half
          } else {
              right = mid - 1; // search in the left half
          }
      }

      return -1; // target not found
  }

  public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int target = 7;
      int result = binarySearch(array, target);

      System.out.println(result); // Output: 6 (the index of the target element)
  }
}
