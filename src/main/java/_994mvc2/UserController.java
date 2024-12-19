package _994mvc2;

public class UserController {
    private User model;
    private UserView view;
    //конструктор
    public UserController(User model, UserView view){
        this.model = model;
        this.view = view;
    }
    // Метод для отображение данных пользавателя
    public void updateView(){
        view.printUserDetails(model.getName(), model.getAge());
    }
}
