package com.zxe.tasklist.services;

import com.zxe.tasklist.dao.TaskDao;
import com.zxe.tasklist.entities.Task;

import java.util.List;

public class TaskService implements ITaskService {
    TaskDao taskDao=new TaskDao();
    public List<Task> queryAllTask(){
        return taskDao.getAllTasks();
    }
}
