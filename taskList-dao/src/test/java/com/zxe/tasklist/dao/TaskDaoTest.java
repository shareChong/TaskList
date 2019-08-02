package com.zxe.tasklist.dao;

import com.zxe.tasklist.entities.Task;
import org.junit.Assert;

import java.util.List;
public class TaskDaoTest {
    TaskDao dao;

    @org.junit.Before
    public void setUp() throws Exception {
        dao=new TaskDao();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getAllTasks() throws Exception{
        List<Task> tasks=dao.getAllTasks();
        Assert.assertEquals(5,tasks.size());
    }
}
