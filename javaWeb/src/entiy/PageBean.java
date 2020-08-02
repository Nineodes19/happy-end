package entiy;

import java.util.List;

/**
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 07:47
 **/

//采用分页的一个好处：当数据库中的数据非常庞大时，
 /*
 比如有十万条数据时，如果没有采用分页，那当打开
 这个页面时，就会从数据库中请求十万条数据，（页面卡）
 如果采用分页，那么当点击这一页的时候，才会从数据库当
 中拉去这一页的数据
  */
public class PageBean <T>{
    private int totalCount;//总记录数
    private int totalPage;//总页码
    private List<T> list;//每页中的数据
    private int currentPage;//当前页码
    private int rows;//每页的记录数

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
