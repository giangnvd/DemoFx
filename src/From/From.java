/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package From;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import viewModel.UserModel;

/**
 *
 * @author Van-Giang
 */
public class From extends Application {

    private Scene scene1;
    private Scene scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        UserModel model = new UserModel();

        // tao layaout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);

        // tao ra cac components
        Label lblUsername = new Label("Name");
        Label lblImage = new Label("Image");
        Label lblPirce = new Label("Pirce");
        TextField txtUsername = new TextField();
        TextField txtImage = new TextField();
        TextField txtPirce = new TextField();
        Button btnSubmit = new Button("Submit");
        btnSubmit.setOnAction((event) -> {
            String name = txtUsername.getText();
            String image = txtImage.getText();
            String price = txtPirce.getText();
            EntityFrom product = new EntityFrom(name, image, price);
            model.register(product);
            System.out.println("Oder thành công");
        });
        Button btnReset = new Button("Reset");

        // Đưa các components vào layout
        gridPane.add(lblUsername, 0, 0, 1, 1);
        gridPane.add(lblImage, 0, 1, 1, 1);
        gridPane.add(lblPirce, 0, 2, 1, 1);
        gridPane.add(txtUsername, 1, 2, 1, 1);
        gridPane.add(txtImage, 1, 1, 1, 1);
        gridPane.add(txtPirce, 1, 0, 1, 1);

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().addAll(btnSubmit, btnReset);
        gridPane.add(hBox, 1, 3, 1, 1);

        // Đưa group vap scene
        scene1 = new Scene(gridPane, 400, 250);

        // Đưa scene vào stage
        stage.setScene(scene1);
        stage.show();

    }

    private static void launcher(String[] args) {

    }
}
