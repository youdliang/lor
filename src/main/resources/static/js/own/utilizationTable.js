function Format(value){
    if (value != null) {
        var date = new Date(parseInt(value));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        return date.getFullYear()  + month  + currentDate;
    }
}

$(function() {

    $('#lineno').change(function () {
        var lineno = $('#lineno').val();
        var custcod = $('#custcod').val();
        $('#linedesc').val("");
        $('#lineccy').val("");
        $('#lineamt').val("");
        $('#avliamt').val("");
        $.ajax({
            type: "POST",
            url: "/getFacilityInfo",
            dataType: "json",
            data: {lineno : lineno,custcod : custcod},
            async: false,
            success: function(result){
                $('#linedesc').val(result.linedesc);
                $('#lineccy').val(result.lineccy);
                $('#lineamt').val(result.lineamt);
                $('#avliamt').val(result.avliamt);
            }
        });

    });
    //根据放款币种类型查询出利率类型
    $('#drawccy').change(function () {
        var drawccy = $('#drawccy').val();
        $('#ratetype').empty();
        $.ajax({
            type: "POST",
            url: "/getliLvLeiXingInfo",
            dataType: "json",
            data: {drawccy : drawccy},
            async: false,
            success: function(result){
                $("#ratetype").append("<option value="+""+">"+"-"+"</option>");
                $.each(result, function(key, val) {
                    $("#ratetype").append("<option value="+val.RATETYP+">"+val.RATETYP+" - "+val.INTRTPA+"</option>");
                });
            }
        });

    });
    //根据利率类型的变化赋值年利率
    $('#ratetype').change(function () {
        var drawccy = $('#drawccy').val();
        var ratetype = $('#ratetype').val();
        $('#rate').val("");
        $.ajax({
            type: "POST",
            url: "/getnianliLvLeiInfo",
            dataType: "json",
            data: {drawccy : drawccy,ratetype : ratetype},
            async: false,
            success: function(result){
                $('#rate').val(result);
            }
        });
    });
    //根据利率调幅百分比变化计算出调整后年利率
    $('#percent').change(function () {
        $('#schemarate').val("");
        //年利率
        var rate = $('#rate').val();
        //利率调幅百分比
        var percent = $('#percent').val();
        //调整后年利率
        $('#schemarate').val(rate*(1+percent/100));
    });
    //根据客户经理代码查询出名称
    $('#btn_query').click(function () {
        $('#accofname').val("");
        var accoffic = $('#accoffic').val();
        $.ajax({
            type: "POST",
            url: "/getJingLiMingChenInfo",
            dataType: "text",
            data: {accoffic : accoffic},
            async: false,
            success: function(result){
                $('#accofname').val(result);
            },error : function () {
                alert("错误");
            }
        });

    });

    $('#dircflag1').change(function () {
        $('#dircflag2').empty();
        $('#dircflag3').empty();
        $('#dircflag4').empty();
        var dircflag1 = $('#dircflag1').val();
        $.ajax({
            type: "POST",
            url: "/getDaleiInfo",
            dataType: "json",
            data: {dircflag1 : dircflag1},
            async: false,
            success: function(result){
                $("#dircflag2").append("<option value="+""+">"+"-"+"</option>");
                $.each(result, function(key, val) {
                    $("#dircflag2").append("<option value="+val.DALEI+">"+val.LEIBIEMINGCHENG+"</option>");
                });
            }
        });

    });

    $('#dircflag2').change(function () {
        $('#dircflag3').empty();
        $('#dircflag4').empty();
        var dircflag1 = $('#dircflag1').val();
        var dircflag2 = $('#dircflag2').val();
        $.ajax({
            type: "POST",
            url: "/getZhongleiInfo",
            dataType: "json",
            data: {dircflag1 : dircflag1,dircflag2 : dircflag2},
            async: false,
            success: function(result){
                $("#dircflag3").append("<option value="+""+">"+"-"+"</option>");
                $.each(result, function(key, val) {
                    $("#dircflag3").append("<option value="+val.ZHONGLEI+">"+val.LEIBIEMINGCHENG+"</option>");
                });
            }
        });

    });

    $('#dircflag3').change(function () {
        $('#dircflag4').empty();
        var dircflag1 = $('#dircflag1').val();
        var dircflag2 = $('#dircflag2').val();
        var dircflag3 = $('#dircflag3').val();
        $.ajax({
            type: "POST",
            url: "/getXiaoleiInfo",
            dataType: "json",
            data: {dircflag1 : dircflag1,dircflag2 : dircflag2,dircflag3 : dircflag3},
            async: false,
            success: function(result){
                $("#dircflag4").append("<option value="+""+">"+"-"+"</option>");
                $.each(result, function(key, val) {
                    $("#dircflag4").append("<option value="+val.XIAOLEI+">"+val.LEIBIEMINGCHENG+"</option>");
                });
            }
        });

    });

    $('#btn_submit').click(function () {
        $('#loanref').attr("disabled",false);
        $('#linedesc').attr("disabled",false);
        $('#lineccy').attr("disabled",false);
        $('#lineamt').attr("disabled",false);
        $('#avliamt').attr("disabled",false);
        $('#rate').attr("disabled",false);
        $('#schemarate').attr("disabled",false);
    });

    $('#btn_delete').click(function () {
        var custcod = $('#custcod').val();
        var lineno = $('#lineno').val();
        var loanref = $('#loanref').val();
            $.ajax({
                type: "POST",
                url: "/deleteUtilizationInfo",
                dataType: "json",
                data: {custcod : custcod,lineno : lineno,loanref :loanref},
                async: false,
                success: function(result){
                    $('#UtilizationTable').bootstrapTable("refresh",{
                        silent : true
                    });
                    alert(result.message);
                    $('#btn_add').trigger("click");
                },
                error : function (result) {
                    alert(result.message);
                }
            });

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

    $("#UtilizationTable").bootstrapTable({
        method : "post",// 请求方式（*）
        url: "/UtilizationListInfo",// 请求后台的URL（*）
        queryParams : queryParams,// 传递参数（*)
        uniqueId : "lineno",// 唯一标识
        sidePagination : 'client',// 分页方式：client客户端分页，server服务端分页（*）
        sortName : "lineno",// 排序字段
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
            field : 'loanref',
            title : '贷款编号'
        }, {
            field : 'lineno',
            title : '额度号'
        }, {
            field : 'drawdate',
            title : '放款日期',
            formatter:function(value,row,index){
                if (value != null) {
                    var date = new Date(parseInt(value));
                    var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
                    var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
                    return date.getFullYear()  + month  + currentDate;
                }
            }
        }, {
            field : 'drawccy',
            title : '放款币种'
        }, {
            field : 'drawamt',
            title : '放款金额'
        }, {
            field : 'schemarate',
            title : '月利率(%)'
        }, {
            field: 'tenor',
            title: '期数'
        }],

        onClickRow : function(row) {
            //通用信息
            $("#custcod").val(row.custcod);
            $("#prodtype").val(row.prodtype);
            $("#HaveLoan").val(row.HaveLoan);
            $("#HaveAcceptance").val(row.HaveAcceptance);
            $("#HaveLG").val(row.HaveLG);
            $("#HaveLC").val(row.HaveLC);
            $("#HaveOtherLoan").val(row.HaveOtherLoan);
            $("#lineno").val(row.lineno);
            $("#linedesc").val(row.linedesc);
            $("#linegrade").val(row.linegrade);
            $("#linestatus").val(row.linestatus);
            $("#lineccy").val(row.lineccy);
            $("#lineamt").val(row.lineamt);
            $("#usedamt").val(row.usedamt);
            $("#osamt").val(row.osamt);
            $("#holdamt").val(row.holdamt);
            $("#avliamt").val(row.avliamt);
            $("#bondflag").val(row.bondflag);
            $("#docflag").val($.trim(row.docflag));
            var createdate = Format(row.createdate);
            $("#createdate").val(createdate);
            $("#revolflag").val(row.revolflag);
            var expirydate = Format(row.expirydate);
            $("#expirydate").val(expirydate);
            $("#countryrisk").val($.trim(row.countryrisk));
            $("#remark").val(row.remark);
        }
    });

    $("#btn_add").click(function () {
        var custcod = $('#custcod').val();
        $.ajax({
            type: "POST",
            url: "/NewUtilizationInfo",
            data: {custcod : custcod},
            dataType: "json",
            async: false,
            success: function(row){
                //通用信息
                $("#loanref").val(row.loanref);
                $("#lineno").val(row.lineno);
                $("#linedesc").val(row.linedesc);
                $("#lineccy").val(row.lineccy);
                $("#lineamt").val(row.lineamt);
                $("#avliamt").val(row.avliamt);
                $("#drawdate").val(row.drawdate);
                $("#anndate").val(row.anndate);
                $("#schetype").val(row.schetype);
                $("#drawccy").val(row.drawccy);
                $("#drawamt").val(row.drawamt);
                $("#ratetype").val(row.ratetype);
                $("#rate").val(row.rate);
                $("#spread").val(row.spread);
                $("#percent").val(row.percent);
                $("#schemarate").val(row.schemarate);
                $("#overdurate").val(row.overdurate);
                $("#paymentmethod").val(row.paymentmethod);
                $("#tenor").val(row.tenor);
                $("#fixflag").val(row.fixflag);
                $("#payfreq").val(row.payfreq);
                $("#payper").val(row.payper);
                $("#firstpaydate").val(row.firstpaydate);
                $("#collflag").val(row.collflag);
                $("#docflag").val(row.docflag);
                $("#dircflag1").val(row.dircflag1);
                $("#dircflag2").val(row.dircflag2);
                $("#dircflag3").val(row.dircflag3);
                $("#dircflag4").val(row.dircflag4);
                $("#dircdesc").val(row.dircdesc);
                $("#marginamt").val(row.marginamt);
                $("#chgtype").val(row.chgtype);
                $("#chgamt").val(row.chgamt);
                $("#chgdate").val(row.chgdate);
                $("#accoffic").val(row.accoffic);
                $("#accofname").val(row.accofname);
                $("#contractsymbol").val(row.contractsymbol);
                $("#signeddate").val(row.signeddate);
                $("#inaccname").val(row.inaccname);
                $("#inaccno").val(row.inaccno);
                $("#outacname").val(row.outacname);
                $("#outaccno").val(row.outaccno);
            }
        });
    });

    $('#drawdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#anndate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#firstpaydate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#chgdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#signeddate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

});