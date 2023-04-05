package impl;

import interfejs.Magacin;
import magacin.Artikal;

public class MagacinImpl implements Magacin{

	private Artikal a;
	
	public MagacinImpl() {
		a = new Artikal();
	}
	
	@Override
	public void dodajArtikal() {
		int stanje = a.getKolicina(); 
		int novoStanje = stanje + 1;
		a.setKolicina(novoStanje);
		
	}

	@Override
	public void izbaciArtikal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal pronadjiArtikal() {
		// TODO Auto-generated method stub
		return null;
	}

}
