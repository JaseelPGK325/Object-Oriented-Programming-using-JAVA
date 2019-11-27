package COREJAVA;
import java.util.Scanner;

public class Case2 {

public static int booked[]=new int[1000];

static void book()
{
String ac,pr;
String cot;
String cable;
String wifi;
String laundry;
Scanner sc=new Scanner(System.in);
int total,b=0,c,d,e,f,i=101,choice;
do {
   
System.out.println("AC/non-AC(AC/nAC)");
ac=sc.next();
if(ac.equals("AC")==true)
{
b=1500;
}
else
{
b=700;
}
System.out.println("cot(Single/Double)");
cot=sc.next();
if(cot.equals("Single")==true)
{
c=50;
}
else
{
c=100;
}
System.out.println("with cable/without cable(Cb/nCb)");
cable =sc.next();
if(cable.equals("Cb")==true)
{
d=50;
}
else
{
d=0;
}
System.out.println("with Wifi/without Wifi(wifi/nwifi)");
wifi =sc.next();
if(wifi.equals("wifi")==true)
{
e=200;
}
else
{
e=0;
}
System.out.println("with laundry/without laundry(La/nLa)");
laundry =sc.next();
if(cable.equals("La")==true)
{
f=100;
}
else
{
f=0;
}



total=b+c+d+e+f;
System.out.println("THE TOAL CHARGE IS Rs."+total);
System.out.println("Choosen services are");
if(b==1500)
{
System.out.println("AC");
}
else
{
System.out.println("NON-AC");
}
if(c==50)
{
System.out.println("SINGLE COT");
}
else
{
System.out.println("DOUBLE COT");
}

if(d!=0)
{
System.out.println("CABLE ENABLED");

}
else
{
System.out.println("CABLE DISABLED");
}
if(e!=0)
{
System.out.println("WIFI ENABLED");
}
else
{
System.out.println("WIFI NOT ENABLED");
}
if(f!=0)
{
System.out.println("LAUNDRY IS CHOOSEN");

}
else
{
System.out.println("LAUNDRY IS NOT CHOOSEN");
}


System.out.println("Do you want proceed");

pr=sc.next();
}while(pr.equals("no"));

if(pr.equals("yes")==true)
{
booked[i]=101;
System.out.println("Thank you your room number is "+i);
i=i+1;
}
}
static void status()
{
Scanner sc=new Scanner(System.in);
int i=101,flag=1;
System.out.println("Enter the room number");
int room=sc.nextInt();
for(i=101;i<1000;i++)
{
if(booked[i]==room)
{
flag=1;
}
else
{
flag=0;

}}
if(flag==1)
System.out.println("NOT AVAILABLE");

else
System.out.println("AVAILABLE");
}

}
