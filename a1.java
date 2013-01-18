import java.util.Scanner;

class a1{
public static void main(String args[]){
	System.out.println("enter the first string");
   Scanner input = new Scanner(System.in);
   String b1 = input.nextLine();
   System.out.println("enter the second string");
   String b2 = input.nextLine();
   int arr[][]= new int [b1.length()+1][b2.length()+1];
   for(int i=0;i<b1.length();i++){
	   for(int j=0;j<b2.length();j++){
		   arr[i][j]=0;
	   }
   }
   for(int i=1;i<b1.length();i++){
	   arr[i][0]=i;
   }
for(int j=1;j<b2.length();j++){
	arr[0][j]=j;
	
}
}
}	
	
