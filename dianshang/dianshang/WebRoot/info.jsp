<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>tksc</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">

			<!--
            	描述：菜单栏
            -->
			<div class="container-fluid">
				<div class="col-md-4">
					<img src="img/logo3.png" />
				</div>
				
			</div>
			<!--
            	描述：导航条
            -->
			<div class="container-fluid">
				<nav class="navbar navbar-inverse">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#">首页</a>
						</div>

						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<<li class="active"><a href="ProductServlet">新鲜果蔬<span class="sr-only">(current)</span></a></li>
								<li><a href="CatServlet">萌宠家族</a></li>
								<li><a href="#">彩妆系列</a></li>
								<li><a href="#">精品文具</a></li>
							</ul>
							<form class="navbar-form navbar-right" role="search">
								<div class="form-group">
									<input type="text" class="form-control" placeholder="Search">
								</div>
								<button type="submit" class="btn btn-default">Submit</button>
							</form>

						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container-fluid -->
				</nav>
			</div>

			<div class="container-fluid">
				<div class="main_con">
					<h2>${msg}</h2>
					<h3 style = "color= blue">
						<div class="col-md-6">
							<img style="opacity: 1;width:400px;height:350px;" title="" class="medium" src="${p.pimg }">
							<div><strong>${p.pname }</strong></div>
							<div style="border-bottom: 1px dotted #dddddd;width:350px;margin:10px 0 10px 0;">
							<div>编号：${p.pid }</div>
							<div>价格：${p.pprice}</div>
							<div>
								<a href="cart.jsp">查看购物车</a>
							</div>
						</div>
						<%-- <div class="col-md-6">
							<div><strong>${p.pname }</strong></div>
							<div style="border-bottom: 1px dotted #dddddd;width:350px;margin:10px 0 10px 0;">
							<div>编号：${p.pid }</div>
							<div>价格：${p.pprice}</div>
							<div>
								<a href="cart.jsp">查看购物车</a>
							</div>
						</div> --%>
						
					</h5>
					<hr/>
					<div>
					</div>
				</div>
			</div>

		</div>
		<div class="container-fluid">
		
				<div style="text-align: center;margin-top: 5px;">
					<ul class="list-inline">
						<li><a href="info.html">关于我们</a></li>
						<li><a>联系我们</a></li>
						<li><a>招贤纳士</a></li>
						<li><a>法律声明</a></li>
						<li><a>友情链接</a></li>
						<li><a>支付方式</a></li>
						<li><a>配送方式</a></li>
						<li><a>服务声明</a></li>
						<li><a>广告声明</a></li>
					</ul>
				</div>
				<div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
					Copyright &copy; 2016-2017 弘成科技 版权所有
				</div>
			</div>
		</div>

	</body>

</html>
