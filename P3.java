package Exception_Handling;

public class P3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
   try{
       System.out.println(arr[6]);
   }
   catch (Exception e)
   {
       System.out.println("array index out of bound");
   }
        System.out.println("hi");
    }
}
