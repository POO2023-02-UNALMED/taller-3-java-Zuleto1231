package test;
//class y constructor
public class TV {
	private Marca marca;
	int canal=1;
	private int precio=500;
	boolean estado;
	int volumen=1;
	private static int numTV;
	Control control;
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
//setter y getter
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if ((canal>=1 && canal<=120)&&(estado==true)) {
			this.canal = canal;
			
		}
		
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if ((volumen >= 0 && volumen <= 7)&&(estado==true)) {
			this.volumen = volumen;
		}else {
			return;
		}
		
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
//	FUNCION PARA ACCEDER AL TOTAL DE TELEVISORES
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public static int getNumTV() {
		return numTV;
	}
	
//METODOS PARA CAMBIAR EL ESTADO DEL TV
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
		
	}
	
//CAMBIO DE CANAL Y DE VOLUMEN
	
    public void canalUp() {
    	if ((estado==true)&&canal!=120) {
    		canal++;}
    
    }
    public void canalDown() {
    	if ((estado==true)&&(canal!=1)) {
    		canal--;}
    	;
    }
    public void volumenUp() {
    	if ((estado==true)&&(volumen!=7)) {
    		volumen++;}
    	else {return;
    	}
    	}
    	
    
    public void volumenDown() {
    	if((estado==true)&&(volumen!=0)) {
    	volumen--;}
    else {return;
    }
    }
}
