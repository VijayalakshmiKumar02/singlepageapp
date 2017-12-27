package com.projectmgmt.SinglePageApp.model;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;


@Entity
@Table(name="Task")
public class Task {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long taskId;
	  @NotBlank
	  private String taskName;
	  @Temporal(TemporalType.TIMESTAMP)
	  @CreatedDate
	  private Date createdAt;
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date endDate;
	  private Integer priority;
	  private String status;
	  /*@ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "project_id", nullable = false)
	  private Project project;
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "parent_id", nullable = false)
	  private ParentTask parentTask;
	  @OneToOne(mappedBy = "tasks")
	    private UserDetails user;*/
	 
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public String getTask() {
		return taskName;
	}
	public void setTask(String taskName) {
		this.taskName = taskName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreateDate(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	  
	  
}
