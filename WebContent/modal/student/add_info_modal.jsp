<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<div class="modal fade" id="student_info_modal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class=" modal-dialog modal-lg">
			<form id="info_form">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">学生信息</h4>
					</div>
					<div class="modal-body">
						<div id="main_body">
							<table class="tab user-table">
								<tbody>
									<tr>
										<td>学号:</td>
										<td><input name="studentInfo.studentId"
											class="form-control table_infomation" type="text"></td>
										<td>姓名:</td>
										<td><input name="studentInfo.studentName"
											class="form-control table_infomation" type="text"></td>
									</tr>
									<tr>
										<td>年制:</td>
										<td><select name="studentInfo.calendarYear"
											class="form-control table_infomation">
												<option>四年制</option>
												<option>五年制</option>
										</select></td>
										<td>入学年份:</td>
										<td><input name="studentInfo.enrolmentYear"
											class="form-control table_infomation" type="text"></td>
										<td>证件类型:</td>
										<td><select name="studentInfo.certificateType"
											class="form-control table_infomation">
												<option>居民身份证</option>
												<option>护照</option>
										</select></td>
									</tr>
									<tr>
										<td>证件号码:</td>
										<td><input name="studentInfo.certificateNo"
											class="form-control table_infomation"></td>
										<td>出生年份:</td>
										<td><input name="studentInfo.birthYear"
											class="form-control table_infomation"></td>
										<td>性别</td>
										<td><select name="studentInfo.sex"
											class="form-control table_infomation">
												<option>男</option>
												<option>女</option>
										</select></td>
									</tr>
									<tr>
										<td>民族:</td>
										<td><select name="studentInfo.nation"
											class="form-control table_infomation">
												<option>汉族</option>
												<option>少数民族</option>
										</select></td>
										<td>政治面貌:</td>
										<td><select name="studentInfo.politicalStatus"
											class="form-control table_infomation">
												<option>共青团员</option>
												<option>共产党员</option>
												<option>民主党派</option>
												<option>群众</option>
										</select></td>
										<td>学缘:</td>
										<td><select name="studentInfo.studentSource"
											class="form-control table_infomation">
												<option>境内</option>
												<option>港澳台学生</option>
												<option>留学生</option>
										</select></td>
									</tr>
									<tr>
										<td>学生类型:</td>
										<td><select name="studentInfo.studentType"
											class="form-control table_infomation">
												<option selected>普通本科生</option>
										</select></td>
										<td>招生类型:</td>
										<td><select name="studentInfo.enrolmentType"
											class="form-control table_infomation">
												<option>高中起点</option>
												<option>专科起点</option>
												<option>第二学士学位</option>
										</select></td>
										<td>授课方式:</td>
										<td><select name="studentInfo.classType"
											class="form-control table_infomation">
												<option selected>无</option>
										</select></td>
									</tr>
									<tr>
										<td>专业代码:</td>
										<td><input name="studentInfo.classNumber"
											class="form-control table_infomation" type="text"></td>
										<td>专业名称:</td>
										<td><input name="studentInfo.className"
											class="form-control table_infomation" type="text"></td>
										<td>自主专业名称:</td>
										<td><input name="studentInfo.inClassName"
											class="form-control table_infomation " type="text"></td>
									</tr>
									<tr>
										<td>所在学院:</td>
										<td><input name="studentInfo.departmentId"
											class="form-control table_infomation" type="text"></td>
										<td>是否师范类型:</td>
										<td><select name="studentInfo.teacherTraining"
											class="form-control table_infomation">
												<option>是</option>
												<option>否</option>
										</select></td>
										<td>是否残疾:</td>
										<td><select name="studentInfo.deformed"
											class="form-control table_infomation">
												<option>是</option>
												<option>否</option>
										</select></td>
									</tr>
									<tr>
										<td>异动类型:</td>
										<td><select name="studentInfo.changes"
											class="form-control table_infomation">
												<option>无</option>
												<option>复学</option>
												<option>转入</option>
												<option>其他(增加)</option>
												<option>休学</option>
												<option>退学</option>
												<option>死亡	</option>
												<option>转出</option>
												<option>其他(减少)</option>
												<option>开除</option>
												<option>毕业</option>
												<option>结业</option>
										</select></td>
										<td>入学学历:</td>
										<td><select name="studentInfo.entranceRecord"
											class="form-control table_infomation">
												<option>普通高中</option>
												<option>中职</option>
												<option>其他学历</option>
												<option>无</option>
										</select></td>
										<td>招生方式:</td>
										<td><select name="studentInfo.enrolmentStyle"
											class="form-control table_infomation" placeholder="">
												<option>无</option>
										</select></td>
									</tr>
									<tr>
										<td>休退学原因:</td>
										<td><select name="studentInfo.droppingReason"
											class="form-control table_infomation" placeholder="请输入任教专业代码">
												<option>无</option>
										</select></td>
										<td>户口类型:</td>
										<td><select name="studentInfo.registeredType"
											class="form-control table_infomation" type="text"
											placeholder="">
												<option>农村</option>
												<option>城镇</option>
												<option>其他</option>
										</select></td>
										<td>是否授予学位:</td>
										<td><select name="studentInfo.degree"
											class="form-control table_infomation">
												<option>是</option>
												<option>否</option>
										</select></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="modal-footer">
						<button style="" type="button" class="btn btn-danger sure_add">添加</button>
						<button style="display: none;" type="button"
							class="btn btn-danger sure_mod">修改</button>
						<button type="button" class="btn btn-default close-btn"
							data-dismiss="modal">关闭</button>
						<!-- <input name="studentInfo.studentId" id="tableid" type="hidden" /> -->
					</div>
				</div>
			</form>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>
