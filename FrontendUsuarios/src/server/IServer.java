package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import objects.ClienteUsuario;
import objects.Compra;
import objects.Evento;


public interface IServer extends Remote 
{
	/**
	 * Test message to say hello to client
	 * @param
	 * @return Message
	 * @throws RemoteException
	 */
	String sayHello() throws RemoteException;
	
	/**
	 * Print message to client
	 * @param login
	 * @param password
	 * @param message
	 * @return Message
	 * @throws RemoteException
	 */
	String sayMessage(String login, String password, String message) throws RemoteException, InvalidUser;
	
	/**
	 * Function to register a new user
	 * @param login
	 * @param password
	 * @throws RemoteException
	 */
	void registerUser(String login, String password) throws RemoteException, InvalidUser;
	boolean registro(String nombre, String contrasenya, String email);
	boolean loginUsuario(String email, String contrasenya);
	int realizarCompra(Evento evento, ClienteUsuario clienteUsuario, int cantidadEntradas, String[] personas);
	Compra consultarCompra(int idCompra);

}