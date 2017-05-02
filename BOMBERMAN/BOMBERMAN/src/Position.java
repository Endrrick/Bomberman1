public class Position {
	private int x, y; //coordonnées x,y de la map
	
	public Position(int x, int y){ //constructeur classique 
		this.x = x;
		this.y = y;
	}
	
	public Position(Position otherCoord){ //permet de copier une coordonnée
		this.x = otherCoord.getX();
		this.y = otherCoord.getY();
	}
	
	
    public boolean equals(Object obj) { //permet d'utiliser la méthode .equals() pour voir si les coordonées sont les mêmes
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Position other = (Position) obj;
        return y == other.y && x == other.x;
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}