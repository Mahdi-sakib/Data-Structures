class Task06 {
  
  static int binSearch(int[] a, int x, int l, int r) {
  
    if(l <= r){
    
    int m = (l+r) / 2;
    
    if(a[m] == x) return m;
    
    if(x < a[m]){
      
      return binSearch(a, x, l, m-1);
      
    }
    else {
      
      return binSearch(a, x, m+1, r);
      
    }
  }
    return -1;
  }
  
  public static void main(String args[]) {
  
    int array[] = {1,2,3,4,5,6,7};
    
    int r = binSearch(array, 3, 0, array.length - 1);
    
    System.out.println("x was found at " + r);
  }
}