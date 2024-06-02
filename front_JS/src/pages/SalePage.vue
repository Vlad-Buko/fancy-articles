<template>
  <div  >
    <PostForm
        @create="createPost"/>
    <!--    Указали функцию которая должна отработать , создание списка-->

    <!--    подписались на событие-->
    <PostList
        :posts="posts"
    />
  </div>
  <router-link to="/product">Товар     </router-link> <p></p>
  <router-link to="/supplier">Поставщики     </router-link> <p></p>
  <router-link to="/customer">Покупатели     </router-link> <p></p>
  <router-link to="/">    На главную</router-link>

</template>

<script>
import PostForm from "@/components/PostForm";
import PostList from "@/components/PostList";
import axios, {post} from 'axios';

export default {
  components: {
    PostList, PostForm
  },
  data() {
    return {
      posts: [
      ],
    }
  },
  methods: {
    createPost(post) {
      console.log(post)
    },
    inputTitle(event) {
    },
    async fetchPost() {
      try {
        const response = await axios.get("http://localhost:8081/sale")
        this.posts = response.data;
      } catch (e) {
        alert('Ошибка')
      }
    }
  },

  mounted() {
    this.fetchPost();
  }

}
</script>


<style scoped>

</style>