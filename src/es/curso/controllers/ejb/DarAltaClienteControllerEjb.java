package es.curso.controllers.ejb;

import es.curso.controllers.DarAltaClienteController;
import es.curso.model.entity.Cliente;

public class DarAltaClienteControllerEjb implements DarAltaClienteController{

	@Override
	public void agregar(Cliente cliente) {
		//Logica del Negocio para agregar un cliente:
		//1.Verificar datos en Hacienda
		//2.Agregarlo-->llamar a la capa Dao(para quese de, de alta).
		//3.Enviar email al jefe de obra.
		//4.Enviar un email al cliente.
		
		
		
	}

}
