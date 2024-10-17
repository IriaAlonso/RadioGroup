package com.carballeria.aplication.view;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import com.carballeira.aplication.model.Usuario;


public class UsuarioView extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// DEFINIR COMPONENTES
			GridPane root = new GridPane();
			Label txt = new Label("Bienvenido!! Haga Login");
			Label nombre = new Label();
			nombre.setText("USUARIO:");
			TextField txtNombre = new TextField();
			Label pass = new Label();
			pass.setText("PASSWORD:");
			TextField txtPass = new TextField();
			Button btn = new Button();
			btn.setText("ENTRAR");
			
			// ESCENA
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			// MOSTRAR COMPONENTES EN LA ESCENA
			root.add(txt, 0, 0);
			root.add(nombre, 0, 1);
			root.add(txtNombre, 1, 1);
			root.add(pass, 0, 2);
			root.add(txtPass, 1, 2);
			root.add(btn, 1, 3);
			primaryStage.setTitle("LOGIN");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
