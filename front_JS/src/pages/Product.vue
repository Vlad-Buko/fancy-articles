<template>
  <ProductForm @create="createProduct"/>
  <ProductList :products="products"
               @remove="removeProduct"/>
  <router-link to="/sales">Назад в продажи     </router-link> <p></p>
</template>

<script>
import axios from "axios";
import ProductForm from "@/components/products/ProductForm";
import ProductList from "@/components/products/ProductList";

export default {
  components: {
    ProductForm, ProductList
  },

  data() {
    return {
      products: [
      ],
    }
  },

  methods: {
    // отправка
    createProduct(product) {

      axios.post('http://localhost:8081/api/products/add', {
        nameProduct: product.nameProduct,
        productCategories: product.category,
        price: product.price,
      }).catch(function (error) {
        console.log(error.toJSON())
        alert(error)
      });
      location.reload();
    },
    removeProduct(product) {
      console.log(product)
      axios.delete("http://localhost:8081/api/products/delete/" + product)
      console.log(product)
      location.reload();
    },
    inputTitle(event) {
    },
    async fetchProduct() {
      try {
        const response = await axios.get("http://localhost:8081/api/products/list")
        this.products = response.data;

      } catch (e) {
        alert('Ошибка')
      }
    }
  },

  mounted() {
    this.fetchProduct();
  }
}
</script>

<style scoped>

</style>