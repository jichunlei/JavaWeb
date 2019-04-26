package com.jicl.servlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie学习：客户端技术
 * 
 * @function CookieServlet
 * @author xianzilei
 * @date 2019/04/25
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String methodCode = request.getParameter("methodCode");
        switch (methodCode) {
            case "1":
                getAccessTime(request, response);
                break;
            case "2":
                deleteCookie(request, response);
                break;
            case "3":
                saveChineseToCookie(request, response);
                break;
            case "4":
                getChineseFromCookie(request, response);
                break;
            default:
                defaultMethod(request, response);
                break;
        }
    }

    /**
     * 获取cookie中的中文
     * @param request
     * @param response
     * @throws IOException 
     */
    private void getChineseFromCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
     // 获取cookies
        Cookie[] cookies = request.getCookies();
        // 设置响应内容和响应编码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        boolean flag = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    String username = cookie.getValue();
                    writer.println("用户名为：" + username);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                writer.println("未找到用户名！");
            }
        } else {
            writer.println("未找到用户名！");
        }
    }

    /**
     * cookie中存储中文
     * @param request
     * @param response
     * @throws IOException 
     */
    private void saveChineseToCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        Cookie cookie = new Cookie("username", "贤子磊");
        cookie.setMaxAge(60);
        response.addCookie(cookie);
        writer.println("存储中文成功！");
         
    }

    /**
     * 默认处理
     * @param request
     * @param response
     * @throws IOException 
     */
    private void defaultMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("未明确定义请求方法!");
    }

    /**
     * 删除cookie
     * @param request
     * @param response
     * @throws IOException 
     */
    private void deleteCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //删除cookie时，path必须一致，否则不会删除
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        Cookie cookie = new Cookie("lastAccessTime", "999");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        writer.println("cookie删除成功!");
    }

    /**
     * 获取网站访问时间
     * @param request
     * @param response
     * @throws IOException
     */
    private void getAccessTime(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取cookies
        Cookie[] cookies = request.getCookies();
        // 设置响应内容和响应编码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        boolean flag = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("lastAccessTime".equals(cookie.getName())) {
                    long time = Long.parseLong(cookie.getValue());
                    Date date = new Date(time);
                    writer.println("您上次访问本站的时间为：" + date.toString());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                writer.println("您是第一次访问本站！");
            }
        } else {
            writer.println("您是第一次访问本站！");
        }
        // 重置cookie
        Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis() + "");
        //设置cookie最大保存时间为60s
        cookie.setMaxAge(60);
        response.addCookie(cookie);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
    
    

}
