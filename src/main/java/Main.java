package main.java;

public class Main {
	String str;
	String prefix;
	void combine(String instr, StringBuffer outstr, int index)
	{
	    for (int i = index; i < instr.length(); i++)
	    {
	        outstr.append(instr.charAt(i));
	        System.out.println(outstr);
	        combine(instr, outstr, i + 1);
	        outstr.deleteCharAt(outstr.length() - 1);
	    }
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.combine("abcd",new StringBuffer(), 0);
		
	}

}
