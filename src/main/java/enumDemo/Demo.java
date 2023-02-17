package enumDemo;

import enumDemo.Enum.data;

public class Demo {
		
	public static void main(String[] args) {
		System.out.println(data.ASHOK.getNumber());

		for(data singleData:data.values()) {
			System.out.print(singleData.getNumber());
			System.out.print(" ,");
			System.out.println(singleData.getMailId());
		}
	}
}
