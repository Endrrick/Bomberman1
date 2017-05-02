import java.awt.Font;
import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class main {

	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(); 
		terrain ter=new terrain();
		terrain.affichter(ter.getter());
		Position a = new Position(1,2);
		Position b = new Position(a);
		System.out.println(a);
		System.out.println(b);
	}
}
