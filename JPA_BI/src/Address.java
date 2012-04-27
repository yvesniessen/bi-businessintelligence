
import javax.*;
import java.io.Serializable;
import javax.persistence.*;

import static javax.persistence.CascadeType.*;

import java.util.Collection;
import java.util.ArrayList;

/**
 * @author TBCY-Boys
 */

@Entity
@Table(name="ADDRESS_TABLE")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3302984691250441749L;

	@Id
	@GeneratedValue
	private int id;
	private String strasse;
	private int plz;
	private String ort;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
}
