$(document).ready(function(){
	$('p').mouseover(function(){alert("jj")});
		$('a').click(function(){$('p').unbind()});
})