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
























































