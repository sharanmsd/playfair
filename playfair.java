import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String s,res="",let="abcdefghiklmnopqrstuvwxyz",che="",pod="",glo="";
      Scanner sc=new Scanner(System.in);
      s=sc.nextLine();
      char a[][]=new char[10][10];
      int lag,i,j,k,le,z=0,l;
      lag=0;
      le=res.length();
      l=s.length();
      for(i=0;i<l;i++)
      {
          if(s.charAt(i)=='j')
          {
              s=s.substring(0,i)+"i"+s.substring(i+1,l);
          }
      }
      for(z=0;z<l;z++)
      {
          le=res.length();
        //   System.out.println(s.charAt(z));
        lag=0;
      for(k=0;k<le;k++)
      {
          if(res.charAt(k)==s.charAt(z))
          {
            //   System.out.println(s.charAt(z));
              lag=1;
              break;
          }
      }
      if(lag==0)
      {
          pod+=s.charAt(z);
          res+=s.charAt(z);
      }
      }
      System.out.println(pod);
      for(i=0;i<25;i++)
      {
          lag=0;
          le=res.length();
          for(k=0;k<le;k++)
          {
              if(res.charAt(k)==let.charAt(i))
              {
                  lag=1;
                  break;
              }
          }
          if(lag==0)
          {
              pod+=let.charAt(i);
          }
      }
      z=0;
      for(i=0;i<5;i++)
      {
          for(j=0;j<5;j++)
          {
              a[i][j]=pod.charAt(z);
              z++;
          }
      }
      for(i=0;i<5;i++)
      {
          for(j=0;j<5;j++)
          {
              System.out.print(a[i][j]);
          }
          System.out.println();
      }
      char ch1,ch2;
      int rv1=0,rv2=0,cv1=0,cv2=0,x,y;
    //   System.out.println(s);
     String plain=sc.nextLine();
      l=plain.length();
      if(l%2!=0)
      {
          plain+='x';
          l++;
      }
      int w;
      for(w=0;w<l-1;w++)
      {
          ch1=plain.charAt(w);
          ch2=plain.charAt(w+1);
        //   System.out.println(ch1);
        //   System.out.println(ch2);
          if(ch1==ch2)
          {
              ch2='x';
          }
          else
          {
              w++;
          }
          for(i=0;i<5;i++)
          {
              for(j=0;j<5;j++)
              {
                  if(a[i][j]==ch1)
                  {
                    //   System.out.println("s");
                      rv1=i;
                      cv1=j;
                      break;
                  }
              }
          }
          for(i=0;i<5;i++)
          {
              for(j=0;j<5;j++)
              {
                  if(a[i][j]==ch2)
                  {
                      rv2=i;
                      cv2=j;
                      break;
                  }
              }
          }
        //   System.out.println(rv1+" "+rv2);
          if(rv1==rv2)
          {
              x=(cv1+1)%5;
              y=(cv2+1)%5;
              glo+=a[rv1][x];
              glo+=a[rv1][y];
          }
          else if(cv1==cv2)
          {
              x=(rv1+1)%5;
              y=(rv2+1)%5;
              glo+=a[x][cv1];
              glo+=a[y][cv1];
          }
          else
          {
              glo+=a[rv1][cv2];
              glo+=a[rv2][cv1];
          }
      }
      System.out.println("KEY TEXT:  "+s);
      System.out.println("PLAIN TEXT:  "+plain);
      System.out.println("ENCRYPTED TEXT:  "+glo);
    }
}
