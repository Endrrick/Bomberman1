import java.awt.event.KeyEvent;
import java.awt.Font;

public class personnages {
	String nomPersonnage;
	private int score;
	private int nombreDeVie;
	Position positionDuJoueur;
	
	public personnages(int x, int y){
		score=0;
		nombreDeVie=0;
		nomPersonnage="Inconnu";
		this.positionDuJoueur = new Position(x,y);
	}
	
	public personnages(String pNom){
		System.out.println("Création d'un personnage ");
		nomPersonnage=pNom;
		score=0;
		nombreDeVie=3;
	}
	
	public String getNomPersonnage(){
		return nomPersonnage;
	}
	
	public int getNombreDeVie(){
		return nombreDeVie;
	}
	public void setNombreDeVie(int pNombreDeVie){
		nombreDeVie=pNombreDeVie;
	}
	
	public int getScore(){
		return score;
	}
	public void setScore(int pScore){
		 score=pScore;
	}
	
	
	
}
