package com.neo.param;

/**
 * @package: com.neo.param
 * @data: 2018/7/4
 * @author: 70918
 */
public class PageParam {
    private int beginLine;
    private Integer pageSize =1;
    private Integer currentPage = 0;

    public int getBeginLine(){
        return pageSize*currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
