package service;

import dao.RecordDao;
import entiy.Record;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-06 15:08
 **/
public class RecordService {
    public int add(Record record) {
        RecordDao recordDao = new RecordDao();
        int ret = recordDao.add(record);
        return ret;
    }
}
