module ProyectoBolentin2 {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.xml;
	
	
	opens application to javafx.graphics, javafx.fxml;
	exports com.carballeria.aplication.view;

}
