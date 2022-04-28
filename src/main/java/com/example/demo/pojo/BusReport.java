package com.example.demo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 用户报名表
 *
 * @author hanku
 * @since 2021-10-25
 */
@Data
@Accessors(chain = true)
public class BusReport {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer routeId;

    private Integer batchId;

    private String zzdId;

    private Integer zzdPosition;

    //private List<ReportUser> reportInfo;
    private ReportUser reportInfo;

    private Integer reportNum;

    private Integer deptId;

    private Integer auditStatus;

    private String auditPeople;

    private Boolean deleted;

    private String createdId;

    private String createdBy;

    private Date createdTime;

    private Date updatedTime;

}
