package codigo; // Pertenece al paquete codigo

public interface Guerrero { // Interfaz publica Guerrero (contrato que las clases implementadoras deben seguir)
	
	// Metodos de la Interfaz
	void atacar(Personaje enemigo); // Utilizado para simular un ataque a otro Personaje (enemigo)
    void defender(Personaje atacante); // Utilizado para que el Personaje se defienda del ataque de otro Personaje (atacante)

}
