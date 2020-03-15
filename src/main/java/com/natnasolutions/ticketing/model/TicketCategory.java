package com.natnasolutions.ticketing.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TicketCategory implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name="event_Id")
	private Event event;
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "total_seats")
	private long totalSeats;
	
	private long price;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "created_time")
	private Date createdTime;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "updated_time")
	private Date updatedTime;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public long getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(long totalSeats) {
		this.totalSeats = totalSeats;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
}
