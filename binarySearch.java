import java.util.Scanner;
public class binarySearch {
    public static int BinarySearch(int []arr,int size,int key){
        int start=0;
        int end=size-1;
        int mid;
        mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      int []arr={1,2,3,4,5,6};  
      System.out.println("Enter the element to search in array");
      int key;
      key=sc.nextInt();
      int size=arr.length;
      int ans=BinarySearch(arr, size, key);
      if(ans==-1){
          System.out.println("ERR Element not found!!");
      }
      else{
          System.out.println("Element "+key+" is present at index "+ans);
      }
  
      }
    }

