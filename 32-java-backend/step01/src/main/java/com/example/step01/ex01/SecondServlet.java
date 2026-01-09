package com.example.step01.ex01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
    public SecondServlet() {
        super();
        System.out.println("CALL: SecondServlet/SecondServlet()");
    }

    // init 메서드 servlet 메서드가 호출될때 한번만 실행
    @Override
    public void init(ServletConfig config) throws ServletException {
    super.init(config);
    System.out.println("CALL: SecondServlet init()");
    }

    @Override
    public void destroy(){
        System.out.println("CALL: SecondServlet destroy()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("CALL: SecondServlet doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        System.out.println("CALL: SecondServlet doPost()");
    }
}


