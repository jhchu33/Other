<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
 <head>
 <script src='https://cdn.bootcss.com/jquery/3.2.1/jquery.js'></script>
 <script type="text/javascript">
 
 $(function(){
	 
  loadJson();
 });

 
 function loadJson(num){
	
      var head=$("#record").val();
      head=parseInt(head)+2;
      $("#record").val(head);
	   var links = "/listdemo/customer/nextlist/" + head;
  $.ajax({
	 
   url: links,
   type: "POST",
   dataType: "json",
   async: false,
   success: function(json){
	   console.log(json)  
    $.each(json,function(index,item){
     var id = item.id;
     var name = item.name;
     var sex = item.sex;
     var age = item.age;
     var address = item.address;  //这里对应json里的每项数据
     $("#records").before(
      "<tr><th>" 
       + id+"</th><th>"
       + "</th><th>"+ name +"</th><th>"+"</th><th>"+sex+"</th><th>"+ age +"</th><th>"+ address +"</tr></th>");
    }); 
   }
  });
 }
</script>
 </head>
 <body>
 <input  hidden id="record" value="-1"></input>
 <table id="records" border="1" cellpadding="10" cellspacing="0"></table>
  <button type="button" onclick="loadJson()">查询5条记录</button>
 </body>
</html>

