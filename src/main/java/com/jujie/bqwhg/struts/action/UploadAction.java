package com.jujie.bqwhg.struts.action;

import java.io.File;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;

import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.FileUtil;

public class UploadAction extends BaseActionSupper{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private File upload;  //文件
	private String uploadContentType;  //文件类型
	private String uploadFileName;   //文件名
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public String fileUpload() throws Exception{
	 
		
 
		 

		response.setCharacterEncoding("GBK");
		 
         response.setContentType("text/html;charset=UTF-8");  
         
         

		PrintWriter out = response.getWriter();

		                                    

		if(!"image/jpeg".equals(uploadContentType)&&!"image/bmp".equals(uploadContentType)){

		            out.print("<font color=\"red\"size=\"2\">*文件格式不正确（必须为.jpg 或 .bmp文件）</font>");

		            return null;

		}
		                                    

			if(null!=upload){
				String uploadDirectory =super.servletContext.getRealPath("/upload/file");
				String fileName = FileUtil.resetFileName(uploadFileName); 
                File target = new File(uploadDirectory,fileName); 
                FileUtils.copyFile(upload, target);  
               
              	
              	
               
              	String callback = request.getParameter("CKEditorFuncNum");  
    			// 返回"图像"选项卡并显示图片  request.getContextPath()为web项目名   
    	        out.println("<script type=\"text/javascript\">");  
    	        out.println("window.parent.CKEDITOR.tools.callFunction(" + callback  
    	                + ",'" + request.getContextPath() + "/upload/file/" + fileName + "','')");  
    	        out.println("</script>");  
                }
			
 
			
		return null ;
		
	}
	

}
