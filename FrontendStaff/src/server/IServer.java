package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import objetos.ClienteStaff;
import objetos.Entrada;

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
	
	boolean loginStaff(int idStaff, String contrasenya);
	boolean validarEntrada(int idEntrada);



}