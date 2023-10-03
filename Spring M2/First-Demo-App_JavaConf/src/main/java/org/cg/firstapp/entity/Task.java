package org.cg.firstapp.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Task {

	private String taskName;
	private String endDate;
	private String status;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String taskName, String endDate, String status) {
		super();
		this.taskName = taskName;
		this.endDate = endDate;
		this.status = status;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", endDate=" + endDate + ", status=" + status + "]";
	}
	
	
}
