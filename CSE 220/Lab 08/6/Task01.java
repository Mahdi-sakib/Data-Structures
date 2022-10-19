class Task01{
  
  static void selectionSort(int[] array, int start)
{
    if ( start >= array.length - 1 )
        return;
    int min = start;
    for ( int i = start + 1; i < array.length; i++ )
    {
        if (array[i] < array[min] )
            min = i;
    }
    int temp = array[start];
    array[start] = array[min];
    array[min] = temp;
    selectionSort(array, start + 1);
}
  
  static void printArray(int arr[]) {
  
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
    System.out.println();
  }
    
  public static void main(String args[]){
    
    
    int a[] = {5, 10, 1, 2, 3, 6};
    
    selectionSort(a,0);
    
    printArray(a);
  }
  }
    

