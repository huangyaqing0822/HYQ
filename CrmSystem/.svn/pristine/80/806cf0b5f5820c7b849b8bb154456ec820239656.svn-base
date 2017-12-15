<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户分布表</title>
<body>
<div id="containerx4" style="height: 400px"></div>

<script type="text/javascript">
$(function () {
	var ads = [];
	var ads1 = [];
	var ads2 = [];
	$.ajax({
		url:'../selectOne?state=4',
		async:false,
		type:'post',
		success:function(data){
			console.log(data);
			for(var i=0;i<data.length;i++)
			{
				ads.push(data[i].monthString);
				ads1.push(data[i].tonbi);
				ads2.push(data[i].huanbi);
			}
		}
	})
	
    $('#containerx4').highcharts({
        chart: {
            type: 'column',
            margin: 75,
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 15,
                depth: 110
            }
        },
        xAxis: {
            categories: ads   // x 轴分类
        },
        yAxis: {
            title: {
                text: '比较值'                // y 轴标题
            }
        },
        title: {
            text: '同比环比比较'
        },
        plotOptions: {
            column: {
                depth: 40,
                stacking: true,
                grouping: false,
                groupZPadding: 10
            }
        },
        series: [{
            name: '同比',
            data: ads1
        }, {
            name: '环比',
            data: ads2
        }]
    });
});
</script>
</body>
</html>