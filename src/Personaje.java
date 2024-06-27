package codigo; // Pertenece al paquete codigo

public class Personaje { // Clase publica Personaje
	// Cada personaje tendra un nombre, una cantidad de salud y un nivel
	// Son atributos privados
	private String nombre;
	private int salud;
	private int nivel;
	
	// Constructor de la clase (para inicializar objetos de la clase)
	// Mismo nombre que la clase
	public Personaje(String nombre, int salud, int nivel) {
		// Parametros del constructor
		this.nombre = nombre;
		this.salud = salud;
		this.nivel = nivel;
	}
	
	// Getters y setters 
	// Para acceder a los valores de los atributos privados de la clase
	
	// Retorna el valor del atributo nombre
	public String getNombre() {
	    return this.nombre;
	}
	
	// Asigna un nuevo valor al atributo nombre
	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	// Retorna el valor del atributo salud
	public int getSalud() {
	    return this.salud;
	}

	// Asigna un nuevo valor al atributo salud
	public void setSalud(int salud) {
	    this.salud = salud;
	}

	// Retorna el valor del atributo nivel
	public int getNivel() {
	    return this.nivel;
	}

	// Asigna un nuevo valor al atributo nivel
	public void setNivel(int nivel) {
	    this.nivel = nivel;
	}

    // Este metodo reduce la salud del personaje basado en el daño recibido
    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud < 0) {
            this.salud = 0; // La salud no puede ser negativa.
        }
    }

}
