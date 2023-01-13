import java.util.*;
class calci1{
public static void main(String[] args){
int x,y;
char z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principal amount: ");
x=sc.nextInt();
System.out.println("Enter the duration: ");
y=sc.nextInt();
System.out.println("(0706)Are you a senior citizen?(y/n): ");
z = sc.next().charAt(0);
calci1(x,y,z);
}
static void calci1(int x, int y, char z)
{
if(z=='y')
{
System.out.println("ROI="+ (x/100*12)*y);
}
else if(z=='n')
{
System.out.println("ROI(Akram)="+(x/100*10)*y);
}
else
{
System.out.println("Enter only yes/no");
}
}
}