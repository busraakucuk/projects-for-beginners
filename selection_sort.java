public class selection_sort {
    public static void printarr(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        for(int i = 0; i < arr.length; i++){

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j])  
                {  
                    int temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp; 
                }
            }
            printarr(arr);
            System.out.println();
        }   
    }
}
