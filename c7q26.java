package thing;

public class c7q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GCF of 160 and 576 is " + gcf(160,576));
		System.out.println("If you want other numbers change the code, because getting user input takes time.");
	}
	public static int gcf(int a, int b){
		while (a!=0 && b!=0){//go until one is 0
			int c=b;
			b=a%b;
			a=c; //do euclid's algorithim
		}
		return a+b; //return the one that's 0 and the one that's positive
	}
}
