<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<title>管理中心V1.0</title>
<meta http-equiv=Content-Type content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resource/admin/css/admin.css" type="text/css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/resource/admin/js/js.js" type="text/javascript"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-1.7.2.js"></script>



<script type="text/javascript">

	function selectPage(currentPage){
		var form = document.forms.form1;
		form.action = form.action+"?page.currentPage="+currentPage;
		//alert(form.action);
		form.submit();
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
	
		
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="30" background="${pageContext.request.contextPath}/resource/admin/images/tab_05.gif">
    		<%@include file="/page/admin/frame/table_top.jsp" %>
    	</td>
	</tr>
	<tr>
    	<td>
 <table width="100%" border="0" cellspacing="0" cellpadding="0">
 	<tr height="30">
 		<td width="8"  background="${pageContext.request.contextPath}/resource/admin/images/tab_15.gif">&nbsp;</td>
	  	<td >
			<form action="${pageContext.request.contextPath}/wxshAction!queryWxshList" name="form1"  method="post" >
 			<s:token name="s_token"></s:token>
	<table width="100%"  bgcolor="#EFF6FE">
	<tr>
		<td class="STYLE4" ></td>
		<td class="STYLE4" >
			标题：<input type="text" name="wxsh.wxshTitle" value="${wxsh.wxshTitle }">
			<input name="wxsh.wxshID" type="hidden" value="${wxsh.wxshID }">
			<input type="submit" value="查询" name="button">
		</td>
		<td class="STYLE4" ></td>
		<td  class="STYLE4">
			<input type="button" value="新增" name="button" onclick="location.href='${pageContext.request.contextPath}/wxshAction!findWxshForModify?modify=save'">
		</td>
	</tr> 
</table>
	 	</form>
		</td>
		<td width="8" background="${pageContext.request.contextPath}/resource/admin/images/tab_15.gif">&nbsp;</td>
	</tr>
	<tr>
		<td width="8" background="${pageContext.request.contextPath}/resource/admin/images/tab_15.gif">&nbsp;</td>
        <td>
        
<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
	<tr>
		<td  height="22" align="left" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" bgcolor="#FFFFFF" width="70%"><span class="STYLE1">&nbsp;&nbsp;标题</span></td>
		<td  height="22" align="right" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" bgcolor="#FFFFFF" width="20%"><span class="STYLE1">发布时间&nbsp;&nbsp;</span></td>
		<td  height="22" align="center" background="${pageContext.request.contextPath}/resource/admin/images/bg.gif" bgcolor="#FFFFFF" width="10%"><span class="STYLE1">操作</span></td>                     
	</tr>
	<!-- 迭代   	-->
	<s:iterator value="wxshList" var="list">
	<c:if test="${list.wxshTitle ne null }">
	<tr>
		<td height="20" bgcolor="#FFFFFF"  align="left" ><span class="STYLE1" >&nbsp;&nbsp;${list.wxshTitle}</span></td>
		<td height="20" bgcolor="#FFFFFF"  align="right" ><span class="STYLE1">${list.subDate}&nbsp;&nbsp;</span></td>
		<td height="20" bgcolor="#FFFFFF"  align="center">
 			<span class="STYLE1"> 
			<a href="${pageContext.request.contextPath}/wxshAction!findWxshForModify?modify=update&wxshID=${list.wxshID}">修改</a>
			<a href="${pageContext.request.contextPath}/wxshAction!deleteWxshByID?wxshID=${list.wxshID}" onclick="return(confirm('确认要删除吗?'))" >删除</a></span>
		</td>
	</tr> 
	</c:if>
	</s:iterator>
	<!--迭代 end -->
</table>
		</td>
        <td  width="8" background="${pageContext.request.contextPath}/resource/admin/images/tab_15.gif">&nbsp;</td>
	</tr>
</table>
		</td>
	</tr>
 	<tr>
    	<td height="35" background="${pageContext.request.contextPath}/resource/admin/images/tab_19.gif">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td width="12" height="35">
        	<img src="${pageContext.request.contextPath}/resource/admin/images/tab_18.gif" width="12" height="35" />
        </td>
        <td>
        	 <%@include file="/page/admin/frame/page.jsp" %>
        </td>
        <td width="16">
        	<img src="${pageContext.request.contextPath}/resource/admin/images/tab_20.gif" width="16" height="35" />
        </td>
 	</tr>
</table>
		</td>
	</tr>
</table>

</BODY>
</HTML>