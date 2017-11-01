
public abstract class PokeAbstract implements PokemonMethods {
	
	public void createPokemon(String name, int health, String type) {
		Pokemon create = new Pokemon(name, health, type);
		create.getName();
		create.getHealth();
		create.getType();
	}
}
