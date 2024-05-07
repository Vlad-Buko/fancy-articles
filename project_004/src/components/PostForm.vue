<template>
  <form @submit.prevent>
    <h4>Добавляем автомобиль</h4>
    <my-input
        v-model="post.model"
        type="text"
        placeholder="Марка"/>
    <my-input
           v-model="post.body"
           type="text"
           placeholder="Модель"/>
    <MyButton
        class="btn"
        style="align-self: flex-end; margin-top: 15px"
        @click="createPost"
    >Создать!</MyButton>
  </form>
</template>

<script>
import MyInput from "./UI/MyInput";
export default {
  components: {MyInput},
  data() {
    return {
      post: {
        model: '',
        body: ''
      }
    }
  },
  methods: {
    createPost() {
      this.post.id = Date.now();
      this.$emit('create', this.post, 'second param', '3 param')
      this.post= {
        model: '',
        body: ''
      }
    }
  }
}
</script>

<style scoped>
form {
  display: flex;
  flex-direction: column;
}
</style>