import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
int sum=0;
int count=0;
double power=0;
int remainder=0;
for(int i=str.length();i>0;i--){
count++;
}
int n=Integer.parseInt(str);
int n1=n;
while(n>0){
remainder=n%10;
n/=10;

power=Math.pow(remainder,count);
sum+=power;
power=0;
}
if(sum==n1){
System.out.println("Armstrong number");
}else{
System.out.println("Not Armstrong number");
}
}
}

