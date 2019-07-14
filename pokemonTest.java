public class pokemonTest extends pokedex
{
    public static void main(String[] args) {
        pokedex redbox = new pokedex();
        pokemon bulbasaur = redbox.createPokemon("Bulbasaur", "grass", 150);
        pokemon charmander = redbox.createPokemon("Charmander", "fire", 100);
        pokemon pikachu = redbox.createPokemon("Pikachu", "electric", 50);
    
        redbox.attackPokemon(bulbasaur);
        redbox.pokemonInfo(bulbasaur);
        redbox.attackPokemon(charmander);
        redbox.pokemonInfo(charmander);
        redbox.attackPokemon(pikachu);
        redbox.pokemonInfo(pikachu);
    }
}
