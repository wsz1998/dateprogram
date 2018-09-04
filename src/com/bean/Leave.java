package com.bean;

public class Leave {
    private int id;        //请假数
    private int user_id;   //请假人编号
    private String date;   //请假时间
    private String start;  //请假起始日期
    private String end;    //请假结束日期
    private String site;   //出差地点（请假不用写）
    private String reason; //原因
    private String rejection;//拒绝原因
    private int type;      //事假、病假、出差
    private int isExigency;//是否紧急
    private int status;    //是否已处理
    private int auditor_id;//处理人id
    public Leave(){
        this.status = 0;
        this.isExigency = 0;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRejection() {
        return rejection;
    }

    public void setRejection(String rejection) {
        this.rejection = rejection;
    }

    public int getAuditor_id() {
        return auditor_id;
    }

    public void setAuditor_id(int auditor_id) {
        this.auditor_id = auditor_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIsExigency() {
        return isExigency;
    }

    public void setIsExigency(int isExigency) {
        this.isExigency = isExigency;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
