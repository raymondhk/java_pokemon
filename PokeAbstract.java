
public abstract class PokeAbstract implements PokemonMethods {
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	
	public void attackPokemon(Pokemon poke) {
		int currentHealth = poke.getHealth() - 10;
		poke.setHealth(currentHealth);
	}
	
}
