<template>
  <div class="post">
    <div>
      <div><strong>Марка: </strong> {{post.id}}</div>
      <div><strong>Модель: </strong> {{post.model}}</div>
    </div>
    <div class="post__buttons">
      <MyButton
      @click="$emit('remove', post)">Удалить </MyButton>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    post: {
      type: Object,
      required: true,
    }
  }
}
</script>

<style scoped>
.post {
  padding: 20px;
  border: 3px solid slategrey;
  margin-top: 14px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
</style>