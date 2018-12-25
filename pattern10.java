/*
1
01
101
0101
10101
*/

class pattern10
{
    public static void main(String... args)
    {
        int n=5;
        int k;
        for(int i = 1 ; i <= n ; i++)
        {
                if(i%2==0)
                    k=0;
                else
                    k=1;
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(k);
                if(k==0)
                    k=1;
                else
                    k=0;
            }
            System.out.println();
        }
    }
}