/*
Copyright (c) 2003-2013, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	 config.language = 'zh-cn'; // 配置语言  
	 //config.uiColor = '#FFF'; // 背景颜色  
	//config.width = 800;  // 宽度  
	config.height =210;  // 高度  
	config.skin = 'moono';
	config.toolbar = 'Full';
	config.font_names='宋体/宋体;黑体/黑体;仿宋/仿宋_GB2312;楷体/楷体_GB2312;隶书/隶书;幼圆/幼圆;微软雅黑/微软雅黑;'+ config.font_names;
	config.toolbar_Full = [

['Source','-','NewPage','Save','Preview','-','Templates'],
['Cut','Copy','Paste','PasteText','PasteFromWord','-','Print', 'SpellChecker', 'Scayt'],
['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
'/',
['Bold','Italic','Underline','Strike','-','Subscript','Superscript'],
['NumberedList','BulletedList','-','Outdent','Indent','Blockquote'],
['JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],
['Link','Unlink','Anchor'],
['Image','Table','HorizontalRule','Smiley','SpecialChar','PageBreak'],
'/',
['Styles','Format','Font','FontSize'],
['TextColor','BGColor'],
['Maximize','ShowBlock']
];
	 config.removeDialogTabs = 'image:advanced;image:Link';
	//config.filebrowserUploadUrl="actions/ckeditorUpload";
	var pathName = window.document.location.pathname;
	//获取带"/"的项目名，如：/uimcardprj
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    config.filebrowserImageUploadUrl = projectName+'/uploadAction!fileUpload'; //固定路径
    
    
};
