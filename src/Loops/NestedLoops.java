package Loops;
public class NestedLoops{
public static void main(String[] args){
int j=0;
int i=0;
{
for (j=1; j<=4;j++)
{
for (i=1; i<5; i++)
{
if (i!=3)
{
System.out.println(i);
}
else
{
System.out.println(1);
}
}
}
}
}
}
