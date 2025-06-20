
var projectName = '疫情防控期间某村外出务工人员信息管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '公告信息',
	url: './pages/gonggaoxinxi/list.html'
}, 

{
	name: '疫情资讯',
	url: './pages/news/list.html'
},
{
	name: '留言板',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springbootxz02k/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除","审核"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"采集员","menuJump":"列表","tableName":"caijiyuan"}],"menu":"采集员管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"分析员","menuJump":"列表","tableName":"fenxiyuan"}],"menu":"分析员管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除","分析"],"menu":"用户行程","menuJump":"列表","tableName":"yonghuxingcheng"}],"menu":"用户行程管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改","删除","新增"],"menu":"行程分析","menuJump":"列表","tableName":"xingchengfenxi"}],"menu":"行程分析管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","采集分析"],"menu":"采集数据","menuJump":"列表","tableName":"caijishuju"}],"menu":"采集数据管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"采集分析","menuJump":"列表","tableName":"caijifenxi"}],"menu":"采集分析管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"综合评估","menuJump":"列表","tableName":"zonghepinggu"}],"menu":"综合评估管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"疫情资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改"],"menu":"用户行程","menuJump":"列表","tableName":"yonghuxingcheng"}],"menu":"用户行程管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"综合评估","menuJump":"列表","tableName":"zonghepinggu"}],"menu":"综合评估管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"采集数据","menuJump":"列表","tableName":"caijishuju"}],"menu":"采集数据管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"采集分析","menuJump":"列表","tableName":"caijifenxi"}],"menu":"采集分析管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"综合评估","menuJump":"列表","tableName":"zonghepinggu"}],"menu":"综合评估管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"采集员","tableName":"caijiyuan"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","分析"],"menu":"用户行程","menuJump":"列表","tableName":"yonghuxingcheng"}],"menu":"用户行程管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改"],"menu":"行程分析","menuJump":"列表","tableName":"xingchengfenxi"}],"menu":"行程分析管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","采集分析"],"menu":"采集数据","menuJump":"列表","tableName":"caijishuju"}],"menu":"采集数据管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改"],"menu":"采集分析","menuJump":"列表","tableName":"caijifenxi"}],"menu":"采集分析管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"综合评估","menuJump":"列表","tableName":"zonghepinggu"}],"menu":"综合评估管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"分析员","tableName":"fenxiyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
