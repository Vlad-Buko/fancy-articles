import { createApp } from 'vue'
import App from './App'
import components from '../../../Project-BSUIR/project_004/src/components/UI'

const app = createApp(App)

components.forEach(component => {
    app.component(component.name, component)
})

app.mount('#app')
