<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户分布表</title>
<body>
<div id="containerx1"></div>
<div id="slidersx1">
    <table>
        <tr>
            <td>α 角（内旋转角）</td>
            <td><input id="alpha" type="range" min="0" max="45" value="15"/> <span id="alpha-valuex1" class="value"></span></td>
        </tr>
        
        <tr>
            <td>β 角（外旋转角）</td>
            <td><input id="beta" type="range" min="-45" max="45" value="15"/> <span id="beta-valuex1" class="value"></span></td>
        </tr>
        
        <tr>
            <td>深度</td>
            <td><input id="depth" type="range" min="20" max="100" value="50"/> <span id="depth-valuex1" class="value"></span></td>
        </tr>
    </table>
</div>
<script type="text/javascript">
	$(function () {
	var ads = [];
	var sum1 = [];
	var sum2 = [];
	var sum3 = [];
	var sum4 = [];
	$.ajax({
		url:'../selectOne?state=1',
		async:false,
		type:'post',
		success:function(data){
			console.log(data);
			for(var i=0;i<data.length;i++)
			{
				ads.push(data[i].monthString);
				sum1.push(data[i].sum1);
				sum2.push(data[i].sum2);
				sum3.push(data[i].sum3);
				sum4.push(data[i].sum4);
			}
		}
	})
		
	 // Set up the chart
    var chart = new Highcharts.Chart({
        chart: {
            renderTo: 'containerx1',
            type: 'column',
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 15,
                depth: 50,
                viewDistance: 25
            }
        },
        xAxis: {
            categories: ads   // x 轴分类
        },
        yAxis: {
            title: {
                text: '客户数量'                // y 轴标题
            }
        },
        title: {
            text: '客户分布图'
        },
        subtitle: {
            text: '可通过滑动下方滑块测试'
        },
        plotOptions: {
            column: {
                depth: 25
            }
        },
        series: [{
            name: '普通客户',
            data: sum1
        }, {
            name: '金卡客户',
            data: sum2
        }, {
            name: '银卡客户',
            data: sum3
        }, {
            name: 'Vip客户',
            data: sum4
        }]
    });
    function showValues() {
        $('#alpha-valuex1').html(chart.options.chart.options3d.alpha);
        $('#beta-valuex1').html(chart.options.chart.options3d.beta);
        $('#depth-valuex1').html(chart.options.chart.options3d.depth);
    }
    // Activate the sliders
    $('#slidersx1 input').on('input change', function () {
        chart.options.chart.options3d[this.id] = this.value;
        showValues();
        chart.redraw(false);
    });
    showValues();
});
</script>
</body>
</html>