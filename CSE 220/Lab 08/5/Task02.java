public class Task02{
    
    static void bubbleSort(int[] arr, int pos){
        if (pos == arr.length-1) return;
        
        loopSort(arr, 0);
        
        bubbleSort(arr, pos+1);
    }
    
    static void loopSort( int[] temp, int i){
        if (i == temp.length-1) return;
        
        if (temp[i+1] < temp[i]){
            int ob= temp[i+1];
            temp[i+1]= temp[i];
            temp[i]= ob;
        }
        
        loopSort(temp, i+1);
    }
    
    public static void main (String[] args){
        int[] num= {26, 16, 12, 10, 9, 7, 5, 4, 3, 2, 1};
        bubbleSort( num, 0);
        
        for (int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}