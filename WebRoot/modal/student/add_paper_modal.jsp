<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="student_paper_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class=" modal-dialog">
			<form id="info_form">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">论文</h4>
					</div>
					<div class="modal-body">
						<div id="main_body">
							<table class="tab com-table">
								<tr>
									<td>论文名称:</td>
									<td><input name="studentPaper.paperName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>作者学号:</td>
									<td><input name="studentPaper.studentId"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>作者名称:</td>
									<td><input name="studentPaper.studentName"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>发表期刊:</td>
									<td><input name="studentPaper.periodical"
										class="form-control table_infomation" type="text"></td>
								</tr>
								<tr>
									<td>发表时间:</td>
									<td><input name="studentPaper.publishTime"
										class="form-control table_infomation mydate" type="text"></td>
								</tr>
								<tr>
									<td>收录情况:</td>
									<td><select name="studentPaper.includedSituation"
										class="form-control table_infomation">
											<option>SCI</option>
											<option>SSCI</option>
											<option>EI</option>
											<option>CPCI</option>
											<option>A&HCI</option>
											<option>CSCD</option>
											<option>其他期刊</option>
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
						<input name="studentPaper.paperId" id="tableid" type="hidden" />
					</div>
				</div>
			</form>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>
