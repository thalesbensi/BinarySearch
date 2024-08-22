import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int item = 5;
        int [] List = {1,3,5,7,9};

        int result = binarySearch(List, item);
        if (result != -1) {
            System.out.println("A posição do item é " + result);
        } else {
            System.out.println("Not Found");
        }

       scan.close();
    }

    public static int binarySearch(int[] List, int item ){
        int low = 0;
        int high = List.length - 1;

            while( low <=  high){
                int mid = (low + high) / 2;
                int guess = List[mid];
                if (guess == item) {
                    return mid;
                } if (guess < item) {
                  low = mid + 1;
                } else   {
                    high = mid - 1;
                }
            }
       return -1;
    }

    }

