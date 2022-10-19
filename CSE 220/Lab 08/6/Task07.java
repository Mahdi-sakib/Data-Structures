class Task07 {
  
  static void mergeSort(int[] a) {
    
    int n = a.length;
    
    if(n < 2)  // base case
      return;
    
    int mid = n / 2;
    
    int[] left = new int[mid];
    
    int[] right = new int[n - mid];
    
    for(int i = 0; i < mid - 1; i++) {
      
      left[i] = a[i];
      
    }
    
    for(int j = mid; j < n - 1; j++) {
      
      right[j - mid] = a[j];
      
    }
    
    mergeSort(left);
    
    mergeSort(right);
    
    merge(left, right, a);
  }
  
  static void merge(int[] lArray, int[] rArray, int[] array) {
  
    int nL = lArray.length;
    
    int nR = rArray.length;
    
    int i = 0, j = 0, k = 0;
    
    while(i < nL && j < nR) {
      
      if(lArray[i] <= rArray[j]) {
        
        array[k] = lArray[i];
        
        i = i + 1;
      }
      
      else {
        
        array[k] = rArray[j];
        
        j = j + 1; 
      }
    
      k = k + 1;
      
    }
    
    while(i < nL) {
      
      array[k] = lArray[i];
      
      i++;
      
      k++;
    }
    
    while(j < nR) {
      
      array[k] = rArray[j];
      
      j++;
      
      k++;
      
    }
  }
  
  static void printArray(int[] arrayPrint) {
    
    for(int item : arrayPrint) {
      
      System.out.print(item + " ");
    }
    
    System.out.println();
    
  }
  public static void main(String args[]) {
  
    int[] array = {10, 20, 5 , 4 , 5, 1, 10}; 
    
    mergeSort(array);
      
    printArray(array);
  }
}