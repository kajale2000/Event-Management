package com.multigenesys.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Organizer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String contactInfo;

   @OneToMany(mappedBy = "organizer")
   private Set<Event> events;

   public Organizer() {
	   super();
	// TODO Auto-generated constructor stub
   }


   public Organizer(Long id, String name, String contactInfo, Set<Event> events) {
	   super();
	   this.id = id;
	   this.name = name;
	   this.contactInfo = contactInfo;
	   this.events = events;
   }


   public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContactInfo() {
		return contactInfo;
	}


	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}


	public Set<Event> getEvents() {
		return events;
	}


	public void setEvents(Set<Event> events) {
		this.events = events;
	}


	@Override
	public String toString() {
		return "Organizer [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + ", events=" + events + "]";
	}
   	
   				
}
