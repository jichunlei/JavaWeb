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
 * 设置content-type响应头来指定返回的数据类型
 * 浏览器能够接收的数据类型为
 *  application/x-ms-application, 
 *  image/jpeg, 
 *  application/xaml+xml, 
 *  image/gif, 
 *  image/pjpeg, 
 *  application/x-ms-xbap, 
 *  application/vnd.ms-excel, 
 *  application/vnd.ms-powerpoint, 
 *  application/msword
 * @function ContentTypeServlet
 * @author xianzilei
 * @date 2019/04/16
 */
@WebServlet("/ContentTypeServlet")
public class ContentTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置浏览器接收的数据类型为image/jpeg
	    response.setHeader("Content-Type", "image/jpeg");
	    //读取图片并输出在浏览器上
	    InputStream is = this.getServletContext().getResourceAsStream("/1.jpg");
	    OutputStream os = response.getOutputStream();
	    byte[] bs=new byte[100];
	    int len=0;
	    while((len=is.read(bs))>0) {
	        os.write(bs, 0, len);
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
