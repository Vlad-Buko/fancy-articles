import Main from "@/pages/Main";
import {createRouter, createWebHistory} from "vue-router";
import SalePage from "@/pages/SalePage";
import Supplier from "@/pages/Supplier";
import Product from "@/pages/Product";


const routes = [
    {
        path: '/',
        component: Main
    },
    {
        path: '/sales',
        component: SalePage
    },
    {
        path: '/supplier',
        component: Supplier
    },
    {
        path: '/product',
        component: Product
    }
]

const router = createRouter({
    routes,
    history: createWebHistory(process.env.BASE_URL)
})

export default router;