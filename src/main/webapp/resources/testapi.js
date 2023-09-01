$(function() {		// << 이렇게 jquery 3.0 식으로 줄여쓰기. 대신 맨 아래 닫는 괄호들 주의.			
	var xhr = new XMLHttpRequest();	
				
	//jqeury : 선택한 요소에 이벤트 핸들러 추가
	
	// 아래 jquery 문은 다시 아래아래껄로 더 줄일 수 있음.					
	//$("#cat1").on("click", function() {	
	
	//아래 두번째 버튼 처리한거랑 비교 해보시오.. 방식을 다르게 처리 했음.				
	$("#cat1").click(function() {				
		$.get("/api/catOne", function(data) {	// todo: 컨텍스트 패스에 맞춰 수정할 것

		// * 주의 * 기존 xhr.open.. 식에서 jqeury $.get 문법으로 바꾼 경우 이 코드 처리를 해야 에러가 안남.
		var x = JSON.stringify(data);
					
		var jo = JSON.parse(x);			
		$("#cat1_area").text("이름:" + jo.name + " 나이:" + jo.age);			
		});			
	});
					
	//$("#cat2").on("click", function() {	
	// $("#cat2").click(function() {				
	// 	xhr.open('GET', '/api/catTwo'); // HTTP 메서드와 요청 URL 설정. todo: 컨텍스트 패스에 맞춰 수정할 것			
	// 	xhr.send(); // 요청 보내기			
	// 	xhr.onload = function() {			
	// 		if (xhr.status === 200) { // 응답 상태 확인		
	// 			var j = xhr.responseText;	
	// 			var jo = JSON.parse(j)	
	// 			$("#cat2_area").text("이름:"+jo.name+" 나이:"+jo.age);	
	// 		} else {		
	// 			console.error(xhr.statusText); // 오류 메시지 출력	
	// 		}		
	// 	};			
	// });	
	$("#cat2").click(function () {						
		$.ajax({					
			url: "/api/catTwo",				
			method: "GET",				
			dataType: "json",				
			success: function(response) {				
				$("#cat2_area").text("이름:" + response.name + " 나이:" + response.age);			
			},				
			error: function(xhr, status, error) {				
				console.error(error);			
			}				
		});					
	});						
	
	
//	} 대신				
});	// 이렇게 마무리 해야되는거 주의.				
//window.onload=function(){
// 	var cat1_area = document.getElementById("cat1_area");
// 	var cat2_area = document.getElementById("cat2_area");
// 	var xhr = new XMLHttpRequest();				
// 	var a = document.getElementById("cat1");				
// 	a.addEventListener("click", function() {				
// 		xhr.open('GET', '/api/catOne'); // HTTP 메서드와 요청 URL 설정. todo: 현 컨텍스트path에 맞춰 수정할 것			
// 		xhr.send(); // 요청 보내기			
// 		xhr.onload = function() {			
// 			if (xhr.status === 200) { // 응답 상태 확인		
// 				console.log(xhr.responseText); // 응답 데이터 출력	
// 				alert(xhr.responseText);
// 				cat1_area.innerHTML = xhr.responseText;	
// 			} else {		
// 				console.error(xhr.statusText); // 오류 메시지 출력	
// 			}		
// 		};			
// 	});				
// 	var b = document.getElementById("cat2");				
// 	b.addEventListener("click", function() {				
// 		xhr.open('GET', '/api/catTwo'); // HTTP 메서드와 요청 URL 설정. todo: 현 컨텍스트path에 맞춰 수정할 것			
// 		xhr.send(); // 요청 보내기			
// 		xhr.onload = function() {			
// 			if (xhr.status === 200) { // 응답 상태 확인		
// 				var jo = JSON.parse(xhr.responseText);	
// 				var s = "고양이름:"+jo.name+" 고양이나이:"+jo.age;	
// 				alert(s);	
// 				cat2_area.innerHTML = s;
// 			} else {		
// 				console.error(xhr.statusText); // 오류 메시지 출력	
// 			}		
// 		};			
					
// 	});				
// }					