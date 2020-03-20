package com.natnasolutions.ticketing.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Transient
	private String passwordConfirm;

	@Transient
	private String passwordOld;

	@Column(name = "enabled", nullable = false)
	private boolean enabled;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "UserAndRole", joinColumns = { @JoinColumn(name = "userId") }, inverseJoinColumns = {
			@JoinColumn(name = "roleId") })
	private Set<UserRole> userRoles = new HashSet<>();

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SubUser> subUsers = new ArrayList<>();

	public void addSubUser(SubUser subUser) {
		subUsers.add(subUser);
		subUser.setUser(this);
	}

	public void removeSubUser(SubUser subUser) {
		subUsers.remove(subUser);
		subUser.setUser(this);
	}

	public void addUserRole(UserRole userRole) {
		userRoles.add(userRole);
		userRole.getUsers().add(this);
	}

	public void removeUserRole(UserRole userRole) {
		userRoles.remove(userRole);
		userRole.getUsers().remove(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		return id != null && id.equals(((User) o).getId());
	}

	@Override
	public int hashCode() {
		return 31;
	}

}
