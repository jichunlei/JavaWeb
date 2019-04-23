package com.jicl.servlet.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用GZIPOutputStream来压缩数据，并且通过Content-Encoding来告诉浏览器压缩格式
 * 浏览器支持的压缩类型为：gzip、deflate
 * @function GziServlet
 * @author xianzilei
 * @date 2019/04/16
 */
@WebServlet("/GziServlet")
public class GziServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data="aaaaaaaaqwecwewfeweceweqwecqwe"
		    + "ccccfqofuojniqwfin"
		    + "EWORIQMIEVWIUNnoivoeiwmrvi"
		    + "oernruehhhhhhhhhhhhhhhhhhhhhhhhhh"
		    + "hhhhhhhhhhhiooooooooommmmmmmmmmmmmmmmmmc"
		    + "cccccccccccccccccccckasdfffkfuwefniwnfiw"
		    + "jfnhdbhfsbfjk21123";
		System.out.println("原始数据大小:"+data.getBytes().length);
		ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
		GZIPOutputStream gzipOutputStream=new GZIPOutputStream(byteArrayOutputStream);
		gzipOutputStream.write(data.getBytes());
		gzipOutputStream.close();
		
		byte[] bs = byteArrayOutputStream.toByteArray();
		response.setHeader("Content-Ecoding", "gzip");
		response.setHeader("Content-Length", ""+bs.length);
		response.getOutputStream().write(bs);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
