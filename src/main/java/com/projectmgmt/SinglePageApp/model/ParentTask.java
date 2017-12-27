package com.projectmgmt.SinglePageApp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
//import org.springframework.data.annotation.Id;

import javax.persistence.Id;
@Entity
@Table(name="ParentTask")
public class ParentTask {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;
  @NotBlank
  private String parentTask;
  
 /* @OneToMany(cascade = CascadeType.ALL,
          fetch = FetchType.LAZY,
          mappedBy = "parentTask")
private Set<Task> tasks = new HashSet<Task>();*/

public Long getParentId() {
	return Id;
}
public void setParentId(Long Id) {
	this.Id = Id;
}
public String getParentTask() {
	return parentTask;
}
public void setParentTask(String parentTask) {
	this.parentTask = parentTask;
}
  	
}
