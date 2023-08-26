package taller3.televisores;
//class y constructor
public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	static int numTV;
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
		this.canal = canal;
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
		this.volumen = volumen;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
//	FUNCION PARA ACCEDER AL TOTAL DE TELEVISORES
	public static void setnumTV(int numTV) {
		TV.numTV=numTV;
	}
//METODOS PARA CAMBIAR EL ESTADO DEL TV
	public void turnON() {
		estado=true;
	}
	public void turnOF() {
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