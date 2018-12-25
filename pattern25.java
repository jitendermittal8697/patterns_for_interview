/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
*/

class pattern25
{
    public static void main(String... args)
    {
        int n=4;
        for(int i = -n ; i <= n ; i++)
        {
            int temp = n - Math.abs(i) + 1  ;
            System.out.printf("%" + temp + "s", "");
            for(int j = n - Math.abs(i) + 1; j <= n + 1 ; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}