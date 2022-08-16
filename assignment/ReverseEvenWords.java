package assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test=" I am a software 'tester";
		String[] split= test.split(" ");
		String a= "";
		for(int i=0;i<split.length;i++) {

		if(i%2==0) {
				char[] charArray=split[i].toCharArray();
				String reverse="";
				for(int j=charArray.length-1;j>=0;j--) {
					reverse = reverse+charArray[j];
				}

					a= a+" "+reverse;
			}
			else {
				a=a+" "+split[i];
			}

		}

		System.out.println(a);
	}
}


