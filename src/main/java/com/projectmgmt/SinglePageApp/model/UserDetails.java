package com.projectmgmt.SinglePageApp.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="user_details")
@JsonAutoDetect(getterVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDetails {
	
	  private Long userId;
	  @NotBlank
	  private String firstName;
	  private String lastName;
	  @Column(unique=true)
	  private String employeeId;
	  private Project project;
	 private Task tasks;
	  public UserDetails(){
		 
	 }
	  public UserDetails(Long userId, Long projectId, String firstName,String lastName,String employeeId){
	       this.userId = userId;
	       this.project = new Project(projectId);
	       this.firstName = firstName;
	       this.lastName = lastName;
	       this.employeeId = employeeId;
	       
	    }
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="userId")
	 // @JsonProperty("userId")
	public Long getuserId() {
		return userId;
	}
	public void setuserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "projectId")
	@JsonBackReference
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	 
	  
	  
}
