<template>
<div class="home">
  <header id="home3">
    
    <div class="center" id="home1">
    <nav>
   
      <ul id="home2">
        <li class="h5"><img src="../assets/logof.png" alt="" height="140" width="300" > <img src="../assets/icone.png" height="40" width="50 " alt=""></li>
        <li class="h5"><a class="h6" href="" @click="home">Início</a></li>
        <li class="h5"><a class="h6" href="" @click="genero">Genêros</a></li>
        <li class="h5"><a class="h6" href="" @click="autor">Autores</a></li>
        <li class="h5"><a class="h6" href="" @click="publicar">Publicar</a></li>
        <li class="h5"><a class="h6" href="" @click="perfil">Perfil</a></li>
        <li class="h5">
            <input type="search" id="texto"  placeholder="Oq você procura?">
            <img src="../assets/lupa2-removebg-preview.png" height="48" width="60" walt="" class="btn">
       </li>
      </ul>
    </nav>
  </div>
  </header>
  
    <div class="container">
        <div class="row">
            <div class="col-4">
                <div class="card bg-light m-3" style="width: 15rem;  border-radius: 50px 50px 50px 50px;" >
                    
                    <div class="card-body" style="background-color:indigo;  border-radius: 0px 0px 50px 50px;"  >
                      <h5 class="card-title text-center" style="color:ivory">Olá,Usuario </h5> 
                      <p class="card-text"><img src="../assets/iconecartao.png" alt="erro" height="50" width="50" left="10px"></p>
                      <p style="color: ivory;">R$ 0,00</p>
                      <a href="#" class="btn btn-primary" style="color:ivory" > Adicione Crédito! </a>
                      <a href="" @click="meuslivros" class="btn btn-primary" style="color:ivory" > Meus Livros </a>
                    </div>
                    
                  </div>
            
            </div>

            <div class="col-8">
                <div id="slide" class="carousel slide m-3" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-target="#slide" data-slide-to="0" class="active"></li>
                      <li data-target="#slide" data-slide-to="1"></li>
                      <li data-target="#slide" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img class="d-block h-100 w-100" src="../assets/livros.png" alt="Primeiro Slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block h-100 w-100" src="../assets/fevereiro-livros.jpg" alt="Segundo Slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block h-100 w-100" src="../assets/slidep.jpeg" alt="Terceiro Slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block h-100 w-100" src="../assets/slidepp.jpg" alt="Quarto Slide">
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#slide" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Anterior</span>
                    </a>
                    <a class="carousel-control-next" href="#slide" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Próximo</span>
                    </a>
                  </div>
            </div>
            </div>
    </div>
    <p></p>
    <div class="card" style="background-color: indigo; width: 20rem; left: 36%; right: 40%; border-radius: 50px 50px 50px 50px;" >
    <h2 style="color: ivory; font-weight:bolder;" >Destaques</h2>
    </div>
    <p></p>
    <div class="container" style="height: auto;">
        <div class="row">
            <div class="col-4">
                <div class="card" style="width: 18rem;height: 40rem;">
                    <img class="card-img-top" src="../assets/rosanegra.jpg" alt="Card image cap" height="400px">
                    <div class="card-body" style="background-color:ivory">
                      <h5 class="card-title">Rosa Negra</h5>
                      <p class="card-text">Autor: Lucas Lima</p>
                      <p class="card-text">Genero: Fantasia</p>
                      <p class="card-text">Capítulos Dispiníveis: 5</p>
                      <a href="#" class="btn btn-primary"> Ver detalhes! </a>
                    </div>
                  </div>
            </div>
            <div class="col-4">
              <div class="card" style="width: 18rem;height: 40rem;">
                  <img class="card-img-top" src="../assets/coraline.jpg" alt="Card image cap" height="400px">
                  <div class="card-body" style="background-color:ivory">
                    <h5 class="card-title">Coraline</h5>
                    <p class="card-text">Autor: Neil Gaiman</p>
                    <p class="card-text">Genero: Fantasia</p>
                    <p class="card-text">Capítulos Dispiníveis: 5</p>
                    <a href="#" class="btn btn-primary"> Ver detalhes! </a>
                  </div>
                </div>
          </div>
          <div class="col-4">
            <div class="card" style="width: 18rem; height: 40rem;">
                <img class="card-img-top" src="../assets/jogos.jpg" alt="Card image cap" height="400px">
                <div class="card-body" style="background-color:ivory">
                  <h5 class="card-title">Jogos Vorazes</h5>
                  <p class="card-text">Autor: Suzanne Colins</p>
                  <p class="card-text">Genero: Aventura</p>
                  <p class="card-text">Capítulos Dispiníveis: 10</p>
                  <a href="#" class="btn btn-primary"> Ver detalhes! </a>
                </div>
              </div>
        </div>
        <div class="col-4">
          <p></p>
          <div class="card" style="width: 18rem; height: 40rem;">
              <img class="card-img-top" src="../assets/Dom.jpg" alt="Card image cap" height="400px">
              <div class="card-body" style="background-color:ivory">
                <h5 class="card-title">Dom Casmurro</h5>
                <p class="card-text">Autor: Machado de Assis</p>
                <p class="card-text">Genero: Romance</p>
                <p class="card-text">Capítulos Dispiníveis: Completo</p>
                <a href="#" class="btn btn-primary"> Ver detalhes! </a>
              </div>
            </div>
      </div>
      <div class="col-4">
        <p></p>
        <div class="card" style="width: 18rem; height: 40rem;">
            <img class="card-img-top" src="../assets/mochileiro.png" alt="Card image cap" height="400px">
            <div class="card-body" style="background-color:ivory">
              <h5 class="card-title">Guia do Mochileiro das Galaxias</h5>
              <p class="card-text">Autor: Douglas Adams</p>
              <p class="card-text">Genero: Aventura</p>
              <p class="card-text">Capítulos Dispiníveis: 15</p>
              <a href="#" class="btn btn-primary"> Ver detalhes! </a>
            </div>
          </div>
    </div>
    <div class="col-4">
      <p></p>
      <div class="card" style="width: 18rem; height: 40rem;">
          <img class="card-img-top" src="../assets/menina.jpg" alt="Card image cap" height="400px">
          <div class="card-body" style="background-color:ivory">
            <h5 class="card-title">A Menina Que Roubava Livros</h5>
            <p class="card-text">Autor: Markus Zusak</p>
            <p class="card-text">Genero: Histórico</p>
            <p class="card-text">Capítulos Dispiníveis: 15</p>
            <a href="#" class="btn btn-primary"> Ver detalhes! </a>
          </div>
        </div>
  </div>
        </div>
      
        <p></p>
        
        <div id="mid">
          <button type="button" class="btn btn-dark" style="text-align: center; text-size-adjust: 15px;">Mais livros</button>
      </div>
    </div>
</div>
</template>

<script>

export default {
  name: 'Home',
 data(){
   return{
     usuarios: this.$session.getAll(),
   }
 },
 
  methods: {

  autor() {
     this.$router.push({ name: "Autor"}).catch(()=>{});
   },
   meuslivros() {
     this.$router.push({ name: "Meuslivros"}).catch(()=>{});
   },
   perfil() {
    if (this.$session.exists()) {
     this.$router.push({ name: "Perfil"}).catch(()=>{});
    }
   },
   publicar() {
     this.$router.push({ name: "Publicar"}).catch(()=>{});
   },
    genero() {
     this.$router.push({ name: "Genero"}).catch(()=>{});
   }, 
   home() {
     this.$router.push({ name: "Home"}).catch(()=>{});
   }
  }
}
</script>

<style>

*{margin: 0; padding: 0; box-sizing: border-box;}

#home1{
 max-width: 1100px;
 margin: 0 150;
 padding: 0 2%;

}

#home2{
height: 100px;

}

#home3{

    padding: 6px 0;
    text-align: center;
    background:transparent;
}

.h5{
    display: inline-block;
    margin: 0 10px;

}

 #mid{
            position: absolute;
            left: 45%;
            right: 50%;
            height: 100px;
            width: 100px;
          }

.h6{

    text-decoration: none;
    color: ivory;
    
}

.container{
    background-color: transparent;
    background-blend-mode: hard-light;
   
}

.card{
    text-align: center;
    
}

.carousel-item {
    height: 50vh;
    min-height: 350px;
    background: no-repeat center center scroll;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
  }
</style>