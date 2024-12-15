package _995mvc;

import java.util.ArrayList;

public class RecipeRepository {

    private ArrayList<Recipe> recipes;

    public RecipeRepository() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public void printRecipes() {
        System.out.println(recipes);
    }

}
