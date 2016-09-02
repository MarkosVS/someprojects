import java.util.*;

class intjava {

	public static void main(String [] args){
		int numChecks, a, result;
		Scanner s = new Scanner(System.in);
		numChecks = s.nextInt();
		a = s.nextInt();
		int[] checks = new int[numChecks];
		for(int i=0; i < numChecks; i++){
			checks[i] = s.nextInt();
		}
		Arrays.sort(checks);
		if(numChecks == 1){
			System.out.print("0\n");
		}else{
			if(numChecks == 2){
				if(Math.abs(a-checks[0]) < Math.abs(a-checks[1])){
					result = (Math.abs(a-checks[0]));
					System.out.print(result + "\n");
				}else{
					result = (Math.abs(a-checks[1]));
					System.out.print(result + "\n");
				}
			}else{
				if(Math.abs(a-checks[0]) < Math.abs(a-checks[numChecks-1])){
					result = 2*(Math.abs(a-checks[0]));
					result += Math.abs(a-checks[numChecks-2]);
					System.out.print(result + "\n");
				}else{
					result = 2*(Math.abs(a-checks[numChecks-1]));
					result += (Math.abs(a-checks[1]));
					System.out.print(result + "\n");
				}
			}
		}
	}
}
