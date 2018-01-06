package sw.wyj.servlet;

import sw.wyj.calculator.Calculator;

import java.io.IOException;

public class CalServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Calculator cal=new Calculator();
        float num1=Float.parseFloat(request.getParameter("num1"));
        float num2=Float.parseFloat(request.getParameter("num2"));
        cal.setNum1(num1);
        cal.setNum2(num2);
        cal.setOp(request.getParameter("op"));
        switch(cal.getOp().charAt(0)){
            case '+':cal.setResult(cal.getNum1()+cal.getNum2());break;
            case '-':cal.setResult(cal.getNum1()-cal.getNum2());break;
            case '*':cal.setResult(cal.getNum1()*cal.getNum2());break;
            case '/':cal.setResult(cal.getNum1()/cal.getNum2());
        }
        request.setAttribute("cal",cal);
        //请求转发
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    }
