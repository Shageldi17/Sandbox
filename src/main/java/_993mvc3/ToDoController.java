package _993mvc3;

public class ToDoController {
    private ToDo model;
    private ToDoView view;
    public ToDoController(ToDo model, ToDoView view){
        this.model = model;
        this.view = view;
    }

    public void setToDoName(String name){
        model.setName(name);
    }
    public void updateView(){
        veiw.printToDoDetails(model.getName());
    }

}
