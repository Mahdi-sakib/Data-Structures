class Task02 {

  static void insertionSort(int arr[], int n)
    {
        
        if (n <= 1)
            return;
      
        
        insertionSort( arr, n-1 );
      
        
        int last = arr[n-1];
        int j = n-2;
      
        
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
  
  static void printArray(int[] a) {
    
    for(int item : a) {
      
      System.out.print(item + " ");
      
    }
    System.out.println();
  }
public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6};
      
        insertionSort(arr, arr.length);
         
        printArray(arr);
        
    }
}


     