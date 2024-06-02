<template>

  <form @submit.prevent>
    <h4>Введите наименование товара</h4>
    <div id="v-model-select" class="demo">

    </div>
    <input
        v-model="product.nameProduct"
        class="input"
        type="text"
        placeholder="Наименование товара">

    <select v-model="product.category" id="products">
      <option>Сделайте выбер</option>
      <option></option>
    </select>

    <input
        v-model="product.price"
        class="input"
        type="text"
        placeholder="Цена">
    <button
        class="btn"
        @click="createProduct"> Добавить товар </button>
  </form>
</template>

<script>
import axios from "axios";

export default {
  data () {
    return {
      product: {
        nameProduct: '',
        category: '',
        price: '',
        code: ''
      }
    }
  },
  methods: {
    createProduct() {
      // подписываемся на родительский класс
      this.$emit('create', this.product)
      this.product = {
        nameProduct: '',
        category: '',
        price: '',
      }
    },
    removeSupplier() {
      // подписываемся на родительский класс
      this.$emit('remove', this.supplier)
      this.supplier = {
        phoneNumber: ''
      }
    },
    async getDataCategory() {
      let newArray;
      try {
        const response = await axios.get("http://localhost:8081/api/categories/list")
        var arr = [];
        arr.push(response.data);
        newArray = arr.flat();
      } catch (e) {
        alert('Ошибка')
      }

      // 1)
      let selectedOption = products.options[products.selectedIndex];
      selectedOption.value;
      selectedOption.text;

      let newOption;
      // 2)

      for (let i = 0; i < newArray.length; i++) {
        newOption = new Option(newArray[i].nameProduct, newArray[i].id);
        products.append(newOption);
      }
      newOption.selected = true;
    }
  },

  mounted() {
    this.getDataCategory();
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