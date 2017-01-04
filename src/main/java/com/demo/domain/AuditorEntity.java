package com.demo.domain;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AuditorAware;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by rawad.elrifai on 1/3/17.
 */
@MappedSuperclass
public abstract class AuditorEntity implements AuditorAware {

    /**
     * Returns the current auditor of the application.
     *
     * @return the current auditor
     */
    @Override
    public String getCurrentAuditor() {
        return null;
    }

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private String createdDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    @Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private String lastModifiedDate;

    @LastModifiedBy
    private String lastModifiedBy;


    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}
