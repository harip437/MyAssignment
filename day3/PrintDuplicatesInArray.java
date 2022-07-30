package week2.day3;
import java.util.Arrays;
public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
int len=arr.length;
int count;
Arrays.sort(arr);
for(int i=0;i<arr.length-1;i++) {
	count=1;
	for(int j=1+i;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
	}
	
}
if(count>1) {
	System.out.println(arr[i]);
}
	}
	}}
