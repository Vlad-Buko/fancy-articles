<template>
  <div  class="application">
    <router-view></router-view>
    <router-link to="/posts">О магазине</router-link>
    <router-link to="/about">О приложении</router-link>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
.app {
  padding: 20px;
}
</style>