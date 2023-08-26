package test;

public class Control {
	private TV tv;
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
   public void canalUp() {
    	tv.canalUp();
    
    }
    public void canalDown() {
    	tv.canalDown();
	    }
    public void volumenUp() {
    	tv.volumenUp();}
    	
    	
    
    public void volumenDown() {
    	tv.volumenDown();
	    }
//  ENLAZAR TV
    public void enlazar(TV tv) {
    	this.tv=tv;
    	tv.setControl(this);
    	
    }
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		enlazar(tv) ;
	}
    
}

