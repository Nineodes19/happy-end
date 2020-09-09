package test;

import dao.RecordDao;
import entiy.Record;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-08 13:56
 **/
public class RecordDaoTest {

    @Test
    public void add() {
        RecordDao recordDao = new RecordDao();
        Record record = new Record();
        record.setC_id(1);
        record.setB_id(17);
        record.setU_id(1);
        int ret = recordDao.add(record);
        if(ret != 0){
            System.out.println("添加成功");
        }else{
            throw new RuntimeException("添加失败！");
        }
    }
}