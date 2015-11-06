package Concepts;

public class Turn {
	public final String Name;
	public Move oponent;
	public Move own;
	
	public Turn(String name, Move oponent, Move own) {
		Name = name; 
		this.oponent = oponent;
		this.own = own;
	}
	
	public Turn(Turn t) {
		Name = t.Name; 
		this.oponent = t.oponent;
		this.own = t.own;
	}

	public Turn() {
		Name="deafult";
		this.oponent = new Move();
		this.own = new Move();
	}

	public String getName() {
		return Name;
	}

	public String show() {
		return "    Du:     " + oponent.show()+ "\n" + "          Fiende: " + own.show() +"\n";
	}

	public Move getOponent() {
		return oponent;
	}

}

 