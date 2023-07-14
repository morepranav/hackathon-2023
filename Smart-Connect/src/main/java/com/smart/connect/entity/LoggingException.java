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

}