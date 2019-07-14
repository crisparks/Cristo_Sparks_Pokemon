public interface pokemonInterface
{
    pokemon createPokemon(String name, String type, int health);
    void attackPokemon(pokemon a);
    void pokemonInfo(pokemon a);
}
