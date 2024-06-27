package codigo; // Pertenece al paquete codigo

/* Declara una clase publica, Pjugador, que es subclase de Personaje.
 * PJugador es un tipo de Personaje y hereda sus metodos y atributos.
 * Implements Guerrero, obliga a la clase PJugador a implementar los metodos definidos en la interfaz Guerrero,
 * lo que significa que PJugador debe tener los metodos atacar y defender.
 */
public class PJugador extends Personaje implements Guerrero {
	//Atributos de la clase
    private int edad;  // Opcional
    private int ataque; //Cantidad de daño que Pjugador puede infligir al atacar
    private int defensa; // Capacidad del PJugador para reducir el daño recibido cuando se defiende de un ataque

    // Este constructor inicializa un PJugador con todos los atributos, incluida la
 	// edad
 	// Invoca al constructor de la superclase Personaje, pasandole los valores
 	// nombre, salud y nivel
 	public PJugador(String nombre, int salud, int nivel, int edad, int ataque, int defensa) {
 		super(nombre, salud, nivel);
 		this.ataque = ataque;
 		this.defensa = defensa;
 		this.edad = edad;
 	}

 	// Constructor sobrecargado para crear un PJugador sin especificar la edad, que
 	// se establece en 0 por defecto
 	public PJugador(String nombre, int salud, int nivel, int ataque, int defensa) {
 		this(nombre, salud, nivel, 0, ataque, defensa);
 	}

 	// Implementación de métodos de Guerrero

 	@Override // El metodo esta sobreescribiendo un metodo de una superclase o interfaz
 	public void atacar(Personaje enemigo) { // Define el metodo atacar
 		// Calcula el daño que el PJugador hace al enemigo. Este daño es igual al nivel
 		// del PJugador multiplicado por su poder de ataque:
 		int daño = this.getNivel() * this.getAtaque();
 		// Llama al metodo recibirDaño en el objeto enemigo (que será otro Personaje),
 		// pasandole el valor de daño calculado:
 		enemigo.recibirDaño(daño);
 	}

 	/*
 	 * // Este metodo reduce la salud del personaje basado en el daño recibido
 	 * public void recibirDaño(int daño) { this.salud -= daño; if (this.salud < 0) {
 	 * this.salud = 0; // La salud no puede ser negativa. } }
 	 */

 	@Override
 	// El metodo defender calcula el daño recibido tras un ataque y ajusta la salud
 	// del personaje defensor
 	public void defender(Personaje atacante) {
 		// Calcula el daño recibido restando la defensa del PJugador del nivel del
 		// atacante
 		int dañoRecibido = atacante.getNivel() - this.defensa;
 		// Se asegura de que solo se reciba daño si el resultado del calculo es mayor
 		// que cero
 		if (dañoRecibido > 0) {
 			// Si hay daño que recibir, se llama al metodo recibirDaño para reducir la salud
 			// del PJugador
 			this.recibirDaño(dañoRecibido);
 		}
 	}

 	// Getters
 	// Devuelve el valor actual del atributo ataque del objeto PJugador
 	public int getAtaque() {
 		return ataque;
 	}

 	// Obtienes el valor actual del atributo defensa del objeto PJugador
 	public int getDefensa() {
 		return defensa;
 	}

 	// Devuelve el valor del atributo edad
 	public int getEdad() {
 		return edad;
 	}


 	// Setters
 	public void setEdad(int edad) {
 		this.edad = edad;
 	}


 	public void setAtaque(int ataque) {
 		this.ataque = ataque;
 	}

 	public void setDefensa(int defensa) {
 		this.defensa = defensa;
 	}
 	
 	

 }
