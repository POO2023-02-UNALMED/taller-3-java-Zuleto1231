package taller3.televisores;

public class Control {
	private TV tv;
	
	public void setCanal(int canal) {
		tv.canal = canal;
	}
	
	public void turnOn() {
		tv.estado=true;
	}
	public void turnOff() {
		tv.estado=false;
	}
   public void canalUp() {
    	if ((tv.estado==true)&&tv.canal!=120) {
    		tv.canal++;}
    
    }
    public void canalDown() {
    	if ((tv.estado==true)&&(tv.canal!=1)) {
    		tv.canal--;}
	    	;
	    }
    public void volumenUp() {
    	if ((tv.estado==true)&&(tv.volumen!=7)) {
    		tv.volumen++;}
    	else {return;
    	}
    	}
    	
    
    public void volumenDown() {
    	if((tv.estado==true)&&(tv.volumen!=0)) {
    	tv.volumen--;}
    else {return;
    }
	    }
//  ENLAZAR TV
    public void enlazar(TV tv) {
    	this.tv=tv;
    	this.tv.control=this;
    	
    }
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
    
}

