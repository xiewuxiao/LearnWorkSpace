<template>
  <div id="app">
    <h1>你奶奶个熊</h1>
    <router-link to="helloworld"><button>首页</button></router-link>
    <router-link to="mychatgtp">><button>chatgpt</button></router-link>
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
    // HelloWorld,
    // MyChatGpt
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
