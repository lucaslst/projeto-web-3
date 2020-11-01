<template>
  <div class="editar">
   
    <div class="container-fluid">
    <div class="row">
    <form id="edit1" class="text-center border border-light p-5" action="#!" style="background-color: indigo; ">
        <img src="../assets/c.png" alt="error" height="110" width="350" >
        <div class="col">
        <input type="text" id="id" class="form-control" placeholder="id" v-model="id">
        <input type="text" id="titulo" class="form-control " placeholder="Título" v-model="titulo">
        <input type="text" id="genero" class="form-control " placeholder="Genero" v-model="genero">
        <input type="text" id="autor" class="form-control " placeholder="Autor" v-model="autor">
        <input type="text" id="sinopse" class="form-control " placeholder="sinopse" v-model="sinopse">
        <input type="date" id="datapublicacao" class="form-control " placeholder="Data de Publicacao" v-model="datapublicacao">
        <input type="text" id="numerototalcapitulos" class="form-control " placeholder="Número Total de Capítulos" v-model="numerototalcapitulos">
        
        </div>
        
        <button id="edit2" class="btn btn-info my-4 btn-block" type="submit" @click="editar" > Confirmar </button>
        
    </form>
    </div>
    </div>
  </div>
</template>

<script>

export default {
 name: 'Editar', 
 data: function() {
    return {
      id: "",
      titulo: "",
      genero: "",
      autor:"",
      sinopse:"",
      datapublicacao: "",
      numerototalcapitulos: "",
      livro: {},
      livros: [],
      baseURI: "http://localhost:8080/api/livros",
    };
  },
  methods: {
    editar: function() {
      let obj = {
        titulo: this.titulo,
        genero: this.genero,
        autor: this.autor,
        sinopse: this.sinopse,
        datapublicacao: this.datapublicacao,
        numerototalcapitulos: this.numerototalcapitulos
      };

      this.$http.put(this.baseURI + "/" + this.id, obj).then((result) => {
        console.log(result);
        this.livro = result.data;
      });
    },
 },
};
</script>

<style>

#edit1{
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

#edit2[type="submit"] {
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

#edit1 input[type="text"],
#edit1 input[type="email"],
#edit1 input[type="date"],
#edit1 input[type="password"] {
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

#edit2 [type="submit"]:hover {
    background: #2ecc71
}

.forgot{
    text-decoration: underline
}
</style>