import java.util.*;

/*
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
*/

class Pascals_triangle
{
    public static void main(String args[])
    {
        int n = 10;
        for(int i = 1 ; i < n ; i++)
        {
            int number = 1;
            System.out.printf("%" + (n - i)*2 + "s", "");
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.printf("%4d",number);
                number = number*(i-j)/j;
            }
            System.out.println();
        }
    }
}