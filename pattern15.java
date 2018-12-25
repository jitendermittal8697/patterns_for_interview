/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 
*/

class pattern15
{
    public static void main(String... args)
    {
        int n=4;
        for(int i = -n ; i <= n ; i++)
        {
            int temp = n + Math.abs(i) + 1 ;
            System.out.printf("%" + temp + "s", "");
            for(int j = 1 ; j <= n - Math.abs(i) + 1 ; j++)
            {
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
    }
}