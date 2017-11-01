
public class PokeTest {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Charmander", 80, "Fire");
		Pokemon p2 = new Pokemon("Bulbasaur", 70, "Water");
		Pokemon p3 = new Pokemon("Squirtle", 75, "Grass");
		
		Pokedex pokedex1 = new Pokedex();
		Pokemon p4 = pokedex1.createPokemon("MagiKarp", 50, "Water");
		System.out.println(pokedex1.pokemonInfo(p1));
		System.out.println(pokedex1.pokemonInfo(p4));
		pokedex1.attackPokemon(p4);
		System.out.println(pokedex1.pokemonInfo(p4));
	}

}
