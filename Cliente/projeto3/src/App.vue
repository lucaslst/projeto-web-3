<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>|
      <router-link v-if="logged == false" to="/login">Pagina Inicial</router-link>|
      <a href="/login" v-if="logged" @click="logout"  > Sair</a>
      
      
    </div>
    <router-view />
  </div>
</template>

<script>
export default {
  data() {
    return {
      logged: false,
    };
  },
  created: function () {
    if (this.$session.exists()) {
      this.logged = true;
      this.$router.push({ name: "Login"}).catch(() => {});
    }
  },
  methods: {
    logout: function () {
      this.$session.destroy();
      location.reload();
    },
  },
};
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
