<template>
  <div class="perfil">
   
    <div class="container-fluid">
    <div class="row">
    <form id= "perfil1" class="text-center border border-light p-5" action="#!" style="background-color: indigo; ">
        <img src="../assets/c.png" alt="error" height="110" width="350" >
        <div class="col">
        <input type="text" id="id" class="form-control " placeholder="ID" v-model="id">
        <input type="text" id="user" class="form-control " placeholder="Nome" v-model="nome">
        <input type="email" id="email" class="form-control mb-4" placeholder="E-mail" v-model="email">
        <input type="date" id="nascimento" class="form-control mb-4" placeholder="Data de nascimento" v-model="datanascimento">
        <input type="password" id="senha" class="form-control mb-4" placeholder="Senha" v-model="senha">
        <input type="password" id="confirmasenha" class="form-control mb-4" placeholder="Confirmar Senha" v-model="confirmasenha">
        
        </div>
        
        <button id="perfil2" class="btn btn-info my-4 btn-block" type="submit" @click="editar" > Confirmar </button>
        
    </form>
    </div>
    </div>
  </div>
</template>

<script>

export default {
name: 'Cadastrousuario',
 data: function() {
    return {
      id: "",
      nome: "",
      email: "",
      datanascimento: "",
      senha: "",
      confirmasenha: "",
      baseURI: "http://localhost:8080/api/usuarios",
    };
  },
  methods: {
    editar: function() {
      let obj = {
        nome: this.nome,
        email: this.email,
        datanascimento: this.datanascimento,
        senha: this.senha
      };

      this.$http.put(this.baseURI, obj).then((result) => {
        if (result.data != "") {
          
          alert("Perfil editado com sucesso!");
          this.$router.push({ name: 'Home'});
        } 
      });

 },
 },
};
</script>

<style>

#perfil1{
    width: 500px;
    padding: 40px;
    left: 430px;
    position: absolute;
    background: white;
    text-align: center;
    transition: 0.25s;
    margin-top: 100px;
    border-radius: 50px 50px 50px 50px;
    -moz-border-radius: 50px 50px 50px 50px;
    -webkit-border-radius: 50px 50px 50px 50px;
    border-color: #2ecc71; 
    border-width: 5px;   
}

#perfil1 input[type="text"],
#pefil1 input[type="email"],
#pefil1 input[type="date"],
#perfil1 input[type="password"] {
    border: 0;
    background: white;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    padding: 10px 10px;
    width: 250px;
    outline: none;
    color: black;
    border-radius: 24px;
    transition: 0.25s
}

button #perfil2[type="submit"] {
    border: 0;
    background: white;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    padding: 14px 40px;
    outline: none;
    color: black;
    border-radius: 24px;
    transition: 0.25s;
    cursor: pointer
}

button #pefil2[type="submit"]:hover {
    background: #2ecc71
}

.forgot {
    text-decoration: underline
}
</style>