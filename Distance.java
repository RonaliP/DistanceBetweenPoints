import java.util.*;

class Distance
{
    public static void main(String args[])
    {
	System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MASTER BRANCH");
	int x1,x2,y1,y2;
	double distance;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter x1 point");
	x1=sc.nextInt();
	 System.out.println("enter x2 point");
        x2=sc.nextInt();
	 System.out.println("enter y1 point");
        y1=sc.nextInt();
	 System.out.println("enter y2 point");
        y2=sc.nextInt();
	distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	System.out.println("THE DISTANCE IS=>"+distance);
	

    }
}
