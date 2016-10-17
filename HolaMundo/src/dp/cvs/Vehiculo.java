package dp.cvs;

/*
 * 
 * 
 * 
 */
public class Vehiculo {
	private String matricula;
	private String marca;
	private Integer kms;
	
	public Vehiculo() {
		marca="";
		matricula="0000-AAA";
		kms=0;
				
	}
	
	public Vehiculo(String _marca, String _matricula, int _kms){
		marca=_marca;
		matricula=_matricula;
		kms=_kms;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}
	
	
	@Override
	public String toString() {
		return marca+"-"+matricula+"-"+kms.toString();
	}
	

}
