package validation;


	class Parent {
		public void meth() {
			System.out.println("In Parent");

		}

	}

	class Child1 extends Parent {
		public void meth() {
			System.out.println("In Child1");

		}

	}

	class Child2 extends Child1 {
		public void meth() {
			System.out.println("In Child2");

		}

	}

	class Child3 extends Child2 {
		public void meth() {
			System.out.println("In Child3");

		}

	}

	public class OOPs_Concepts_practice {
	public static void main(String[] args) {

		Parent parent = new Child3();
		parent.meth();
		// System.out.println("In walkthetalk");
	}


}
