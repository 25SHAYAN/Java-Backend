public class Arrays_5 {
    public static void main(String[] args) {
        //arrays

        //two types of declaring array
int a[];
char[] b;
//int c[10];  this throws error in java

       // 2. allocate memory
        a = new int[5];
        b = new char[19];

        //3.initialize array
        a[0] = 11;
        a[1] = 10;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

       //combined initializes and memory allocation
        int c[] = new int[10];

        //declaration + memory allocation + initializtion
        int d [] = new int[] {1,2,3,4,5};
        for(int i=0;i<d.length;i++)
        {
            System.out.println(d[i]);

}
}
/*
*creating array is 3 step process
* 1. declare array
* 2. allocate memory
* 3.initialize array
*
*
*
*
* */