$(function(){
	act(new Date().getFullYear());
})
function dsfsf(){
	act($("#selectOption").val());
}
function act(val){
	$.ajax({
		url : "http://localhost:8080/CrmSystem/indent/statistics",
		type : "POST",
		data : {
			year:val
		},
		dataType : "json",
		success : function(resutl) {
			console.log(resutl.actualDate.data);
			$('#container').highcharts(
					{
						chart : {
							type : 'line',
						},
						xAxis : {
							categories : [ '一月', '二月', '三月', '四月',
									'五月', '六月', '七月', '八月', '九月', '十月',
									'十一月', '十二月' ]
						},
						title : {
							text : '订单统计'
						},
						plotOptions : {
							series : {
								allowPointSelect : true,
							}
						},
						animationLimit : Infinity,
						series : [{
							name:resutl.actualDate.name,
							data:resutl.actualDate.data
						}
						, resutl.predictData]
					});
			// the button action
			$('#button')
					.click(
							function() {
								var chart = $('#container')
										.highcharts(), selectedPoints = chart
										.getSelectedPoints();
								if (chart.lbl) {
									chart.lbl.destroy();
								}
								chart.lbl = chart.renderer
										.label(
												'You selected '
														+ selectedPoints.length
														+ ' points',
												100, 60)
										.attr(
												{
													padding : 10,
													r : 5,
													fill : Highcharts
															.getOptions().colors[1],
													zIndex : 5
												}).css({
											color : 'white'
										}).add();
							});
		}
	})
}