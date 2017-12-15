<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户分布表</title>
<body>
<div id="container19" style="min-width:400px;height:400px"></div>

<script type="text/javascript">
$(function () {
	
	var marketList = "${month}";
	console.log(marketList);
	var ads = [];
	$.ajax({
		url:'../selectOne2?state=4&month='+marketList,
		async:false,
		type:'post',
		success:function(data){
			console.log(data);
			for(var i=0;i<data.length;i++)
			{
				var sum1 = [];
				sum1.push(data[i].str2);
				sum1.push(data[i].sum7);
				ads.push(sum1);
			} 
			
			console.log(ads);
		}
	})
	
    $('#container19').highcharts({
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: new Date().getFullYear()+'-'+marketList+'月各部门业绩占比'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: '业绩占比',
            data: ads
        }]
    });
})
</script>
</body>
</html>