module.exports = { // meetroom
	PROJECT_COLOR: '#28a887',
	NAV_COLOR: '#ffffff',
	NAV_BG: '#28a887',

	// setup
	SETUP_CONTENT_ITEMS: [
		{ title: '关于我们', key: 'SETUP_CONTENT_ABOUT' },
		{ title: '用户注册使用协议', key: 'SETUP_YS' }
	],

	// 用户 
	USER_FIELDS: [
		{ mark: 'sex', title: '性别', type: 'select', selectOptions: ['男', '女'], must: true },
		{ mark: 'birth', type: 'date', title: '出生年月', must: true },
		{ mark: 'college', type: 'text', title: '学院系所', must: true, min: 2, max: 200 },
		{ mark: 'major', type: 'text', title: '所学专业', must: true, min: 2, max: 200 },
		{ mark: 'item', type: 'text', title: '班级', must: true, min: 2, max: 200 },
		{ mark: 'year', type: 'year', title: '入学年份', must: true, },
		{ mark: 'no', type: 'text', title: '学号', must: true, },
	],


	NEWS_NAME: '公告',
	NEWS_CATE: [
		{ id: 1, title: '公告通知' },
		{ id: 2, title: '校园动态' },
	],
	NEWS_FIELDS: [
		{ mark: 'desc', type: 'textarea', title: '简介', must: true, min: 2, max: 200 },
		{ mark: 'content', title: '详细内容', type: 'content', must: true },
		{ mark: 'cover', type: 'image', title: '封面图', must: true, min: 1, max: 1 },
	],


	MEET_NAME: '预约',
	MEET_CATE: [
		{ id: 1, title: '图书馆' },
		{ id: 2, title: '教学楼' },
		{ id: 3, title: '实验室' },
		{ id: 4, title: '院系楼' },
		{ id: 5, title: '考研自修室' },
		{ id: 6, title: '其他' },

	],
	MEET_FIELDS: [
		{ mark: 'cover', title: '封面图', type: 'image', min: 1, max: 1, must: true },
		{ mark: 'time', title: '预约时段设置', type: 'rows', ext: { titleName: '时段', maxCnt: 15, minCnt: 1 }, must: false },
		{ mark: 'tag', title: '特色', type: 'checkbox', selectOptions: ['饮水机', '咖啡机', '打印机', '充电宝', '独立隔间', '安静', '近宿舍', '近食堂', '近教学楼', 'WIFI'], ext: { show: 'row' }, checkBoxLimit: 0, must: false },
		{ mark: 'desc', title: '预约须知', type: 'content', must: true },
	],
	MEET_JOIN_FIELDS: [
		{ mark: 'name', type: 'text', title: '姓名', must: true, max: 30 },
		{ mark: 'phone', type: 'mobile', title: '手机', must: true, edit: false }
	],


}