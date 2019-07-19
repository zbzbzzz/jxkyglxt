//js默认执行
$(function() {
	//全局变量
	var parent_div = null;
	var a_href = null;
	var infoType = null;
	var modal_id = null;
	//方法声明------------------------------start
	//方法加载，让方法开始加载，以便调用
	//信息添加
	var add_info = function() {
		$("#" + modal_id).find('.sure_add').show();
		$("#" + modal_id).modal({
			keyboard : true
		})
	}
	/*============================================================================模态框按钮事件绑定*/
	$.each([ '#student_award_modal', '#student_info_modal', '#student_paper_modal', '#student_patent_modal', '#student_project_modal' ], function(index, value) {
		$(value).on('hidden.bs.modal', function() {
			$(value).find('.sure_add').show();
			$(value).find('.sure_mod').hide();
			$(this).find('input').each(function() {
				$(this).val('');
			});
			$(this).find('select').each(function() {
				$(this).find('option:first-child').attr("selected", "selected");
			});
		})
	});

    //添加事件
	var addInfo = function() {
		//data.tableName中获取当前的表名称，进行判断对具体哪一个模态框进行操作
			//modal_id_1，除去Teacher前部分，方便后部分操作
			var modal_id_1 = data.tableName.replace("Student", "");
			//modal_id，最终获取到的模态框id
			var modal_id = "student_" + modal_id_1.substring(0, 1).toLowerCase() + modal_id_1.substring(1) + "_modal";
			$("#" + modal_id).find('.sure_add').show();
			$("#" + modal_id).find('.sure_modi').hide();
			$("#" + modal_id + " .modal-body").find("input,select").removeAttr("disabled");
			$("#" + modal_id + " .review-info").hide();
			$("#" + modal_id).find('.addInfo').hide();
			//显示出模态框
			$("#" + modal_id).modal({
				keyboard : true
			})

	}

	//信息选择导出按钮事件绑定
	var export_info = function() {
		//显示确认导出按钮
		parent_div.find('.sure_export').show();
		parent_div.find('.all_sure_export').show();
		//给每行的tr给与点击事件，通过点击tr来让checkbox选中
		var tr = parent_div.find('#info_table tbody tr');
		tr.each(function() {
			$(this).find("td:first").empty().append('<input name="check" type="checkbox">');
		});
		tr.on("click", function() {
			var check_attr = $(this).find('td input[name="check"]').is(":checked");
			if (check_attr == false) {
				$(this).find('td input[name="check"]').attr("checked", "true");
			} else {
				$(this).find('td input[name="check"]').removeAttr("checked");
			}
		});
	}
	//确定导出
	var sure_export = function() {
		parent_div.find('#info_table tbody tr').each(function() {
			if (($(this).find(' input[name="check"]').is(':checked')) == true) {
				data.export_id += $(this).find('input[type="hidden"]').val() + ',';
			}
		})
		//通过a标签的链接属性，判断是哪一个导出模态框内的值
		$('#student_export_' + a_href + ' .tab-inneed button').each(function() {
			if ($(this).attr('value') != undefined) {
				data.export_name += $(this).val() + ',';
			}
		})
		if (data.export_id != "" && data.export_name != "") {
			window.open("/jxkyglxt/Student/student_ExportExcelCollection?tableName=" + data.tableName + "&export_id=" + (data.export_id).substring(0, data.export_id.length - 1) + "&export_name=" + (data.export_name).substring(0, data.export_name.length - 1));
		//location.href = "/jxkyglxt/Admin/admin_ExportExcelCollection?tableName=" + data.tableName + "&export_id=" + (data.export_id).substring(0, data.export_id.length - 1) + "&export_name=" + (data.export_name).substring(0, data.export_name.length - 1);
		} else {
			toastr.error("未选择数据");
			return;
		}
		data.export_id = "";
		data.export_name = "";
		//移除点击事件
		parent_div.find('#info_table tbody tr').unbind();
		//确认导出按钮隐藏,this为当前被点击的元素
		parent_div.find('.sure_export').hide();
		parent_div.find('.all_sure_export').hide();
		//将tr的第一个td返回显为数字
		parent_div.find('#info_table tbody tr').each(function(i, v) {
			$(this).children('td:first-child').empty().html(i + 1);
		})
	}
	//导出全部
	var all_sure_export = function() {
		//通过a标签的链接属性，判断是哪一个导出模态框内的值
		$('#student_export_' + a_href + ' .group-list button').each(function() {
			if (($(this).children('i').hasClass('fa-check')) && $(this).attr('value') != undefined) {
				data.export_name += $(this).val() + ',';
			}
		})
		console.log(data.export_name);
		if (data.export_name != "") {
			window.open("/jxkyglxt/Admin/admin_ExportExcelCollection?tableName=" + data.tableName + "&export_name=" + (data.export_name).substring(0, data.export_name.length - 1));
		//location.href = "/jxkyglxt/Admin/admin_ExportExcelCollection?tableName=" + data.tableName + "&export_id=" + (data.export_id).substring(0, data.export_id.length - 1) + "&export_name=" + (data.export_name).substring(0, data.export_name.length - 1);
		} else {
			toastr.error("未选择数据");
			return;
		}
		data.export_id = "";
		data.export_name = "";
		//移除点击事件
		parent_div.find('#info_table tbody tr').unbind();
		//确认导出按钮隐藏,this为当前被点击的元素
		parent_div.find('.sure_export').hide();
		parent_div.find('.all_sure_export').hide();
		//将tr的第一个td返回显示为数字
		parent_div.find('#info_table tbody tr').each(function(i, v) {
			$(this).children('td:first-child').empty().html(i + 1);
		})
	}
	//修改信息
	var modiInfo = function() {
		//获取id
		var id = $(this).siblings('input').val();
		//隐藏添加
		$("#" + modal_id).find('.sure_add').hide();
		//查询单条用户的信息
		$.post("/jxkyglxt/Student/student_getStudentAllInfo", {
			tableName : data.tableName
		}, function(xhr) {
			//modal_id_1，除去学生前部分，方便后部分操作
			var modal_id_1 = data.tableName.replace("Student", "");
			//modal_id，最终获取到的模态框id
			var modal_id = modal_id_1.substring(0, 1).toLowerCase() + modal_id_1.substring(1) + "_modal";
			$('#' + modal_id + ' form').find("input,select").each(function() {
				var na = $(this).attr('name').split(".")[1];
				if (na == "studentId") {
					$(this).val(xhr.ObjDatas[i].object.studentId);
				} else if ($(this).attr('name') == "studentName") {
					$(this).val(xhr.ObjDatas[i].object.studentName);
				} else $(this).val(xhr.ObjDatas[i].object[na]);
			})
			//等全部信息加载完毕，再将模态框显示出来，避免模态框出现但是对应的值还未加载情况
			//如果为用户信息，则只显示基础部分（当前是学生管理页面）
			if (a_href == "info") {
				$("#" + modal_id).find('.other').show();
				$("#" + modal_id).find('.basic').hide();
			}
			//显示出模态框
			$("#" + modal_id).modal({
				keyboard : true
			});
			$("#" + modal_id).find('.sure_mod').unbind().click(function() {
				var review_data = $("#" + modal_id + " form").serialize() + "&tableName=" + data.tableName;
				$.post("/jxkyglxt/Student/student_updateStudentAllInfo", review_data, function(sxh_data) {
					if (sxh_data.result == "success") {
						toastr.success("修改成功!");
						$("#" + modal_id).modal('hide');
						doQuery();
					}
				}, "json")
			}).show();
		}, "json");
	}


	//(用户信息)修改信息
	var modiUserInfo = function() {
		//获取id、
		var id = $(this).siblings('input').val();
		//查询单条用户的信息
		$.post("/jxkyglxt/Admin/admin_getTeacherTableInfoById", {
			tableId : id,
			tableName : data.tableName
		}, function(xhr) {
			$("#info_modal .modal-body").find("input,select").each(function() {
				var na = $(this).attr('name').split(".")[1];
				if (na == "userId") {
					$(this).val(xhr.user.userId);
				} else if ($(this).attr('name') == "userName") {
					$(this).val(xhr.user.userName);
				} else $(this).val(xhr.object[na]);
			})
			//等全部信息加载完毕，再将模态框显示出来，避免模态框出现但是对应的值还未加载情况
			//如果为用户信息，则只显示基础部分（当前为用户管理页面）
			$('#info_modal .basic').show();
			$('#info_modal .other').hide();
			$('.sure_mod').show();
			//显示出模态框
			//关闭图片添加
			$('#info_modal').modal({
				keyboard : true
			});
			$('#info_modal').find('.sure_mod').unbind().click(function() {
				var review_data = $("#info_modal form").serialize() + "&tableName=" + data.tableName;
				$.post("/jxkyglxt/Teacher/teacher_userSetTableInfo", review_data, function(sxh_data) {
					if (sxh_data.result == "success") {
						toastr.success("修改成功!");
						$('#info_modal').modal('hide');
						doQuery();
					}
				}, "json")
			}).show();
		}, "json");
	}

	//查看信息(不包含用户信息)
	var viewInfo = function() {
		//获取id
		var id = $(this).siblings('input').val();
		//查询单条信息
		$.post("/jxkyglxt/Student/student_getStudentOneInfo", {
			tableId : id,
			tableName : data.tableName
		}, function(xhr) {
			//data.tableName中获取当前的表名称，进行判断对具体哪一个模态框进行操作
			//modal_id_1，除去Teacher前部分，方便后部分操作
			var modal_id_1 = data.tableName.replace("Student", "");
			//modal_id，最终获取到的模态框id
			var modal_id = "student_" + modal_id_1.substring(0, 1).toLowerCase() + modal_id_1.substring(1) + "_modal";
			$("#" + modal_id).find('.sure_add').hide();
			$("#" + modal_id).find('.sure_modi').hide();
			$("#" + modal_id + " .modal-body").find("input,select").each(function() {
				var na = $(this).attr("name").split(".")[1];
				if (na == "userId") {
					if (xhr.studentInfo)
						$(this).val(xhr.studentInfo.studentId);
				} else if (na == "userName") {
					if (xhr.studentInfo)
						$(this).val(xhr.studentInfo.studentName);
				} else $(this).val(xhr.object[na]);
				$(this).attr("disabled","disabled")
			})
			/*$.each(xhr.attachmentName, function(i, v) {
				$("#" + modal_id + " .addInfo").before(ImgManiFunc.setImgDiv(v, xhr.user.userId));
			})*/
			$("#" + modal_id + " .review-info").hide();
			$("#" + modal_id).find('.addInfo').hide();
			//显示出模态框
			$("#" + modal_id).modal({
				keyboard : true
			})
		}, "json");
	}

	//解除固化
	var relieveInfo = function() {
		var infoid = $(this).siblings('input').val();
		$(this).parent().empty().append('<img title="已解除固化"  src="img/ok1.png" />');
		$.post('/jxkyglxt/Student/student_LiftCuring', {
			tableId : infoid,
			tableName : data.tableName,
			dataState : "10"
		}, function(xhr) {
			xhr = JSON.parse(xhr);
			if (xhr.result == "success") {
				toastr.success("信息解除固化成功!");
			} else {
				toastr.error("信息解除固化失败");
			}
		}, 'json')
	}

	//页面加载开始，给与元素加载事件-----------------------end

	//页面中只需要绑定一次事件的元素绑定事件区----start
	$('.nav-tabs li a').click(function() {
		//如果已经是点击状态，则点击不作为
		if ($(this).parent('li').attr('class') == 'active') return;
		//重置页码
		data.page = 1;
		//将所有的确认导出按钮隐藏
		$('.sure_export').hide();
		//清空模糊查询内容
		data.fuzzy_query = '';
		//除去链接属性中的#号
		a_href = $(this).attr("href").substr(1);
		//获取panel-body内和所点击的类别相对应的div父元素
		parent_div = $('#' + a_href);
		//通过点击的a标签的链接属性，来给全局对象data.tableName赋值
		data.tableName = "Student" + a_href.substring(0, 1).toUpperCase() + a_href.substring(1);
		//条件筛选清空
		parent_div.find("#search_input").empty();
		//infoType，除去Student前部分
		infoType = data.tableName.replace("Student", "");
		//modal_id，最终获取到的模态框id
		modal_id = "student_" + infoType.substring(0, 1).toLowerCase() + infoType.substring(1) + "_modal";
		//执行查询操作
		doQuery();
		//导出模态框初始化
		m_check.init({
			id : '#student_export_' + a_href + ' .tab_content'
		});
	});

	//指定查询
	$('.search_info').click(function() {
		var this_object = $(this);
		if (this_object.text().trim() == "确认搜索") {
			var name = '';
			var value = '';
			this_object.siblings('#search_input').find('div').each(function() {
				name = data.tableName.replace("Student", "student") + '.' + $(this).attr('id');
				var val_arr = [];
				$(this).find('input').each(function() {
					val_arr.push($(this).val());
				});
				//将搜索的内容放入js的数据中
				info_data[data.tableName][name] = val_arr.join(",");
			});
			doQuery();
		} else if (this_object.text().trim() == "清空搜索") {
			$.confirm({
				title : '确定清空?',
				smoothContent : false,
				content : false,
				autoClose : 'cancelAction|10000',
				buttons : {
					deleteUser : {
						btnClass : 'btn-danger',
						text : '确定',
						action : function() {
							this_object.siblings('#search_input').empty();
							$.each(data, function(k, v) {
								if (k.indexOf('student') > -1) {
									data[k] = "";
								}
							})
						}
					},
					cancelAction : {
						btnClass : 'btn-blue',
						text : '取消',
					}
				}
			});
		}
	});

	//学生添加
	$('.sure_add').unbind();
	$('.sure_add').click(function() {

		var review_data = $("#" + modal_id + " form").serialize() + "&tableName=" + data.tableName;
		$.post("/jxkyglxt/Student/student_setStudentAllInfo", review_data, function(sxh_data) {

			ajaxResultVerification(sxh_data.result);
			doQuery();
			$("#" + modal_id).modal("hide");

		}, "json")
	});

	//模糊查询
	$('.fuzzy_query').click(function() {
		data.fuzzy_query = $(this).parent().prev().val();
		doQuery();
	});
	//一次事件的元素绑定事件区----end
	//导出按钮点击事件
	$('.export_button').click(export_info);
	//确认导出按钮点击事件
	$('.sure_export').click(sure_export);
	//确认导出全部按钮点击事件
	$('.all_sure_export').click(all_sure_export);
	//分页信息
	$('.panel-footer a').click(function() {
		if ($(this).parent().hasClass('disabled')) return;
		var style = $(this).text();
		switch (style) {
		case '首页':
			if (!pageDataInformation.pageIndex <= 1) {
				toastr.info("您已经在首页!");
				return;
			}
			data.page = 1;
			doQuery();
			break;
		case '上一页':
			if (!pageDataInformation.HavePrePage) {
				toastr.info("您已经在第一页!");
				return;
			}
			data.page = pageDataInformation.pageIndex - 1;
			doQuery();
			break;
		case '下一页':
			if (!pageDataInformation.HaveNextPage) {
				toastr.info("您已经在最后一页！")
				return;
			}
			data.page = pageDataInformation.pageIndex + 1;
			doQuery();
			break;
		case '尾页':
			if (pageDataInformation.pageIndex == pageDataInformation.totalPages) {
				toastr.info("您已经在尾页!");
				return;
			}
			data.page = pageDataInformation.totalPages;
			doQuery();
			break;
		}
	});
	//方法声明----start
	//查询方法
	function doQuery() {
		$.ajax({
			url : "/jxkyglxt/Student/student_getSpecifiedInformationByPaging",
			type : "post",
			async : false,
			timeout : 3000,
			data : info_data.getQueryInfo(),
			dataType : "json",
			success : function(xhr_data) {
				//记录分页信息
				setPageInfo(xhr_data);

				$('#' + a_href).find('table tbody').html(getStr(xhr_data));



				//每次做查询之后，按钮需要重新绑定事件

				$('.relieveButton').click(relieveInfo);
				$('.modiButton').click(modiUserInfo);
				$('.viewButton').click(viewInfo);

				//记录分页详情信息
				$('#pageInfo').html('当前第' + xhr_data.pageIndex + '页 | 共' + xhr_data.totalPages + '页');
				((xhr_data)=>{
					if(xhr_data.HaveNextPage){$('#page-next').removeClass('disabled')}else{ $('#page-next').addClass('disabled')}
					if(xhr_data.HavePrePage){$('#page-prev').removeClass('disabled')}else{ $('#page-prev').addClass('disabled')}
					if(xhr_data.pageIndex == 1){$('#page-first').addClass('disabled')}else{$('#page-first').removeClass('disabled')}
					if(xhr_data.pageIndex == xhr_data.totalPages || xhr_data.totalPages == 0){$('#page-last').addClass('disabled')}else{$('#page-last').removeClass('disabled')}
				})(xhr_data);
			},
			error : function() {
				toastr.warning('服务器错误!');
			}
		});
	}
	//通过a标签的href属性，获取查询到的组合成的字符串结果
	function getStr(xhr) {
		var str = "";
		switch (a_href) {
		case 'info':
			for (i = 0; i < xhr.ObjDatas.length; i++) {
				str += `<tr>
				<td>${((pageDataInformation.pageIndex - 1) * 10 + i + 1)}</td>
				<td>${xhr.ObjDatas[i].object.studentId}</td>
				<td>${xhr.ObjDatas[i].object.studentName}</td>
				<td>${xhr.ObjDatas[i].object.sex}</td>
				<td>${xhr.ObjDatas[i].object.enrolmentYear}</td>
				<td>${xhr.ObjDatas[i].object.departmentId}</td>
				<td>${xhr.ObjDatas[i].object.createTime}</td>
				<td><input type="hidden" value="${xhr.ObjDatas[i].object.studentId}">
				<button class="btn btn-default btn-xs relieveButton" title="解除固化"><i class="fa fa-chain-broken fa-lg"></i></button>
		        <button class="btn btn-default btn-xs viewButton" title="查看"><i class="fa fa-search-plus fa-lg"  aria-hidden="true"></i></button></td>`;
			}
			break;
		case 'award':
			for (i = 0; i < xhr.ObjDatas.length; i++) {
				str += `<tr>
				<td>${((pageDataInformation.pageIndex - 1) * 10 + i + 1)}</td>
				<td>${xhr.ObjDatas[i].object.awardName}</td>
				<td>${xhr.ObjDatas[i].studentInfo.studentId}</td>
				<td>${xhr.ObjDatas[i].studentInfo.studentName}</td>
				<td>${xhr.ObjDatas[i].object.awardClass}</td>
				<td>${xhr.ObjDatas[i].object.time}</td>
				<td>${xhr.ObjDatas[i].object.firstAward}</td>
				<td><input type="hidden" value="${xhr.ObjDatas[i].object.awardId}">
				<button class="btn btn-default btn-xs relieveButton" title="解除固化"><i class="fa fa-chain-broken fa-lg"></i></button>
		        <button class="btn btn-default btn-xs viewButton" title="查看"><i class="fa fa-search-plus fa-lg"  aria-hidden="true"></i></button>`;
			}
			break;
		case 'patent':
			for (i = 0; i < xhr.ObjDatas.length; i++) {
				str += `<tr>
				<td>${((pageDataInformation.pageIndex - 1) * 10 + i + 1)}</td>
				<td>${xhr.ObjDatas[i].object.patentName}</td>
				<td>${xhr.ObjDatas[i].object.studentId}</td>
				<td>${xhr.ObjDatas[i].studentInfo.studentName}</td>
				<td>${xhr.ObjDatas[i].object.patentClass}</td>
				<td>${xhr.ObjDatas[i].object.authorizationNo}</td>
				<td>${xhr.ObjDatas[i].object.time}</td>
				<td><input type="hidden" value="${xhr.ObjDatas[i].object.patentId}">
				<button class="btn btn-default btn-xs relieveButton" title="解除固化"><i class="fa fa-chain-broken fa-lg"></i></button>
		        <button class="btn btn-default btn-xs viewButton" title="查看"><i class="fa fa-search-plus fa-lg"  aria-hidden="true"></i></button>`;
			//		        <td>${xhr.ObjDatas[i].object.firstPatent}</td>
			}
			break;
		case 'paper':
			for (i = 0; i < xhr.ObjDatas.length; i++) {
				str += `<tr>
				<td>${((pageDataInformation.pageIndex - 1) * 10 + i + 1)}</td>
				<td>${xhr.ObjDatas[i].object.studentId}</td>
				<td>${xhr.ObjDatas[i].object.periodical}</td>
				<td>${xhr.ObjDatas[i].object.publishTime}</td>
				<td>${xhr.ObjDatas[i].object.includedSituation}</td>
				<td>${xhr.ObjDatas[i].object.createTime}</td>
				<td><input type="hidden" value="${xhr.ObjDatas[i].object.paperId}">
				<button class="btn btn-default btn-xs relieveButton" title="解除固化"><i class="fa fa-chain-broken fa-lg"></i></button>
		        <button class="btn btn-default btn-xs viewButton" title="查看"><i class="fa fa-search-plus fa-lg"  aria-hidden="true"></i></button>`;
			}
			break;
		case 'project':
			for (i = 0; i < xhr.ObjDatas.length; i++) {
				str += `<tr>
			    <td>${((pageDataInformation.pageIndex - 1) * 10 + i + 1)}</td>
				<td>${xhr.ObjDatas[i].object.projectName}</td>
				<td>${xhr.ObjDatas[i].object.studentId}</td>
				<td>${xhr.ObjDatas[i].object.projectLeading}</td>
				<td>${xhr.ObjDatas[i].object.userId}</td>
				<td><input type="hidden" value="${xhr.ObjDatas[i].object.projectId}">
				<button class="btn btn-default btn-xs relieveButton" title="解除固化"><i class="fa fa-chain-broken fa-lg"></i></button>
		        <button class="btn btn-default btn-xs viewButton" title="查看"><i class="fa fa-search-plus fa-lg"  aria-hidden="true"></i></button>`;
			}
			break;
		case 'class':
			for (i = 0; i < xhr.ObjDatas.length; i++) {
				str += `<tr>
				<td>${((pageDataInformation.pageIndex - 1) * 10 + i + 1)}</td>
				<td>${xhr.ObjDatas[i].object.className}</td>
				<td>${xhr.ObjDatas[i].studentInfo.studentName}</td>
				<td>${xhr.ObjDatas[i].userId || 40}</td>
				<td><input type="hidden" value="${xhr.ObjDatas[i].classId}">
				<button class="btn btn-default btn-xs relieveButton" title="解除固化"><i class="fa fa-chain-broken fa-lg"></i></button>
		        <button class="btn btn-default btn-xs viewButton" title="查看"><i class="fa fa-search-plus fa-lg"  aria-hidden="true"></i></button>`;
			}
			break;
		default:
			toastr.warning('服务器错误!');
			break;
		}
		return str;
	}

	$('select[id="all_options"]').on("change", function() {
		var option = $(this).find('option:selected');
		var pla = '';
		switch ($(this).val()) {
		case 'studentId':
			pla = '学号';
			break;
		case 'studentName':
			pla = '名字';
			break;
		case 'calendarYear':
			pla = '年制';
			break;
		case 'enrolmentYear':
			pla = '入学时间';
			break;
		case 'studentSource':
			pla = '生源地';
			break;
		case 'entranceRecord':
			pla = '入学学历';
			break;
		case 'registeredType':
			pla = '户口类型';
			break;
		case 'awardName':
			pla = '奖励名称';
			break;
		case 'studentName':
			pla = '学生名称';
			break;
		case 'studentId':
			pla = '学生学号';
			break;
		case 'awardClass':
			pla = '获奖类别';
			break;
		case 'paperName':
			pla = '论文名称';
			break;
		case 'patentClass':
			pla = '论文类型';
			break;
		case 'patentName':
			pla = '专利名称';
			break;
		case 'projectName':
			pla = '项目名称';
			break;
		case 'userId':
			pla = '负责人工号';
			break;
		case 'userName':
			pla = '负责人名称';
			break;
		default:
			break;
		}
		if (option.hasClass('true') || pla == "") {
			return;
		} else {
			var con = $(this).val();
			if ((con.indexOf("Date")) >= 0 || (con.indexOf("Time")) >= 0) {
				$(".all_options").siblings('#search_input').append('<div id="main_body">' + '<div id="' + $(this).val() + '" class="dateinput_div form-group">' +
					'<input type="text"  placeholder="' + pla + '搜索起始时间" class="form-control  riliDate"  />' + '--' +
					'<input type="text"  placeholder="' + pla + '搜索结束时间" class="form-control  riliDate" />' +
					'<button class="btn btn-primary"><i class="fa fa-times" aria-hidden="true"></i></button></div></div>')
				option.addClass('true');
				$('.dateinput_div button').click(function() {
					option.removeClass('true');
					//移除时候清空js中已存的数据
					info_data[data.tableName][data.tableName.replace("S", "s") + "." + $(this).parent().val()] = "";
					$(this).parent().remove();
				});
			} else {
				$(".all_options").siblings('#search_input').append('<div id="' + $(this).val() + '" class="input_div form-group">' +
					'<input type="text"  placeholder="' + pla + '" class="form-control"/>' +
					'<button class="btn btn-primary"><i class="fa fa-times" aria-hidden="true"></i></button></div>')
				option.addClass('true');
				$('.input_div button').click(function() {
					option.removeClass('true');
					//移除时候清空js中已存的数据
					if (con == "userName") {
						info_data["TeacherInfo"]["user.userName"] = "";
					} else {
						info_data[data.tableName][data.tableName.replace("S", "s") + "." + $(this).parent().val()] = "";
					}
					$(this).parent().remove();
					$(this).parent().empty();
				});

			}
		}
	})

	$(".btn-addon").click(addInfo);
	//方法声明----end
	//加载后默认点击学生信息管理
	$('a[href="#info"]').click();

})