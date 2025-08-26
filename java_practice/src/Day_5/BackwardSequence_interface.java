package Day_5;
public class BackwardSequence_interface implements CharSequence {
	private String reversed;
	public BackwardSequence_interface(String input) {
		this.reversed=new StringBuilder(input).reverse().toString();
	}
	public int length() {
		return 0;
	}
	public char charAt(int index) {
		return 0;
	}
	public CharSequence subSequence(int start, int end) {
		return null;
	}
    public String toString() {
        return reversed;
    }
public static void main(String[] args) {
	BackwardSequence_interface seq = new BackwardSequence_interface("hello");

	        System.out.println("Full reversed string: " + seq);
	        System.out.println("Length: " + seq.length());
	        System.out.println("Character at index 1: " + seq.charAt(1));
	        System.out.println("Subsequence (1, 4): " + seq.subSequence(1, 4));
	    }
	}

