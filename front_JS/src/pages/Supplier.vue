<template>
  <h2>Поставщики</h2>

  <PostFormSupplier @create="createSupplier" />
  <PostListSupplier
      :suppliers="suppliers"
  @remove="removeSupplier"
  />

  <router-link to="/sales">    Назад</router-link>
</template>

<script>
import PostListSupplier from "@/components/PostListSupplier";
import axios from 'axios';
import PostFormSupplier from "@/components/PostFormSupplier";

export default {
  components: {
    PostListSupplier, PostFormSupplier
  },

  data() {
    return {
      suppliers: [
      ],
    }
  },

  methods: {
    // отправка
    createSupplier(supplier) {

        axios.post('http://localhost:8081/supplier/add', {
          nameCompany: supplier.nameCompany,
          legalAddress: supplier.legalAddress,
          email: supplier.email,
          phoneNumber: supplier.phoneNumber
        }).catch(function (error) {
          console.log(error.toJSON())
          alert(error)
        });
    },
    removeSupplier(supplier) {
      axios.post('http://localhost:8081/supplier/delete', {
        phoneNumber : supplier
      })
      console.log(supplier)
      this.suppliers = null;
    },
    inputTitle(event) {
    },
    async fetchSupplier() {
      try {
        const response = await axios.get("http://localhost:8081/supplier/list")
        this.suppliers = response.data;

      } catch (e) {
        alert('Ошибка')
      }
    }
  },

  mounted() {
    this.fetchSupplier();
  }
}
</script>

<style scoped>

</style>