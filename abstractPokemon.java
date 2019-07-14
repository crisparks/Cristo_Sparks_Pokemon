public abstract class abstractPokemon implements pokemonInterface
{
    public pokemon createPokemon(String name, String type, int health){
        return new pokemon(name, type, health);
    }
    public void attackPokemon(pokemon a){
        a.setHealth(-20);
    }
}
