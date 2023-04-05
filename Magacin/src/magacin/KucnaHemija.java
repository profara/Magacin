package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{
	
	private Date rokTrajanja;
	
	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	
	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja != null)
			this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", rokTrajanja=" + rokTrajanja;
	}

	
	
	

}
