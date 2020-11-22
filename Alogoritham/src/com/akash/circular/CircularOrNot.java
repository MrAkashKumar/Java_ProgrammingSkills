package com.akash.circular;

public class CircularOrNot {

	public static void main(String[] args) {
		// TODO 
		
		String path = "GLGLGLG";
		
		char chPath[] = path.toCharArray();
		
		if(isCircularPath(chPath)) 
			System.out.println("Given Sequence "+ " of moves is circular");
		else
			System.out.println("Given Sequence "+ " of moves is not circular");
	}
 
	private static boolean isCircularPath(char[] chPath) {
		// TODO 
		
		int x=0; int y=0;
		int dir = 0;
		
		for(int i = 0; i<chPath.length; i++) {
			char move = chPath[i];
			if(move == 'R') {
				dir = (dir+1)%4;
			}else if (move == 'L') {
				dir = (4+dir-1)%4;
			}else {
				if(dir==0) {
					y++;
				}else if(dir==1) {
					x++;
				}else if(dir==2) {
					y--;
				}else {
					x--;
				}		
			}
		}
		return (x==0 && y==0);
	}

}
