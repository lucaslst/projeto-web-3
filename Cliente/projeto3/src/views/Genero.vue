<template>
<div class="genero">

 <header id="genero3">
    
    <div class="center" id="genero1">
    <nav>
   
      <ul id="genero2">
        <li class="genero4"><img src="../assets/logof.png" alt="" height="140" width="300" > <img src="../assets/icone.png" height="40" width="50 " alt=""></li>
        <li class="genero4"><a class="genero5" href="" @click="home">Início</a></li>
        <li class="genero4"><a class="genero5" href="" @click="genero">Genêros</a></li>
        <li class="genero4"><a class="genero5" href="" @click="autor">Autores</a></li>
        <li class="genero4"><a class="genero5" href="" @click="publicar">Publicar</a></li>
        <li class="genero4"><a class="genero5" href="" >Perfil</a></li>
        <li class="genero4" >
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
        <input type="text" name="" id="genero" v-model="genero" /><br /><br />
        <button @click="getLivroByGenero" class="btn btn-success"> Listar Livros Por Genero </button><br /><br />
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
  name: "Genero",
    data() {
    return {
      genero: "",  
      logged: true,
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
    getLivroByGenero: function() {
      this.$http.get(this.baseURI + "/search?genero=" + this.genero).then((result) => {
        this.livros = result.data;
      })
        .catch(function(error) {
          console.log(error);
        });
    }
  }
}
</script>

<style>

*{margin: 0; padding: 0; box-sizing: border-box;}

#genero1{
 max-width: 1100px;
 margin: 0 150;
 padding: 0 2%;

}

#genero2{
height: 100px;

}

#genero3{

    padding: 6px 0;
    text-align: center;
    background:transparent;
}

.genero4{
    display: inline-block;
    margin: 0 10px;

}

.genero5{

    text-decoration: none;
    color: ivory;
    
}

</style>