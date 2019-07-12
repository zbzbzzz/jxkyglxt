<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="student_project_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class=" modal-dialog">
			<form id="info_form">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">项目(课题)</h4>
					</div>
					<div class="modal-body">
						<div id="main_body">
							<table class="tab com-table">
								<tr>
									<td>项目名称:</td>
									<td><input name="studentProject.projectName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>学生名称:</td>
									<td><input name="studentProject.projectName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>项目负责人:</td>
									<td><input name="studentProject.userName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>项目负责人工号:</td>
									<td><input name="studentProject.userId"
										class="form-control table_infomation" type="text"></td>
								</tr>
							</table>
						</div>
					</div>
					<div class="modal-footer">
						<button style="" type="button" class="btn btn-danger sure_add">添加</button>
						<button style="display: none;" type="button"
							class="btn btn-danger sure_mod">修改</button>
						<button type="button" class="btn btn-default close-btn"
							data-dismiss="modal">关闭</button>
						<input name="studentProject.projectId" id="tableid" type="hidden" />
					</div>
				</div>
			</form>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>