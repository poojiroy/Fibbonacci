package test;

public class TestProgram {
	public static void main(String[] args) {
	    int n1=0, n2=1, n3=0, counter=10;
	    for(int i=2; i<counter; i++) {
	    	n3=n1+n2;
	    	System.out.println(n3);
	    	n1=n2;
	    	n2=n3;
	    }
		
	}

}
