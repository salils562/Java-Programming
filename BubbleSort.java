public class BubbleSort {
    public static int[] bubbleSort(int []arr,int size){
    int i=0,j=0;    
    int temp;
    while(i<(size)){
        j=0;
        while(j<(size-1)){    
        if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        j++;
        }
        i++;
    }
    return arr;
    }
    public static void main(String[] args){
        int []arr={4,222,11,21,3,1,44};
        int size=arr.length;
        int []Sorted=bubbleSort(arr, size);
        for(int i=0;i<size;i++){
            System.out.println(Sorted[i]);
        }

    }
}
