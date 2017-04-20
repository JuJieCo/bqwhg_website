<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<HTML>
<HEAD>
<title>管理中心V1.0</title>
<meta http-equiv=Content-Type content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath }/resource/admin/css/admin.css" >
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/admin/js/js.js" ></script>



<script type="text/javascript">	
  	function validateForm(){
  		var wxshTitle = document.getElementById('wxshTitle').value;
  		var loginName =  document.getElementById('loginName').value;
 

  
  		if(wxshTitle==""){
  			alert('标题是必填项');
  			return false;
  		}
  		if(loginName==""){
  			alert('发布人是必填项');
  			return false;
  		}
  
  		
  	}
</script> 





 </HEAD>
<BODY>
	<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
		<TR height=28>
			<TD background="${pageContext.request.contextPath}/resource/admin/images/title_bg1.jpg">&nbsp;西安市灞桥区文化馆网站后台管理系统--文学书画</TD>
		</TR>
		<TR>
			<TD bgColor=#b1ceef height=1></TD>
		</TR>
		<TR height=20>
			<TD background="${pageContext.request.contextPath}/resource/admin/images/shadow_bg.jpg"></TD>
		</TR>
	</TABLE>
	
		
	
<form action="${pageContext.request.contextPath}/wxshAction!modifyWxsh" id="form1" name="form1" method="post"  enctype="multipart/form-data" onsubmit="return validateForm();" >
<s:token name="s_token"></s:token>
<table width="100%"  border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td height="30" background="${pageContext.request.contextPath}/resource/admin/images/tab_05.gif">
    	<%@include file="/page/admin/frame/table_top.jsp" %>
    </td>
  </tr>
  <tr>
    <td>
    
    <input name="wxsh.wxshID" type="hidden" value="${wxsh.wxshID }">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
        <td width="8" background="${pageContext.request.contextPath}/resource/admin/images/tab_15.gif">&nbsp;</td>
        <td>
		<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
          <tr>
            <td height="22" align="right" bgcolor="#FFFFFF" class="STYLE3" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" width="15%">标题：</td>
			<td height="22" align="left" bgcolor="#FFFFFF" class="STYLE3" width="85%"  colspan="3"> &nbsp;&nbsp;<input type="text" name="wxsh.wxshTitle" value="${wxsh.wxshTitle }" size="50" id="wxshTitle"></td>
			
          </tr>
          <tr>
            <td height="22" align="right" bgcolor="#FFFFFF" class="STYLE3" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" width="15%">发布时间：</td>
            <td height="22" align="left" bgcolor="#FFFFFF" class="STYLE3" width="85%"  colspan="3">&nbsp;&nbsp;<input type="text" name="wxsh.subDate"  value="<fmt:formatDate value="${wxsh.subDate }" pattern="yyyy-M-d"/>" readonly="readonly" ></td>
           	
          </tr>
          <tr>
            <td height="22" align="right" bgcolor="#FFFFFF" class="STYLE3" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" width="15%">发布人：</td>
            <td height="22" align="left" bgcolor="#FFFFFF" class="STYLE3" width="85%"  colspan="3">&nbsp;&nbsp;<input type="text" name="wxsh.sysUser.loginName" value="${wxsh.sysUser.loginName}"   readonly="readonly"  id="loginName">
            																																						   <input type="hidden" name="wxsh.sysUser.userID" value="${wxsh.sysUser.userID }"></td>     	
          </tr>
          <tr>
            <td height="22" align="right" bgcolor="#FFFFFF" class="STYLE3" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" width="15%">发布类型：</td>
            <td height="22" align="left" bgcolor="#FFFFFF" class="STYLE3" width="85%"  colspan="3">&nbsp; <select name="wxsh.wxshType" id="wxshType">
            																																									<option value="0"  ${wxsh.wxshType eq 0 ? "selected":"" }>- 文学 -</option>
            																																									<option value="1"  ${wxsh.wxshType eq 1 ? "selected":"" }>- 书法 -</option>
            																																									<option value="2"  ${wxsh.wxshType eq 2 ? "selected":"" }>- 美术 -</option>
            																																									<option value="3"  ${wxsh.wxshType eq 3 ? "selected":"" }>- 摄影 -</option>
            																																									<option value="4"  ${wxsh.wxshType eq 4 ? "selected":"" }>- 戏曲 -</option>
            																																									<option value="5"  ${wxsh.wxshType eq 5 ? "selected":"" }>- 舞蹈 -</option>
            																																							</select>
	
          </tr>
          <tr>
            <td height="22" align="right" bgcolor="#FFFFFF" class="STYLE3" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" width="15%">内容：</td>
            <td height="22" align="left" bgcolor="#FFFFFF" class="STYLE3" width="85%"  colspan="3">&nbsp;&nbsp;
            	    <textarea id="id_1" name="wxsh.wxshContent">${wxsh.wxshContent }</textarea> 
					<ckeditor:replace replace="id_1" basePath="${pageContext.request.contextPath}/resource/ckeditor/" />
            </td>     	
          </tr>
          
          
        </table>
		</td>
        <td  width="8" background="${pageContext.request.contextPath}/resource/admin/images/tab_15.gif">&nbsp;</td>
      </tr>
    </table> 
    </td>
 </tr>
  <tr>
    <td>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="35"><img src="${pageContext.request.contextPath}/resource/admin/images/tab_18.gif" width="12" height="35" /></td>
        <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="STYLE4"></td>
            <td height="35" background="${pageContext.request.contextPath}/resource/admin/images/tab_19.gif">
              <table border="0" align="center" cellpadding="0" cellspacing="0" id="form_oper">
                <tr>
                <td>					
                	 &nbsp;
				</td>
                </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="16"><img src="${pageContext.request.contextPath}/resource/admin/images/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table>
    
    
    </td>
  </tr>
</table>
</form>
</BODY>
</HTML>