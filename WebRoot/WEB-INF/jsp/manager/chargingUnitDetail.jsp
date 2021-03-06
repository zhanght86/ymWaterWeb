<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>收费单位编辑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
  </head>
<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 系统管理 -&gt;  收费单位编辑</td>
	 		</tr>
	 	</tbody>
	</table>
	<div id="main">
		<form class="registerform" method="post" action="">
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>收费单位编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<c:if test="${not empty chargingUnit.unitId }">
								${chargingUnit.unitId }<input type="hidden" name="unitId" value="${chargingUnit.unitId }" />
							</c:if>
							<c:if test="${empty chargingUnit.unitId }">
								<input type="text" id="unitId" name="unitId" value="${chargingUnit.unitId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
								<span class="Validform_checktip"></span>
							</c:if>
						</td>
						<td class="editLeftTd"><span></span>收费单位名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="name" name="name" value="${chargingUnit.name }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>上级收费单位名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="chargingUnitSel" name="parentUnitId" <c:if test="${not empty chargingUnit.unitId }">disabled="disabled"</c:if>>
								<option></option>
							</select>
						</td>
						<td class="editLeftTd"><span></span>联系人<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="linkMan" name="linkMan" value="${chargingUnit.linkMan }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>联系电话<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="linkTel" name="linkTel" value="${chargingUnit.linkTel }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>联系地址<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="linkAddr" name="linkAddr" value="${chargingUnit.linkAddr }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>备注<span style="color: red;">*</span>：</td>
						<td class="editRightTd" colspan="3" >
							<textarea style="float: left;" rows="3" cols="50" name="remark">${chargingUnit.remark }</textarea>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.location='${baseUrl}manage/chargingUnitList.jspx';"value="返 回">
			</div>
		</form>
	</div>
	
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${baseUrl }js/Validform_v5.3.2/Validform_v5.3.2_min.js"></script>
<script type="text/javascript">
$(function(){
	//$(".registerform").Validform();  //就这一行代码！;
	if('${param.message}' != ''){
		alert('${param.message}');
	}
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
			if('${chargingUnit.unitId }' == ''){
				$(".registerform").attr('action','${baseUrl }manage/saveChargingUnit.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }manage/updateChargingUnit.jspx');
			}
			if(confirm("您确定要提交表单吗？")){
				return true;
			}
			return false;
		}
	});
	//加载收费单位
	function loadChargingUnit(unitId){
		var _loadSelObj=$("#chargingUnitSel");
    	_loadSelObj.empty();
		$.ajax({
			url:'${baseUrl}common/getChargingUnitListAjax.jspx?rand=' + Math.random(),
			type:'get',
			data:{},
			dataType:'json',
			success:function(response){
				var optStr="<option value=''>-请选择-</option>";
				if(response.length>0){
					for(var i=0;i<response.length;i++){
						optStr+="<option value='"+response[i].unitId+"'>"+response[i].name+"</option>";
   					}
				}				
				_loadSelObj.append(optStr);
				_loadSelObj.val(unitId);
			},
			error:function(response){
				alert("服务忙，请重试。");
			}
		});
	}
	loadChargingUnit('${chargingUnit.parentUnitId }');
});
</script>
</body>
</html>