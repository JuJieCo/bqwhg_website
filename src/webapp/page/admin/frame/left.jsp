<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<HTML>
<HEAD>
<title>管理中心V1.0</title>
<meta http-equiv=Content-Type content="text/html; charset=UTF-8">
<link
	href="${pageContext.request.contextPath}/resource/admin/css/admin.css"
	type="text/css" rel="stylesheet">

<SCRIPT language=javascript>
	function expand(el) {
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none') {
			childObj.style.display = 'block';
		} else {
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
</HEAD>


<BODY>
	<TABLE height="100%" cellSpacing=0 cellPadding=0 width=170
		background=${pageContext.request.contextPath}/resource/admin/images/menu_bg.jpg
		border=0>
		<TR>
			<TD vAlign=top align=middle>
				<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>

					<TR>
						<TD height=10></TD>
					</TR>
				</TABLE>




				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(1) href="javascript:void(0);">基本概况</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child1 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/jbgkAction!queryDefaultJbgkList" target=main>文化馆概况</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>




				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(2) href="javascript:void(0);">文化活动</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child2 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/whhdAction!queryDefaultWhhdList" target=main>文化活动</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>




				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(3) href="javascript:void(0);">文学书画</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child3 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/wxshAction!queryDefaultWxshList" target=main>文学书画</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				
				
				
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(4) href="javascript:void(0);">非遗展示</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child4 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/fyzsAction!queryDefaultFyzsList" target=main>非遗展示</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				
				
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(5) href="javascript:void(0);">群文论坛</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child5 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/qwltAction!queryDefaultQwltList" target=main>群文论坛</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(6) href="javascript:void(0);">艺术培训</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child6 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/yspxAction!queryDefaultYspxList" target=main>艺术培训</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				
				
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(7) href="javascript:void(0);">馆办刊物</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child7 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/gbkwAction!queryDefaultGbkwList" target=main>馆办刊物</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				
				<!--  
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(8) href="javascript:void(0);">群文理论</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child8 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/qwllAction!queryDefaultQwllList" target=main>群文理论</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				  -->
				
				
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(9) href="javascript:void(0);">群文政策</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child9 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/qwzcAction!queryDefaultQwzcList" target=main>群文政策</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				
				
				
				
				
				
				<!--  
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(10) href="javascript:void(0);">主页展示</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child10 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/znbmAction!queryDefaultZnbmList" target=main>主页展示</A></TD>
					</TR>
					<TR height=4>
						<TD colSpan=2></TD>
					</TR>
				</TABLE>
				-->
				
				
				
				
				
				<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
					<TR height=22>
						<TD style="PADDING-LEFT: 30px"
							background=${pageContext.request.contextPath}/resource/admin/images/menu_bt.jpg><A
							class=menuParent onclick=expand(0) href="javascript:void(0);">系统管理</A></TD>
					</TR>
					<TR height=4>
						<TD></TD>
					</TR>
				</TABLE>
				<TABLE id=child0 style="DISPLAY: none" cellSpacing=0 cellPadding=0
					width=150 border=0>
					<!-- 
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild href="${pageContext.request.contextPath}/sysUserAction!queryDefaultUserList" target=main>人员信息</A></TD>
					</TR>
					 -->
					<TR height=20>
						<TD align=middle width=30><IMG height=9
							src="${pageContext.request.contextPath}/resource/admin/images/menu_icon.gif"
							width=9></TD>
						<TD><A class=menuChild
							onclick="if (confirm('确定要退出吗？')) return true; else return false;"
							href="${pageContext.request.contextPath}/loginAction!showAdminLogin" target=_top>退出系统</A></TD>
					</TR>
				</TABLE>
			</TD>
			<TD width=1 bgColor=#d1e6f7></TD>
		</TR>
	</TABLE>
</BODY>
</HTML>
