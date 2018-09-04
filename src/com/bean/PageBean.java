package com.bean;

import java.util.List;

public class PageBean {
    private int pageCurrent;  //��ǰҳ
    private int pageSize;     //һҳ������
    private int pageCount;       //��ҳ��
    private int recorCount;      //�ܵļ�¼��
    private int start;           //��������ʼ��
    private List recordList;     //��ҳ�б�����
    public PageBean(int  pageCurrent,int pageSize,int recordCount){
         this.pageCurrent = pageCurrent;
         this.pageSize = pageSize;
         this.pageCount = recordCount;

         //������ҳ��
         if((recordCount%pageSize)==0){
             this.pageCount = recordCount / pageSize;
         }else
             {
             this.pageCount = recordCount / pageSize +1;
         }
         //�����������ʼ��
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
