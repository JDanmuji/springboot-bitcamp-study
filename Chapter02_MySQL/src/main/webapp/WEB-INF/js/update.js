//등록
$(document).ready(function(){

	$("#updateDiv").hide(); 
	
});


$('#searchIdBtn').on("click", function() {
	$("#updateDiv").hide(); 
	$('#resultDiv').empty();
 	
 	if(!$('#searchId').val()) {
 		alert("아이디를 입력하세요");
    	return;
 	} 
 	
   	$.ajax({
       	type: 'post',
       	url : '/user/getUser',
       	data: {
       		'searchId' : $('#searchId').val()
       },
       	dataType: 'json',
       	success : function(data) {
       		
       		$('#name').val(data.name);
       		$('#id').val(data.id);
       		$('#pwd').val(data.pwd);
       		
       		$("#updateDiv").show(); 
       		
       		 
       	},
       	error : function(err) {
       		$('#resultDiv').text("찾고자 하는 아이디가 없습니다.");
       		
       	}
    });



});



$('#updateBtn').on("click", function() {
	$('#nameDiv').empty();
	$('#pwdDiv').empty();

	if(!$('#name').val()) {
		$('#nameDiv').text('name넣으삼');
		$('#name').focus();
		return;
	}

	if(!$('#pwd').val()) {
		$('#pwdDiv').text('pwd넣으삼');
		$('#pwd').focus();
		return;
	}

	$.ajax({
		type: 'post',
		url : '/user/update',
		data: $('#updateForm').serialize(),
		success : function() {
			alert("회원정보수정이 완료되었습니다!");
			location.href="/user/list";
		},
		error : function(err) {
			console.log(err);

		}
	});



});


$('#resetBtn').on("click", function() {

	$('#searchIdBtn').trigger('click');

});


