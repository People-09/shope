package a.b.c;

import java.util.Scanner;

public class Shopping {
	public static int i1,i2,i3;
	public static String price1,price2,price3,price4;
	public static void electronics()
	{
		System.out.println("Your selected the Electronic section");
		System.out.println("Enter 1 for Electronics menu");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("ItemID"+"     "+"Item"+"         "+"Availability "+"      "+"cost");
			System.out.println("11--------Swithches-------50 --------200");
			System.out.println("22--------Fan-------------10 --------1500");
			System.out.println("33--------Lights----------50  --------50");
			System.out.println("select 11 for switches,select 22 for Fan,select 33 for Lights");
			int a=sc.nextInt();

			if(a==11)
             {
				 System.out.println("select switches how many you want");
				 int h=sc.nextInt();
                 int cost=200;
                 int p11 = cost*h;
                 System.out.println(" your bill for Switches "+p11);
                 i1=p11;
                 System.out.println("continue press 1");
             }
			int q=sc.nextInt();
			System.out.println("select 11 for switches,select 22 for Fan,select 33 for Lights");
            int b=sc.nextInt();
			if(b==22)
             {
				 System.out.println("select Fans how many you want");
				 int h=sc.nextInt();
                 int cost=1500;
                 int p22 = cost*h;
                 System.out.println(" your bill for fans "+p22);
                 i2=p22;
                 System.out.println("continue press 1");
             }
			int r=sc.nextInt();
			System.out.println("select 11 for switches,select 22 for Fan,select 33 for Lights");
            int c=sc.nextInt();
			if(c==33)
             {
				 System.out.println("select Lights how many you want");
				 int h=sc.nextInt();
                 int cost=50;
                 int p33 = cost*h;
                 System.out.println(" your bill for fans "+p33);
                 i3=p33;
                 System.out.println("enter 11 for yor electronics total bill");
             }
		
		int price1=sc.nextInt();
		System.out.println(" your electronics total bill : "+(price1=(i1+i2+i3)));
		sections();

		}
	}
	public static void bath()
	{
		System.out.println("Your selected the Bath section");
		System.out.println("ItemID"+"     "+"Item"+"         "+"Availability "+"      "+"cost");
		System.out.println("111--------soap-------10  -----------100");
		System.out.println("222--------Towel-------------15 --------200");
		System.out.println("select 111 for soap,select 222 for Towel");
		Scanner sc1 = new Scanner(System.in);
		int a=sc1.nextInt();

		if(a==111)
         {
			 System.out.println("select soap how many you want");
			 int h=sc1.nextInt();
             int cost=100;
             int p11 = cost*h;
             System.out.println(" your bill for soaps "+p11);
             i1=p11;
             System.out.println("continue press 1");
         }
		int r=sc1.nextInt();
		System.out.println("select 111 for soap,select 222 for Towel");
		int b=sc1.nextInt();

		if(b==222)
         {
			 System.out.println("select Towel how many you want");
			 int h=sc1.nextInt();
             int cost=200;
             int p11 = cost*h;
             System.out.println(" your bill for soaps "+p11);
             i1=p11;
             System.out.println("enter 22 for yor bath total bill");

         }
		int price2=sc1.nextInt();

		System.out.println(" your bath section total bill : "+(price2=(i1+i2+i3)));
		sections();

	}
	public static void kitchen()
	{
		System.out.println("Your selected the Kithchen section");
		System.out.println("ItemID"+"     "+"Item"+"         "+"Availability "+"      "+"cost");
		System.out.println("44--------sugar-------10  -----------40");
		System.out.println("55--------rice-------------18 --------80");	
		System.out.println("select 44 for sugar,select 55 for rice");

		Scanner sc1 = new Scanner(System.in);
		int a=sc1.nextInt();

		if(a==44)
         {
			 System.out.println("enter your kgs");
			 int h=sc1.nextInt();
             int cost=40;
             int p11 = cost*h;
             System.out.println(" your bill for sugar "+p11);
             i1=p11;
             System.out.println("continue press 1");
         }
		int r=sc1.nextInt();
		System.out.println("select 44 for sugar,select 55 for rice");
		int b=sc1.nextInt();
		if(b==55)
        {
			 System.out.println("enter your kgs");
			 int h=sc1.nextInt();
            int cost=40;
            int p22 = cost*h;
            System.out.println(" your bill for rice "+p22);
            i2=p22;
            System.out.println("enter 33 for yor kitchen total bill");

	}
		int price3=sc1.nextInt();

		System.out.println(" your kitchen section total bill : "+(price3=(i1+i2+i3)));
		sections();

	}
	public static void cloths()
	{
		System.out.println("Your selected the Cloths section");
		System.out.println("ItemID"+"     "+"Item"+"         "+"Availability "+"      "+"cost");
		System.out.println("101--------shirt-------30  -----------500");
		System.out.println("202--------tops-------------15 --------850");
		System.out.println("select 101 for shirt,select 202 for tops");

		Scanner sc1 = new Scanner(System.in);
		int a=sc1.nextInt();

		if(a==101)
         {
			 System.out.println("select shirts how many you want");
			 int h=sc1.nextInt();
             int cost=500;
             int p11 = cost*h;
             System.out.println(" your bill for shirts "+p11);
             i1=p11;
             System.out.println("continue press 1");
         }
		int r=sc1.nextInt();
		System.out.println("select 101 for shirt,select 202 for tops");
		int b=sc1.nextInt();
		if(b==202)
        {
			 System.out.println("select tops how many you want");
			 int h=sc1.nextInt();
            int cost=40;
            int p22 = cost*h;
            System.out.println(" your bill for tops "+p22);
            i2=p22;
            System.out.println("enter 44 for yor cloths total bill");

	}
		int price4=sc1.nextInt();
		System.out.println(" your cloths section total bill : "+(price4=(i1+i2+i3)));
		System.out.println(" ");
		sections();

	}
	
public static void main(String[] args) 
{
	
	Shopping.sections();
	
}
public static void sections()
{
//	System.out.println("welcome to shopping section");
	System.out.println("what you want select the section");
	System.out.println("choose 1 for Electronics section" );
	System.out.println("choose 2 for Bath section");
	System.out.println("choose 3 for Kitchen section");
	System.out.println("choose 4 for Cloths section");
	System.out.println("choose 5 for exit");
	Scanner scan = new Scanner(System.in);
	int choice;
	Scanner sc =new Scanner(System.in);
	choice=sc.nextInt();
	if(choice==1)
	{
		electronics();
		sections();
	}
	if(choice==2)
	{
		bath();
		sections();
	}
	if(choice==3)
	{
		kitchen();
		sections();
	}
	if(choice==4)
	{
		cloths();
		sections();
	}
	System.out.println(" Total amount for your shopping : "+(price1+price2+price3+price4));
}
}
