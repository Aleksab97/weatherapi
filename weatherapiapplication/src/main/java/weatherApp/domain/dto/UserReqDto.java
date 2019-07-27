package weatherApp.domain.dto;

public class UserReqDto {
	
	private String ime;
	private String prezime;
	private String email;
	private int pretplata;
	private String grad;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	

	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
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
	
	
	
	
	
	
	

}
