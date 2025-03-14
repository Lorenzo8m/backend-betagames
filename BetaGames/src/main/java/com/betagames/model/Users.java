package com.betagames.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "pwd", nullable = false)
	private String pwd;

	@OneToOne(mappedBy = "user")
	private Carts cart;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Reviews> listReviews;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Orders> listOrders;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<PayCards> listPayCards;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<DetailsShipping> listDetailsShippings;

	@ManyToOne()
	@JoinColumn(name = "id_role")
	private Roles role;

	@Column(name = "active", nullable = false)
	private Boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Carts getCart() {
		return cart;
	}

	public void setCart(Carts cart) {
		this.cart = cart;
	}

	public List<Reviews> getListReviews() {
		return listReviews;
	}

	public void setListReviews(List<Reviews> listReviews) {
		this.listReviews = listReviews;
	}

	public List<Orders> getListOrders() {
		return listOrders;
	}

	public void setListOrders(List<Orders> listOrders) {
		this.listOrders = listOrders;
	}

	public List<PayCards> getListPayCards() {
		return listPayCards;
	}

	public void setListPayCards(List<PayCards> listPayCards) {
		this.listPayCards = listPayCards;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<DetailsShipping> getListDetailsShippings() {
		return listDetailsShippings;
	}

	public void setListDetailsShippings(List<DetailsShipping> listDetailsShippings) {
		this.listDetailsShippings = listDetailsShippings;
	}

}// class
