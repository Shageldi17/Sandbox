package _995mvc;

public class RecipeService {

    private RecipeRepository repository;            // HAS-A    service has a repository

    public RecipeService(recipeRepository) {
        this.repository = repository;
    }

}
