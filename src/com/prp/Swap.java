package com.prp;
import java.util.*;

public class Swap{
    public void findSwap(String input){
        String input1= input.toLowerCase();
        String s[]=input1.split(" ");
        for(int i=0;i<s.length;i=i+2){
            if(i==s.length-1){
                StringBuffer s1=new StringBuffer();
                s1.append(s[i]);
                String s2=s1.reverse()+"";
                String s3=s2.substring(1);
                String s4=s2.substring(0,1).toUpperCase();
                s2=s4+s3;
                s[i]=s2;
            }
            else{
                char a[]=s[i].toCharArray();
                char b[]=s[i+1].toCharArray();
                String c="";
                String d="";
                for(int x=0,y=0;x<a.length||y<b.length;){
                if(x<a.length&&y<b.length){
                    c=c+b[y]+"";
                    d=d+a[x]+"";
                    x++;
                    y++;
                }
                else if(y==b.length){
                    d=a[x]+d+"";
                    x++;
                }
                else if(x==a.length-1){
                    c=b[y]+c+"";
                    y++;
                }
                }
                s[i]=c;
                s[i+1]=d;
                String s3=c.substring(1);
                String s4=c.substring(0,1).toUpperCase();
                c=s4+s3;
                s[i]=c;
                s3=d.substring(1);
                s4=d.substring(0,1).toUpperCase();
                d=s4+s3;
                s[i+1]=d;
            }
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        Swap obj=new Swap();
        obj.findSwap(input);
    }
}

