import java.util.Scanner;

public class Search {
	
	public static int LSearch(double a[],int b) throws FileException{
		
	int d=0;
	while(d<a.length && a[d]!=b) {d++;}
	if(a[d]==b) {return d;}
	else if(d==a.length) throw new FileException("No matching Number");
	return d;
	
	
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double Arr[]= {2,4,6,8,10,12};
		System.out.println("Enter the NUm");
		int val=in.nextInt();
		
		try{int f=Search.LSearch(Arr, val);
		System.out.println("Match Found Number at "+f+" The Number is "+val);}
		catch (FileException e) {System.out.println(e+"Sorry Try another number");}
		in.close();

	}

}
