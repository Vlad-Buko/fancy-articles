<template>
  <form @submit.prevent>
    <h4>Введите данные поставщика</h4>
    <div id="v-model-select" class="demo">

    </div>

    <input
        v-model="supplier.nameCompany"
        class="input"
        type="text"
        placeholder="Название компании">
    <input
        v-model="supplier.email"
        class="input"
        type="text"
        placeholder="Адрес почты">
    <input
        v-model="supplier.legalAddress"
        class="input"
        type="text"
        placeholder="Юр адрес">
    <input
        v-model="supplier.phoneNumber"
        class="input"
        type="text"
        pattern="^\+375[1-9]{10}$" required
        placeholder="Контактный телефон">
    <button
        class="btn"
        @click="createSupplier"> Добавить поставщика </button>
  </form>
</template>

<script>
export default {
  data () {
    return {
      supplier: {
        nameCompany: '',
        legalAddress: '',
        email: '',
        phoneNumber: ''
      }
    }
  },
  methods: {
    createSupplier() {
      // подписываемся на родительский класс
      this.$emit('create', this.supplier)
      this.supplier = {
        nameCompany: '',
        legalAddress: '',
        email: '',
        phoneNumber: ''
      }
    },
    removeSupplier() {
      // подписываемся на родительский класс
      this.$emit('remove', this.supplier)
      this.supplier = {
        phoneNumber: ''
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
.input{
  width: 100%;
  border: 1px solid teal;
  padding: 10px 15px;
  margin-top: 15px;
}
.btn {
  margin-top: 15px;
  align-self: flex-start;
  padding: 10px 15px;
  background: no-repeat;
  color: teal;
  border: 1px solid teal;
}

</style>