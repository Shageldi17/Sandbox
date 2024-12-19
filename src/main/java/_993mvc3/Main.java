package _993mvc3;

public class Main {
    public static void main(String[] args) {
        ToDo todo = new ToDo("Learn MVC Pattern" );
        ToDoView toDoView = new ToDoView();
        ToDoController toDoController = new ToDoController(todo, toDoView);

        toDoController.updateView();

        todoController.setToDoName("Learn Java Design Patterns");

        toDoController.updateView();


    }
}
