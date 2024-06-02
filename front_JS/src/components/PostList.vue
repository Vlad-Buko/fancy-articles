<template>
  <div class="post" v-for="post in posts">

    <div><strong>Товар: </strong> {{post.product}}</div>
    <div><strong>Имя поставщика: </strong> {{post.nameSupplier}}</div>
    <div><strong>Дата продажи: </strong> {{post.dateSales}}</div>
    <div><strong>Имя продавца: </strong> {{post.nameSeller}}</div>
    <div><strong>Имя покупателя: </strong> {{post.nameCustomer}}</div>
    <div><strong>Тип оплаты: </strong> {{post.payid}}</div>
    <div><strong>Товар: </strong> {{post.product}}</div>
  </div>
</template>

<script>
export default {
  props: {
    posts: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>
.post {
  padding: 15px;
  border: 2px solid teal;
  margin-top: 15px;
}
</style>