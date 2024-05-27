public class GFG{
    static void printarray(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
        }
    }
    static void transpose(int a[][],int r, int c){
        int toprow =0,bottomrow= r-1,leftcol =0,rightcol=c-1;
        int toel=0;
        while (toel< r*c ){
        //toprow 
        for(int j=leftcol;j<= rightcol && toel<r*c;j++){
            System.out.print(a[toprow][j]+" ");
            toel++;
        }
        toprow++;
        //rightcol 
        for(int i=0;i<=bottomrow && toel<r*c;i++ ){
            System.out.print(a[i][rightcol]+ " ");
            toel++;
        }
        rightcol--;
        //bottomrow
        for(int j=0;j>= rightcol && toel<r*c;j--){
            System.out.print(a[bottomrow][j]+" ");
            toel++;
        }
        bottomrow--;
        //lestcoll
        for(int i=0;i>=toprow && toel <r*c;i--){
            System.out.print(a[i][leftcol]+" ");
            toel++;
        }
        leftcol++;
        }

    }
    public static void main(String[] main){
        int r=3,c=3;
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println( "original ");
        printarray(a);
        System.out.println(" spiral ");
        transpose(a, r, c);
    }
}