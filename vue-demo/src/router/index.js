
import {createRouter, createWebHistory} from 'vue-router'

import HelloWorld from "@/components/HelloWorld";
import MyChatGpt from "@/components/MyChatGpt";

// 1、使用使用插件
const routerHistory = createWebHistory()


// 2、创建路由对象
const routes = [
    {
        path : '/helloworld',
        component: HelloWorld
    },  {
        path : '/mychatgtp',
        component: MyChatGpt
    },
]

const router = createRouter({
    // 配置路由与组件之间的关系
    history: routerHistory,
    routes

})

// 3、将router对象传入实例
export  default router;