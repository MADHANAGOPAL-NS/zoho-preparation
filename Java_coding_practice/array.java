public class array{
    public static void main(String args[]){
        int arr[][] = new int[4][5];

        int k = 0;

        //inserting elements in 2D array
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = k;
                k = k + 1;
            }
        }

        System.out.println("The elements of 2D array are");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}