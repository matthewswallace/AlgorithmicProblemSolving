
public class Main {

	public Main() {
		Queue q = new Queue();
		
		System.out.println("Is the Q empty ? : " + q.isEmpty());
		
		for(int i = 0; i < 50; ++i ) {
			System.out.println("Adding Item to Q : " + i);
			q.enqueue(i);
		}
		
		System.out.println("What is the size of the Q new ? : " + q.size());
		
		//we get this size here because if we use q.size() in the for loop it will keep changing as things 
		//are added to the q
		int size = q.size();
		
		if(!q.isEmpty()) {
			for( int i = 0; i < size; ++i) {
				System.out.println("Dequeuing item : " + q.dequeue());
			}
			
		}
		
		System.out.println("is the Q empty after all that ? " + q.isEmpty());
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
