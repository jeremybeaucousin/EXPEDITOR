package fr.eni.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="UTILISATEURS")
@NamedQueries({
	@NamedQuery(name="getUtilisateurByLoginPwd", 
			query="SELECT * FROM Utilisateur u where u.login = :login and u.password = :password "),
	@NamedQuery(name="getUtilisateurById", query = "SELECT * FROM Utilisateur u where u.idUtilisateur = :util ")
})
public class Utilisateurs {
	
	@Column(name="ID_UTILISATEUR")
	@Id @GeneratedValue
	private int idUtilisateur;
	@Column(name="LOGIN")
	private String login;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	private String prenom;
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="TYPE_UTILISATEUR")
	@ManyToOne(targetEntity=TypeUtilisateur.class)
	private int typeUtilisateur;

	/**
	 * @return the idUtilisateur
	 */
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the typeUtilisateur
	 */
	public int getTypeUtilisateur() {
		return typeUtilisateur;
	}

	/**
	 * @param typeUtilisateur the typeUtilisateur to set
	 */
	public void setTypeUtilisateur(int typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public Utilisateurs(int idUtilisateur, String login, String nom,
			String prenom, String password, int typeUtilisateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.typeUtilisateur = typeUtilisateur;
	}

	public Utilisateurs() {
		super();
	}
	
	

}

