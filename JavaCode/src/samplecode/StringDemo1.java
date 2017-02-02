package samplecode;

public class StringDemo1 {

	public static void main(String[] args) {
	
		String fullname = "Yuva-raja thiru karasu";
		String[] fullname1= fullname.split("-");
		//
		for (int i=0;i<fullname1.length;i++)
		{
			System.out.println("Value "+i+" is,"+fullname1[i]);
		}
	}

}
