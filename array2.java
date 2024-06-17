import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[2]=new int[4];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
            System.out.println("Enter the marks of student"+i+"student"+j);
             array[i][j]=scan.nextInt();
            }
        }


        System.out.println("The marks of students are");


        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
            System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
