<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<div class="modal fade" id="student_award_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class=" modal-dialog">
			<form id="info_form">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">奖励</h4>
					</div>
					<div class="modal-body">
						<div id="main_body">
							<table class="tab com-table">
								<tr>
									<td>奖励名称:</td>
									<td><input name="studentAward.awardName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>获奖者学号:</td>
									<td><input name="studentAward.studentId"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>获奖者姓名:</td>
									<td><input name="studentAward.studentName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>奖励级别:</td>
									<td><select name="studentAward.awardClass"
										draggable="true" class="form-control table_infomation">
											<option>国家级</option>
											<option>省部级</option>
									</select></td>
								</tr>
								<tr>
									<td>是否第一发明人:</td>
									<td><select name="studentAward.firstAward"
										draggable="true" class="form-control table_infomation">
											<option>是</option>
											<option>否</option>
									</select></td>
								</tr>
								<tr>
									<td>获奖证书编号:</td>
									<td><input name="studentAward.authorizationNo"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>获奖时间:</td>
									<td><input name="studentAward.time"
										class="form-control table_infomation mydate" type="text"></td>
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
						<input name="studentAward.awardId" id="tableid" type="hidden" />
					</div>
				</div>
			</form>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>
