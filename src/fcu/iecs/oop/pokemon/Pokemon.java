package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	private String nickname;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String name, PokemonType type, int cp){
		super();
		this.nickname = name;
		this.type = type;
		this.cp = cp;
	}
	public PokemonType gettype(){
		return this.type;
	}
	public String getName(){
		return this.nickname;
	}
	public int getcp(){
		return this.cp;
	}
	public void setName(String name){
		this.nickname = name;
	}
	public void setcp(int cp){
		this.cp = cp;
	}
	
	
}
