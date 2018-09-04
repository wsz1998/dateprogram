package com.bean;

import java.util.List;

public class PageBean {
    private int pageCurrent;  //当前页
    private int pageSize;     //一页多少行
    private int pageCount;       //总页数
    private int recorCount;      //总的记录行
    private int start;           //从哪条开始查
    private List recordList;     //本页列表数据
    public PageBean(int  pageCurrent,int pageSize,int recordCount){
         this.pageCurrent = pageCurrent;
         this.pageSize = pageSize;
         this.pageCount = recordCount;

         //计算总页码
         if((recordCount%pageSize)==0){
             this.pageCount = recordCount / pageSize;
         }else
             {
             this.pageCount = recordCount / pageSize +1;
         }
         //计算从哪条开始查
        start = (pageCurrent-1)*10+1;
    }

    public int getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getRecorCount() {
        return recorCount;
    }

    public void setRecorCount(int recorCount) {
        this.recorCount = recorCount;
    }


    public List<Leave> getRecordList() {
        return recordList;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setRecordList(List<Leave> recordList) {
        this.recordList = recordList;
    }
}
