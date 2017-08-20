function showData()
{
    $("div[id^='div']").hide();

    showOwerData();

    var locVal=$("#mode1").val();

    if(locVal=="1")
    {
        $("#divReceivables").show();
    }
    else if(locVal=="2")
    {
        $("#divBankAccount").show();
    }
    else  if(locVal=="3")
    {
        $("#divCar").show();
    }
    if(locVal=="4")
    {
        $("#divCDs").show();
    }
    else if(locVal=="5")
    {
        $("#divClaim").show();
    }
    else  if(locVal=="6")
    {
        $("#divCharge").show();
    }
    else  if(locVal=="7")
    {
        $("#divIntellectual").show();
    }
    else  if(locVal=="8")
    {
        $("#divLading").show();
    }
    else  if(locVal=="9")
    {
        $("#divTicket").show();
    }
    else  if(locVal=="10")
    {
        $("#divStock").show();
    }
    else  if(locVal=="11")
    {
        $("#divWarehouse").show();
    }
    else  if(locVal=="12")
    {
        $("#divNational").show();
    }
    else  if(locVal=="13")
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

    $('#mode1').change(function () {
        showData();
    });

    $('#BankPledgeOwnerType').change(function () {
        showOwerData();
    });

    $('#ethnic').blur(function () {
        var ethnic = $('#ethnic').val();
        $.ajax({
            type: "POST",
            url: "/QueryInfoByethnic",
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
        var rows = $('#PrendaTable').bootstrapTable('getAllSelections');
        var json = [];
        for(var i=0;i<rows.length;i++){
            json.push(rows[i].id);
        }
        if(json == null || json == ""){
            alert("删除失败，您还未选择任何数据");
        }else{
            $.ajax({
                type: "POST",
                url: "/deletePrendaInfo",
                contentType : "application/json",
                dataType: "json",
                data: JSON.stringify(json),
                async: false,
                success: function(result){
                    $('#PrendaTable').bootstrapTable("refresh",{
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

    $("#PrendaTable").bootstrapTable({
        method : "post",// 请求方式（*）
        url: "/PrendaListInfo",// 请求后台的URL（*）
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
            field : 'mode1',
            title : '质押物种类',
            formatter:function(value,row,index){
                if(value=='1'){
                    return "应收账款质押";
                }else if(value=='2'){
                    return "银行账户质押";
                }else if(value=='3'){
                    return "汽车合格证质押";
                }else if(value=='4'){
                    return "存单(折)质押";
                }else if(value=='5'){
                    return "权利凭证质押";
                }else if(value=='6'){
                    return "收费权质押";
                }else if(value=='7'){
                    return "知识产权质押";
                }else if(value=='8'){
                    return "提货单质押";
                }else if(value=='9'){
                    return "票据质押";
                }else if(value=='10'){
                    return "股份、股票质押";
                }else if(value=='11'){
                    return "仓单质押";
                }else if(value=='12'){
                    return "国债质押";
                }else if(value=='13'){
                    return "其他质押";
                }
            }
        }, {
            field : 'amount',
            title : '质押金额'
        }, {
            field : 'value',
            title : '质押物价值'
        }, {
            field : 'contractnumber',
            title : '质押合同编号'
        }, {
            field : 'signeddate',
            title : '质押合同签订日期',
            formatter:function(value,row,index){
                if (value != null) {
                    var date = new Date(parseInt(value));
                    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
                    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
                    return date.getFullYear()  + month  + currentDate;
                }
            }
        }],

        onDblClickRow : function(row) {
            //通用信息
            $("#custcod").val(row.custcod);
            $("#id").val(row.id);
            $("#line_no").val(row.line_no);
            $("#num").val(row.num);
            $("#mode1").val(row.mode1);
            $("#amountccy").val(row.amountccy);
            $("#amount").val(row.amount);
            $("#valueccy").val(row.valueccy);
            $("#value").val(row.value);
            $("#contractnumber").val(row.contractnumber);
            var signeddate = Format(row.signeddate);
            $("#signeddate").val(signeddate);
            $("#bankpledgename").val(row.bankpledgename);
            $("#bankpledgeownertype").val(row.bankpledgeownertype);
            var bankpledgeeffectivedate = Format(row.bankpledgeeffectivedate);
            $("#bankpledgeeffectivedate").val(bankpledgeeffectivedate);
            var bankpledgelastdate = Format(row.bankpledgelastdate);
            $("#bankpledgelastdate").val(bankpledgelastdate);
            //权属情况
            $("#ethnic").val(row.ethnic);
            $("#pidtypeid").val(row.pidtypeid);
            $("#pidno").val(row.pidno);
            $("#mortgagorname").val(row.mortgagorname);
            $("#contactaddress").val(row.contactaddress);
            $("#contactphone").val(row.contactphone);
            //应收账款质押
            $("#accrecproveperson").val(row.accrecproveperson);
            $("#accrecowner").val(row.accrecowner);
            $("#accrecamountccy").val(row.accrecamountccy);
            $("#accrecamount").val(row.accrecamount);
            $("#accrec_remark").val(row.accrec_remark);
            //银行账户质押
            $("#bankaccountname").val(row.bankaccountname);
            $("#bankaccounttype").val(row.bankaccounttype);
            $("#bankname").val(row.bankname);
            $("#bankaccount").val(row.bankaccount);
            $("#bankaccountccy").val(row.bankaccountccy);
            $("#bankaccountbalance").val(row.bankaccountbalance);
            $("#bankisfreezed").val(row.bankisfreezed);
            $("#bankaccountistrust").val(row.bankaccountistrust);
            $("#bankaccount_remark").val(row.bankaccount_remark);
            //汽车合格证质押
            $("#carproveperson").val(row.carproveperson);
            $("#carproduction").val(row.carproduction);
            $("#carno").val(row.carno);
            $("#carbrand").val(row.carbrand);
            $("#cartype").val(row.cartype);
            $("#carengineno").val(row.carengineno);
            $("#carchassisno").val(row.carchassisno);
            $("#carprice").val(row.carprice);
            $("#car_remark").val(row.car_remark);
            //存单（折）质押
            $("#cdname").val(row.cdname);
            $("#cdtype").val(row.cdtype);
            $("#cdno").val(row.cdno);
            $("#cdaccount").val(row.cdaccount);
            $("#cdbank").val(row.cdbank);
            $("#cdisselfbank").val(row.cdisselfbank);
            $("#cdamount").val(row.cdamount);
            $("#cdisstoppay").val(row.cdisstoppay);
            $("#cd_remark").val(row.cd_remark);
            //权利凭证质押
            $("#cerorg").val(row.cerorg);
            $("#cercustomer").val(row.cercustomer);
            $("#cerno").val(row.cerno);
            $("#ceraccount").val(row.ceraccount);
            var cereffectivedate = Format(row.cereffectivedate);
            $("#cereffectivedate").val(cereffectivedate);
            var cerlastdate = Format(row.cerlastdate);
            $("#cerlastdate").val(cerlastdate);
            $("#ceramount").val(row.ceramount);
            $("#cer_remark").val(row.cer_remark);
            //收费权质押
            $("#chargeorg").val(row.chargeorg);
            $("#chargeproject").val(row.chargeproject);
            $("#chargelicenceno").val(row.chargelicenceno);
            var chargelastdate = Format(row.chargelastdate);
            $("#chargelastdate").val(chargelastdate);
            $("#chargeregorg").val(row.chargeregorg);
            $("#charge_remark").val(row.charge_remark);
            //知识产权质押
            $("#intprotype").val(row.intprotype);
            $("#intproownername").val(row.intproownername);
            $("#intproproveorg").val(row.intproproveorg);
            $("#intpropatentnumber").val(row.intpropatentnumber);
            $("#intproregorg").val(row.intproregorg);
            var intproregdate = Format(row.intproregdate);
            $("#intproregdate").val(intproregdate);
            var intproteddate = Format(row.intproteddate);
            $("#intproteddate").val(intproteddate);
            var intproprovedate = Format(row.intproprovedate);
            $("#intproprovedate").val(intproprovedate);
            $("#intpropledgeno").val(row.intpropledgeno);
            $("#intproorg").val(row.intproorg);
            $("#intpro_remark").val(row.intpro_remark);
            //提货单质押
            $("#ladorg").val(row.ladorg);
            $("#ladno").val(row.ladno);
            $("#ladcontractno").val(row.ladcontractno);
            $("#ladcommoditycoding").val(row.ladcommoditycoding);
            $("#ladshippingunit").val(row.ladshippingunit);
            $("#ladgoods").val(row.ladgoods);
            $("#ladrule").val(row.ladrule);
            $("#ladcharacter").val(row.ladcharacter);
            $("#laddeliverynumber").val(row.laddeliverynumber);
            $("#laddeliveryaddress").val(row.laddeliveryaddress);
            $("#laddrawer").val(row.laddrawer);
            $("#lad_remark").val(row.lad_remark);
            //票据质押
            $("#notestype").val(row.notestype);
            $("#notesamount").val(row.notesno);
            $("#notesamount").val(row.notesamount);
            $("#notesbank").val(row.notesbank);
            var notessigneddate = Format(row.notessigneddate);
            $("#notessigneddate").val(notessigneddate);
            var noteslastdate = Format(row.noteslastdate);
            $("#noteslastdate").val(noteslastdate);
            $("#notesaddress").val(row.notesaddress);
            $("#notes_remark").val(row.notes_remark);
            //股份、股票质押
            $("#stockownername").val(row.stockownername);
            $("#stocknumber").val(row.stocknumber);
            $("#stockno").val(row.stockno);
            $("#stocknature").val(row.stocknature);
            $("#stockholdersname").val(row.stockholdersname);
            $("#stocksecuritiesaccountno").val(row.stocksecuritiesaccountno);
            $("#stockinstitutions").val(row.stockinstitutions);
            $("#stockregno").val(row.stockregno);
            $("#stockinvestorsaccount").val(row.stockinvestorsaccount);
            $("#stockcode").val(row.stockcode);
            $("#stockpledgeref").val(row.stockpledgeref);
            $("#stockpledgenumber").val(row.stockpledgenumber);
            var stockpledgeregdate = Format(row.stockpledgeregdate);
            $("#stockpledgeregdate").val(stockpledgeregdate);
            $("#stock_remark").val(row.stock_remark);
            //仓单质押
            $("#wrowner").val(row.wrowner);
            $("#wrorg").val(row.wrorg);
            $("#wrno").val(row.wrno);
            $("#wrname").val(row.wrname);
            $("#wrstandard").val(row.wrstandard);
            $("#wrunit").val(row.wrunit);
            $("#wrnumber").val(row.wrnumber);
            $("#wrdeliverystaff").val(row.wrdeliverystaff);
            $("#wracceptancestaff").val(row.wracceptancestaff);
            $("#wrgoodsvalue").val(row.wrgoodsvalue);
            $("#wrstoragecosts").val(row.wrstoragecosts);
            $("#wrhaveinsurance").val(row.wrhaveinsurance);
            var wrinsurancebegindate = Format(row.wrinsurancebegindate);
            $("#wrinsurancebegindate").val(wrinsurancebegindate);
            var wrinsuranceenddate = Format(row.wrinsuranceenddate);
            $("#wrinsuranceenddate").val(wrinsuranceenddate);
            $("#wr_remark").val(row.wr_remark);
            //国债质押
            $("#nd_kind").val(row.nd_kind);
            $("#nd_id").val(row.nd_id);
            $("#nd_rate").val(row.nd_rate);
            $("#nd_deadline").val(row.nd_deadline);
            $("#nd_amount").val(row.nd_amount);
            $("#nd_bank").val(row.nd_bank);
            $("#nd_begindate").val(row.nd_begindate);
            $("#nd_enddate").val(row.nd_enddate);
            $("#nd_address").val(row.nd_address);
            $("#nd_remark").val(row.nd_remark);
            //其他质押
            $("#other_name").val(row.other_name);
            $("#other_number").val(row.other_number);
            $("#other_address").val(row.other_address);
            $("#other_remark").val(row.other_remark);

            showData();
            showOwerData();
        }
    });

    $("#btn_add").click(function () {
        $.ajax({
            type: "POST",
            url: "/NewPrendaInfo",
            dataType: "json",
            async: false,
            success: function(row){
                //通用信息
                $("#id").val(row.id);
                $("#line_no").val(row.line_no);
                $("#mode1").val(row.mode1);
                $("#amountccy").val(row.amountccy);
                $("#amount").val(row.amount);
                $("#valueccy").val(row.valueccy);
                $("#value").val(row.value);
                $("#contractnumber").val(row.contractnumber);
                $("#signeddate").val(row.signeddate);
                $("#bankpledgename").val(row.bankpledgename);
                $("#bankpledgeownertype").val(row.bankpledgeownertype);
                $("#bankpledgeeffectivedate").val(row.bankpledgeeffectivedate);
                $("#bankpledgelastdate").val(row.bankpledgelastdate);
                //权属情况
                $("#ethnic").val(row.ethnic);
                $("#pidtypeid").val(row.pidtypeid);
                $("#pidno").val(row.pidno);
                $("#mortgagorname").val(row.mortgagorname);
                $("#contactaddress").val(row.contactaddress);
                $("#contactphone").val(row.contactphone);
                //应收账款质押
                $("#accrecproveperson").val(row.accrecproveperson);
                $("#accrecowner").val(row.accrecowner);
                $("#accrecamountccy").val(row.accrecamountccy);
                $("#accrecamount").val(row.accrecamount);
                $("#accrec_remark").val(row.accrec_remark);
                //银行账户质押
                $("#bankaccountname").val(row.bankaccountname);
                $("#bankaccounttype").val(row.bankaccounttype);
                $("#bankname").val(row.bankname);
                $("#bankaccount").val(row.bankaccount);
                $("#bankaccountccy").val(row.bankaccountccy);
                $("#bankaccountbalance").val(row.bankaccountbalance);
                $("#bankisfreezed").val(row.bankisfreezed);
                $("#bankaccountistrust").val(row.bankaccountistrust);
                $("#bankaccount_remark").val(row.bankaccount_remark);
                //汽车合格证质押
                $("#carproveperson").val(row.carproveperson);
                $("#carproduction").val(row.carproduction);
                $("#carno").val(row.carno);
                $("#carbrand").val(row.carbrand);
                $("#cartype").val(row.cartype);
                $("#carengineno").val(row.carengineno);
                $("#carchassisno").val(row.carchassisno);
                $("#carprice").val(row.carprice);
                $("#car_remark").val(row.car_remark);
                //存单（折）质押
                $("#cdname").val(row.cdname);
                $("#cdtype").val(row.cdtype);
                $("#cdno").val(row.cdno);
                $("#cdaccount").val(row.cdaccount);
                $("#cdbank").val(row.cdbank);
                $("#cdisselfbank").val(row.cdisselfbank);
                $("#cdamount").val(row.cdamount);
                $("#cdisstoppay").val(row.cdisstoppay);
                $("#cd_remark").val(row.cd_remark);
                //权利凭证质押
                $("#cerorg").val(row.cerorg);
                $("#cercustomer").val(row.cercustomer);
                $("#cerno").val(row.cerno);
                $("#ceraccount").val(row.ceraccount);
                $("#cereffectivedate").val(row.cereffectivedate);
                $("#cerlastdate").val(row.cerlastdate);
                $("#ceramount").val(row.ceramount);
                $("#cer_remark").val(row.cer_remark);
                //收费权质押
                $("#chargeorg").val(row.chargeorg);
                $("#chargeproject").val(row.chargeproject);
                $("#chargelicenceno").val(row.chargelicenceno);
                $("#chargelastdate").val(row.chargelastdate);
                $("#chargeregorg").val(row.chargeregorg);
                $("#charge_remark").val(row.charge_remark);
                //知识产权质押
                $("#intprotype").val(row.intprotype);
                $("#intproownername").val(row.intproownername);
                $("#intproproveorg").val(row.intproproveorg);
                $("#intpropatentnumber").val(row.intpropatentnumber);
                $("#intproregorg").val(row.intproregorg);
                $("#intproregdate").val(row.intproregdate);
                $("#intproteddate").val(row.intproteddate);
                $("#intproprovedate").val(row.intproprovedate);
                $("#intpropledgeno").val(row.intpropledgeno);
                $("#intproorg").val(row.intproorg);
                $("#intpro_remark").val(row.intpro_remark);
                //提货单质押
                $("#ladorg").val(row.ladorg);
                $("#ladno").val(row.ladno);
                $("#ladcontractno").val(row.ladcontractno);
                $("#ladcommoditycoding").val(row.ladcommoditycoding);
                $("#ladshippingunit").val(row.ladshippingunit);
                $("#ladgoods").val(row.ladgoods);
                $("#ladrule").val(row.ladrule);
                $("#ladcharacter").val(row.ladcharacter);
                $("#laddeliverynumber").val(row.laddeliverynumber);
                $("#laddeliveryaddress").val(row.laddeliveryaddress);
                $("#laddrawer").val(row.laddrawer);
                $("#lad_remark").val(row.lad_remark);
                //票据质押
                $("#notestype").val(row.notestype);
                $("#notesamount").val(row.notesno);
                $("#notesamount").val(row.notesamount);
                $("#notesbank").val(row.notesbank);
                $("#notessigneddate").val(row.notessigneddate);
                $("#noteslastdate").val(row.noteslastdate);
                $("#notesaddress").val(row.notesaddress);
                $("#notes_remark").val(row.notes_remark);
                //股份、股票质押
                $("#stockownername").val(row.stockownername);
                $("#stocknumber").val(row.stocknumber);
                $("#stockno").val(row.stockno);
                $("#stocknature").val(row.stocknature);
                $("#stockholdersname").val(row.stockholdersname);
                $("#stocksecuritiesaccountno").val(row.stocksecuritiesaccountno);
                $("#stockinstitutions").val(row.stockinstitutions);
                $("#stockregno").val(row.stockregno);
                $("#stockinvestorsaccount").val(row.stockinvestorsaccount);
                $("#stockcode").val(row.stockcode);
                $("#stockpledgeref").val(row.stockpledgeref);
                $("#stockpledgenumber").val(row.stockpledgenumber);
                $("#stockpledgeregdate").val(row.stockpledgeregdate);
                $("#stock_remark").val(row.stock_remark);
                //仓单质押
                $("#wrowner").val(row.wrowner);
                $("#wrorg").val(row.wrorg);
                $("#wrno").val(row.wrno);
                $("#wrname").val(row.wrname);
                $("#wrstandard").val(row.wrstandard);
                $("#wrunit").val(row.wrunit);
                $("#wrnumber").val(row.wrnumber);
                $("#wrdeliverystaff").val(row.wrdeliverystaff);
                $("#wracceptancestaff").val(row.wracceptancestaff);
                $("#wrgoodsvalue").val(row.wrgoodsvalue);
                $("#wrstoragecosts").val(row.wrstoragecosts);
                $("#wrhaveinsurance").val(row.wrhaveinsurance);
                $("#wrinsurancebegindate").val(row.wrinsurancebegindate);
                $("#wrinsuranceenddate").val(row.wrinsuranceenddate);
                $("#wr_remark").val(row.wr_remark);
                //国债质押
                $("#nd_kind").val(row.nd_kind);
                $("#nd_id").val(row.nd_id);
                $("#nd_rate").val(row.nd_rate);
                $("#nd_deadline").val(row.nd_deadline);
                $("#nd_amount").val(row.nd_amount);
                $("#nd_bank").val(row.nd_bank);
                $("#nd_begindate").val(row.nd_begindate);
                $("#nd_enddate").val(row.nd_enddate);
                $("#nd_address").val(row.nd_address);
                $("#nd_remark").val(row.nd_remark);
                //其他质押
                $("#other_name").val(row.other_name);
                $("#other_number").val(row.other_number);
                $("#other_address").val(row.other_address);
                $("#other_remark").val(row.other_remark);

                showData();
                showOwerData();
            }
        });
    });

    $('#signeddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#bankpledgeeffectivedate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });
    $('#bankpledgelastdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });
    $('#cereffectivedate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#cerlastdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#notessigneddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#noteslastdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#wrinsurancebegindate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#wrinsuranceenddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#stockpledgeregdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#intproregdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#intproteddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#intproprovedate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#chargelastdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#nd_begindate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#nd_enddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

});