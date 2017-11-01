
public class Pokedex extends PokeAbstract {
	public String pokemonInfo(Pokemon poke) {
		return "Name: " + poke.getName() + "\nHealth: " + poke.getHealth() + "\nType: " + poke.getType();
	}
}
