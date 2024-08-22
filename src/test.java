import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int item = 65;

        int[] List = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
                54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                80, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int result = binarySearch(List, item);

        if (result != -1){
            System.out.print("Item index:" + result);
        }
        else {
            System.out.print(" Item Not found");
        }


    }

    private static int binarySearch(int[] List, int item){

        int low = 0;
        int high = List.length - 1;

        while (low <= high){
            int mid = (high + low ) / 2;
            int guess = List[mid];
            if (guess == item){
                return mid;
            }
            if (guess < item){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }









}




