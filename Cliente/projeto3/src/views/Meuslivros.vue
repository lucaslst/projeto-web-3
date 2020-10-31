<template>
<div class="meuslivros">

 <header id="ml3">
    
    <div class="center" id="ml1">
    <nav>
   
      <ul id="ml2">
        <li class="ml4"><img src="../assets/logof.png" alt="" height="140" width="300" > <img src="../assets/icone.png" height="40" width="50 " alt=""></li>
        <li class="ml4"><a class="ml5" href="" @click="home">Início</a></li>
        <li class="ml4"><a class="ml5" href="" @click="genero">Genêros</a></li>
        <li class="ml4"><a class="ml5" href="" @click="autor">Autores</a></li>
        <li class="ml4"><a class="ml5" href="" @click="publicar">Publicar</a></li>
        <li class="ml4"><a class="ml5" href="" >Perfil</a></li>
        <li class="ml4" >
            <input type="search" id="texto"  placeholder="Oq você procura?">
            <img src="../assets/lupa2-removebg-preview.png" height="48" width="60" walt="" class="btn">
        </li>
      </ul>
    </nav>
  </div>
  </header>
  <br /><br />
  <div class="container" style="height: auto;">
    <div class="row">
        <button @click="getAll" class="btn btn-success"> Listar Livros </button>
      <ul>
      <li v-for="livro in livros" :key="livro.id">
        <div>
          <div>
            <table border="2" class="table table-dark">
              <tr>
                <td>ID:</td>
                <td>Título:</td>
                <td>Genêro:</td>
                <td>Autor:</td>
                <td>Sinopse:</td>
                <td>Data de Publicaçao:</td>
                <td>Número Total de Capítulos:</td>
              </tr>

              <tr>
                <td>{{ livro.id }}</td>
                <td>{{ livro.titulo }}</td>
                <td>{{ livro.genero }}</td>
                <td>{{ livro.autor }}</td>
                <td>{{ livro.sinopse }}</td>
                <td>{{ livro.datapublicacao }}</td>
                <td>{{ livro.numerototalcapitulos }}</td>
              </tr>
            </table>
          </div>
          <div>
              <button @click="editar" class="btn btn-success"> Editar Livro </button>
              <button @click="excluir(livro.id)" class="btn btn-success"> Excluir Livro </button>
          </div>
  </div>
    <hr />
      </li>
    </ul>
  </div>
  </div>
  </div>

</template>

<script>
export default {
  name: "Meuslivros",
    data() {
    return {  
      logged: true,
      livro: {},
      livros: [],
      baseURI: "http://localhost:8080/api/livros",
    };
  },
  methods: {
     autor() {
     this.$router.push({ name: "Autor"}).catch(()=>{});
   },
    genero() {
     this.$router.push({ name: "Genero"}).catch(()=>{});
   }, 
   publicar() {
     this.$router.push({ name: "Publicar"}).catch(()=>{});
   },
   home() {
     this.$router.push({ name: "Home"}).catch(()=>{});
   },
    editar() {
     this.$router.push({ name: "EditarLivro"}).catch(()=>{});
   },
   getAll: function() {
      this.$http.get(this.baseURI).then((result) => {
        this.livros = result.data;
      });
    },
    excluir: function(id) {
      this.$http.delete(this.baseURI + "/" + id).then((result) => {
        console.log(result.status);
      });
    },

  }
}
</script>

<style>

*{margin: 0; padding: 0; box-sizing: border-box;}

#ml1{
 max-width: 1100px;
 margin: 0 150;
 padding: 0 2%;

}

#ml2{
height: 100px;

}

#ml3{

    padding: 6px 0;
    text-align: center;
    background:transparent;
}

.ml4{
    display: inline-block;
    margin: 0 10px;

}

.ml5{

    text-decoration: none;
    color: ivory;
    
}

</style>