
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<html>
<style>
    .nav-item1{
        width: 20px;
        padding-left: 200px;
        color:blue;


    }



</style>
<head>
    <div class="p-3 mb-2 bg-success text-white" style="width: auto">chào mừng đến với cửa hàng của chúng tôi</div>
</head>
<body>
<div class="container-fluid">

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="/home">Trang Chủ</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="san-pham/index">sản phẩm</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="cua-hang/index">của hàng</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="nhan-vien/index">nhân viên</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="khach-hang/index">khach hàng</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="mau-sac/index">màu sản phẩm</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="nsx/index">nsx</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="chuc-vu/index">chức vụ</a>
                    </li>
                    <li class="nav-item1">
                        <a class="nav-link" href="chuc-vu/index">đăng nhập</a>
                    </li>
                    <li class="nav-item1">
                        <a class="nav-link" href="chuc-vu/index">đăng ký</a>
                    </li>

                </ul>

            </div>
        </div>
    </nav>
    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="/image/anh3.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>First slide label</h5>
                    <p>Some representative placeholder content for the first slide.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="/image/anh2.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Second slide label</h5>
                    <p>Some representative placeholder content for the second slide.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="/image/anh3.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Third slide label</h5>
                    <p>Some representative placeholder content for the third slide.</p>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>


</div>
</body>

    <!-- Footer -->
    <footer class="text-center text-lg-start bg-white text-muted">
        <!-- Section: Social media -->
        <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
            <!-- Left -->
            <div class="me-5 d-none d-lg-block">
                <span>Get connected with us on social networks:</span>
            </div>
            <!-- Left -->

            <!-- Right -->
            <div>
                <a href="" class="me-4 link-secondary">
                    <i class="fab fa-facebook-f"></i>
                </a>
                <a href="" class="me-4 link-secondary">
                    <i class="fab fa-twitter"></i>
                </a>
                <a href="" class="me-4 link-secondary">
                    <i class="fab fa-google"></i>
                </a>
                <a href="" class="me-4 link-secondary">
                    <i class="fab fa-instagram"></i>
                </a>
                <a href="" class="me-4 link-secondary">
                    <i class="fab fa-linkedin"></i>
                </a>
                <a href="" class="me-4 link-secondary">
                    <i class="fab fa-github"></i>
                </a>
            </div>
            <!-- Right -->
        </section>
        <!-- Section: Social media -->

        <!-- Section: Links  -->
        <section class="">
            <div class="container text-center text-md-start mt-5">
                <!-- Grid row -->
                <div class="row mt-3">
                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                        <!-- Content -->
                        <h6 class="text-uppercase fw-bold mb-4">
                            <i class="fas fa-gem me-3 text-secondary"></i>Company name
                        </h6>
                        <p>
                            Here you can use rows and columns to organize your footer content. Lorem ipsum
                            dolor sit amet, consectetur adipisicing elit.
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
                        <!-- Links -->
                        <h6 class="text-uppercase fw-bold mb-4">
                            Products
                        </h6>
                        <p>
                            <a href="#!" class="text-reset">Angular</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">React</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Vue</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Laravel</a>
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                        <!-- Links -->
                        <h6 class="text-uppercase fw-bold mb-4">
                            Useful links
                        </h6>
                        <p>
                            <a href="#!" class="text-reset">Pricing</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Settings</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Orders</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Help</a>
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                        <!-- Links -->
                        <h6 class="text-uppercase fw-bold mb-4">Contact</h6>
                        <p><i class="fas fa-home me-3 text-secondary"></i> New York, NY 10012, US</p>
                        <p>
                            <i class="fas fa-envelope me-3 text-secondary"></i>
                            info@example.com
                        </p>
                        <p><i class="fas fa-phone me-3 text-secondary"></i> + 01 234 567 88</p>
                        <p><i class="fas fa-print me-3 text-secondary"></i> + 01 234 567 89</p>
                    </div>
                    <!-- Grid column -->
                </div>
                <!-- Grid row -->
            </div>
        </section>
        <!-- Section: Links  -->

        <!-- Copyright -->
        <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.025);">
            © 2021 Copyright:
            <a class="text-reset fw-bold" href="https://mdbootstrap.com/">MDBootstrap.com</a>
        </div>

    </footer>


</html>
