<template>
  <div class="cadastrous">
    <div class="container-fluid">
      <div class="row">
        <form id="cadus" class="text-center border border-light p-5"
          action="#!"
          style="background-color: indigo"
        >
          <img src="../assets/c.png" alt="error" height="110" width="350" />
          <div class="col">
            <input
              type="text"
              id="nome"
              class="form-control"
              placeholder="Usuário"
              v-model="nome"
            /><br />
            <input
              type="email"
              id="email"
              class="form-control mb-4"
              placeholder="E-mail"
              v-model="email"
            />
            <input
              type="text"
              id="nascimento"
              class="form-control mb-4"
              placeholder="Data de nascimento"
              v-model="datanascimento"
              onkeypress="$(this).mask('00/00/0000');"
            />
            <input
              type="password"
              id="senha"
              class="form-control mb-4"
              placeholder="Senha"
              v-model="senha"
            />
            <input
              type="password"
              id="confirmasenha"
              class="form-control mb-4"
              placeholder="Confirmar Senha"
              v-model="confirmasenha"
            />
          </div>

          <button
            class="btn btn-info my-4 btn-block"
            type="submit"
            @click="salvar"
          >
            Confirmar
          </button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Cadastrousuario",
  data: function () {
    return {
      nome: "",
      email: "",
      datanascimento: "",
      senha: "",
      confirmasenha: "",
      baseURI: "http://localhost:8080/api/usuarios",
    };
  },
  created: function () {
    if (this.$session.exists()) {
      this.$router.push({ name: "Home"}).catch(() => {});
    }
  },
  methods: {
    salvar: function () {
      let obj = {
        nome: this.nome,
        email: this.email,
        datanascimento: this.datanascimento,
        senha: this.senha,
        confirmasenha:this.confirmasenha
      };

      if (this.nome.length == 0 || this.email.length == 0 || this.senha.length == 0 || this.datanascimento.length ==0 || this.senha.length ==0) {
        alert("preencha todos os campos!");
      }if(this.senha != this.confirmasenha){
        alert("As senhas não conferem");
      }if(this.senha.length < 8){
        alert("Senha fraca menos de 8 caracteres!!");
      }
        this.$http.post(this.baseURI, obj).then((result) => {
          if (result.data != "") {
            this.$session.start();
            this.$session.set("usuario", JSON.stringify(result.data));
            alert("Cadastro realizado com sucesso!");
            this.$router.push({ name: "Home" });
          } 
        });
      
    },
  },
};
</script>

<style>

#cadus{
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

#cadus input[type="text"],
#cadus input[type="email"],
#cadus input[type="password"] {
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

button #cadaus[type="submit"] {
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

button #cadaus[type="submit"]:hover {
    background: #2ecc71
}

.forgot {
    text-decoration: underline
}
</style>