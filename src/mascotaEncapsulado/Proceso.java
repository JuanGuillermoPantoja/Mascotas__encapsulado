package mascotaEncapsulado;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Proceso {
	int opc, buscarCodigo, codigo, edad;
	String nombre, tipo, buscarNombre;
	HashMap <Integer, Mascota> mapaMascotas = new HashMap <Integer, Mascota>();
	public void iniciar() {
			String menu = "menu de opciones\n";
			menu+= "1. Ingresar Mascotas:\n";
			menu+= "2. Buscar mascotas por codigo:\n";
			menu+= "3. Buscar mascotas por nombres:\n";
			menu+= "4. Mostrar la lista de mascotas:\n";
			menu+="5.salir del programa\n";
			menu+="Ingrese una opcion";
			do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			validar();
			} while (opc != 5);	
}
	
	public void validar() {
			switch (opc) {
			case 1:
				Mascota animal = new Mascota();
				animal.IngresarDatos();
				animal.GuardarDatos(animal.getCodigo(), animal.getNombre(), animal.getEspecie(), animal.getEdad());
				mapaMascotas.put(animal.getCodigo(), animal);
				break;
			case 2:
				buscarMascotas();
				break;
			case 3:
				buscarNombre();
				break;
			case 4:
				imprimirLista();
				break;
			case 5: System.out.println("salio del programa, vuelva pronto!");
				break;
			default:
				System.out.println("ingrese una opcion correta");
				break;
			}
	}
	public void buscarMascotas () {
		
		buscarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de su mascota"));
	    Mascota mascota = mapaMascotas.get(buscarCodigo);
	    codigo = mascota.getCodigo();
	    nombre = mascota.getNombre();
	    tipo = mascota.getEspecie();
	    edad = mascota.getEdad();
	    System.out.println("codigo: "+codigo + "\nnombre: " + nombre + "\ntipo: " + tipo + "\nedad: " + edad );
	}
	
	public void buscarNombre () {
		
		buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre de su mascota");
		for (Mascota mascota: mapaMascotas.values()) {
			if (buscarNombre == mascota.getNombre()) {
				codigo = mascota.getCodigo();
			}
		}
		
		Mascota mascota = mapaMascotas.get(codigo);
		codigo = mascota.getCodigo();
		nombre = mascota.getNombre();
		tipo = mascota.getEspecie();
		edad = mascota.getEdad();
		System.out.println("Codigo: "+codigo +"\n" 
		+"Nombre: "+ nombre+ "\n" 
		+"Tipo: "+ tipo +"\n"
		+"Años:" + edad );
		
	}
	
	public void imprimirLista() {
		
		for (Mascota mascota : mapaMascotas.values()) {
			System.out.println("Codigo: " + mascota.getCodigo());
			System.out.println("Nombre: " + mascota.getNombre());
			System.out.println("Especie: " + mascota.getEspecie());
			System.out.println("Edad: " + mascota.getEdad());
			System.out.println("---------------------------");
			}

		
	}
	

	

}