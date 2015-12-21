/**
 * 
 */
package fr.eni.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author d144retoreb
 *
 */
@Entity
@Table(name="TYPE_UTILISATEURS")
public class TypeUtilisateur {

	@Column(name="ID_TYPE_UTILISATEUR")
	@Id
	private int idTypeUtilisateur;
	
	@Column(name="LIBELLE")
	private String libelle;

	public int getIdTypeUtilisateur() {
		return idTypeUtilisateur;
	}

	public void setIdTypeUtilisateur(int idTypeUtilisateur) {
		this.idTypeUtilisateur = idTypeUtilisateur;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public TypeUtilisateur(int idTypeUtilisateur, String libelle) {
		super();
		this.idTypeUtilisateur = idTypeUtilisateur;
		this.libelle = libelle;
	}

	public TypeUtilisateur() {
		super();
	}
	
	
	
}
