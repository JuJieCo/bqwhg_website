<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>西安市灞桥区文化馆</title>


<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/main.css"  type="text/css" />
<script src="${pageContext.request.contextPath}/resource/js/jquery-1.4a2.min.js"  type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resource/js/jquery.KinSlideshow-1.2.1.min.js" type="text/javascript"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/gundong.css"  type="text/css" />
<script src="${pageContext.request.contextPath}/resource/js/jQuery-jcMarquee.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resource/js/marquee.js" type="text/javascript"></script>



<script type="text/javascript">

	function selectPage(currentPage){
		var form = document.forms.form1;
		form.action = form.action+"?page.currentPage="+currentPage;
		//alert(form.action);
		form.submit();
	}
	
</script>
</head>
<body>

<form name="form1" method="post" action="${pageContext.request.contextPath}/indexAction!queryQwllMenu" id="form1">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="background: url(${pageContext.request.contextPath}/resource/images/index_bg1.png) no-repeat center  top;">
 	<tr>
 		<td>
        	<div id="wrap">
   
			<div class="header">
    			<%@include file="/page/website/common/header.jsp" %>
			</div>



 
                    

<!-- 主DIV开始 -->

<s:iterator value="qwllList" var="list">
	<c:if test="${list.qwllTitle ne null }">
	
<div class="main3_content">
	<div class="w936">
		<dl class="qwdt2">
			<dt>  <img src="${pageContext.request.contextPath}/resource/images/3.jpg"  alt="" width="196" height="111" /> </dt>
				<dd class="qwdt_bt2"> <a href="${pageContext.request.contextPath}/indexAction!findQwllForShow?qwllID=${list.qwllID}">${list.qwllTitle}</a><span class="date">${list.subDate}</span></dd>
                <dd class="qwdt_nr2"> ${fn:substring (list.qwllContent , 0, 39)}...   <a href="${pageContext.request.contextPath}/indexAction!findQwllForShow?qwllID=${list.qwllID}">[全文]</a> </dd>
         </dl>
	</div>
</div>    

 </c:if>
	</s:iterator>
                                
                 <p><%@include file="/page/website/common/page.jsp" %>       </p>
                        
                        
<!-- 友情链接 -->                
<%@include file="/page/website/common/link.jsp" %>
</div>
		</td>
	</tr>
</table>

<%@include file="/page/website/common/foot.jsp" %>

   
    
</form>
</body>
</html>
