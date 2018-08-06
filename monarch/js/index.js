     //全屏
        function fullScreen(){
            var el = document.documentElement;
            var rfs = el.requestFullScreen || el.webkitRequestFullScreen || el.mozRequestFullScreen || el.msRequestFullscreen;      
                if(typeof rfs != "undefined" && rfs) {
                    rfs.call(el);
                };

              return;
        }
        //退出全屏
        function exitScreen(){
            if (document.exitFullscreen) {  
                document.exitFullscreen();  
            }  
            else if (document.mozCancelFullScreen) {  
                document.mozCancelFullScreen();  
            }  
            else if (document.webkitCancelFullScreen) {  
                document.webkitCancelFullScreen();  
            }  
            else if (document.msExitFullscreen) {  
                document.msExitFullscreen();  
            } 
            if(typeof cfs != "undefined" && cfs) {
                cfs.call(el);
            }

            
        }
        //ie低版本的全屏，退出全屏都这个方法
        function iefull(){
            var el = document.documentElement;
            var rfs =  el.msRequestFullScreen;
            if(typeof window.ActiveXObject != "undefined") {
                //这的方法 模拟f11键，使浏览器全屏
                var wscript = new ActiveXObject("WScript.Shell");
                if(wscript != null) {
                    wscript.SendKeys("{F11}");
                }
            }

        }


        //判断是否是全屏
		    function checkFull() {
		      		 //监听状态变化
      				  if (window.addEventListener) {
				        document.addEventListener('fullscreenchange', function(){ 
				          if($("#fullscreen span").text() == "开启全屏"){
				            $("#fullscreen span").text("退出全屏");
				          }else{
				           $("#fullscreen span").text("开启全屏");
				          		 //监听 ESC键盘事件
								$(document).keyup(function(event) {
									switch(event.keyCode) {
									case 27:
											screentotal++;
											return;
									}
								});
				          }
				        });
				        document.addEventListener('webkitfullscreenchange', function(){ 
				          if($("#fullscreen span").text() == "开启全屏"){
				            $("#fullscreen span").text("退出全屏");
				          }else{
				            $("#fullscreen span").text("开启全屏");
				             //监听 ESC键盘事件
								$(document).keyup(function(event) {
									switch(event.keyCode) {
									case 27:
											screentotal++;
											return;
									}
								});
				          }
				        });
				        document.addEventListener('mozfullscreenchange', function(){ 
				          if($("#fullscreen span").text() == "开启全屏"){
				            $("#fullscreen span").text("退出全屏"); 
				          }else{
				            $("#fullscreen span").text("开启全屏");
				             //监听 ESC键盘事件
								$(document).keyup(function(event) {
									switch(event.keyCode) {
									case 27:
											screentotal++;
											return;
									}
								});
				          }
				        });
				        document.addEventListener('MSFullscreenChange', function(){ 
				          if($("#fullscreen span").text() == "开启全屏"){
				            $("#fullscreen span").text("退出全屏");
				          }else{
				           $("#fullscreen span").text("开启全屏");
				            //监听 ESC键盘事件
								$(document).keyup(function(event) {
									switch(event.keyCode) {
									case 27:
											screentotal++;
											return;
									}
								});
				          }
				        });
				      }
		    }
        
      				   checkFull();
				// 		fullScreen
				var screentotal=2;
				$("#fullscreen").on("click",function(){
					if(screentotal%2==0){
						fullScreen();
						screentotal++;
					}else{
						exitScreen();
				        screentotal++;
					}
				});


//回到顶部 功能
    $(window).scroll(function(){
                if ($(window).scrollTop()>30){
                    $("#goup").fadeIn(1000);
                }
                else
                {
                    $("#goup").fadeOut(1000);
                }
            });

            //当点击跳转链接后，回到页面顶部位置

            $("#goup").click(function(){
                $('body,html').animate({scrollTop:0},1000);
                return false;
            });

//下拉隐藏菜单
$("#xl").on("click",function(){
	$(".scollmode").slideToggle(1000);
});

//点击隐藏聊天好友列表
 $(".fa.fa-chevron-down").click(function(){
  $(this).parent().next().slideToggle("slow");
  });


//聊天滑动效果
$("#chat").on("click",function(){
	$("#right-sidebar").fadeToggle(1000);
	
});


//中间jquery-table配置
     $('#example').dataTable( {
//   	 "dom": '<"top"fl>rt<"bottom"pi><"clear">',
//		 "dom": 'lfrtip',
         "scrollY": 200,
         "scrollX": 200,
         "scrollCollapse": true,
   		 "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示  
//      "bServerSide" : true, //是否启动服务器端数据导入  
//      "bStateSave" : true, //是否打开客户端状态记录功能,此功能在ajax刷新纪录的时候不会将个性化设定回复为初始化状态  
//      "bJQueryUI" : true, //是否使用 jQury的UI theme  
//      "sScrollY" : 450, //DataTables的高  
//      "sScrollX" : 820, //DataTables的宽  
        "aLengthMenu" : [8, 16, 24], //更改显示记录数选项  
        "iDisplayLength" : 8, //默认显示的记录数  
        "bAutoWidth" : false, //是否自适应宽度  
        //"bScrollInfinite" : false, //是否启动初始化滚动条  
        "bScrollCollapse" : true, //是否开启DataTables的高度自适应，当数据条数不够分页数据条数的时候，插件高度是否随数据条数而改变  
        "bPaginate" : true, //是否显示（应用）分页器  
        "bInfo" : true, //是否显示页脚信息，DataTables插件左下角显示记录数  
        "sPaginationType" : "full_numbers", //详细分页组，可以支持直接跳转到某页  
        "bSort" : true, //是否启动各个字段的排序功能  
//      "aaSorting" : [[1, "asc"]], //默认的排序方式，第2列，升序排列  
        "bFilter" : true, //是否启动过滤、搜索功能  
        "language": { 
		     	"sProcessing" : "正在获取数据，请稍后...",
		        "sLengthMenu" : "显示 _MENU_ 条",    
		        "sZeroRecords" : "没有您要搜索的内容",    
		        "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",    
		        "sInfoEmpty" : "记录数为0",    
		        "sInfoFiltered" : "(全部记录数 _MAX_ 条)",    
		        "sInfoPostFix" : "",    
		        "sSearch" : "搜索",    
		        "sUrl" : "",    
		        "oPaginate": {    
		            "sFirst" : "第一页",    
		            "sPrevious" : "上一页",    
		            "sNext" : "下一页",    
		            "sLast" : "最后一页"    
		        } 
 		},
 		//打印组件
// 		"buttons": {
// 				name: 'primary',
//      		buttons: [ 'copy', 'csv', 'excel','pdf' ]
//  	},
//  	"dom": 'B<"clear">lfrtip',
    	//列固定插件
// 		"fixedColumns": true,
    	//响应式
//  	"responsive": true,
    	//动态获取ajax数据
//  		"serverSide": true,
			"ajax": {
				url:  "demo.txt" ,//请求的url
//				method: "POST",
//				data: {//请求的参数
//					lareName: $('#lareName').val(),
//					keyWord: $('#keyWord').val(),
//					issUnitName: $('#issUnitName').val(),
//					repStat: $('#repStat').val(),
//					veriStat: $('#veriStat').val(),
//					startDate: $('#startDate').val(),
//					endDate: $('#endDate').val(),
//				},
			},
			"columns": [
                {"data": "name"},
                {"data": "hr.position"},
                {"data": "contact.0"},
                {"data": "contact.1"},
                {"data": "hr.start_date"},
                {"data": "hr.salary"}
            	],
        	"createdRow": function( row, data, dataIndex ) {
            if(data.hr.position.length > 10){//只有超长，才有td点击事件
                $(row).children('td').eq(1).attr('onclick','javascript:changeShowRemarks(this);');
	            }
	            $(row).children('td').eq(1).attr('content',data.hr.position);
	        	},
            "columnDefs" : [
                {
                    "type": "date",
                    "targets": 1,
                    "render": function (data, type, full, meta) {
                        if (full.hr.position.length  > 10) {
                            return getPartialRemarksHtml(full.hr.position);//显示部分信息
                        } else {
                            return full.hr.position;//显示原始全部信息            }
                        }
                    }
                }
            ],
     });
    //切换显示备注信息，显示部分或者全部
    function changeShowRemarks(obj){//obj是td
        var content = $(obj).attr("content");
        if(content != null && content != ''){
            if($(obj).attr("isDetail") == 'true'){//当前显示的是详细备注，切换到显示部分
                //$(obj).removeAttr('isDetail');//remove也可以
                $(obj).attr('isDetail',false);
                $(obj).html(getPartialRemarksHtml(content));
            }else{//当前显示的是部分备注信息，切换到显示全部
                $(obj).attr('isDetail',true);
                $(obj).html(getTotalRemarksHtml(content));
            }
        }
    }
    //部分备注信息
    function getPartialRemarksHtml(remarks){
        return remarks.substr(0,10) + '&nbsp;&nbsp;<a href="javascript:void(0);" ><b>更多</b></a>';
    }

    //全部备注信息
    function getTotalRemarksHtml(remarks){
        return remarks + '&nbsp;&nbsp;<a href="javascript:void(0);" >收起</a>';
    }











































