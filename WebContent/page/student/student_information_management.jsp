<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<!--管理员查看信息时右侧内容-->
	<section class="content" id="content">
		<%@ include file ="/modal/student/add_award_modal.jsp" %>
		<%@ include file ="/modal/student/add_class_modal.jsp" %>
		<%@ include file ="/modal/student/add_info_modal.jsp" %>
		<%@ include file ="/modal/student/add_paper_modal.jsp" %>
		<%@ include file ="/modal/student/add_patent_modal.jsp" %>
		<%@ include file ="/modal/student/add_project_modal.jsp" %>
		<div class="row">
		<div class="col-md-12">
			<!--breadcrumbs start -->
			<ul class="breadcrumb">
				<li><a href="javascript:location.reload();"><i
						class="fa fa-home"></i> 首页</a></li>
				<li class="active">学生信息管理</li>
			</ul>
			<!--breadcrumbs end -->
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<!--breadcrumbs start -->
			<section class="panel general"> <header
				class="panel-heading tab-bg-dark-navy-blue">
			<ul class="nav nav-tabs">
				<li class=""><a data-toggle="tab" href="#info">学生查看</a></li>
				<li class=""><a data-toggle="tab" href="#award">奖励列表</a></li>
				<li class=""><a data-toggle="tab" href="#patent">学生专利列表</a></li>
				<li class=""><a data-toggle="tab" href="#paper">学生论文列表</a></li>
				<li class=""><a data-toggle="tab" href="#project">学生参与项目(课题)列表</a></li>
				<li class=""><a data-toggle="tab" href="#class">班级列表</a></li>
			</ul>
			</header>
			<div class="panel-body">
				<div class="tab-content">
					<div id="info" class="tab-pane">
						<!--管理员查看用户信息的表格-->
						<div id="user_table_view">
							<!--表投上按钮组-->
							<div class="box-tools m-b-15">
								<div style="width: 100%;" class="input-group">
									<!--筛选&查询&添加按钮位置-->
									<button style="margin-left:6px;"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-plus"></i>添加学生
									</button>
									<button style="margin-left:6px;" data-toggle="modal" data-target="#student_export_info"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-share-square"></i>学生信息导出
									</button>
									<!--按条件筛选-->
									<button style="margin-left:6px;" style="" class="btn btn-default btn-sm" type="button"
										data-toggle="collapse" data-target="#collapse_exam_user"
										aria-expanded="false" aria-controls="collapseExample">
										<i class="fa fa-search" aria-hidden="true"></i> 条件筛选
									</button>
									<!-- 部分搜索 -->
									<div style="float: right;">
										<input name="table_search" class="form-control input-sm"
											style="width: 150px;" type="text" placeholder="Search">
										<div style="float: right; height: 30px;">
											<button class="btn btn-default fuzzy_query"
												style="height: 100%;">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
									<div style="width: 100%; margin-top: 6px;" class="collapse"
										id="collapse_exam_user">
										<div class="well">
											<div id="search">
												<label>指定条件搜索：</label> <select id="all_options"
													class="all_options form-control ">
													<option value="">请选择</option>
													<option value="studentId">学号</option>
													<option value="studentName">姓名</option>
													<option value="calendarYear">年制</option>
													<option value="enrolmentYear">入学年份</option>
													<option value="studentSource">生源地</option>
													<option value="registeredType">户口类型</option>
												</select>
												<button style="float: right; margin-left: 6px;"
													class="btn btn-danger search_info">
													<i class="fa fa-exclamation-circle" aria-hidden="true"></i>清空搜索
												</button>
												<button style="float: right;"
													class="btn btn-info search_info">
													<i class="fa fa-check-square-o" aria-hidden="true"></i>确认搜索
												</button>
												<div style="width: 100%; margin-top: 6px;" id="search_input"></div>
											</div>
										</div>
									</div>
									<!--<input type="text" class="form-control" />-->
								</div>
							</div>
							<!--查询存放信息的表格-->
							<section class="panel"> <header
								class="panel-heading second-panel-heading"> 学生信息
							<button style="display: none;float: right;"
								class="btn btn-primary sure_export">确认导出</button>
							<button style="display: none;float: right;"
								class="btn btn-danger all_sure_export">导出全部</button>
							</header>
							<div class="panel-body table-responsive">
								<table class="table table-hover" id="info_table">
									<thead>
										<tr>
											<th>序号</th>
											<th>学号</th>
											<th>姓名</th>
											<th>性别</th>
											<th>入学年份</th>
											<th>所在学院</th>
											<th>所在班级</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
							</section>
						</div>
					</div>
					<div id="award" class="tab-pane">
						<div id="award_table_view">
							<!--表投上按钮组-->
							<div class="box-tools m-b-15">
								<div style="width: 100%; margin-bottom: 15px;"
									class="input-group">
									<!--筛选&查询&添加按钮位置-->
									<button data-toggle="modal" data-target="#student_award_modal"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-plus"></i>添加奖励
									</button>
									<button style="margin-left:6px;"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-share-square"></i>奖励信息导出
									</button>
									<!--按条件筛选-->
									<button style="margin-left:6px;" style="" class="btn btn-default btn-sm" type="button"
										data-toggle="collapse" data-target="#collapse_exam_award"
										aria-expanded="false" aria-controls="collapseExample">
										<i class="fa fa-search" aria-hidden="true"></i> 条件筛选
									</button>
									<!-- 部分搜索 -->
									<div style="float: right;">
										<input name="table_search" class="form-control input-sm"
											style="width: 150px;" type="text" placeholder="Search">
										<div style="float: right; height: 30px;">
											<button class="btn btn-default fuzzy_query"
												style="height: 100%;">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
									<div style="width: 100%; margin-top: 6px;" class="collapse"
										id="collapse_exam_award">
										<div class="well">
											<div id="search">
												<label>指定条件搜索：</label> <select id="all_options"
													class="all_options form-control ">
													<option value="">请选择</option>
													<option value="awardName">获奖名称</option>
													<option value="awardClass">获奖类型</option>
													<option value="studentName">获奖人姓名</option>
													<option value="studentId">获奖人姓名</option>
												</select>

												<button style="float: right; margin-left: 6px;"
													class="btn btn-danger search_info">
													<i class="fa fa-exclamation-circle" aria-hidden="true"></i>清空搜索
												</button>

												<button style="float: right;"
													class="btn btn-info search_info">
													<i class="fa fa-check-square-o" aria-hidden="true"></i>确认搜索
												</button>
												<div style="width: 100%; margin-top: 6px;" id="search_input"></div>
											</div>
										</div>
										<!--<input type="text" class="form-control" />-->
									</div>
								</div>
								<!--查询存放信息的表格-->
								<section class="panel"> <header
									class="panel-heading second-panel-heading"> 奖励信息
								<button style="display: none;float: right;"
									class="btn btn-primary sure_export">确认导出</button>
								<button style="display: none;float: right;"
									class="btn btn-danger all_sure_export">导出全部</button>
								</header>
								<div class="panel-body table-responsive">
									<table class="table table-hover" id="info_table">
										<thead>
											<tr>
												<th>序号</th>
												<th>奖励名称</th>
												<th>学生学号</th>
												<th>学生姓名</th>
												<th>获奖级别</th>
												<!-- <th>授权号</th> -->
												<th>获奖时间</th>
												<th>是否第一获奖人</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
								</section>
							</div>
						</div>
					</div>
					<div id="paper" class="tab-pane">
						<!--管理员查看论文信息的表格-->
						<div id="paper_table_view">
							<!--表投上按钮组-->
							<div class="box-tools m-b-15">
								<div style="width: 100%;" class="input-group">
									<!--筛选&查询&添加按钮位置-->
									<button
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-plus"></i>添加论文
									</button>
									<button style="margin-left:6px;" data-toggle="modal" data-target="#student_export_paper"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-share-square"></i>论文信息导出
									</button>
									<!--按条件筛选-->
									<button style="margin-left:6px;" class="btn btn-default btn-sm" type="button"
										data-toggle="collapse" data-target="#collapse_exam_paper"
										aria-expanded="false" aria-controls="collapseExample">
										<i class="fa fa-search" aria-hidden="true"></i> 条件筛选
									</button>
									<!-- 部分搜索 -->
									<div style="float: right;">
										<input name="table_search" class="form-control input-sm"
											style="width: 150px;" type="text" placeholder="Search">
										<div style="float: right; height: 30px;">
											<button class="btn btn-default fuzzy_query"
												style="height: 100%;">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
									<div style="width: 100%; margin-top: 6px;" class="collapse"
										id="collapse_exam_paper">
										<div class="well">
											<div id="search">
												<label>指定条件搜索：</label> <select id="all_options"
													class="all_options form-control ">
													<option value="">请选择</option>
													<option value="studentName">姓名</option>
													<option value="studentId">工号</option>
													<option value="paperName">论文名称</option>
													<option value="paperType">论文类别</option>
												</select>
												<button style="float: right; margin-left: 6px;"
													class="btn btn-danger search_info">
													<i class="fa fa-exclamation-circle" aria-hidden="true"></i>清空搜索
												</button>
												<button style="float: right;"
													class="btn btn-info search_info">
													<i class="fa fa-check-square-o" aria-hidden="true"></i>确认搜索
												</button>
												<div style="width: 100%; margin-top: 6px;" id="search_input"></div>
											</div>
										</div>
									</div>
									<!-- collapse end -->
								</div>
							</div>
							<!--查询存放信息的表格-->
							<section class="panel"> <header
								class="panel-heading second-panel-heading"> 论文信息
							<button style="display: none;float: right;"
								class="btn btn-primary sure_export">确认导出</button>
							<button style="display: none;float: right;"
								class="btn btn-danger all_sure_export">导出全部</button>
							</header>
							<div class="panel-body table-responsive">
								<table class="table table-hover" id="info_table">
									<thead>
										<tr>
											<th>序号</th>
											<th>论文名称</th>
											<th>学生学号</th>
											<th>发表期刊</th>
											<th>发表时间</th>
											<th>收录情况</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
							</section>
						</div>
					</div>
					<div id="patent" class="tab-pane">
						<!--管理员查看专利信息的表格-->
						<div id="patent_table_view">
							<!--表投上按钮组-->
							<div class="box-tools m-b-15">
								<div style="width: 100%;" class="input-group">
									<!--筛选&查询&添加按钮位置-->
									<button
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-plus"></i>添加专利
									</button>
									<button data-toggle="modal" style="margin-left:6px;"
										data-target="#student_export_patent"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-share-square"></i>专利信息导出
									</button>
									<!--按条件筛选-->
									<button style="margin-left:6px;" class="btn btn-default btn-sm" type="button"
										data-toggle="collapse" data-target="#collapse_exam_patent"
										aria-expanded="false" aria-controls="collapseExample">
										<i class="fa fa-search" aria-hidden="true"></i> 条件筛选
									</button>
									<!-- 部分搜索 -->
									<div style="float: right;">
										<input name="table_search" class="form-control input-sm"
											style="width: 150px;" type="text" placeholder="Search">
										<div style="float: right; height: 30px;">
											<button class="btn btn-default fuzzy_query"
												style="height: 100%;">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
									<!-- collapse start -->
									<div style="width: 100%; margin-top: 6px;" class="collapse"
										id="collapse_exam_patent">
										<div class="well">
											<div id="search">
												<label>指定条件搜索：</label> <select id="all_options"
													class="all_options form-control ">
													<!-- patent搜索条件 -->
													<option value="">请选择</option>
													<option value="studentName">姓名</option>
													<option value="studentId">工号</option>
													<option value="patentName">专利名称</option>
												</select>
												<button style="float: right; margin-left: 6px;"
													class="btn btn-danger search_info">
													<i class="fa fa-exclamation-circle" aria-hidden="true"></i>清空搜索
												</button>

												<button style="float: right;"
													class="btn btn-info search_info">
													<i class="fa fa-check-square-o" aria-hidden="true"></i>确认搜索
												</button>

												<div style="width: 100%; margin-top: 6px;" id="search_input"></div>
											</div>
										</div>
									</div>
									<!-- collapse end -->
								</div>
							</div>
							<!--查询存放信息的表格-->
							<section class="panel"> <header
								class="panel-heading second-panel-heading"> 专利信息
							<button style="display: none;float: right;"
								class="btn btn-primary sure_export">确认导出</button>
							<button style="display: none;float: right;"
								class="btn btn-danger all_sure_export">导出全部</button>
							</header>
							<div class="panel-body table-responsive">
								<table class="table table-hover" id="info_table">
									<thead>
										<tr>
											<th>序号</th>
											<th>专利名称</th>
											<th>学号</th>
											<th>名字</th>
											<th>专利类型</th>
											<th>专利授权号</th>
											<th>获批时间</th>
											<!-- <th>是否第一专利人</th> -->
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
							</section>
						</div>
					</div>
					<div id="project" class="tab-pane">
						<!--管理员查看课题(项目)信息的表格-->
						<div id="project_table_view">
							<!--表投上按钮组-->
							<div class="box-tools m-b-15">
								<div style="width: 100%;" class="input-group">
									<!--筛选&查询&添加按钮位置-->
									<button
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-plus"></i>添加项目
									</button>
									<button data-toggle="modal" style="margin-left:6px;"
										data-target="#student_export_project"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-share-square"></i>项目信息导出
									</button>
									<!--按条件筛选-->
									<button style="margin-left:6px;" class="btn btn-default btn-sm" type="button"
										data-toggle="collapse" data-target="#collapse_exam_project"
										aria-expanded="false" aria-controls="collapseExample">
										<i class="fa fa-search" aria-hidden="true"></i> 条件筛选
									</button>
									<!-- 部分搜索 -->
									<div style="float: right;">
										<input name="table_search" class="form-control input-sm"
											style="width: 150px;" type="text" placeholder="Search">
										<div style="float: right; height: 30px;">
											<button class="btn btn-default fuzzy_query"
												style="height: 100%;">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
									<!-- collapse start -->
									<div style="width: 100%; margin-top: 6px;" class="collapse"
										id="collapse_exam_project">
										<div class="well">
											<div id="search">
												<label>指定条件搜索：</label> <select id="all_options"
													class="all_options form-control ">
													<option value="">请选择</option>
													<!-- project搜索条件 -->
													<option value="studentName">姓名</option>
													<option value="studentId">工号</option>
													<option value="projectName">项目名称</option>
													<option value="userId">负责人工号</option>
													<option value="userName">负责人名称</option>
												</select>
												<button style="float: right; margin-left: 6px;"
													class="btn btn-danger search_info">
													<i class="fa fa-exclamation-circle" aria-hidden="true"></i>清空搜索
												</button>

												<button style="float: right;"
													class="btn btn-info search_info">
													<i class="fa fa-check-square-o" aria-hidden="true"></i>确认搜索
												</button>

												<div style="width: 100%; margin-top: 6px;" id="search_input"></div>
											</div>
										</div>
									</div>
									<!-- collapse end -->
								</div>
							</div>
							<!--查询存放信息的表格-->
							<section class="panel"> <header
								class="panel-heading second-panel-heading"> 课题(项目)信息
							<button style="display: none;float: right;"
								class="btn btn-primary sure_export">确认导出</button>
							<button style="display: none;float: right;"
								class="btn btn-danger all_sure_export">导出全部</button>
							</header>
							<div class="panel-body table-responsive">
								<table class="table table-hover" id="info_table">
									<thead>
										<tr>
											<th>项目名称</th>
											<th>学号</th>
											<th>发表刊期</th>
											<th>负责人ID</th>
											<th>项目负责人名称</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
							</section>
						</div>
					</div>
					
					<div id="class" class="tab-pane">
						<!--管理员查看班级信息的表格-->
						<div id="class_table_view">
							<!--表投上按钮组-->
							<div class="box-tools m-b-15">
								<div style="width: 100%;" class="input-group">
									<!--筛选&查询&添加按钮位置-->
									<!-- <button data-toggle="modal"
										data-target="#student_project_modal"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-plus"></i>添加项目
									</button> -->
									<!-- <button data-toggle="modal" style="margin-left:6px;"
										data-target="#student_export_project"
										class="btn btn-default btn-addon btn-sm">
										<i class="fa fa-share-square"></i>项目信息导出
									</button> -->
									<!--按条件筛选-->
									<!-- <button style="margin-left:6px;" class="btn btn-default btn-sm" type="button"
										data-toggle="collapse" data-target="#collapse_exam_project"
										aria-expanded="false" aria-controls="collapseExample">
										<i class="fa fa-search" aria-hidden="true"></i> 条件筛选
									</button> -->
									<!-- 部分搜索 -->
									<div style="float: right;">
										<input name="table_search" class="form-control input-sm"
											style="width: 150px;" type="text" placeholder="Search">
										<div style="float: right; height: 30px;">
											<button class="btn btn-default fuzzy_query"
												style="height: 100%;">
												<i class="fa fa-search"></i>
											</button>
										</div>
									</div>
									<!-- collapse start -->
									<div style="width: 100%; margin-top: 6px; display:none; " class="collapse"
										id="collapse_exam_project">
										<div class="well">
											<div id="search">
												<label>指定条件搜索：</label> <select id="all_options"
													class="all_options form-control ">
													<option value="">请选择</option>
													<!-- project搜索条件 -->
													<option value="studentName">姓名</option>
													<option value="studentId">工号</option>
													<option value="projectName">项目名称</option>
													<option value="userId">负责人工号</option>
													<option value="userName">负责人名称</option>
												</select>
												<button style="float: right; margin-left: 6px;"
													class="btn btn-danger search_info">
													<i class="fa fa-exclamation-circle" aria-hidden="true"></i>清空搜索
												</button>

												<button style="float: right;"
													class="btn btn-info search_info">
													<i class="fa fa-check-square-o" aria-hidden="true"></i>确认搜索
												</button>

												<div style="width: 100%; margin-top: 6px;" id="search_input"></div>
											</div>
										</div>
									</div>
									<!-- collapse end -->
								</div>
							</div>
							<!--查询存放信息的表格-->
							<section class="panel"> <header
								class="panel-heading second-panel-heading"> 班级信息
							<button style="display: none;float: right;"
								class="btn btn-primary sure_export">确认导出</button>
							<button style="display: none;float: right;"
								class="btn btn-danger all_sure_export">导出全部</button>
							</header>
							<div class="panel-body table-responsive">
								<table class="table table-hover" id="info_table">
									<thead>
										<tr>
											<th>序号</th>
											<th>班级名称</th>
											<th>负责人</th>
											<th>班级人数</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
							</section>
						</div>
					</div>
					
				</div>
			</div>
			<div class="panel-footer">
				<div id="page">
					<ul class="pager">
						<li id="page-first"><a href="javascript:;">首页</a></li>
						<li id="page-prev"><a href="javascript:;">上一页</a></li>
						<li><span id="pageInfo">当前第x页 | 共n页</span></li>
						<li id="page-next"><a href="javascript:;">下一页</a></li>
						<li id="page-last"><a href="javascript:;">尾页</a></li>
					</ul>
				</div>
			</div>
			</section>
			<!--breadcrumbs end -->
		</div>
	</div>
	</section>
</body>
</html>