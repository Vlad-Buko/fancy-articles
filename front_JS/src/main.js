import { createApp } from 'vue'
import App from './App'
import router from "@/router/router";


const app = createApp(App)

app
    .use(router)
    .mount('#app')
