package weatherApp.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.querydsl.core.annotations.QueryEntity;
@QueryEntity
@Document
public class User {
	
	@Id
	private String id;
	
	private String ime;
	private String prezime;
	private String email;
	private int pretplata;
	private String sifra;
	private String grad;
	
	
	
	public User(String id, String ime, String prezime, String email, int pretplata,String sifra,String grad) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.pretplata = pretplata;
		this.sifra = sifra;
		this.grad = grad;
	}
	
	public User() {
		
	}
	
	
	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public int getPretplata() {
		return pretplata;
	}

	public void setPretplata(int pretplata) {
		this.pretplata = pretplata;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email + ", pretplata="
				+ pretplata + ", sifra=" + sifra + ", grad=" + grad + "]";
	}

	


	
	
	
	
	
}
