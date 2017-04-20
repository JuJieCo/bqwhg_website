<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/main.css"  type="text/css" />
<script src="${pageContext.request.contextPath}/resource/js/jquery-1.4a2.min.js"  type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resource/js/jquery.KinSlideshow-1.2.1.min.js" type="text/javascript"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/gundong.css"  type="text/css" />
<script src="${pageContext.request.contextPath}/resource/js/jQuery-jcMarquee.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resource/js/marquee.js" type="text/javascript"></script>
	 
	 
	  <!-- 菜单js -->
 <script type="text/javascript">
 
    function MM_swapImgRestore() { //v3.0
        var i, x, a = document.MM_sr; for (i = 0; a && i < a.length && (x = a[i]) && x.oSrc; i++) x.src = x.oSrc;
    }
    function MM_preloadImages() { //v3.0
        var d = document; if (d.images) {
            if (!d.MM_p) d.MM_p = new Array();
            var i, j = d.MM_p.length, a = MM_preloadImages.arguments; for (i = 0; i < a.length; i++)
                if (a[i].indexOf("#") != 0) { d.MM_p[j] = new Image; d.MM_p[j++].src = a[i]; } 
        }
    }

    function MM_findObj(n, d) { //v4.01
        var p, i, x; if (!d) d = document; if ((p = n.indexOf("?")) > 0 && parent.frames.length) {
            d = parent.frames[n.substring(p + 1)].document; n = n.substring(0, p);
        }
        if (!(x = d[n]) && d.all) x = d.all[n]; for (i = 0; !x && i < d.forms.length; i++) x = d.forms[i][n];
        for (i = 0; !x && d.layers && i < d.layers.length; i++) x = MM_findObj(n, d.layers[i].document);
        if (!x && d.getElementById) x = d.getElementById(n); return x;
    }

    function MM_swapImage() { //v3.0
        var i, j = 0, x, a = MM_swapImage.arguments; document.MM_sr = new Array; for (i = 0; i < (a.length - 2); i += 3)
            if ((x = MM_findObj(a[i])) != null) { document.MM_sr[j++] = x; if (!x.oSrc) x.oSrc = x.src; x.src = a[i + 2]; }
    }
 
</script>
	 
	 
	  				<div class="top">
        				<p class="slogan">  您好，欢迎来到灞桥文化馆！</p>
        					 
    				</div>
    				
    				<h3><a class="logo"><img src="${pageContext.request.contextPath}/resource/images/logo.png"  alt="" width="431" height="106" /></a></h3>
    
    				<div class="top2">
        					<ul class="menu">
             					<li><a href="${pageContext.request.contextPath}/indexAction!showIndexPage"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image3','','${pageContext.request.contextPath}/resource/images/daohang2_01.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_01.gif" name="Image3" width="82" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryjbgkMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image4','','${pageContext.request.contextPath}/resource/images/daohang2_02.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_02.gif"  name="Image4" width="107" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryWhhdMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image5','','${pageContext.request.contextPath}/resource/images/daohang2_03.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_03.gif"  name="Image5" width="108" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryWxshMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image6','','${pageContext.request.contextPath}/resource/images/daohang2_04.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_04.gif"  name="Image6" width="109" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryFyzsMenu"   onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','${pageContext.request.contextPath}/resource/images/daohang2_05.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_05.gif"  name="Image7" width="107" height="68" border="0"></a>
            					</li>
           
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryQwltMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','${pageContext.request.contextPath}/resource/images/daohang2_06.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_06.gif"  name="Image8" width="109" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryYspxMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','${pageContext.request.contextPath}/resource/images/daohang2_07.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_07.gif"  name="Image9" width="109" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryGbkwMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','${pageContext.request.contextPath}/resource/images/daohang2_08.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_08.gif"  name="Image10" width="108" height="68" border="0"></a>
            					</li>
            
            					<li><a href="${pageContext.request.contextPath}/indexAction!queryQwzcMenu"  onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','${pageContext.request.contextPath}/resource/images/daohang2_09.gif')">
                					<img src="${pageContext.request.contextPath}/resource/images/daohang_09.gif"  name="Image11" width="121" height="68" border="0"></a>
            					</li>
        					</ul>
    				</div>

 