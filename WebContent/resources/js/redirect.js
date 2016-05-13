$(document).ready(function(){
	$(".linking").click(function(){
		redirectMe(this);
	});
	
	$(".live").click(function(){
		changeText(this);
	});
});

function redirectMe(el){
	window.location.replace($(el).attr("data"));
}
function changeText(el){
	var text = $("#onChangeText").val();
	$("#onChangeText").val($("#text").text());
	$("#text").text(text);
}

function addObject(){
	var row = $('<li></li>');
	var label = $('<input type="textfield" name="label">');
	var value = $('<input type="textfield" name="value">');
	row.append(label);
	row.append(value);
	row.insertBefore($("#confirm"));
}