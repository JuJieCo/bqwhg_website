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


<!-- 非遗展示JS -->
<script type="text/javascript">
$(function(){
    $('#Marquee_x').jcMarquee({ 'marquee':'x','margin_right':'10px','speed':20 });
	// DIVCSS5提示：10px代表间距，第二个20代表滚动速度
});
</script>

<!-- 佳作展示 JS -->
<script type="text/javascript">
        function show(n) {
            var o = document.getElementById('title').getElementsByTagName("a");
            var c = document.getElementById('content').getElementsByTagName("div");
            for (i = 0; l = o.length, i < l; o[i].className = '', c[i].style.display = 'none', i++);
            o[n].className = 'over';
            c[n].style.display = 'block';
        }
        function show2(n) {
            var o = document.getElementById('title2').getElementsByTagName("a");
            var c = document.getElementById('content2').getElementsByTagName("div");
            for (i = 0; l = o.length, i < l; o[i].className = '', c[i].style.display = 'none', i++);
            o[n].className = 'over';
            c[n].style.display = 'block';
        }

        function show3(n) {
            var o = document.getElementById('title3').getElementsByTagName("a");
            var c = document.getElementById('content3').getElementsByTagName("div");
            for (i = 0; l = o.length, i < l; o[i].className = '', c[i].style.display = 'none', i++);
            o[n].className = 'over';
            c[n].style.display = 'block';
        }

        function show4(n) {
            var o = document.getElementById('title4').getElementsByTagName("a");
            var c = document.getElementById('content4').getElementsByTagName("div");
            for (i = 0; l = o.length, i < l; o[i].className = '', c[i].style.display = 'none', i++);
            o[n].className = 'over';
            c[n].style.display = 'block';
        }

        function show5(n) {
            var o = document.getElementById('title5').getElementsByTagName("a");
            var c = document.getElementById('content5').getElementsByTagName("div");
            for (i = 0; l = o.length, i < l; o[i].className = '', c[i].style.display = 'none', i++);
            o[n].className = 'over';
            c[n].style.display = 'block';
        }
        function show6(n) {
            var o = document.getElementById('title6').getElementsByTagName("a");
            var c = document.getElementById('content6').getElementsByTagName("div");
            for (i = 0; l = o.length, i < l; o[i].className = '', c[i].style.display = 'none', i++);
            o[n].className = 'over';
            c[n].style.display = 'block';
        } 
    </script>
</head>
<body>

<form name="form1" method="post" action="" id="form1">
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="background: url(${pageContext.request.contextPath}/resource/images/index_bg.png) no-repeat center  top;">
 	<tr>
 		<td>
        	<div id="wrap">
   
			<div class="header">
    			<%@include file="/page/website/common/header.jsp" %>
			</div>



<!-- 上大图flash -->    
<div class="banner">
	<div class="b245">
		<script type="text/javascript">
			$(function(){
			$("#KinSlideshow2").KinSlideshow({
				moveStyle:"right",
				titleFont:{TitleFont_size:12,TitleFont_color:"#FFFFFF",TitleFont_weight:"normal"},
				btn:{btn_bgColor:"#FFFFFF",btn_bgHoverColor:"#990000",btn_fontColor:"#000000",btn_fontHoverColor:"#FFFFFF",btn_borderColor:"#cccccc",btn_borderHoverColor:"#1188c0",btn_borderWidth:1}
				});
			})
		</script>
		<div id="KinSlideshow2" style="visibility:hidden;">
			<a href="#" ><img src="${pageContext.request.contextPath}/upload/file/topbig1.jpg"  width="997" height="506" /></a>
        	<a href="#"  ><img src="${pageContext.request.contextPath}/upload/file/topbig2.jpg"  width="997" height="506" /></a>
        	<a href="#"  ><img src="${pageContext.request.contextPath}/upload/file/topbig3.jpg"  width="997" height="506" /></a>
        	<a href="#"  ><img src="${pageContext.request.contextPath}/upload/file/topbig4.jpg"  width="997" height="506" /></a>
     	</div>
     </div>
</div>

                    

<!-- 主DIV开始 -->
<div class="main">



<div class="main_content1">
<!-- 文化活动flash -->
<div class="main_content1_hdp">
<div align="center">
<script type="text/javascript">
	var focus_width = 288
	var focus_height = 236
	var text_height = 42
	var swf_height = focus_height + text_height
	var pics = '${pageContext.request.contextPath}/upload/file/208508173499.jpg|${pageContext.request.contextPath}/upload/file/208508171468.jpg|${pageContext.request.contextPath}/upload/file/208508172657.jpg|${pageContext.request.contextPath}/upload/file/208508179099.jpg|${pageContext.request.contextPath}/upload/file/208508178437.jpg';
	var links = '${pageContext.request.contextPath}/indexAction!findWhhdForShow?whhdID=5 | ${pageContext.request.contextPath}/indexAction!findWhhdForShow?whhdID=4 | ${pageContext.request.contextPath}/indexAction!findWhhdForShow?whhdID=3 | ${pageContext.request.contextPath}/indexAction!findWhhdForShow?whhdID=2 | ${pageContext.request.contextPath}/indexAction!findWhhdForShow?whhdID=1';
	var texts = '《砚湾叙事》座谈会|首届白鹿文学奖|《文化灞桥。我的梦》演讲比赛|灞桥湿地民俗文化展|灞桥非物质文化遗产进社区活动 ';
	document.write('<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="[url]http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6[/url],0,0,0" width=288 height=235>');
	document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="resource/images/pixviewer.swf"/*tpa=resource/images/pixviewer.swf*/><param name="quality" value="high"><param name="bgcolor" value="#F0EFEF">');
	document.write('<param name="menu" value="false"/><param name="wmode" value="transparent"/>');
	document.write('<param name="FlashVars" value="pics=' + pics + '&links=' + links + '&texts=' + texts + '&borderwidth=' + focus_width + '&borderheight=' + focus_height + '&textheight=' + text_height + '">');
	document.write('<embed src="resource/images/pixviewer.swf"/*tpa=resource/images/pixviewer.swf*/ wmode="transparent" FlashVars="pics=' + pics + '&links=' + links + '&texts=' + texts + '&borderwidth=' + focus_width + '&borderheight=' + focus_height + '&textheight=' + text_height + '" menu="false" bgcolor="#F0EFEF" quality="high" width="' + focus_width + '" height="' + focus_height + '" allowScriptAccess="sameDomain" type="application/x-shockwave-flash"  pluginspage="[url]http://www.macromedia.com/go/getflashplayer[/url]" />');
	document.write('</object>');
</script>
</div>
</div>
    
    
    
  <!-- 文化活动 -->
 <div class="main_content1_middle">
 	<h3 class="zxhd_bt"><a href=""  ><img src="${pageContext.request.contextPath}/resource/images/list09.png" alt="" width="343" height="42" /></a></h3>
       	<ul class="news">
       	<s:iterator value="whhdList" var="list">
       	<c:if test="${list.whhdTitle ne null }">
 			<li><a href="${pageContext.request.contextPath}/indexAction!findWhhdForShow?whhdID=${list.whhdID}">${list.whhdTitle}</a></li>
		</c:if>
          </s:iterator>
         </ul>
 </div>
 
 
 
 <!-- 馆办刊物 -->
 <div class="main_content1_right">
	<h3 class="tzgg_bt"><a href=" " ><img src="${pageContext.request.contextPath}/resource/images/list10.png"  alt="" width="273" height="42" /></a></h3>
		<ul class="news2">
			<s:iterator value="gbkwList" var="list">
			<c:if test="${list.gbkwTitle ne null }">
            <li><a href="${pageContext.request.contextPath}/indexAction!findGbkwForShow?gbkwID=${list.gbkwID}">${list.gbkwTitle}</a></li>
            </c:if>
            </s:iterator>
         </ul>
</div>
</div>
                        
  
                        
                        
                        
    
    
    
<!-- 佳作展示 -->                    
 <div class="main_content2">
<div id="title">
	<ul>
		<li><a href=" "  onmouseover="show(0)" class="over">书法</a></li>
		<li><a href=" "   onmouseover="show(1)">美术</a></li>
		<li><a href=" "   onmouseover="show(2)">摄影</a></li>
		<li><a href=" "   onmouseover="show(3)">戏曲</a></li>
		<li><a href=" "   onmouseover="show(4)">舞蹈</a></li>
	</ul>
</div>
<p>   &nbsp;<br> &nbsp; <br>&nbsp; <br> </p>
 <div id="content">
    <div style="display: block" class="main2">
 		<ul class="blocks">
			<ul class="cpzs">
			<s:iterator value="wxshList1" var="list">
			<c:if test="${list.wxshTitle ne null && list.wxshType eq 1 }">
				<li><a href="${pageContext.request.contextPath}/indexAction!findWxshForShow?wxshID=${list.wxshID}"> <img src=" ${pageContext.request.contextPath}/${list.hold}"   alt="" width="198" height="205" /></a></li>
          	</c:if>
          	</s:iterator>
           </ul>
         </ul>
	</div>
	
 	<div class="main2">
    	<ul class="blocks">
         	<ul class="cpzs">
         	<s:iterator value="wxshList2" var="list">
			<c:if test="${list.wxshTitle ne null && list.wxshType eq 2 }">
             	<li><a href="${pageContext.request.contextPath}/indexAction!findWxshForShow?wxshID=${list.wxshID}"> <img src=" ${pageContext.request.contextPath}/${list.hold}"   alt="" width="198" height="205" /></a></li>
            </c:if>
            </s:iterator> 
            </ul>
          </ul>
	</div>
 	
	<div class="main2">
    	<ul class="blocks">
        	<ul class="cpzs">
 			<s:iterator value="wxshList3" var="list">
			<c:if test="${list.wxshTitle ne null && list.wxshType eq 3 }">
             	<li><a href="${pageContext.request.contextPath}/indexAction!findWxshForShow?wxshID=${list.wxshID}"> <img src=" ${pageContext.request.contextPath}/${list.hold}"   alt="" width="198" height="205" /></a></li>
            </c:if>
            </s:iterator> 
			</ul>
		</ul>
	</div>
	
	<div class="main2">
		<ul class="blocks">
			<ul class="cpzs">
			<s:iterator value="wxshList4" var="list">
			<c:if test="${list.wxshTitle ne null && list.wxshType eq 4 }">
             	<li><a href="${pageContext.request.contextPath}/indexAction!findWxshForShow?wxshID=${list.wxshID}"> <img src=" ${pageContext.request.contextPath}/${list.hold}"   alt="" width="198" height="205" /></a></li>
            </c:if>
            </s:iterator> 
			</ul>
		</ul>
	</div>
	
 	<div class="main2">
		<ul class="blocks">
			<ul class="cpzs">
			<s:iterator value="wxshList5" var="list">
			<c:if test="${list.wxshTitle ne null && list.wxshType eq 5 }">
             	<li><a href="${pageContext.request.contextPath}/indexAction!findWxshForShow?wxshID=${list.wxshID}"> <img src=" ${pageContext.request.contextPath}/${list.hold}"   alt="" width="198" height="205" /></a></li>
            </c:if>
            </s:iterator> 
			</ul>
		</ul>
	</div>
 </div>
</div>                        
                            
                            
                            
                            
                            
 
 


 
 
 <!--艺术培训,群文理论,群文政策  -->
 <div class="main_content3">
	<div class="main_content3_left">
		<h3 class="qwdt_bt"><img src="${pageContext.request.contextPath}/resource/images/list20.png"   width="113" height="34" /></h3>
		<ul class="new_s3">
            <s:iterator value="yspxList" var="list">
			<c:if test="${list.yspxTitle ne null }">
            	<li><a href="${pageContext.request.contextPath}/indexAction!findYspxForShow?yspxID=${list.yspxID}">${list.yspxTitle}</a> </li>
            </c:if>
			</s:iterator>
		</ul>
	</div>
	
	<div class="main_content3_middle">
		<h3 class="qwdt_bt">  <img src="${pageContext.request.contextPath}/resource/images/list21.png"   width="113" height="34" /></h3>
		<ul class="new_s3">
			<s:iterator value="qwllList" var="list">
	  		<c:if test="${list.qwllTitle ne null }">
			<li><a href="${pageContext.request.contextPath}/indexAction!findQwllForShow?qwllID=${list.qwllID}">${list.qwllTitle}</a></li>
			</c:if>
			</s:iterator>
		</ul>
	</div>
	
	<div class="main_content3_right">
 		<h3 class="fybh_bt">  <img src="${pageContext.request.contextPath}/resource/images/list22.png"  alt="" width="113" height="34" /></h3>
			<ul class="new_s3">
			<s:iterator value="qwzcList" var="list">
			<c:if test="${list.qwzcTitle ne null }">
				<li><a href="${pageContext.request.contextPath}/indexAction!findQwzcForShow?qwzcID=${list.qwzcID}">${list.qwzcTitle}</a> </li>
			</c:if>
			</s:iterator>	 
			</ul>
		</div>
</div>
                        








<!-- 非遗展示 -->
  <div class="main_content5">
	<div >   <img src="${pageContext.request.contextPath}/resource/images/list19.png"   width="113" height="34" />   </div>
	<div id="mrq">
    <div id="Marquee_x">
        <ul>
            <li>
          <s:iterator value="fyzsList" var="list">
			<c:if test="${list.fyzsTitle ne null }">
                <div><a href="${pageContext.request.contextPath}/indexAction!findFyzsForShow?fyzsID=${list.fyzsID}"  ><img src="${pageContext.request.contextPath}/${list.hold}"   onerror="this.src='resource/images/list12.png'" /><span>非遗展示</span></a></div>
            </c:if>
            </s:iterator>
            </li>
        </ul>
    	</div>
		</div>
	</div>
	
 <!-- 主DIV结束 -->
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
