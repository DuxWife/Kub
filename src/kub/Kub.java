package kub;
import java.io.*;                    
public class Kub {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m,n,p,i,j,k;
    System.out.print("m=");
    m=Integer.parseInt(br.readLine ());
    System.out.print("n=");
    n=Integer.parseInt(br.readLine ());
    System.out.print("p=");
    p=Integer.parseInt(br.readLine ());
    int [][][] mas=new int[m][n][p];
    for (i=0;i<m;i++){
        for(j=0;j<n;j++){
            for (k=0;k<p;k++){
              System.out.print("("+(i+1)+","+(j+1)+","+(k+1)+")=");
              mas[i][j][k]=Integer.parseInt(br.readLine ());
            }
        }
    }
    int [][]s1=new int [m][n];
    for (i=0;i<m;i++) for (j=0;j<n;j++) s1[i][j]=0;
    int [][]s2=new int [m][p];
    for (i=0;i<m;i++) for (j=0;j<p;j++) s2[i][j]=0;
    int [][]s3=new int [n][p];
    for (i=0;i<n;i++) for (j=0;j<p;j++) s3[i][j]=0;
    for (i=0;i<m;i++){
        for(j=0;j<n;j++){
            for (k=0;k<p;k++){
              System.out.print(mas[i][j][k]+" ");              
            }
            System.out.println();
        }
        System.out.println();
    }
     for (i=0;i<m;i++){
        for(j=0;j<n;j++){
            for (k=0;k<p;k++){
             s1[i][j]=s1[i][j]+mas[i][j][k];
             s2[i][k]=s2[i][k]+mas[i][j][k];
             s3[j][k]=s3[j][k]+mas[i][j][k];
            }
        }
    }
     for(i=1;i<p*2;i++) System.out.print("_");
     System.out.println();
     System.out.println("сбоку");
        for (i=0;i<m;i++) {
           for (j=0;j<n;j++) {
            if (s1[i][j]>0) s1[i][j]=1;
       System.out.print(s1[i][j]+" ");
     }
           System.out.println();
     }
        System.out.println();
        System.out.println("спереди");
      for (i=0;i<m;i++){
          for (j=0;j<p;j++) {
            if (s2[i][j]>0) s2[i][j]=1;
       System.out.print(s2[i][j]+" ");
     }
          System.out.println();
     }
     System.out.println();
     System.out.println("сверху");
     for (i=0;i<n;i++) {
         for (j=0;j<p;j++) {
            if (s3[i][j]>0) s3[i][j]=1;
       System.out.print(s3[i][j]+" ");
     }
         System.out.println();
     }  
    }    
}