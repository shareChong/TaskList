package com.zxe.tasklist.services;

import com.zxe.tasklist.entities.Task;

import java.util.List;

public interface ITaskService {
    List<Task> queryAllTask();
}
