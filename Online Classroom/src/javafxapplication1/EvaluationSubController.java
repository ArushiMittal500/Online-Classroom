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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EvaluationSubController implements Initializable {
    
    @FXML
    private TextField ut1;

    @FXML
    private TextField ut2;

    @FXML
    private TextField ut3;

    @FXML
    private TextField ut4;

    @FXML
    private TextField sa1;

    @FXML
    private TextField sa2;

    @FXML
    private Label lab;

    @FXML
    void evalBtn(ActionEvent event){

        String a = ut1.getText().toString();
        double inta = Double.parseDouble(a);

        String b = ut2.getText().toString();
        double intb = Double.parseDouble(b);

        String c = ut3.getText().toString();
        double intc = Double.parseDouble(c);

        String d = ut4.getText().toString();
        double intd = Double.parseDouble(d);

        String e = sa1.getText().toString();
        double inte = Double.parseDouble(e);

        String f = sa2.getText().toString();
        double intf = Double.parseDouble(f);

        double percentage = inta + intb + intc+ intd+ inte +intf;
        String per = Double.toString(percentage);
        lab.setText("The percentage is " + per + "%");
    }

    @FXML
    private Button back;
    
    @FXML
    private Button exam;

    @FXML
    private Button df;

    @FXML
    private Button result;
   
    @FXML
    private Hyperlink logout;
    
    @FXML
    private Hyperlink hy1;

    @FXML
    private Hyperlink hy2;

    @FXML
    private Hyperlink hy3;

    @FXML
    private Hyperlink hy4;

    @FXML
    private Hyperlink hy5;

    @FXML
    private Hyperlink hy6;

    @FXML
    void hy1c(ActionEvent event) throws URISyntaxException {
        try {
            Desktop.getDesktop().browse(new URL("https://www.123test.com/iq-test/#classical-intelligence-test").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hy2c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://classroom.google.com/u/2/c/MjQyNjE5MjUwNDE4").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hy3c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://www.123test.com/iq-test/#classical-intelligence-test").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hy4c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://classroom.google.com/u/2/c/MjQyNjE5MjUwNDE4").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hy5c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://www.123test.com/iq-test/#classical-intelligence-test").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hy6c(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("https://classroom.google.com/u/2/c/MjQyNjE5MjUwNDE4").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void subjectbuttonaction(ActionEvent event) throws Exception {
        
        if(event.getSource()==exam){
            Stage stage = (Stage) exam.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("exam.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==df) {
            Stage stage = (Stage) df.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Discussion forum.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==result) {
            Stage stage = (Stage) result.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("result.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==back) {
            Stage stage = (Stage) back.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("evaluation.fxml"));
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
