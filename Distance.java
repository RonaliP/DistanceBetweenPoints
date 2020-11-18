import java.util.*;

class Distance
{
	 static int x1,x2,y1,y2,x3,x4,y3,y4;
          static double distance1,distance2;


        public static void main(String args[])
        {
	  System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MASTER BRANCH");
	  Calculate1();
	  CalculateDistance1(x1,x2,y1,y2);
	  Calculate2();
	 CalculateDistance2(x3,x4,y3,y4);
	if(distance1==distance2)
	{
		System.out.println("The lengths of two lines are almost equal");
	}
	else if(distance1>distance2)
	{
		System.out.println("The first line is bigger");
	}
	else if(distance1<distance2)
	{
		System.out.println("The first line is smaller");
	}

	//  System.out.println("The LENGTH OF THE LINE IS ="+distance);
	}

	public static void Calculate1()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter x1 point");
	  x1=sc.nextInt();
	  System.out.println("enter x2 point");
          x2=sc.nextInt();
	  System.out.println("enter y1 point");
          y1=sc.nextInt();
	  System.out.println("enter y2 point");
          y2=sc.nextInt();

	 }

	public static double CalculateDistance1(int x1,int x2,int y1,int y2)
	{
	     distance1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	    System.out.println("The LENGTH OF THE LINE IS ="+distance1);
	     return distance1;
	}

	  public static void Calculate2()
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter x3 point");
          x3=sc.nextInt();
          System.out.println("enter x4 point");
          x4=sc.nextInt();
          System.out.println("enter y3 point");
          y3=sc.nextInt();
          System.out.println("enter y4 point");
          y4=sc.nextInt();

         }

        public static double CalculateDistance2(int x3,int x4,int y3,int y4)
        {
             distance2=Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
            System.out.println("The LENGTH OF THE LINE IS ="+distance2);
             return distance2;
        }



}
