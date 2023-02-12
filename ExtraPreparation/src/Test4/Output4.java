package Test4;

public class Output4 {
	class P {
	}
	class Q extends P {
	}
	class R extends P { }


		public static void foo(P p) {
		System.out.println("p");
		}
		public static void foo(Q q) {
		System.out.println("q");
		}
		public static void foo(R r) {
		System.out.println("r");
		}
		public static void main(String[] args) {
			
		foo(p);
		}
		}

		


