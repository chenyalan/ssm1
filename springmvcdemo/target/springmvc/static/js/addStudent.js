/**
 * Created by 陈亚兰 on 2017/7/14.
 */

$(document).ready(function () {
    var formParam=$("form").serialize();//序列化表格内容为字符串
    console.log(formParam)
    $("#sub").click(function () {
       $.ajax({
           url:'http://localhost:8080/student/add.do',
           data:formParam,
           type:'post',
           cache:false,
           dataType:'html'
           // success:function (data) {
           //     alert("陈公公")
           // },
           // error:function () {
           //     alert("一场")
           // }
       })
    })

})