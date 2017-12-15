<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户分布表</title>
<body>
<div id="containerx3"></div>
<div id="slidersx3">
    <table>
        <tr>
            <td>α 角（内旋转角）</td>
            <td><input id="alpha" type="range" min="0" max="45" value="15"/> <span id="alpha-valuex3" class="value"></span></td>
        </tr>
        
        <tr>
            <td>β 角（外旋转角）</td>
            <td><input id="beta" type="range" min="-45" max="45" value="15"/> <span id="beta-valuex3" class="value"></span></td>
        </tr>
        
        <tr>
            <td>深度</td>
            <td><input id="depth" type="range" min="20" max="100" value="50"/> <span id="depth-valuex3" class="value"></span></td>
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
		url:'../selectOne?state=3',
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
		
   /*  var chart = new Highcharts.Chart('container5', {
        chart: {
            type: 'bar'
        },
        title: {
            text: '服务统计'
        },
        subtitle: {
            text: '数据来源: mysql'
        },
        xAxis: {
            categories: ads,
            title: {
                text: null
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: '客户数量 (人)',
                align: 'high'
            },
            labels: {
                overflow: 'justify'
            }
        },
        tooltip: {
            valueSuffix: ' 人'
        },
        plotOptions: {
            bar: {
                dataLabels: {
                    enabled: true
                    // ,allowOverlap 默认是 false，即不允许数据标签重叠
                }
            }
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'top',
            x: -40,
            y: 100,
            floating: true,
            borderWidth: 1,
            backgroundColor: ((Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'),
            shadow: true
        },
        credits: {
            enabled: false
        },
        series: [{
            name: '业务咨询',
            data: sum1
        }, {
            name: '投诉问题',
            data: sum2
        }, {
            name: '售前问题',
            data: sum3
        }, {
            name: '售后问题',
            data: sum4
        }]
    });
    $('input').click(function() {
        var val = $(this).prop('checked'),
            allowOverlap = val === 'on';
        console.log(val);
        chart.update({
            plotOptions: {
                bar: {
                    dataLabels: {
                        allowOverlap: val
                    }
                }
            }
        });
    }); */
	 var chart = new Highcharts.Chart({
	        chart: {
	            renderTo: 'containerx3',
	            type: 'column',
	            options3d: {
	                enabled: true,
	                alpha: 15,
	                beta: 15,
	                depth: 50,
	                viewDistance: 25
	            }
	        },
	        title: {
	            text: '服务统计'
	        },
	        xAxis: {
	            categories: ads   // x 轴分类
	        },
	        yAxis: {
	            title: {
	                text: '服务数量'                // y 轴标题
	            }
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
	            name: '业务咨询',
	            data: sum1
	        }, {
	            name: '投诉问题',
	            data: sum2
	        }, {
	            name: '售前问题',
	            data: sum3
	        }, {
	            name: '售后问题',
	            data: sum4
	        }]
	    });
	    function showValues() {
	        $('#alpha-valuex3').html(chart.options.chart.options3d.alpha);
	        $('#beta-valuex3').html(chart.options.chart.options3d.beta);
	        $('#depth-valuex3').html(chart.options.chart.options3d.depth);
	    }
	    // Activate the sliders
	    $('#slidersx3 input').on('input change', function () {
	        chart.options.chart.options3d[this.id] = this.value;
	        showValues();
	        chart.redraw(false);
	    });
	    showValues();
});
</script>
</body>
</html>