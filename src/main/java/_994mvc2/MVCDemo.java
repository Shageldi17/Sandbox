package _994mvc2;

public class MVCDemo {
    public static void main (String[] args){
        // создаем модель
        User model = new User("John Doe", 30);
        // создаем представление
        UserView view = new UserView();

        UserController controller = new UserController(model, view);


        // обновляем представление с помощью контроллера
        controller.updateView();

    }
}
