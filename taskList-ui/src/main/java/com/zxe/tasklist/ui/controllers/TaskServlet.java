package com.zxe.tasklist.ui.controllers;

import com.zxe.tasklist.services.ITaskService;
import com.zxe.tasklist.services.TaskService;
import com.zxe.tasklist.utils.R;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {
    ITaskService service=new TaskService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String json = R.ok(service.queryAllTask()).Json();
        response.getWriter().write(json);

    }
}
