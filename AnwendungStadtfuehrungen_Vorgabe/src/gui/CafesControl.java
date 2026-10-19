package gui;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;

//import business.Cafe;
import business.CafesModel;
import javafx.stage.Stage;

public class CafesControl {
	private CafesModel cafeModel;
	private CafesView cafeView;

	public CafesControl(Stage primaryStage) {
		this.cafeModel = new CafesModel();
		this.cafeView = new CafesView(primaryStage, this, cafeModel);
	}

	public void leseAusDatei(String typ) {
		try {
			if ("csv".equals(typ)) {
				cafeModel.leseAusDatei(typ);
				cafeView.zeigeInformationsfensterAn("Das Cafe wurde gelesen!");
			} else {
				cafeView.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		} catch (IOException exc) {
			cafeView.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
		} catch (Exception exc) {
			cafeView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
		}
	}
	public void schreibeCafesInCsvDatei(String typ) {
		try {
			if ("csv".equals(typ)) {
				cafeModel.schreibeCafesInCsvDatei();
				cafeView.zeigeInformationsfensterAn("Das Cafe wurde gelesen!");
			} else {
				cafeView.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		} catch (IOException exc) {
			cafeView.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
		} catch (Exception exc) {
			cafeView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
		}
	}

}
