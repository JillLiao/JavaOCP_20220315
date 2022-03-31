package day03_string;

public class _05_StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		// Java Framework
		sb.append(" Framework");
		// Java Spring Framework
		sb.insert(5, "Spring ");
		System.out.println(sb);
	}

}
