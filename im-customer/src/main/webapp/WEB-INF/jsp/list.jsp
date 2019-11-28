<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:import url="common.jsp"></c:import>
<script type="text/javascript">
	
	 
	$(function(){
		var pages =1;
		page1(pages);
	});
	//此方法不能调用page1待解决
	function up(pages) {
		console.log(pages)
		pages +=1;
		console.log(pages)
		page1(pages);
	}
	function page1(padd) {
		console.log("1")
		$.ajax({
			type : "post",
			url : "list.action?page="+padd,
			success : function(result){
				console.log(result);
				page = result.page;
				console.log(page);
			var html = "";
			$.each(result.listPage,function(i,data){
				console.log(result.listPage);
				
				html += "<tr><td><input name='ids' type='checkbox' value='"+data.id+"' /></td><td>"+data.id+"</td>"+
				"<td><a href='findById.action?id="+data.id+"'>"+data.title+"</a></td><td>"+data.author+"</td>"+
				"<td>"+data.createdate+"</td><td><input onclick='javascript:location.href=update.action?id="+
				data.id+"' value='修改' type='button' /></td></tr>";
			})
			html += "<tr align='center'><td colspan='6'><input onclick='javascript:location.href='add.action'' value='添加' type='button' /> <input value='删除' type='submit' /></td></tr>";
			$("#list").html(html);
			var html2 = "";
			if(result.page==1){
				html2 = "<center><span>共"+result.endPage+"页，第"+result.page+"页</span><button type='button' onclick='page1("+result.downPage+")'>下一页</button></center>"
			}else if(result.page==result.endPage){
				html2 = "<center><button type='button' onclick='page1("+result.upPage+")'>上一页</button><span>共"+result.endPage+"页，第"+result.page+"页</span>"
			}else{
				html2 = "<center><button type='button' onclick='page1("+result.upPage+")'>上一页</button><span>共"+result.endPage+"页，第"+result.page+"页</span><button type='button' onclick='page1("+result.downPage+")'>下一页</button></center>"
			}
			
			$("#page").html(html2);
			},
		
		});
	}

</script>
</head>
<body>

	<c:import url="nav.jsp"></c:import>
	<div style="margin: 0 5%">
		<form action="delete.action" method="post">
			<table class="table table-hover">
				<tr>
					<th><input type="checkbox" /></th>
					<th>id</th>
					<th>title</th>
					<th>author</th>
					<th>createdate</th>
					<th>option</th>
				</tr>
				</table>
					<table id = "list" class="table table-hover"></table>
				
				</form>
				
			
			<div id = "page"></div>
		
	</div>
</body>
</html>
