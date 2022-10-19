public class Task01{
    
    static int binSearch(int[] n,int f,int r,int k){
        if (r>=1){
            int mid= (f+r)/2;
            if (n[mid] == k) return mid;
            else if (k < n[mid]) return binSearch(n, f, mid-1, k);
            else return binSearch(n, mid+1, r, k);
        }
        return -1;
    }
    
    
    
    
    
    
    public static void main (String[] args){
        int[] num= {1, 8, 13, 17, 19, 21, 23, 28, 33, 41, 45, 47, 48, 49, 51, 53};
        /*int key= 100;
        int front=0, rear= num.length-1, mid=0;
        while (front<=rear){
            mid= (rear+front)/2;
            if (key == num[mid]){
                System.out.println("Key found at:"+mid); 
                break;
            }
            else if (key < num[mid]) {
                rear= mid-1;
            }
            else if (key > num[mid]) {
                front= mid+1;
            }
        }*/
        System.out.println("Key found at:"+binSearch(num, 0, num.length-1, 8)); 
    }
}
