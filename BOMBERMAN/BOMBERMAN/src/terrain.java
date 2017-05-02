import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

import java.applet.*;
import java.awt.*;


public class terrain {
	
	int ter[][]={{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			 	 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,4,0},
			 	 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,2,0,2,0},
			 	 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,0},
			 	 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
			 	 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			 	 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
			 	 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			 	 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
			 	 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			 	 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
			 	 {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			 	 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
			 	 {0,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			 	 {0,2,0,2,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0},
			 	 {0,3,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			 	 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};


	public int[][] getter(){
			return ter;
		}

	public static void affichter (int [][] ter){
			StdDraw.setXscale(-0.5,20.5);
			StdDraw.setYscale(-15.5,1.5);
			StdDraw.enableDoubleBuffering();
			StdDraw.clear(StdDraw.BLACK);
			
		for(int i=0; i<21;i++){
			for(int j=0; j<17;j++){	
				switch( ter[j][i]){
				
				case 0:
					StdDraw.setPenColor(StdDraw.GRAY);
					StdDraw.filledRectangle(i,-j+1,0.5,0.5);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.rectangle(i,-j+1,0.5,0.5);
					break;
					
				
				case 1:
					StdDraw.setPenColor(StdDraw.ORANGE);
					StdDraw.filledRectangle(i,-j+1,0.5,0.5);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.rectangle(i,-j+1,0.5,0.5);	
					break;
				case 2:
					StdDraw.setPenColor(StdDraw.GREEN);
					StdDraw.filledRectangle(i,-j+1,0.5,0.5);
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.rectangle(i,-j+1,0.5,0.5);
					break;
				
				case 3:
					StdDraw.setPenColor(StdDraw.GREEN);
					StdDraw.filledRectangle(i,-j+1,0.5,0.5);
					StdDraw.setPenColor(Color.cyan);
					StdDraw.filledCircle(i,-j+1,0.3);
					break;
				
				case 4:
					StdDraw.setPenColor(StdDraw.GREEN);
					StdDraw.filledRectangle(i,-j+1,0.5,0.5);
					StdDraw.setPenColor(StdDraw.BLUE);
					StdDraw.filledCircle(i,-j+1,0.3);
					break;
				}
				
				

				
			}
		}
		StdDraw.show(20);/*temps=20ms*/
	}	
}
