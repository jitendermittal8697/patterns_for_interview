/*
1           1
2  2        2
3    3      3
4      4    4
5        5  5
6           6
*/


class N
{
    public static void main(String... args)
    {
        int n = 9;
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(i + " ");
            for(int k = 2 ; k < n ; k++)
            {
                if(k==i)
                {
                    System.out.print(k);
                }
                else
                {
                System.out.print(" ");
                }
            }
            System.out.print(" " + i);
            System.out.println();
        }        
    }
}