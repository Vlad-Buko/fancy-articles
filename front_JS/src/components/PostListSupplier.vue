<template>
  <div class="supplier" v-for="supplier in suppliers">
    <div><strong>Имя поставщика: </strong> {{supplier.nameCompany}}</div>
    <div><strong>Юр адрес: </strong> {{supplier.legalAddress}}</div>
    <div><strong>Email адрес: </strong> {{supplier.email}}</div>
    <div><strong>Номер телефона: </strong> {{supplier.phoneNumber}}</div>
    <button @click="$emit('remove', supplier.nameCompany)">Удалить</button>
  </div>
</template>

<script>

import supplier from "@/pages/Supplier";

export default {

  props: {
    suppliers: {
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