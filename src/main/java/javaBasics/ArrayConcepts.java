package javaBasics;


public class ArrayConcepts {

	public static void main(String[] args) {

		ArrayConcepts.twoDeminesionalArray();
		ArrayConcepts.objectArray();
		//one dimensional Array
		int i[] = new int[5];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		i[4] = 5;
		System.out.println(i[4]);
		System.out.println(i.length);
		System.out.println("........................................................");
		for (int j : i) {
			System.out.println(j);
		}
 
		String[] k= {"Ashok", "Kumar", "Pasula", "Kishore", "bochu", "Bhavani"};
		System.out.println("Lenth of the Array :"+k.length);
		
		for(String name:k) {
			System.out.println(name);
		}
		System.out.println("........................................................");
		Object ob[]= new Object[9];
		ob[0]="ashok";
		ob[1]=7799359065l;
		ob[2]=20202020;
		ob[3]=202;
		ob[4]=1;
		ob[5]=20.22f;
		ob[6]=209.12567;
		ob[7]='P';
		ob[8]=true;
		System.out.println("Lenth of the Array object: "+ob.length);
		for(Object ob1:ob) {
			System.out.println(ob1);
		}
		
	}
	
	public static void twoDeminesionalArray() {
		
		
		
		String s[][]= {{"ashok", "kumar","Demo"}, {"pasula" ,"Mathews","demo1"}};
		System.out.println("Row lenth: "+s.length);
		System.out.println("Column lenth: "+s[0].length);
		
		System.out.println("---------------------------------------------");
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[0].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		System.out.println("-----------------------------------------------");
	}
	
	public static void objectArray(){
		Object x[][] = new Object[2][4];//([rows][columns])
		System.out.println("Row lenth: "+x.length); // row length
		System.out.println("Column lenth: "+x[0].length);// column length
		System.out.println("-----------------------------------------------");
		
		x[0][0]="row 0, coloumn 0";
		x[0][1]="row 0, coloumn 1";
		x[0][2]="row 0, coloumn 2";
		x[0][3]="row 0, coloumn 3";
//		x[0][4]="row 0, coloumn 4"; getting ArrayIndexOutOfBoundsException beacuse the length of the array is fixed
		
		x[1][0]="row 1, coloumn 0";
		x[1][1]="row 1, coloumn 1";
		x[1][2]="row 1, coloumn 2";
		x[1][3]="row 1, coloumn 3";
//		x[1][4]="row 1, coloumn 4"; ArrayIndexOutOfBoundsException
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[0].length; j++) {
				System.out.println(x[i][j]);
			}
		}
		System.out.println("-----------------------------------------------");
	}
	

}
