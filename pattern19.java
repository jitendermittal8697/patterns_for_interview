/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

class pattern19
{
    public static void main(String... args)
    {
        int n=4;
        for(int i = -n ; i <= n ; i++)
        {
            int temp = n + Math.abs(i) + 1 ;
            System.out.printf("%" + temp + "s", "");
            for(int j = 1 ; j <= 2*(n - Math.abs(i)) + 1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}