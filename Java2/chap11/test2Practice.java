package chap11;

public class test2Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I go to Miami University in Oxford, MS";
		String s2 = "the";
		String s3 = s1.replace("Miami", "the");
		String s5 = s3.substring(0, s3.indexOf("Oxford"));
		String s6 = s3.substring(s3.indexOf("Oxford"));
		//System.out.print(s1.replace(s1.indexOf("Miami"),s1.indexOf("Miami")+5,"the"));
		
		StringBuilder builder =  new StringBuilder(s1);
		System.out.print(builder.replace(s1.indexOf("Miami"), s1.indexOf("Miami")+5, "the"));
		System.out.print("\n"+builder.insert(builder.indexOf("Oxford"),"Mississippi "));
		String toString = builder.toString();
		String[] tokens =toString.split(" ");
		System.out.println("\n"+tokens.length);
	}

}
