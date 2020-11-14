package dad.primertrimestre.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	Calculadora calculadora = new Calculadora();

		@FXML
	    private GridPane gripanel;

	    @FXML
	    private Button buttonSiete;

	    @FXML
	    private Button buttonOcho;

	    @FXML
	    private TextField resultTextfield;

	    @FXML
	    private Button buttonNueve;

	    @FXML
	    private Button buttonC;

	    @FXML
	    private Button buttonCE;

	    @FXML
	    private Button buttonCuatro;

	    @FXML
	    private Button buttonCinco;

	    @FXML
	    private Button buttonSeis;

	    @FXML
	    private Button buttonMulti;

	    @FXML
	    private Button buttonTres;

	    @FXML
	    private Button buttonDos;

	    @FXML
	    private Button buttonUno;

	    @FXML
	    private Button buttonDividir;

	    @FXML
	    private Button buttonMinus;

	    @FXML
	    private Button buttonPlus;

	    @FXML
	    private Button buttonComa;

	    @FXML
	    private Button buttonZero;

	    @FXML
	    private Button buttonEqual;

	    @FXML
	    void onCButtonAction(ActionEvent event) {
	    	calculadora.borrar();
			resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCEButtonAction(ActionEvent event) {
	    	calculadora.borrarTodo();
			resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCincoButtonAction(ActionEvent event) {
			calculadora.insertar('5');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onComaButtonAction(ActionEvent event) {
	    	calculadora.insertarComa();
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onCuatroButtonAction(ActionEvent event) {
	    	calculadora.insertar('4');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onDividirButtonAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.DIVIDIR);
	    	resultTextfield.setText(calculadora.getPantalla());
	    }	

	    @FXML
	    void onDosButtonAction(ActionEvent event) {
	    	calculadora.insertar('2');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onEqualButtonAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.IGUAL);
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onMinusButtonAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.RESTAR);
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onMultiButtonAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.MULTIPLICAR);
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onNueveButtonAction(ActionEvent event) {
	    	calculadora.insertar('9');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onOchoButtonAction(ActionEvent event) {
	    	calculadora.insertar('8');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onPlusButtonAction(ActionEvent event) {
	    	calculadora.operar(Calculadora.SUMAR);
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onSeisButtonAction(ActionEvent event) {
	    	calculadora.insertar('6');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onSieteButtonAction(ActionEvent event) {
	    	calculadora.insertar('7');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onTresButtonAction(ActionEvent event) {
	    	calculadora.insertar('3');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onUnoButtonAction(ActionEvent event) {
	    	calculadora.insertar('1');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }

	    @FXML
	    void onZeroButtonAction(ActionEvent event) {
	    	calculadora.insertar('0');
	    	resultTextfield.setText(calculadora.getPantalla());
	    }
	    public Controller() throws IOException {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.fxml"));
			loader.setController(this);
			loader.load();
		}


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public GridPane getView() {
		// TODO Auto-generated method stub
		return gripanel;
	}

}
