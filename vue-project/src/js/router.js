import VueRouter from "vue-router"
import Vue from "vue"

import vSub1 from "../components/sub1.vue"
import vSub2 from "../components/sub2.vue"
import vSub3 from "../components/sub3.vue"
import crawls from "../components/crawls.vue"
Vue.use(VueRouter)

const router = new VueRouter({
    mode: "history",
    routes:[
        {
            path:"/sub1",
            alias:"/",
            component:vSub1
        },
        {
            path:"/sub2",
            component:vSub2
        },
        {
            path:"/sub3",
            component:vSub3
        },
        {
            path:"/crawls",
            component:crawls
        },
    ]
});

export default router