package com.natnasolutions.ticketing.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Event implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "event_name")
	private String eventName;
	@Column(name = "event_description")
	private String eventDesc;
	@Column(name = "event_type")
	private String eventType;

	@Temporal(TemporalType.DATE)
	@Column(name = "event_date")
	private Date eventDate;
	@Temporal(TemporalType.TIME)
	@Column(name = "start_time")
	private Date startTime;
	@Temporal(TemporalType.TIME)
	@Column(name = "end_time")
	private Date endTime;

	private String region;
	private String city;
	private String address;
	@Column(name = "image_path")
	private String imageIcon;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	private List<TicketCategory> categories;
	private long ticketCateId;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ticket_open_date")
	private Date ticketOpenDate;
	private String eventStatus;
	@Temporal(TemporalType.TIME)
	@Column(name = "created_time")
	private Date createdDate;
	@Temporal(TemporalType.TIME)
	@Column(name = "updated_time")
	private Date updatedDate;
	@ManyToOne
	@JoinColumn(name="owner_Id")
	private Owner owner;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	private List<Ticket> tickets;
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}

	public List<TicketCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<TicketCategory> categories) {
		this.categories = categories;
	}

	public long getTicketCateId() {
		return ticketCateId;
	}

	public void setTicketCateId(long ticketCateId) {
		this.ticketCateId = ticketCateId;
	}

	public Date getTicketOpenDate() {
		return ticketOpenDate;
	}

	public void setTicketOpenDate(Date ticketOpenDate) {
		this.ticketOpenDate = ticketOpenDate;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
