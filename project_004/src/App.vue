<template>
  <div class="application">
    <h1>Галантерейный магазин</h1>
    <my-button @click="fetchPost">Получить данные</my-button>
    <my-button @click="showDialog" style="margin: 15px ">Поставщики</my-button>
    <my-button @click="showDialog" style="margin: 15px ">Продажи</my-button>
    <my-button @click="showDialog" style="margin: 15px ">Продавцы</my-button>
    <my-dialog v-model:show="dialogVisible">
      <PostForm  @create="createAuto"/>
    </my-dialog>

    <PostList :posts="posts"
    @remove=" removePost" />
  </div>

</template>

<script>
import PostForm from "@/../../../Project-BSUIR/project_004/src/components/PostForm";
import PostList from "@/../../../Project-BSUIR/project_004/src/components/PostList";
import MyDialog from "../../../Project-BSUIR/project_004/src/components/UI/MyDialog";
import MyButton from "../../../Project-BSUIR/project_004/src/components/UI/MyButton";
// import axios from 'axios';

export default {
  components: {
    MyButton,
    MyDialog,
    PostList, PostForm
  },
  data() {
    return {
      posts: [
        {id: 1, model: 'Opel', body: 'Calibra'},
        {id: 2, model: 'BMW', body: 'e34'},
        {id: 3, model: 'MB', body: 'e-class'}
      ],
      dialogVisible: false,
    }
  },
  methods: {
    createAuto (post) {
      this.posts.push(post);
      this.dialogVisible = false
    },
    removePost(post) {
      this.posts = this.posts.filter(p => p.id !== post.id )
    },
    showDialog() {
      this.dialogVisible = true;
    },
    async fetchPost() {
      try {
        const response = await axios.get('http://localhost:8080/list')
        console.log(response);
      } catch (e) {
        alert('Ошибка')
      }
    }

  }
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
</style>