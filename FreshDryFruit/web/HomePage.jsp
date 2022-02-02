<%-- 
    Document   : HomePage.jsp
    Created on : Nov 29, 2021, 9:24:16 PM
    Author     : deepa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
  <%@include file="NavBar.jsp"%>

  <div class="p-5 mb-4 bg-light text-light bg-black" style="clip-path: polygon(20% 0%, 80% 0%, 100% 0, 100% 80%, 68% 98%, 17% 78%, 0 88%, 0 0);">
    <div class="container-fluid py-5">
      <h1 class="display-5 fw-bold" style="font-family: 'Dancing Script', cursive;">Fry Dry Fruit</h1>
      <p class="col-md-8 fs-4">Using a series of utilities, you can create this jumbotron, just like the one in previous
        versions of Bootstrap. Check out the examples below for how you can remix and restyle it to your liking.</p>
      <button class="btn btn-primary btn-lg" type="button">Login</button>
    </div>
  </div>


  <div id="carouselExampleIndicators" class="carousel slide container" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>

    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
          aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
          aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
          aria-label="Slide 3"></button>
      </div>
      <div class="carousel-inner" style="height: 50%
      ;">
        <div class="carousel-item active">
          <div class="card pb-5" >
            <div class="card-header">
              Our Specialities
            </div>
            <div class="card-body align-items-center">
              <img src="https://www.foodsafetynews.com/files/2019/03/dreamstime_ecommerce-food-online-internet.jpg"
                class="rounded float-start w-25 h-25" alt="...">
              <div class="card w-50 ps-xl-5 border-0" style="width: 18rem;">
                <div class="card-body pl-lg-5 ">
                  <h5 class="card-title">Gulab Jamun</h5>
                  <p class="card-text">With supporting text below as a natural lead-in to additional content.
                    and with love and care we distribute it to you we Hope you will like it
                  </p>
                  <a href="#" class="btn btn-primary">Go somewhere</a>
                  <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
              </div>

            </div>
          </div>
        </div>

        <div class="carousel-item">
          <div class="card">
            <div class="card-header">
              Our Speciality
            </div>
            <div class="card-body align-items-center">
              <img src="https://www.foodsafetynews.com/files/2019/03/dreamstime_ecommerce-food-online-internet.jpg"
                class="rounded float-start w-25 h-25" alt="...">
              <div class="card w-50" style="width: 18rem;">
                <div class="card-body pl-lg-5 ">
                  <h5 class="card-title">Gulab Jamun</h5>
                  <p class="card-text">With supporting text below as a natural lead-in to additional content.
                    and with love and care we distribute it to you we Hope you will like it
                  </p>
                  <a href="#" class="btn btn-primary">Go somewhere</a>
                  <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
              </div>

            </div>
          </div>
        </div>

        <div class="carousel-item ">
          <div class="card">
            <div class="card-header">
              Our Specialities
            </div>
            <div class="card-body align-items-center">
              <img src="https://www.foodsafetynews.com/files/2019/03/dreamstime_ecommerce-food-online-internet.jpg"
                class="rounded-3 float-start w-25 h-25" alt="...">
              <div class="card w-50" style="width: 18rem;">
                <div class="card-body pl-lg-5 ">
                  <h5 class="card-title">Gulab Jamun</h5>
                  <p class="card-text">With supporting text below as a natural lead-in to additional content.
                    and with love and care we distribute it to you we Hope you will like it
                  </p>
                  <a href="#" class="btn btn-primary">Go somewhere</a>
                  <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
              </div>

            </div>
          </div>
        </div>
        
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden"></span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden"></span>
      </button>
    </div>
    <a class="carousel-control-prev " href="#carouselExampleIndicators" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only"></span>
    </a>
    <a class="carousel-control-next " href="#carouselExampleIndicators" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only"></span>
    </a>
  </div>

<div class="container pt-5">
  <div class="row align-items-center">
    
    <div class="col">
      <div class="card text-black" style="width: 18rem;">
        <img src="http://yaadi.in/wp-content/uploads/2021/06/d526bdd5df43af45f212a81d4dd19902.jpg" class="card-img-top " alt="...">
        <div class="card-body">
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        </div>
      </div>
    </div>

    <div class="col">
      <div class="card" style="width: 18rem;">
        <img src="https://images.news18.com/ibnkhabar/uploads/2021/07/shutterstock_1735916885-1.jpg?im=Resize,width=509,aspect=fit,type=normal" class="card-img-top" alt="...">
        <div class="card-body">
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        </div>
      </div>
    </div>

    <div class="col">
      <div class="card" style="width: 18rem;">
        <img src="https://m.media-amazon.com/images/I/31GVbXE3Y8L.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        </div>
      </div>
    </div>
  </div>

</div>
<%@include file="Footer.jsp"%>
</body>
</html>
