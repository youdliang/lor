function Format(value){
    if (value != null) {
        var date = new Date(parseInt(value));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        return date.getFullYear()  + month  + currentDate;
    }
}

$(function() {

    $('#a_shifang').hide();

    //模态框信息发生改变
    $('#a_baocun').click(function () {
        var custcod = $('#custcod').val();
        var lineno = $('#lineno').val();
        //原有余额、可用金额、冻结金额、释放金额
        var osamtNew = $('#osamtNew').val();
        var avliamtNew = $('#avliamtNew').val();
        var holdamtNew = $('#holdamtNew').val();
        var releaseamt = $('#releaseamt').val();
        //新余额
        $('#osamtNew').val(osamtNew-releaseamt);
        var osamt =  $('#osamtNew').val();
        //新可用金额
        $('#avliamtNew').val(osamt-holdamtNew);
        var avliamt =$('#avliamtNew').val();

        $('#osamtNew').attr("disabled",false);
        $('#avliamtNew').attr("disabled",false);

        $.ajax({
            type: "POST",
            url: "/updateFacilityInfo",
            dataType: "json",
            data: {custcod : custcod,lineno : lineno,
                releaseamt : releaseamt,osamt : osamt,avliamt : avliamt},
            async: false,
            success: function(result){
                $('#FacilityTable').bootstrapTable("refresh",{
                    silent : true
                });
                alert(result.message);
            },
            error : function (result) {
                alert(result.message);
            }
        });

    });

    $('#lineamt').change(function () {
        //额度金额
        var lineamt = $('#lineamt').val();
        //余额
        $('#osamt').val(lineamt);
        //可用金额
        $('#avliamt').val(lineamt);
    });

    $('#btn_submit').click(function () {
        $("[name='lineno']").attr("disabled",false);
        $('#linestatus').attr("disabled",false);
        $('#usedamt').attr("disabled",false);
        $('#osamt').attr("disabled",false);
        $('#holdamt').attr("disabled",false);
        $('#avliamt').attr("disabled",false);
    });

    $('#btn_delete').click(function () {
        var custcod = $('#custcod').val();
        var lineno = $('#lineno').val();

            $.ajax({
                type: "POST",
                url: "/deleteFacilityInfo",
                dataType: "json",
                data: {custcod : custcod,lineno : lineno},
                async: false,
                success: function(result){
                    $('#FacilityTable').bootstrapTable("refresh",{
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

    $("#FacilityTable").bootstrapTable({
        method : "post",// 请求方式（*）
        url: "/FacilityListInfo",// 请求后台的URL（*）
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
            field : 'prodtype',
            title : '贷款类型',
            formatter:function(value,row,index){
                if(value=='1'){
                    return "直接融资租赁";
                }else if(value=='2'){
                    return "回租融资租赁";
                }
            }
        }, {
            field : 'lineno',
            title : '额度号'
        }, {
            field : 'linedesc',
            title : '额度描述'
        }, {
            field : 'linegrade',
            title : '额度等级',
            formatter:function(value,row,index){
                if(value=='1'){
                    return "正常";
                }else if(value=='2'){
                    return "关注";
                }else if(value=='3'){
                    return "次级";
                }else if(value=='4'){
                    return "可疑";
                }else if(value=='5'){
                    return "损失";
                }else if(value=='9'){
                    return "未知";
                }
            }
        }, {
            field : 'linestatus',
            title : '额度状况',
            formatter:function(value,row,index){
                if(value=='1'){
                    return "等候";
                }else if(value=='2'){
                    return "正常";
                }
            }
        }, {
            field : 'lineamt',
            title : '额度金额'
        }, {
            field: 'osamt',
            title: '余额'
        }, {
            field: 'holdamt',
            title: '冻结金额'
        }, {
            field: 'usedamt',
            title: '已用额度'
        }, {
            field: 'avliamt',
            title: '可用额度'
        }],

        onClickRow : function(row) {
            //通用信息
            $('#a_shifang').show();

            $("[name='haveloan']").attr("checked",false);
            $("[name='haveacceptance']").attr("checked",false);
            $("[name='havelg']").attr("checked",false);
            $("[name='havelc']").attr("checked",false);
            $("[name='haveotherloan']").attr("checked",false);

            if(row.haveloan=='1'){
                $("[name='haveloan']").attr("checked",true);
            }
            if(row.haveacceptance=='1'){
                $("[name='haveacceptance']").attr("checked",true);
            }
            if(row.havelg=='1'){
                $("[name='havelg']").attr("checked",true);
            }
            if(row.havelc=='1'){
                $("[name='havelc']").attr("checked",true);
            }
            if(row.haveotherloan=='1'){
                $("[name='haveotherloan']").attr("checked",true);
            }

            //模态框数据赋值
            $("#linenoNew").val(row.lineno);
            $("#linedescNew").val(row.linedesc);
            $("#linegradeNew").val(row.linegrade);
            $("#linestatusNew").val(row.linestatus);
            $("#lineccyNew").val(row.lineccy);
            $("#lineamtNew").val(row.lineamt);
            $("#usedamtNew").val(row.usedamt);
            $("#osamtNew").val(row.osamt);
            $("#holdamtNew").val(row.holdamt);
            $("#avliamtNew").val(row.avliamt);
            $("#releaseamt").val(row.avliamt);

            //form表单赋值
            $("#custcod").val(row.custcod);
            $("#prodtype").val(row.prodtype);
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
            $("#appflag").val(row.appflag);
        }
    });

    $("#btn_add").click(function () {

        $('#a_shifang').hide();

        var custcod = $('#custcod').val();
        $.ajax({
            type: "POST",
            url: "/NewFacilityInfo",
            data: {custcod : custcod},
            dataType: "json",
            async: false,
            success: function(row){
                //通用信息
                $("[name='haveloan']").attr("checked",false);
                $("[name='haveacceptance']").attr("checked",false);
                $("[name='havelg']").attr("checked",false);
                $("[name='havelc']").attr("checked",false);
                $("[name='haveotherloan']").attr("checked",false);
                $("#prodtype").val(row.prodtype);
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
                $("#docflag").val(row.docflag);
                $("#createdate").val(row.createdate);
                $("#revolflag").val(row.revolflag);
                $("#expirydate").val(row.expirydate);
                $("#countryrisk").val(row.countryrisk);
                $("#remark").val(row.remark);
                $("#appflag").val(row.appflag);
            }
        });
    });

    $('#createdate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

    $('#expirydate').datepicker({
        format: 'yyyymmdd',
        weekStart: 1,
        autoclose: true,
        todayBtn: 'linked',
        language: 'zh-CN'
    }).on('changeDate',function(ev){

    });

});