<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>银行信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
  </head>
<body style="padding: 3px;">
	<div id="main">
		<form class="registerform" method="post" action="" target="main">
			<input type="hidden" name="id" value="${id }" />
			<input type="hidden" id="bankId" name="bankId" value="" />
			<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>付费优先级<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="payPriority" name="bank.payPriority" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option>1</option>
								<option>2</option>
								<option>3</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>银行代码<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="bankCode" name="bank.bankCode" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>银行账号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="bankAccount" name="bank.bankAccount" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>账户名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="accountName" name="bank.accountName" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>账户类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="accountType" name="bank.accountType" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>托收协议标识<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="collAgreementId" name="bank.collAgreementId" value="" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" id="subBtn" value="新 增" /> <input type="reset" id="resetBtn" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/userList.jspx','main');"value="返 回">
			</div>
		</form>
		<div class="block10"></div>
		<c:if test="${not empty id }">
		<table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
	      <tr class="listTableHead">
	        <td><div><span>序号</span></div></td>
	        <td><div><span>付费优先级</span></div></td>
	        <td><div><span>银行代码</span></div></td>
	        <td><div><span>银行账号</span></div></td>
	        <td><div><span>账户名称</span></div></td>
	        <td><div><span>操作</span></div></td>
	      </tr>
	      <c:forEach var="bank" items="${bankList }">
	      <tr class="listTableTr">
	      	<td><div>${bank.id }</div></td>
	        <td><div>
				<c:if test="${bank.payPriority == '1'}">1</c:if>
				<c:if test="${bank.payPriority == '2'}">2</c:if>
				<c:if test="${bank.payPriority == '3'}">3</c:if>
	        </div></td>
	        <td><div>
	        	${bank.bankCode}
	        </div></td>
	        <td><div>
				${bank.bankAccount}
	        </div></td>
	        <td><div>${bank.accountName }</div></td>
	        <td><div>
	        	<a href="javascript:void(0);" class="btnEdit" title="${bank.id }">修改</a>
	         | <a href="javascript:void(0);" class="btnDelete" title="${bank.id }">删除</a>
	        </div></td>
	      </tr>
	      </c:forEach>
	      <tr class="listFooterTr">
		  	<td colSpan="6">
				<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }archives/bankDetail.jspx" pageDynamicURLFormat="${baseUrl }archives/bankDetail.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
			</td>
		  </tr>
	    </table>
	    </c:if>
	</div>
	
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2/Validform_v5.3.2_min.js"></script>
<script type="text/javascript">
$(function(){
	//$(".registerform").Validform();  //就这一行代码！;
		
	$(".registerform").Validform({
		tiptype:function(msg,o,cssctl){
			//msg：提示信息;
			//o:{obj:*,type:*,curform:*}, obj指向的是当前验证的表单元素（或表单对象），type指示提示的状态，值为1、2、3、4， 1：正在检测/提交数据，2：通过验证，3：验证失败，4：提示ignore状态, curform为当前form对象;
			//cssctl:内置的提示信息样式控制函数，该函数需传入两个参数：显示提示信息的对象 和 当前提示的状态（既形参o中的type）;
			if(!o.obj.is("form")){//验证表单元素时o.obj为该表单元素，全部验证通过提交表单时o.obj为该表单对象;
				//var objtip=$(o.obj).parent().next().find(".Validform_checktip");
				var objtip=o.obj.siblings(".Validform_checktip");
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		},
		callback:function(form){
			if($("#bankId").val() == ''){
				if('${id }' != ''){
					$(".registerform").attr('action','${baseUrl }archives/saveBank.jspx');
				}else{
					alert('请先完善基本信息！');
					window.open('${baseUrl}archives/userInfoTab.jspx','main');
				}
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateBank.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	
	$(".btnEdit").click(function(){
		$('#subBtn').val('修 改');
		var data = eval(${bankListJson});
		for(var key in data){
			var bank = data[key];
			if($(this).attr('title') == bank.id){
				$('#bankId').val(bank.id);
				$('#bankCode').val(bank.bankCode);
				$('#bankAccount').val(bank.bankAccount);
				$('#accountName').val(bank.accountName);
				$('#collAgreementId').val(bank.collAgreementId);
				$('#accountType').val(bank.accountType);
			}
		}
	});
	$(".btnDelete").click(function(){
		var bankId = $(this).attr('title');
		var confirm = window.confirm('请确认是否删除该银行信息?');
		if(confirm){
			window.open('${baseUrl}archives/deleteBank.jspx?id=${id}&bankId='+bankId+'&curr=${curr}','main');
		}
	});
	
	$('#resetBtn').click(function(){
		$('#subBtn').val('新 增');
		$('#bankId').val('');
	});
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>