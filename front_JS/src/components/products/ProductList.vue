<template>
  <div class="supplier" v-for="product in products">
    <div><strong>Наименоввание продукта: </strong> {{product.nameProduct}}</div>
    <div><strong>Стоимость: </strong> {{product.price}}</div>
    <div><strong>Категория: </strong> {{product.productCategories}}</div>
    <button @click="$emit('remove', product.code)">Удалить</button>
  </div>
</template>

<script>
export default {
  props: {
    products: {
      type: Array,
      required: true,
    }
  },
}
</script>

<style scoped>
.supplier {
  padding: 15px;
  border: 2px solid teal;
  margin-top: 15px;
  align-items: center;
  justify-content: space-between;
}
</style>