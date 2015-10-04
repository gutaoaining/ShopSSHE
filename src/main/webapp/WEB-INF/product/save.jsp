<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<!-- 引入公共的JSP片段 -->
	<%@ include file="/public/head.jspf"%>
	<style type="text/css">
		form div{
			margin: 10px;
		}
	</style>
	<script type="text/javascript">
       $(function(){
    	   $('input[name=name]').validatebox({    
               required: true,    
               missingMessage : '类型不能为空！' 
           }); 
    	   $('input[name=price]').numberbox({ 
    		   min : 0,    
    		   precision : 2 ,
    		   prefix : '￥',   
               required: true
           }); 
    	   $('#cc').combobox({    
       	    url:'categoryaction!queryType.action',  
       	    panelHeight : 'auto',
       	    panelWidth : 120,
       	    width : 120,  
       	    editable : false,
       	    valueField:'id',    
       	    textField:'type'   
        }); 
        });
   </script>
</head>

<body>
<form title="添加商品" id="ff" method="post" enctype="multipart/form-data">
	<div>
		<label>商品名称:</label> <input type="text" name="name" />
	</div>
	<div>
		<label>商品价格:</label> <input type="text" name="price" />
	</div>
	<div>
		<label>图片上传:</label> <input type="file" name="upload" />
	</div>
	<div>
		<label>所属类别：</label> 
		<select id="cc" name="category.id">
		</select>
	</div>
	<div>
		<label>加入推荐:</label><input type="radio" name="commend"
			checked="checked" value="true" />推荐  <input type="radio"
			name="commend" value="false" />不推荐 
	</div>
	<div>
		<label>是否有效:</label>
		<input type="radio" name="open" checked="checked"value="true" />上架
		<input type="radio" name="open" value="false" />下架
				
	</div>
	<div>
		<label>简单描述:</label>
		<textarea name="remark" cols="40" rows="4"></textarea>
	</div>
	<div>
		<label>详细描述:</label>
		<textarea name="xremark" cols="40" rows="6"></textarea>
	</div>
	<div>
		<a id="submit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添 加</a> 
		<a id="reset" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">重 置</a>
	</div>
</form>
</body>
</html>
