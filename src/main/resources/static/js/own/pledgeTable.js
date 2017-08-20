function showData()
{
    $("div[id^='div']").hide();

    showOwerData();
    showInsuranceData();

    var locVal=$("#mode1").val();

    if(locVal=="1")
    {
        $("#divLand").show();
    }
    else if(locVal=="2")
    {
        $("#divEstate").show();
    }
    else  if(locVal=="3")
    {
        $("#divDevice").show();
    }
    if(locVal=="4")
    {
        $("#divVehicle").show();
    }
    else if(locVal=="5")
    {
        $("#divProject").show();
    }
    else  if(locVal=="6")
    {
        $("#divShip").show();
    }
    else  if(locVal=="7")
    {
        $("#divMining").show();
    }
    else  if(locVal=="8")
    {
        $("#divOther").show();
    }
}

function showOwerData(){
    $("#divOwer").hide();
    var locVal=$("#BankPledgeOwnerType").val();
    if(locVal!="1") {
        $("#divOwer").show();
    }
}

function showInsuranceData(){
    $("#divInsurance").hide();
    var insuranceVal=$("#IsInsuranceType").val();
    if(insuranceVal=="1") {
        $("#divInsurance").show();
    }
}

function Format(value){
    if (value != null) {
        var date = new Date(parseInt(value));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        return date.getFullYear()  + month  + currentDate;
    }
}

$(function() {

    showData();
    showOwerData();
    showInsuranceData();

    $('#mode1').change(function () {
        showData();
    });

    $('#BankPledgeOwnerType').change(function () {
        showOwerData();
    });

    $('#IsInsuranceType').change(function () {
        showInsuranceData();
    });

    $('#ethnic').blur(function () {
        var ethnic = $('#ethnic').val();
        $.ajax({
            type: "POST",
            url: "/QueryInfo",
            dataType: "json",
            data: {ethnic : ethnic},
            async: false,
            success: function(result){
                var pidtypeid = result.pidtypeid;
                var mortgagorname = result.mortgagorname;
                var contactaddress = result.contactaddress;
                var contactphone = result.contactphone;
                $('#pidtypeid').val(pidtypeid);
                $('#mortgagorname').val(mortgagorname);
                $('#contactaddress').val(contactaddress);
                $('#contactphone').val(contactphone);
            }
        });
    });

    $('#ethnic').change(function () {
        $('#pidtypeid').val("");
        $('#mortgagorname').val("");
        $('#contactaddress').val("");
        $('#contactphone').val("");
    });

    $('#btn_submit').click(function () {
        $('#pidtypeid').attr("disabled",false);
        $('#mortgagorname').attr("disabled",false);
        $('#contactaddress').attr("disabled",false);
        $('#contactphone').attr("disabled",false);
    });

    $('#btn_delete').click(function () {
        var rows = $('#pledgeNewList').bootstrapTable('getAllSelections');
        var json = [];
        for(var i=0;i<rows.length;i++){
            json.push(rows[i].id);
        }
        if(json == null || json == ""){
            alert("删除失败，您还未选择任何数据");
        }else{
            $.ajax({
                type: "POST",
                url: "/deletePledgeInfo",
                contentType : "application/json",
                dataType: "json",
                data: JSON.stringify(json),
                async: false,
                success: function(result){
                    $('#pledgeNewList').bootstrapTable("refresh",{
                        silent : true
                    });
                    alert(result.message);
                    $('#btn_add').trigger("click");
                },
                error : function (result) {
                    alert(result.message);
                }
            });
        }

    });

    $('#signeddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#begindate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });
    $('#enddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });
    $('#assessmentdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#insuranceeffectivedate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#insurancematuritydate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#estatebuildingdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#deviceexfactorydate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#vehiclebuydate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#vehicleexpectedretirementdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#projectbuildingdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#projectexpectedcompletiondate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#shipexfactorydate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#mininglastdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    //当其采取后台分页的时候，在这里把所需要的参数传给后台
    function queryParams(params) { // 配置参数
        var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            // limit : params.limit, // 页面大小
            // offset : params.offset, // 页码
            // sortname : params.sort, // 排序列名
            // sortorder : params.order// 排序规则
            custcod : $("#custcod").val()
            // pageWhere2 : $("#searchAcName").val()

        };
        return temp;
    }

    $("#pledgeNewList").bootstrapTable({
        method : "post",// 请求方式（*）
        url: "/PledgeNewListInfo",// 请求后台的URL（*）
        queryParams : queryParams,// 传递参数（*)
        uniqueId : "id",// 唯一标识
        sidePagination : 'client',// 分页方式：client客户端分页，server服务端分页（*）
        sortName : "id",// 排序字段
        sortOrder : "desc",// 排序方式
        pageList : [ 5, 10, 15, 20, 25, 30 ],// 可供选择的每页的行数（*）
        pageNumber : 1,// 初始化加载第一页，默认第一页
        pagination : true,// 是否显示分页（*）
        pageSize : 5,// 每页的记录行数（*）
        showColumns : true, // 是否显示所有的列
        toolbar : "#toolbar",// 工具按钮用哪个容器
        clickToSelect : true,// 是否启用点击选中行
        cache : false,// 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        striped : false,// 是否显示行间隔色
        showRefresh : true,// 是否显示刷新按钮
        showToggle : true,// 是否显示详细视图和列表视图的切换按钮
        cardView : false,// 是否显示详细视图
        detailView : false,// 是否显示父子表
        paginationLoop : false,// 是否允许循环分页
        paginationPreText : "上一页",// 指定上一页按钮文字，不配置默认<
        paginationNextText : "下一页",
        columns : [ {
            checkbox : true
        }, {
            field : 'line_no',
            title : '额度号'
        }, {
            field : 'num',
            title : '物品序号'
        }, {
            field : 'contractnumber',
            title : '抵押品合同编号'
        }, {
            field : 'signeddate',
            title : '抵押合同签订日期',
            formatter:function(value,row,index){
                if (value != null) {
                    var date = new Date(parseInt(value));
                    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
                    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
                    return date.getFullYear()  + month  + currentDate;

                }
            }
        }, {
            field : 'mode1',
            title : '抵押品类型',
            formatter:function(value,row,index){
                if(value=='1'){
                    return "土地使用权";
                }else if(value=='2'){
                    return "房产";
                }else if(value=='3'){
                    return "车辆";
                }else if(value=='4'){
                    return "设备";
                }else if(value=='5'){
                    return "在建工程";
                }else if(value=='6'){
                    return "船舶";
                }else if(value=='7'){
                    return "采矿权";
                }else if(value=='8'){
                    return "其他";
                }
            }
        }, {
            field : 'begindate',
            title : '抵押期限起',
            formatter:function(value,row,index){
                if (value != null) {
                    var date = new Date(parseInt(value));
                    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
                    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
                    return date.getFullYear()  + month  + currentDate;
                }
            }
        }, {
            field : 'enddate',
            title : '抵押期限止',
            formatter:function(value,row,index){
                if (value != null) {
                    var date = new Date(parseInt(value));
                    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
                    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
                    return date.getFullYear()  + month  + currentDate;
                }
            }
        }, {
            field : 'originalvalue',
            title : '抵押物原值'
        }, {
            field : 'marketvalue',
            title : '抵押物市场价值'
        }, {
            field : 'assessedvalue',
            title : '抵押物评估值'
        }, {
            field : 'amount',
            title : '抵押金额'
        }, {
            field : 'scale',
            title : '抵押比率'
        }, {
            field : 'owner',
            title : '权属情况',
            formatter:function(value,row,index){
                if(value=='0'){
                    return "他有";
                }else if(value=='1'){
                    return "自有";
                }else if(value=='2'){
                    return "共有";
                }
            }
        }, {
            field : 'isinsurance',
            title : '保险情况',
            formatter:function(value,row,index){
                if(value=='0'){
                    return "否";
                }else{
                    return "是";
                }
            }
        }, {
            field : 'assessmentagencies',
            title : '评估机构'
        }, {
            field : 'assessmentdate',
            title : '评估日期',
            formatter:function(value,row,index){
                if (value != null) {
                    var date = new Date(parseInt(value));
                    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
                    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
                    return date.getFullYear()  + month  + currentDate;
                }
            }
        }, {
            field : 'assessmentreportno',
            title : '评估报告编号'
        }],
        // onDblClickRow : function(row) {
        //     $("#acName").html(row.a_name);
        //     $("#acDetail").html(row.a_detail);
        //     $("#check_detail").modal({
        //         keyboard : true
        //     });
        // }

        onDblClickRow : function(row) {
            //通用信息
            $("#custcod").val(row.custcod);
            $("#id").val(row.id);
            $("#line_no").val(row.line_no);
            $("#num").val(row.num);
            $("#contractnumber").val(row.contractnumber);
            var signeddate = Format(row.signeddate);
            $("#signeddate").val(signeddate);
            $("#mode1").val(row.mode1);
            var begindate = Format(row.begindate);
            $("#begindate").val(begindate);
            var enddate = Format(row.enddate);
            $("#enddate").val(enddate);
            $("#originalvalueccy").val(row.originalvalueccy);
            $("#originalvalue").val(row.originalvalue);
            $("#marketvalueccy").val(row.marketvalueccy);
            $("#marketvalue").val(row.marketvalue);
            $("#assessedvalueccy").val(row.assessedvalueccy);
            $("#assessedvalue").val(row.assessedvalue);
            $("#amountccy").val(row.amountccy);
            $("#amount").val(row.amount);
            $("#scale").val(row.scale);
            $("#BankPledgeOwnerType").val(row.owner);
            $("#IsInsuranceType").val(row.isinsurance);
            $("#assessmentagencies").val(row.assessmentagencies);
            var assessmentdate = Format(row.assessmentdate);
            $("#assessmentdate").val(assessmentdate);
            $("#assessmentreportno").val(row.assessmentreportno);
            $("#organizationcode").val(row.organizationcode);
            //权属情况
            $("#ethnic").val(row.ethnic);
            $("#pidtypeid").val(row.pidtypeid);
            $("#pidno").val(row.pidno);
            $("#mortgagorname").val(row.mortgagorname);
            $("#contactaddress").val(row.contactaddress);
            $("#contactphone").val(row.contactphone);
            //土地使用权抵押
            $("#landuserightsno").val(row.landuserightsno);
            $("#landarea").val(row.landarea);
            $("#landareaunit").val(row.landareaunit);
            $("#landaddress").val(row.landaddress);
            $("#landaccessmethod").val(row.landaccessmethod);
            $("#landnature").val(row.landnature);
            $("#landhaveattachment").val(row.landhaveattachment);
            $("#landhaveattachmentcertificate").val(row.landhaveattachmentcertificate);
            $("#landattachmentisconsistent").val(row.landattachmentisconsistent);
            $("#landisreg").val(row.landisreg);
            $("#landregorgans").val(row.landregorgans);
            $("#landotherrightsno").val(row.landotherrightsno);
            $("#landotherremark").val(row.landotherremark);
            //房产抵押
            $("#estateno").val(row.estateno);
            $("#estatearea").val(row.estatearea);
            $("#estateaddress").val(row.estateaddress);
            $("#estatebuildingstructure").val(row.estatebuildingstructure);
            $("#estatefloors").val(row.estatefloors);
            $("#estateatfloor").val(row.estateatfloor);
            var estatebuildingdate = Format(row.estatebuildingdate);
            $("#estatebuildingdate").val(estatebuildingdate);
            $("#estateisreg").val(row.estateisreg);
            $("#estateregorgans").val(row.estateregorgans);
            $("#estateotherrightsno").val(row.estateotherrightsno);
            $("#estaterightsaddress").val(row.estaterightsaddress);
            $("#estateattatichmentowner").val(row.estateattatichmentowner);
            $("#estateremark").val(row.estateremark);
            //车辆抵押
            $("#vehiclebrand").val(row.vehiclebrand);
            $("#vehicleenginenumber").val(row.vehicleenginenumber);
            $("#vehicletype").val(row.vehicletype);
            $("#vehiclechassisnumber").val(row.vehiclechassisnumber);
            var vehiclebuydate = Format(row.vehiclebuydate);
            $("#vehiclebuydate").val(vehiclebuydate);
            var vehicleexpectedretirementdate = Format(row.vehicleexpectedretirementdate);
            $("#vehicleexpectedretirementdate").val(vehicleexpectedretirementdate);
            $("#vehiclerunlong").val(row.vehiclerunlong);
            $("#vehiclelicensenumber").val(row.vehiclelicensenumber);
            $("#vehicleremark").val(row.vehicleremark);
            //设备抵押
            $("#devicename").val(row.devicename);
            $("#devicetype").val(row.devicetype);
            $("#deviceunit").val(row.deviceunit);
            $("#devicenumber").val(row.devicenumber);
            var deviceexfactorydate = Format(row.deviceexfactorydate);
            $("#deviceexfactorydate").val(deviceexfactorydate);
            $("#deviceusedyears").val(row.deviceusedyears);
            $("#deviceretirementyears").val(row.deviceretirementyears);
            $("#deviceaddress").val(row.deviceaddress);
            $("#deviceremark").val(row.deviceremark);
            //船舶抵押
            $("#shipbrand").val(row.shipbrand);
            $("#shiptype").val(row.shiptype);
            $("#shiplicenenumber").val(row.shiplicenenumber);
            var shipexfactorydate = Format(row.shipexfactorydate);
            $("#shipexfactorydate").val(shipexfactorydate);
            $("#shipnavmil").val(row.shipnavmil);
            $("#shiprights").val(row.shiprights);
            $("#shipuse").val(row.shipuse);
            $("#shipnumber").val(row.shipnumber);
            $("#shipremark").val(row.shipremark);
            //采矿权抵押
            $("#miningperson").val(row.miningperson);
            $("#mininglicencenumber").val(row.mininglicencenumber);
            $("#miningaddress").val(row.miningaddress);
            $("#miningtype").val(row.miningtype);
            $("#miningname").val(row.miningname);
            $("#miningworktype").val(row.miningworktype);
            $("#miningproductionscale").val(row.miningproductionscale);
            $("#miningarea").val(row.miningarea);
            var mininglastdate = Format(row.mininglastdate);
            $("#mininglastdate").val(mininglastdate);
            $("#miningremark").val(row.miningremark);
            //其他抵押
            $("#othername").val(row.othername);
            $("#otherunit").val(row.otherunit);
            $("#othernumber").val(row.othernumber);
            $("#otheraddress").val(row.otheraddress);
            $("#otherremark").val(row.otherremark);
            //在建工程抵押
            $("#projectname").val(row.projectname);
            $("#projectattathimentarea").val(row.projectattathimentarea);
            $("#projectbuildingarea").val(row.projectbuildingarea);
            $("#projectaddress").val(row.projectaddress);
            $("#projectbuildingorg").val(row.projectbuildingorg);
            $("#projectbuildingfloors").val(row.projectbuildingfloors);
            var projectbuildingdate = Format(row.projectbuildingdate);
            $("#projectbuildingdate").val(projectbuildingdate);
            var projectexpectedcompletiondate = Format(row.projectexpectedcompletiondate);
            $("#projectexpectedcompletiondate").val(projectexpectedcompletiondate);
            $("#projectconstructionunit").val(row.projectconstructionunit);
            $("#projectremark").val(row.projectremark);
            //保险信息
            $("#insuranceno").val(row.insuranceno);
            var insuranceeffectivedate = Format(row.insuranceeffectivedate);
            $("#insuranceeffectivedate").val(insuranceeffectivedate);
            var insurancematuritydate = Format(row.insurancematuritydate);
            $("#insurancematuritydate").val(insurancematuritydate);
            $("#insurancetype").val(row.insurancetype);
            $("#insurancecompany").val(row.insurancecompany);
            $("#insuranceamountccy").val(row.insuranceamountccy);
            $("#insuranceamount").val(row.insuranceamount);
            $("#insurancebeneficiaries").val(row.insurancebeneficiaries);

            showData();
            showOwerData();
            showInsuranceData();
        }
    });

    $("#btn_add").click(function () {
        $.ajax({
            type: "POST",
            url: "/NewPledgeInfo",
            dataType: "json",
            async: false,
            success: function(result){
                //通用信息
                $("#id").val(result.id);
                $("#line_no").val(result.line_no);
                $("#contractnumber").val(result.contractnumber);
                $("#signeddate").val(result.signeddate);
                $("#mode1").val(result.mode1);
                $("#begindate").val(result.begindate);
                $("#enddate").val(result.enddate);
                $("#originalvalueccy").val(result.originalvalueccy);
                $("#originalvalue").val(result.originalvalue);
                $("#marketvalueccy").val(result.marketvalueccy);
                $("#marketvalue").val(result.marketvalue);
                $("#assessedvalueccy").val(result.assessedvalueccy);
                $("#assessedvalue").val(result.assessedvalue);
                $("#amountccy").val(result.amountccy);
                $("#amount").val(result.amount);
                $("#scale").val(result.scale);
                $("#BankPledgeOwnerType").val(result.owner);
                $("#IsInsuranceType").val(result.isinsurance);
                $("#assessmentagencies").val(result.assessmentagencies);
                $("#assessmentdate").val(result.assessmentdate);
                $("#assessmentreportno").val(result.assessmentreportno);
                $("#organizationcode").val(result.organizationcode);
                //权属情况
                $("#ethnic").val(result.ethnic);
                $("#pidtypeid").val(result.pidtypeid);
                $("#pidno").val(result.pidno);
                $("#mortgagorname").val(result.mortgagorname);
                $("#contactaddress").val(result.contactaddress);
                $("#contactphone").val(result.contactphone);
                //土地使用权抵押
                $("#landuserightsno").val(result.landuserightsno);
                $("#landarea").val(result.landarea);
                $("#landareaunit").val(result.landareaunit);
                $("#landaddress").val(result.landaddress);
                $("#landaccessmethod").val(result.landaccessmethod);
                $("#landnature").val(result.landnature);
                $("#landhaveattachment").val(result.landhaveattachment);
                $("#landhaveattachmentcertificate").val(result.landhaveattachmentcertificate);
                $("#landattachmentisconsistent").val(result.landattachmentisconsistent);
                $("#landisreg").val(result.landisreg);
                $("#landregorgans").val(result.landregorgans);
                $("#landotherrightsno").val(result.landotherrightsno);
                $("#landotherremark").val(result.landotherremark);
                //房产抵押
                $("#estateno").val(result.estateno);
                $("#estatearea").val(result.estatearea);
                $("#estateaddress").val(result.estateaddress);
                $("#estatebuildingstructure").val(result.estatebuildingstructure);
                $("#estatefloors").val(result.estatefloors);
                $("#estateatfloor").val(result.estateatfloor);
                $("#estatebuildingdate").val(result.estatebuildingdate);
                $("#estateisreg").val(result.estateisreg);
                $("#estateregorgans").val(result.estateregorgans);
                $("#estateotherrightsno").val(result.estateotherrightsno);
                $("#estaterightsaddress").val(result.estaterightsaddress);
                $("#estateattatichmentowner").val(result.estateattatichmentowner);
                $("#estateremark").val(result.estateremark);
                //车辆抵押
                $("#vehiclebrand").val(result.vehiclebrand);
                $("#vehicleenginenumber").val(result.vehicleenginenumber);
                $("#vehicletype").val(result.vehicletype);
                $("#vehiclechassisnumber").val(result.vehiclechassisnumber);
                $("#vehiclebuydate").val(result.vehiclebuydate);
                $("#vehicleexpectedretirementdate").val(result.vehicleexpectedretirementdate);
                $("#vehiclerunlong").val(result.vehiclerunlong);
                $("#vehiclelicensenumber").val(result.vehiclelicensenumber);
                $("#vehicleremark").val(result.vehicleremark);
                //设备抵押
                $("#devicename").val(result.devicename);
                $("#devicetype").val(result.devicetype);
                $("#deviceunit").val(result.deviceunit);
                $("#devicenumber").val(result.devicenumber);
                $("#deviceexfactorydate").val(result.deviceexfactorydate);
                $("#deviceusedyears").val(result.deviceusedyears);
                $("#deviceretirementyears").val(result.deviceretirementyears);
                $("#deviceaddress").val(result.deviceaddress);
                $("#deviceremark").val(result.deviceremark);
                //船舶抵押
                $("#shipbrand").val(result.shipbrand);
                $("#shiptype").val(result.shiptype);
                $("#shiplicenenumber").val(result.shiplicenenumber);
                $("#shipexfactorydate").val(result.shipexfactorydate);
                $("#shipnavmil").val(result.shipnavmil);
                $("#shiprights").val(result.shiprights);
                $("#shipuse").val(result.shipuse);
                $("#shipnumber").val(result.shipnumber);
                $("#shipremark").val(result.shipremark);
                //采矿权抵押
                $("#miningperson").val(result.miningperson);
                $("#mininglicencenumber").val(result.mininglicencenumber);
                $("#miningaddress").val(result.miningaddress);
                $("#miningtype").val(result.miningtype);
                $("#miningname").val(result.miningname);
                $("#miningworktype").val(result.miningworktype);
                $("#miningproductionscale").val(result.miningproductionscale);
                $("#miningarea").val(result.miningarea);
                $("#mininglastdate").val(result.mininglastdate);
                $("#miningremark").val(result.miningremark);
                //其他抵押
                $("#othername").val(result.othername);
                $("#otherunit").val(result.otherunit);
                $("#othernumber").val(result.othernumber);
                $("#otheraddress").val(result.otheraddress);
                $("#otherremark").val(result.otherremark);
                //在建工程抵押
                $("#projectname").val(result.projectname);
                $("#projectattathimentarea").val(result.projectattathimentarea);
                $("#projectbuildingarea").val(result.projectbuildingarea);
                $("#projectaddress").val(result.projectaddress);
                $("#projectbuildingorg").val(result.projectbuildingorg);
                $("#projectbuildingfloors").val(result.projectbuildingfloors);
                $("#projectbuildingdate").val(result.projectbuildingdate);
                $("#projectexpectedcompletiondate").val(result.projectexpectedcompletiondate);
                $("#projectconstructionunit").val(result.projectconstructionunit);
                $("#projectremark").val(result.projectremark);
                //保险信息
                $("#insuranceno").val(result.insuranceno);
                $("#insuranceeffectivedate").val(result.insuranceeffectivedate);
                $("#insurancematuritydate").val(result.insurancematuritydate);
                $("#insurancetype").val(result.insurancetype);
                $("#insurancecompany").val(result.insurancecompany);
                $("#insuranceamountccy").val(result.insuranceamountccy);
                $("#insuranceamount").val(result.insuranceamount);
                $("#insurancebeneficiaries").val(result.insurancebeneficiaries);

                showData();
                showOwerData();
                showInsuranceData();
            }
        });

    });

});