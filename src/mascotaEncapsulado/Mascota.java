package mascotaEncapsulado;

import javax.swing.JOptionPane;

public class Mascota {
	private int edad, codigo;
    private String nombre, especie;
    
    public void IngresarDatos () {
		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota")));
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la mascota"));
        setEspecie(JOptionPane.showInputDialog("Ingrese la especie de su mascota"));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota")));
	}

public void GuardarDatos (int codigo, String nombre, String especie, int edad) {
    this.setNombre(nombre);
    this.setEspecie(especie);
    this.setCodigo(codigo);
    this.setEdad(edad);
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}
}
