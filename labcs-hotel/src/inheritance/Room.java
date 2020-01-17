package inheritance;

public abstract class Room {

	public abstract void actype();
	public abstract void beds();
	public void breakfast() {
		System.out.println("Breakfast is complimentary");
	}
}

 class Premium extends Room{

	@Override
	public void actype() {
		System.out.println("window ac");
		
	}

	@Override
	public void beds() {
	System.out.println("2");
	
		
	}
 }
	class Deluxe extends Room{

		@Override
		public void actype() {
		System.out.println("split");
			
		}

		@Override
		public void beds() {
			System.out.println("4");
			
		}
		
	}
	

