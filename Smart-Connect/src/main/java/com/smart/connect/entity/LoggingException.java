package com.smart.connect.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "logging_exception")
@Data
public class LoggingException {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "exception_summary")
    private String exceptionSummary;

    @Column(name = "exception_stack_trace")
    private String exceptionStackTrace;

    @Column(name = "jira_id")
    private String jiraId;

    @Column(name = "commiter")
    private String commiter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExceptionSummary() {
        return exceptionSummary;
    }

    public void setExceptionSummary(String exceptionSummary) {
        this.exceptionSummary = exceptionSummary;
    }

    public String getExceptionStackTrace() {
        return exceptionStackTrace;
    }

    public void setExceptionStackTrace(String exceptionStackTrace) {
        this.exceptionStackTrace = exceptionStackTrace;
    }

    public String getJiraId() {
        return jiraId;
    }

    public void setJiraId(String jiraId) {
        this.jiraId = jiraId;
    }

    public String getCommiter() {
        return commiter;
    }

    public void setCommiter(String commiter) {
        this.commiter = commiter;
    }
}