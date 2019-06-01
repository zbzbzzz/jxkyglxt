<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="student_patent_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class=" modal-dialog">
			<form id="info_form">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">专利</h4>
					</div>
					<div class="modal-body">
						<div id="main_body">
							<table class="tab com-table">
								<tr>
									<td>专利名称:</td>
									<td><input name="studentPatent.patentName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>作者学号:</td>
									<td><input name="studentPatent.studentId"
										class=" form-control
										table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>作者姓名:</td>
									<td><input name="studentPatent.studentName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>专利类型:</td>
									<td><select name="studentPatent.patentClass"
										draggable="true" class="form-control table_infomation">
											<option>发明专利</option>
											<option>实用新型专利</option>
											<option>外观设计专利</option>
											<option>软件著作权</option>
									</select></td>
								</tr>
								<tr>
									<td>授权号:</td>
									<td><input name="studentPatent.authorizationNo"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>获批日期:</td>
									<td><input name="studentPatent.time"
										class="form-control table_infomation mydate" type="text"></td>
								</tr>
								<tr>
									<td>是否第一发明人:</td>
									<td><select name="studentPatent.firstPatent"
										draggable="true" class="form-control table_infomation">
											<option>是</option>
											<option>否</option>
									</select></td>
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
						<input name="studentPatent.patentId" id="tableid" type="hidden" />
					</div>
				</div>
			</form>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>
