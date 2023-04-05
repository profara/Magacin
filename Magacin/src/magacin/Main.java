package magacin;


import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		KucnaHemija kh = new KucnaHemija();
		kh.setNaziv("Ornel");
		kh.setKolicina(1);
		kh.setOpis("Lavanda");
		kh.setRokTrajanja(new Date());
		kh.setSifra(100);
		
		System.out.println(kh);
		
	

	}

}
