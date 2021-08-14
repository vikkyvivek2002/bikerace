import java.util.*;
class bike_race
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the speed of 5 racers ");

int a =s.nextInt();
int b =s.nextInt();
int c =s.nextInt();
int d =s.nextInt();
int e =s.nextInt();
int avg =  (a+b+c+d+e)/5;

if(a>=avg)
System.out.println("a got qualified in race ");
if(b>=avg)
System.out.println("b got qualified in race ");
if(c>=avg)
System.out.println("c got qualified in race ");
if(d>=avg)
System.out.println("d got qualified in race ");
if(e>=avg)
System.out.println("e got qualified in race ");
}
}



