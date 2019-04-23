package com.jicl.servlet.response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 文件下载:
 * 在编写下载文件功能时，要使用OutputStream流，避免使用PrintWriter流，
 * 因为OutputStream流是字节流，可以处理任意类型的数据，
 * 而PrintWriter流是字符流，只能处理字符数据，
 * 如果用字符流处理字节数据，会导致数据丢失
 * @function FileDownload
 * @author xianzilei
 * @date 2019/04/20
 */
@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDownload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //设置content-disposition响应头控制浏览器以下载的形式打开文件
	    response.setHeader("content-disposition", "attachment;filename='xianzilei.jpg'");
	    //InputStream inputStream=new FileInputStream("D:\\eclipse_workspace\\JavaWeb\\WebContent\\1.jpg");
	    InputStream inputStream = getServletContext().getResourceAsStream("/1.jpg");
	    //Serlvet的service方法结束后，
	    //Servlet引擎将检查getWriter或getOutputStream方法返回的输出流对象是否已经调用过close方法，
	    //如果没有，Servlet引擎将调用close方法关闭该输出流对象
	    //所有我们无需自己关闭从response获得的流
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
