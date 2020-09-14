<template>
  <div id="app">
    <router-link to="/sub1">sub1 </router-link>
    <router-link to="/sub2">sub2 </router-link>
    <router-link to="/sub3">sub3 </router-link>
    <router-link to="/crawls">crawls </router-link>
  
    <router-view></router-view>
  </div>
</template>

<script>


export default {
  name: 'app',
  components: {


  }

}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
