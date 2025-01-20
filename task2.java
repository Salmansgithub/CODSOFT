import java.util.Scanner;
class task2
{
public static void main(String args[])
{
int marks=0,total=0,subjects;
double average;
char grade;

Scanner sc=new Scanner(System.in);
System.out.println("enter the total no.subjects:");
subjects=sc.nextInt();
for(int i=0;i<subjects;i++)
{
System.out.println("enter the marks"+(i+1)+":");
marks=sc.nextInt();
total+=marks;
}
System.out.println("total:"+total);


average=total/subjects;
System.out.println("average:"+average);
if(average>90)
{
System.out.println("A");
}
else if(average>80 && average<89)
{
System.out.println("B");
}
else if(average>70 && average<79)
{
System.out.println("C");
}
else
{
System.out.println("D");
}





}
}

 