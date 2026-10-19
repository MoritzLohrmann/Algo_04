package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CafesModel {
	private Cafe cafe;

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public void leseAusDatei(String typ) throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Cafe.csv"));
		String[] zeile = ein.readLine().split(";");
		this.cafe = new Cafe(zeile[0], zeile[1], zeile[2], zeile[3], zeile[4].split("_"));
		ein.close();
	}

	public void schreibeCafesInCsvDatei() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("cafesAusgabe.csv", true));
		aus.write(this.cafe.gibCafeZurueck(';'));
		aus.close();

	}

}
