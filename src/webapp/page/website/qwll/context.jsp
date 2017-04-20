<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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

</head>
<body>

<form name="form1" method="post" action="" id="form1">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="background: url(${pageContext.request.contextPath}/resource/images/index_bg1.png) no-repeat center  top;">
 	<tr>
 		<td>
        	<div id="wrap">
   
			<div class="header">
    			<%@include file="/page/website/common/header.jsp" %>
			</div>



 
                    

<!-- 主DIV开始 -->
 
 <div class="main3_content" align="center">
	<h1 class="nybt">${qwll.qwllTitle }</h1>
	<h3 class="fbrq"> 灞桥文化馆 &nbsp;&nbsp; 发布时间：${qwll.subDate } </h3>

<table>
	<tr>
		<td>
		<p>
		<span style="font-family: 楷体; font-size: 17px; color: rgb(51, 51, 51);">

  	${qwll.qwllContent }

		</span>
		</p>
		</td>
	</tr>

</table>


 </div>                  
                                
                        
                        
                        
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
