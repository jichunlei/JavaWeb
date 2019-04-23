package com.jicl.servlet.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * content-disposition：控制用户请求所得的内容存为一个文件的时候提供一个默认的文件名，
 * 文件直接在浏览器上显示或者在访问时弹出文件下载对话框。 
 * @function DispositionServlet
 * @author xianzilei
 * @date 2019/04/16
 */
@WebServlet("/DispositionServlet")
public class DispositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispositionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //设置content-disposition响应头
	    response.setHeader("content-disposition", "attachment;filename=xianzilei.jpg");
	    //
	    InputStream inputStream = this.getServletContext().getResourceAsStream("/1.jpg");
	    OutputStream outputStream = response.getOutputStream();
	    int len=0;
	    byte[] bs=new byte[100];
	    while((len=inputStream.read(bs))>0) {
	        outputStream.write(bs, 0, len);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
