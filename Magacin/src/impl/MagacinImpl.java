package impl;

import java.util.ArrayList;
import java.util.List;

import interfejs.Magacin;
import magacin.Artikal;

public class MagacinImpl implements Magacin{

	
	private Artikal artikal;
	private List<Artikal> artikli;
	
	public MagacinImpl(Artikal artikal) {
		this.artikal = artikal;
		this.artikli = new ArrayList<>();
	}
	
	@Override
	public void dodajArtikal() {
		
		artikal.setKolicina(artikal.getKolicina()+1);
		
	}

	@Override
	public void izbaciArtikal() {
		
		artikal.setKolicina(artikal.getKolicina()-1);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		
		for(Artikal artikal: artikli) {
			if(artikal.getSifra() == sifra)
				return artikal;
		}
		
		return null;
		
	}

}
