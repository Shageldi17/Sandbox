package _995mvc;

public class MainMVC {

    public static void main(String[] args) {

        Recipe chickenSoup = new Recipe("Chicken soup", "Delicious soup");

        RecipeRepository recipeRepository = new RecipeRepository();


        recipeRepository.printRecipes();

        recipeRepository.addRecipe(chickenSoup);

        recipeRepository.printRecipes();

    }
}
