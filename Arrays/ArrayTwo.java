class ArrayTwo{
    public static void main(String[] args)
    {   
        int[][] arr = new int[5][6];
        int num = 1;
        for(int j=0;j<6;j++)
        {
            if(j%2==0)
            {

                for(int i=0;i<5;i++)
                {
                    arr[i][j] = num;
                    num++;
                }
            }
            else
            {
                for(int i=4;i>=0;i--)
                {
                    
                    arr[i][j] = num;
                    num++;

                }
            }
        } 
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        } 
                            

    }
    
}