/**
 * 
 */
package fr.eni.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author d144retoreb
 *
 */
@Entity
@Table(name="ARTICLES")
@NamedQueries({
	@NamedQuery(name="getArticleById", query ="SELECT * FROM Article a WHERE a.idArticle = :idArt")
})
public class Article {

	@Id
	@Column(name="ID_ARTICLE")
	private int idArticle;
	@Column(name="LIBELLE_ARTICLE")
	private String libelle;
	@Column(name="POID_UNITAIRE")
	private int poidUnitaire;
	/**
	 * @return the idArticle
	 */
	public int getIdArticle() {
		return idArticle;
	}
	/**
	 * @param idArticle the idArticle to set
	 */
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the poidUnitaire
	 */
	public int getPoidUnitaire() {
		return poidUnitaire;
	}
	/**
	 * @param poidUnitaire the poidUnitaire to set
	 */
	public void setPoidUnitaire(int poidUnitaire) {
		this.poidUnitaire = poidUnitaire;
	}
	
	public Article(int idArticle, String libelle, int poidUnitaire) {
		super();
		this.idArticle = idArticle;
		this.libelle = libelle;
		this.poidUnitaire = poidUnitaire;
	}
	public Article() {
		super();
	}
	
	
}
