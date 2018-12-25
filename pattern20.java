/*
       *
      **
     ***
    ****
   *****
  ******
 *******
********
*/

class pattern20
{
    public static void main(String... args)
    {
        int n=8;
        for(int i = 1 ; i <= n ; i++)
        {
            int temp = n - i + 1 ;
            System.out.printf("%" + temp + "s", "");
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}