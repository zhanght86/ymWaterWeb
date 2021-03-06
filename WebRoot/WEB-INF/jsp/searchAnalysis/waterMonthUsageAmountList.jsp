<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="gdcct" uri="http://www.xiaocong.net/gdcct/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>月用水量查询</title>
<link href="${baseUrl }css/admin.css" type="text/css" rel="stylesheet" />
<script src="${baseUrl }js/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<script>
$(function(){
	//全选
	var flag = true;
	$('#selectAllBtn').click(function(){
		if(flag){
			$.each($('.cb'), function(index){
				$(this)[0].checked = true;
			});
		}else{
			$.each($('.cb'), function(index){
				$(this)[0].checked = false;
			});
		}
		flag = !flag;
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
	loadChargingUnit('${unitId }');
	$('#btnSubmit').click(function(){
		$('#searchForm').submit();
	});
	
    $('#exportBtn').click(function(){
    	var chargingUnitId = $('#chargingUnitSel').val();
    	var concHardwareId = $('#concHardwareId').val();
    	var userId = $('#userId').val();
    	var freezeYear = $('#freezeYear').val();
    	var meterHardwareId = $('#meterHardwareId').val();
    	window.open('${baseUrl }searchAnalysis/downloadWaterMonthUsageAmountList.jspx?unitId='+chargingUnitId +'&userId='+userId +'&concHardwareId='+concHardwareId 
    			+'&meterHardwareId='+meterHardwareId
    			+'&freezeYear='+freezeYear
    			+'&random=' + Math.random());
    });
});
</script>
</head>

<body style="min-width: 1100px;">
	<table class="position" border="0" cellSpacing="0" cellPadding="0" width="100%" align="center">
		<tbody>
			<tr class="position">
	 			<td class="position">当前位置: 数据查询 -&gt;  月用水量查询</td>
	 		</tr>
	 	</tbody>
	</table>	
	<table width="100%" border="0" align="" cellpadding="0" cellspacing="0">
		<tr><td>
			<div class="srhtab">
			    <form id="searchForm" action="${baseUrl }searchAnalysis/waterMonthUsageAmountList.jspx" method="post">
			    <table cellSpacing=0 cellPadding=2 border=0>
			      <tbody>
				      <tr>
				        <td>收费单位：</td>
				        <td>
				        	<select id="chargingUnitSel" name="unitId">
								<option></option>
							</select>
						</td>
				        <td>集中器编号：</td>
				        <td><input class="textbox" id="concHardwareId" style="width: 90px" name="concHardwareId" value="${concHardwareId }"/></td>
				        <td>客户编号：</td>
				        <td><input class="textbox" id="userId" style="width: 90px" name="userId" value="${userId }"/></td>
				        <td>年份：</td>
				        <td><input class="textbox" id="freezeYear" style="width: 90px" name="freezeYear" value="${freezeYear }"/></td>
				        <td>表号：</td>
				        <td><input class="textbox" id="meterHardwareId" style="width: 90px" name="meterHardwareId"  value="${meterHardwareId }"/></td>
				      	<td><input class="button" id="btnSubmit" type="button" value="查询" name="btnSubmit"></td>
				      	<td><input class="button" id="exportBtn" type="button" value="导出" name=""></td>
				      </tr>
			      </tbody>
			    </table>
			    </form>	
			</div>
		</td></tr>
	</table>

    <table class="ymlistTable" width="100%" cellpadding="0" cellspacing="1" >
      <tr class="listTableHead">
        <td width=""><div align="center"><input type="checkbox" name="checkbox" id="selectAllBtn" /></div></td>
        <td width=""><div><span>序号</span></div></td>
        <td width=""><div><span>客户编号</span></div></td>
        <td width=""><div><span>集中器编号</span></div></td>
        <td width=""><div><span>表号</span></div></td>
        <td width=""><div><span>收费单位</span></div></td>
        <td width=""><div><span>冻结时间(年)</span></div></td>
        <td width=""><div><span>1月用水量</span></div></td>
        <td width=""><div><span>2月用水量</span></div></td>
        <td width=""><div><span>3月用水量</span></div></td>
        <td width=""><div><span>4月用水量</span></div></td>
        <td width=""><div><span>5月用水量</span></div></td>
        <td width=""><div><span>6月用水量</span></div></td>
        <td width=""><div><span>7月用水量</span></div></td>
        <td width=""><div><span>8月用水量</span></div></td>
        <td width=""><div><span>9月用水量</span></div></td>
        <td width=""><div><span>10月用水量</span></div></td>
        <td width=""><div><span>11月用水量</span></div></td>
        <td width=""><div><span>12月用水量</span></div></td>
      </tr>
      <c:if test="${not empty list}">
      <c:forEach var="item"  items="${list }" varStatus="vs">
      <tr class="listTableTr">
        <td><div><input type="checkbox" name="" id="" class="cb" /></div></td>
        <td><div>${vs.count}</div></td>
        <td><div>${item.userId}</div></td>
        <td><div>${item.concHardwareId}</div></td>
        <td><div>${item.meterHardwareId}</div></td>
        <td><div>${item.chargingUnitId}</div></td>
        <td><div>${item.freezeYear }</div></td>
        <td><div>${item.usageAmount1}</div></td>
        <td><div>${item.usageAmount2}</div></td>
        <td><div>${item.usageAmount3}</div></td>
        <td><div>${item.usageAmount4}</div></td>
        <td><div>${item.usageAmount5}</div></td>
        <td><div>${item.usageAmount6}</div></td>
        <td><div>${item.usageAmount7}</div></td>
        <td><div>${item.usageAmount8}</div></td>
        <td><div>${item.usageAmount9}</div></td>
        <td><div>${item.usageAmount10}</div></td>
        <td><div>${item.usageAmount11}</div></td>
        <td><div>${item.usageAmount12}</div></td>
      </tr>
      </c:forEach>
      </c:if>
	 	<tr class="listFooterTr">
		<td colSpan=21>
			<gdcct:pager id="pagerID" fontPageCSS="currentFont" pageStaticMax="0" pageIndex="${pageModel.pageIndex}" recordCount="${pageModel.recordCount }" pageFirstURL="${baseUrl }searchAnalysis/waterMonthUsageAmountList.jspx" pageDynamicURLFormat="${baseUrl }searchAnalysis/waterMonthUsageAmountList.jspx?pageIndex={0}" pageSize="${pageModel.pageSize}"></gdcct:pager>
		</td>
		</tr>      
    </table>
</body>
</html>