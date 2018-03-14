package com.artivr.entity.log;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_sys_logs", schema = "realiart", catalog = "")
public class TbSysLogsEntity {
    private long id;
    private String clazz;
    private String fuction;
    private String level;
    private String logger;
    private String message;
    private Timestamp createDate;
    private String remarks;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "clazz", nullable = true, length = 60)
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "fuction", nullable = true, length = 60)
    public String getFuction() {
        return fuction;
    }

    public void setFuction(String fuction) {
        this.fuction = fuction;
    }

    @Basic
    @Column(name = "level", nullable = true, length = 30)
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "logger", nullable = true, length = 60)
    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    @Basic
    @Column(name = "message", nullable = true)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "remarks", nullable = true, length = 100)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSysLogsEntity that = (TbSysLogsEntity) o;

        if (id != that.id) return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;
        if (fuction != null ? !fuction.equals(that.fuction) : that.fuction != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (logger != null ? !logger.equals(that.logger) : that.logger != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (fuction != null ? fuction.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (logger != null ? logger.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
