<template>
<div class = "autor">

 <header id = "autor3">
    
    <div class="center" id = "autor1">
    <nav>
   
      <ul id = "autor2">
        <li class= "autor4"><img src="../assets/logof.png" alt="" height="140" width="300" > <img src="../assets/icone.png" height="40" width="50 " alt=""></li>
        <li class= "autor4"><a class= "autor5" href="" @click="home">Início</a></li>
        <li class= "autor4"><a class= "autor5" href="" @click="genero">Genêros</a></li>
        <li class= "autor4"><a class= "autor5" href="" @click="autor">Autores</a></li>
        <li class= "autor4"><a class= "autor5" href="" @click="publicar">Publicar</a></li>
        <li class= "autor4"><a class= "autor5" href="" @click="perfil">Perfil</a></li>
        <li class= "autor4">
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
        <input type="text" name="" id="autor" v-model="autor" /><br /><br />
        <button @click="getLivroByAutor" class="btn btn-success"> Listar Livros Por Autor </button><br /><br />
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
  name: "Autor",
    data() {
    return {
      autor: "",  
      logged: true,
      livros: [],
      baseURI: "http://localhost:8080/api/livros",
    };
  },
  methods: {
    perfil() {
     this.$router.push({ name: "Perfil"}).catch(()=>{});
   },
     autor() {
     this.$router.push({ name: "Autor"}).catch(()=>{});
   },
    genero() {
     this.$router.push({ name: "Genero"}).catch(()=>{});
   }, 
   home() {
     this.$router.push({ name: "Home"}).catch(()=>{});
   }, 
   publicar() {
     this.$router.push({ name: "Publicar"}).catch(()=>{});
   },
    getLivroByAutor: function() {
      this.$http.get(this.baseURI + "/search?autor=" + this.autor).then((result) => {
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

#autor1{
 max-width: 1100px;
 margin: 0 150;
 padding: 0 2%;

}

#autor2{
height: 100px;

}

#autor3{

    padding: 6px 0;
    text-align: center;
    background:transparent;
}

.autor4{
    display: inline-block;
    margin: 0 10px;

}

.autor5{

    text-decoration: none;
    color: ivory;
    
}

</style>