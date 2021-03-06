<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>基本信息</title>
    
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
			<input type="hidden" name="curr" value="${curr }" />
			<table class="editTable" border="0" cellspacing="1" cellpadding="10" width="100%" align="center">
				<tbody>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>客户编号<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="userId" name="userId" value="${user.userId }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>收费单位名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="chargingUnitSel" name="user.chargingUnitId" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！">
								<option></option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>客户名称<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="user.name" name="user.name" value="${user.name }" datatype="*" nullmsg="请输入信息！" errormsg="请输入信息！" />
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>告警余额(元)<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<input type="text" id="user.warnPrice" name="warnPriceStr" value="<gdcct:price longPrice="${user.warnPrice }" ></gdcct:price>" datatype="/^[0-9]+([.]\d{1,4})?$/" nullmsg="请输入信息！" errormsg="请输入数字(例:0.00),最高保留四位小数!" />
							<span class="Validform_checktip"></span>
						</td>
					</tr>
					<tr class="editTr">
						<td class="editLeftTd"><span></span>产业分类<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select datatype="*" id="industrial" name="user.industrial" nullmsg="请输入信息！" errormsg="请输入信息！">
						        <option value="第一产业">第一产业</option>
						        <option value="第二产业">第二产业</option>
						        <option value="第三产业">第三产业</option>
							</select>
							<span class="Validform_checktip"></span>
						</td>
						<td class="editLeftTd"><span></span>经济类型<span style="color: red;">*</span>：</td>
						<td class="editRightTd" width="250px">
							<select id="economicType" name="user.economicType">
						        <option value="全民所有制经济">全民所有制经济</option>
						        <option value="集体所有制经济">集体所有制经济</option>
						        <option value="私人所有制经济">私人所有制经济</option>
						        <option value="混合所有制经济">混合所有制经济</option>
						        <option value="其他所有制经济">其他所有制经济</option>
					        </select>
							<span class="Validform_checktip"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="editBtn" style="margin-top: 20px;" align="center">
				<input type="submit" value="保 存" /> <input type="reset" value="重 置" /><input type="button" onclick="javascript:window.open('${baseUrl}archives/userList.jspx','main');"value="返 回">
			</div>
		</form>
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
				var objtip=o.obj.siblings(".Validform_checktip");
				cssctl(objtip,o.type);
				objtip.text(msg);
			}
		},
		callback:function(form){
			if('${user.id }' == ''){
				$(".registerform").attr('action','${baseUrl }archives/saveUser.jspx');
			}else{
				$(".registerform").attr('action','${baseUrl }archives/updateUser.jspx');
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
	loadChargingUnit('${user.chargingUnitId }');
	
	$("#industrial").val('${user.industrial}');
	$("#economicType").val('${user.economicType}');
	
	if('${param.message}' != ''){
		alert('${param.message}');
	}
});
</script>
</body>
</html>