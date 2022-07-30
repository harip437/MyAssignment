package week2.day3;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		int n=input/2;
		int flag=0;
if(input==10||input==1){
	System.out.println(input+"is not a primenum");
}
	else {
for(int i=2;i<=n;i++) {
	if(input%i==0) {
		System.out.println(input+"is not primenum");
		flag=1;
		break;
	}
}
}
if(flag==0) {
	System.out.println(input+"is a primenum");
}
	}}
