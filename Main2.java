public class Main2{
    static void Printarray(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+ " ");
            }System.out.println();
        }
    }
    static void transposeplace(int[][] arr,int r,int c){
        for (int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            
            {
                if(j>=i)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }               
            }
            System.out.println();
        }
        
    }
        public static void main(String[] args) {
        int r=3;int c=3;
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original");
        Printarray(arr);
        System.out.println("tranpose");
        transposeplace(arr, r, c);
        Printarray(arr);
    }
}