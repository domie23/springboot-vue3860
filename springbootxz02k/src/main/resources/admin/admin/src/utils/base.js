const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootxz02k/",
            name: "springbootxz02k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootxz02k/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疫情防控期间某村外出务工人员信息管理系统"
        } 
    }
}
export default base
