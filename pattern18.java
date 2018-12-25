/*
      *
     ***
    *****
   *******
  *********
 ***********
*************

*/

class pattern18
{
    public static void main(String... args)
    {
        int n=7;
        for(int i = 1 ; i <= n ; i++)
        {
            int temp = n - i + 1 ;
            System.out.printf("%" + temp + "s", "");
            for(int j = 1 ; j <= 2*i - 1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}