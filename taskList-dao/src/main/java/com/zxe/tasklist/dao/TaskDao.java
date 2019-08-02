package com.zxe.tasklist.dao;

import com.zxe.tasklist.entities.Task;
import com.zxe.tasklist.utils.JDBCUtils;

import java.util.List;

/**
 * 获得所有任务清单
 */
public class TaskDao {
    public List<Task> getAllTasks(){
        return JDBCUtils.queryForList("select id ,title,status from task",Task.class);

    }
}
