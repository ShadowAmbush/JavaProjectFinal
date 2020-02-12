package model;

import java.io.Serializable;

public abstract class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2523668002450217620L;
	private String login = new String();
	private String pass = new String();
	
	public abstract String showMenu();
	public abstract boolean ValidaOp(int op);
	
	public void setLogin(String n)
	{
		this.login = n;
	}
	public void setPass(String n)
	{
		this.pass = n;
	}
	
	public String getLogin()
	{
		return login;
	}
	public String getPass()
	{
		return pass;
	}

	

	
}
