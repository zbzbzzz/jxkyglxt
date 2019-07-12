<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<div class="modal fade" id="student_export_info" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">导出</h4>
				</div>
				<div class="modal-body  " id="modal-content">
					<div class="tab_content">
						<div id="check" class="checkbox">
							<ul class="group-list">
								<!-- <i class="fa fa-check" aria-hidden="true"></i> 
										<i class="fa fa-times" aria-hidden="true"></i> -->
								<li><button id="all" class="btn btn-info btn-sm">
										<i class="fa fa-times" aria-hidden="true"></i> <span>全选</span>
									</button></li>
								<li><button id="inverse" class="btn btn-info btn-sm">
										<i class="fa fa-times" aria-hidden="true"></i> <span>反选</span>
									</button></li>
							</ul>
							<ul class="group-list">
								<li><button value="0" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>学号</span>
									</button></li>
								<li><button value="1" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>名字</span>
									</button></li>
								<li><button value="2" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>年制</span>
									</button></li>
								<li><button value="3" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>入学年份</span>
									</button></li>
								<li><button value="4" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>证件类型</span>
									</button></li>
								<li><button value="5" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>证件号码</span>
									</button></li>
								<li><button value="6" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>出生年份</span>
									</button></li>
								<li><button value="7" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>性别</span>
									</button></li>
								<li><button value="8" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>民族</span>
									</button></li>
							</ul>
							<ul class="group-list">

								<li><button value="9" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>政治面貌</span>
									</button></li>
								<li><button value="10" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>生源地</span>
									</button></li>
								<li><button value="11" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>学生类型</span>
									</button></li>
								<li><button value="12" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>招生类型</span>
									</button></li>
								<li><button value="13" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>授课方式</span>
									</button></li>
								<li><button value="14" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>专业代码</span>
									</button></li>
								<li><button value="15" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>专业名称</span>
									</button></li>
								<li><button value="16" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>自主专业名称</span>
									</button></li>

							</ul>
							<ul class="group-list">

								<li><button value="17" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>所在学院</span>
									</button></li>
								<li><button value="18" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>是否师范类型</span>
									</button></li>
								<li><button value="19" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>是否残疾</span>
									</button></li>
								<li><button value="20" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>异动类型</span>
									</button></li>
								<li><button value="21" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>入学学历</span>
									</button></li>
								<li><button value="22" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>招生方式</span>
									</button></li>
								<li><button value="23" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>休退学原因</span>
									</button></li>
							</ul>
							<ul class="group-list">
								<li><button value="24" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>户口类型</span>
									</button></li>
								<li><button value="25" class="btn btn-info btn-sm pro">
										<i class="fa fa-times" aria-hidden="true"></i> <span>是否授予学位</span>
									</button></li>
							</ul>
						</div>
						<div class="tab-inneed"></div>
					</div>
				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-primary export_button"
						data-dismiss="modal">导出</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<input name="teacherInfo.infoId" id="tableid" type="hidden" />
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>
