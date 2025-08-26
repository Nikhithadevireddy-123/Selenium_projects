package variables_practice;

public class String_demo {

	public static void main(String[] args) {
		String s="Java is awesome";
		System.out.println(s.charAt(6));
		System.out.println(s.codePointAt(3));
		System.out.println(s.codePointBefore(4));
		System.out.println(s.codePointCount(3,8));
		System.out.println(s.equals("welcome"));
		System.out.println(s.equalsIgnoreCase("java is awesome"));
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.contains("aw"));

	}

}
