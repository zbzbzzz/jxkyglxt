package util;

public class ExcelHead {
	private final static String[] TeacherAward = { "奖励ID", "用户工号", "获奖作品名称", "奖励名称", "获奖者姓名", "获奖者工号", "奖励类型", "获奖类别",
			"获奖等级", "获奖级别", "获奖时间", "获奖证书编号", "授予单位" };

	private final static String[] TeacherInfo = { "教职工信息ID", "用户工号", "证件类型", "证件号码", "名族", "国籍", "港澳台", "华侨", "政治面貌",
			"性别", "出生年月", "最高学历", "最高学位", "学缘", "专业技术职称", "职称级别", "学科类别", "参加工作时间", "入校时间", "教师资格证号", "授课类型", "授课状态","校外教师类型",
			"任教专业名称", "任教专业代码", "专业任教时间", "是否实验技术人员", "是否双师型", "是否工程背景", "是否行业背景", "行政职务级别", "研究生导师类型", "校内指导博士生人数",
			"校内指导研究生人数", "职工类型", "录用类型", "任职状态", "异动类型", "高校调入", "本校毕业", "本校调整"};

	private final static String[] TeacherPaper = { "论文ID", "用户工号", "论文名称", "作者", "作者工号_排名", "论文类别", "发表期刊", "期号",
			"发表日期", "收录情况", "他引次数", "是否与行业联合发表", "是否与地方联合发表", "是否与国际联合发表", "是否是跨学科论文", "成果字数（千字）" };

	private final static String[] TeacherPatent = { "专利ID", "用户ID", "作者", "作者工号_排名", "专利类型", "授权号", "获批日期", "是否应用" };

	private final static String[] TeacherProject = { "项目ID", "用户ID", "项目名称", "项目来源", "成员姓名", "成员工号_排名", "立项编号或批准文号",
			"项目类别", "立项日期", "结题验收或鉴定日期", "经费(万元)", "参与教师数", "级别", "是否重点" };

	private final static String[] TeacherWorks = { "著作ID", "用户ID", "著作（专著）名称", "著作类别", "出版社", "ISBN", "出版时间", "入选情况",
			"入选时间", "主编（作者）", "主编工号（多个以逗号隔开）_排名", "副主编", "副主编工号（多个以逗号隔开）_排名", "参编", "参编工号（多个以逗号隔开）_排名" };

	private final static String[] StudentAward = { "奖励ID", "获奖名称", "学号", "学生名称", "奖励类别", "授权号", "获批时间", "是否第一发明人" };

	private final static String[] StudentInfo = { "学号", "姓名", "年制", "入学年份", "证件类型", "证件号码", "出生年份", "性别", "民族", "政治面貌",
			"生源地", "学生类型", "招生类型", "授课方式", "专业代码", "专业名称", "自主专业名称", "所在学院", "是否师范类型", "是否残疾", "异动类型", "入学学历", "招生方式",
			"休退学原因", "户口类型", "是否授予学位" };

	private final static String[] StudentPaper = { "论文ID", "论文名称", "学号", "学生名称", "发表刊期", "发表时间", "收录情况" };

	private final static String[] StudentPatent = { "专利ID", "专利名称", "学号", "学生名称", "专利类别", "授权号", "获批日期", "是否第一发明人" };

	private final static String[] StudentProject = { "项目ID", "项目名称", "学号", "学生名称", "发表刊期", "负责人工号", "负责人名称" };

	public static String[] getExcelHeadArray(String str) {
		String[] st = null;
		if ("TeacherAward".equals(str)) {
			st = TeacherAward;
		} else if ("TeacherInfo".equals(str)) {
			st = TeacherInfo;
		} else if ("TeacherPaper".equals(str)) {
			st = TeacherPaper;
		} else if ("TeacherPatent".equals(str)) {
			st = TeacherPatent;
		} else if ("TeacherProject".equals(str)) {
			st = TeacherProject;
		} else if ("TeacherWorks".equals(str)) {
			st = TeacherWorks;
		} else if ("StudentInfo".equals(str)) {
			st = StudentInfo;
		} else if ("StudentPaper".equals(str)) {
			st = StudentPaper;
		} else if ("StudentPatent".equals(str)) {
			st = StudentPatent;
		} else if ("StudentProject".equals(str)) {
			st = StudentProject;
		} else if ("StudentAward".equals(str)) {
			st = StudentAward;
		}
		return st;
	}
}
