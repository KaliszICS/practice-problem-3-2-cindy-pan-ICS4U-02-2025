
public class PracticeProblem {
	public static int towerOfHanoi(int num){

		if (num<3){
			return -1;
		}
		if (num==3){
			return 7;
		}
		else{
			
			return 2 * towerOfHanoi(num-1) +1;
			// 1 -> b 2->c 1-> c (3 moves)
			// 3 -> b 1->a 2 -> b 1-> b (4 moves) 
			// 7 moves to move layer 3 (2*3+1)
		}
	}
	
}
