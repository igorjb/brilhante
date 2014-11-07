package br.com.devmedia.batch.TO;

import java.io.Serializable;
import java.util.Date;

public class JobInformationTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private long instanceID;
	private long executionID;
	private String jobName;
	private Date startTime;
	private Date endTime;
	private String batchStatus;
	
	public JobInformationTO() {
		
	}
	public long getInstanceID() {
		return instanceID;
	}
	public void setInstanceID(long instanceID) {
		this.instanceID = instanceID;
	}
	public long getExecutionID() {
		return executionID;
	}
	public void setExecutionID(long executionID) {
		this.executionID = executionID;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
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
	public String getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	
	
}
