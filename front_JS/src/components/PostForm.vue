<template>
  <form @submit.prevent>
    <h1>Ввод данных по продаже</h1>
    <div id="v-model-select" class="demo">

    </div>
    <p>Товар</p>
    <select v-model="post.product" id="product">
      <option>Сделайте выбор</option>
      <option></option>
    </select>
    <p>Поставщик</p>
    <select v-model="post.nameSupplier" id="supplier">
      <option>Сделайте выбор</option>
      <option></option>
    </select>
    <p>Покупатель</p>
    <select v-model="post.product" id="prod">
      <option>Сделайте выбор</option>
      <option></option>
    </select>
    <p>Продавец</p>
    <select v-model="post.product" id="pr2od">
      <option>Сделайте выбор</option>
      <option></option>
    </select>
    <p>Тип оплаты</p>
    <select v-model="post.product" id="pod">
      <option>Сделайте выбор</option>
      <option></option>
    </select>
    <p>Дата</p>
    <input
        v-model="post.dateSales"
        class="input"
        type="date"
        placeholder="Название">
    <input
        v-model="post.body"
        class="input"
        type="text"
        placeholder="Заметка">
    <button
        class="btn"
        @click="createPost"> Ввести данные по продаже</button>
  </form>
</template>

<script>
import axios, {post} from "axios";

export default {
  data1() {
    return {
      products: [
      ],
    }
  },
  data () {
    return {
      post: {
        product:'',
        nameSupplier: '',
        nameSeller: '',
        nameCustomer:'',
        dateSales: '',
        paymentType: '',
        note: ''
      }
    }
  },
  methods: {
    createPost() {
      // подписываемся на родительский класс
      this.$emit('create', this.post)
      this.post = {
        product:'',
        nameSupplier: '',
        nameSeller: '',
        nameCustomer:'',
        dateSales: '',
        paymentType: '',
        note: ''
      }
    },
    async getDataProduct() {
      // Поставщики
      let newArray;
      try {
        const response = await axios.get("http://localhost:8081/supplier/list")
        var arr = [];
        arr.push(response.data);
        // Из массива массив
        newArray = arr.flat();
      } catch (e) {
        alert('Ошибка')
      }
      let selectedOption = supplier.options[supplier.selectedIndex];
      selectedOption.value;
      selectedOption.text;
      let newOption;
      for (let i = 0; i < newArray.length; i++) {
        newOption = new Option(newArray[i].nameCompany, newArray[i].id);
        supplier.append(newOption);
      }

      // Товар
      let newArrayProduct;
      try {
        const responseOne = await axios.get("http://localhost:8081/api/products/list")
        var arr1 = [];
        arr1.push(responseOne.data);
        newArrayProduct = arr1.flat();
      } catch (e) {
        alert('Ошибка')
      }
      let selectedOption1 = product.options[product.selectedIndex];
      selectedOption1.value;
      selectedOption1.text;
      let newOption1;
      for (let i = 0; i < newArrayProduct.length; i++) {
        newOption1 = new Option(newArrayProduct[i].nameProduct, newArrayProduct[i].id);
        product.append(newOption1);
      }

    }
  },

  mounted() {
    this.getDataProduct();
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