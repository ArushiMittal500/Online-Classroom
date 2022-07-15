package javafxapplication1;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Hyperlink;

public class coursecontentController implements Initializable{

    @FXML
    private Button courses;

    @FXML
    private Button timetable;

    @FXML
    private Button english;

    @FXML
    private Button maths;

    @FXML
    private Button science;

    @FXML
    private Button ssc;

    @FXML
    private Button hindi;

    @FXML
    private Button computer;

    @FXML
    private Button back;

    @FXML
    private Hyperlink logout;

    @FXML
    void d1c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1cK37JdT_ag_DY1T_AP-5MUUKuy-6d0aD?usp=sharing").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void r1c(ActionEvent event) throws URISyntaxException {
        try {
            Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/folders/1oLLjt8_o3cOZ8voD853o6c5SpdnwxiwD?usp=sharing").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void resourceAction(ActionEvent event) throws Exception {
        
        if(event.getSource()==courses){
            Stage stage = (Stage) courses.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("course.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==timetable) {
            Stage stage = (Stage) timetable.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("timetable.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==maths){
            Stage stage = (Stage) maths.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("maths.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==english) {
            Stage stage = (Stage) english.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("english.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==science) {
            Stage stage = (Stage) science.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("science.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==hindi) {
            Stage stage = (Stage) hindi.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("hindi.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==ssc){
            Stage stage = (Stage) ssc.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("s.sc.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==computer) {
            Stage stage = (Stage) computer.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("computer.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==back) {
            Stage stage = (Stage) back.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==logout) {
            Stage stage = (Stage) logout.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}

