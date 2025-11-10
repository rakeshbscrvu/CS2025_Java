import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Lab12 extends Application {

    ListView<String> studentList;
    TextField nameField, idField, gradeField;

    @Override
    public void start(Stage stage) {

        
        Label idLabel = new Label("Student ID:");
        idField = new TextField();
        Label nameLabel = new Label("Name:");
        nameField = new TextField();
        Label gradeLabel = new Label("Grade:");
        gradeField = new TextField();

        
        Button addBtn = new Button("Add");
        Button clearBtn = new Button("Clear");

        
        studentList = new ListView<>();

        
        GridPane form = new GridPane();
        form.setVgap(10);
        form.setHgap(10);
        form.add(idLabel, 0, 0);
        form.add(idField, 1, 0);
        form.add(nameLabel, 0, 1);
        form.add(nameField, 1, 1);
        form.add(gradeLabel, 0, 2);
        form.add(gradeField, 1, 2);

        HBox buttons = new HBox(10, addBtn, clearBtn);
        VBox layout = new VBox(15, form, buttons, studentList);
        layout.setPadding(new Insets(20));

        
        addBtn.setOnAction(e -> addStudent());
        clearBtn.setOnAction(e -> clearFields());

        
        Scene scene = new Scene(layout, 400, 400);
        stage.setTitle("Student Record System");
        stage.setScene(scene);
        stage.show();
    }

    
    private void addStudent() {
        String id = idField.getText();
        String name = nameField.getText();
        String grade = gradeField.getText();

        if (id.isEmpty() || name.isEmpty() || grade.isEmpty()) {
            showAlert("Please fill in all fields!");
        } else {
            String record = "ID: " + id + " | Name: " + name + " | Grade: " + grade;
            studentList.getItems().add(record);
            clearFields();
        }
    }

    
    private void clearFields() {
        idField.clear();
        nameField.clear();
        gradeField.clear();
    }

    
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}