import java.util.Scanner;

//Aim: to find the optimal alignment of two given strings, taking into consideration the cost of deletion
//insertion and alignment. For each alignment some positive points will be added to the score, for each deletion 
//or insertion some points will be deducted from the score. Aim is to find the optimal score
public class optimalAllignment {
public static void main(String args[]){

System.out.println("Enter first string");
Scanner inp=new Scanner(System.in);
String s1=inp.nextLine();
System.out.println("enter second string ");
String s2= inp.nextLine();
int arr[][]=new int[s1.length()+1][s2.length()+1];
for(int i=0;i<s1.length();i++){
for(int j=0;j<s2.length();j++){
arr[i][j]=0;
}
}
for(int i=1;i<=s1.length();i++){
arr[i][0]=i;
}
for(int j=1;j<=s2.length();j++){
	arr[0][j]=j;
	}
	int match, gap1,gap2;
	for(int i=1;i<=s1.length();i++){
	for(int j=1;j<=s2.length();j++){
	if(s1.charAt(i-1)==s2.charAt(j-1)){
	match=arr[i-1][j-1];
	}
	else{
	match=arr[i-1][j-1]+1;
	}
	gap1=arr[i][j-1]+1;
	gap2=arr[i-1][j]+1;
	arr[i][j]=min(match,gap1,gap2);
	}

	}
	for(int i=0;i<=s1.length();i++){
		for(int j=0;j<=s2.length();j++){
		System.out.print(arr[i][j]+"    ");
		}
		System.out.println();
		}
		}

		public static int min(int a,int b,int c){          //returning max of three integers
		if(a<b){
		if(a<c){
		return a;
		}else{
		return c;
		}
		}else{
		if(b<c){
		return b;
		}else{
		return c;
		}
		}
		}
		}