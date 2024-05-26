
public class task4 {
    public static int getmax(int[] arr){
        if(arr==null || arr.length==0){
            return -1;
        }

        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] k={23,34,56,78};
        System.out.print(getmax(k));
    }
    }
    

