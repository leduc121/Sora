<%-- 
    Document   : home
    Created on : Feb 23, 2025, 4:09:26 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">


    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Koparion – Book Shop HTML5 Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Favicon -->
        <link rel="shortcut icon" type="image/x-icon" href="img/favicon.png">

        <!-- all css here -->
        <!-- bootstrap v3.3.6 css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
        <!-- animate css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
        <!-- meanmenu css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/meanmenu.min.css">
        <!-- owl.carousel css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.css">
        <!-- font-awesome css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
        <!-- flexslider.css-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css">
        <!-- chosen.min.css-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/chosen.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <!-- responsive css -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/responsive.css">

    </head>

    <body class="shop">

        <!-- header-area-start -->
        <header>
            <!-- header-top-area-start -->
            <jsp:include page="common/header-top-area.jsp"></jsp:include>
                <!-- header-top-area-end -->
                <!-- header-mid-area-start -->
            <jsp:include page="common/header-mid-area.jsp"></jsp:include>
                <!-- header-mid-area-end -->
                <!-- main-menu-area-start -->
            <jsp:include page="common/main-menu-area.jsp"></jsp:include>
                <!-- main-menu-area-end -->
                <!-- mobile-menu-area-start -->
            <jsp:include page="common/mobile-menu-area.jsp"></jsp:include>
                <!-- mobile-menu-area-end -->
            </header>
            <!-- header-area-end -->
            <!-- breadcrumbs-area-start -->
            <jsp:include page="common/breadcrumbs-area.jsp"></jsp:include>
            <!-- breadcrumbs-area-end -->
            <!-- shop-main-area-start -->
            <jsp:include page="common/shop-main-area.jsp"></jsp:include>
            <!-- shop-main-area-end -->
            <!-- footer-area-start -->
            <jsp:include page="common/footer.jsp"></jsp:include>
            <!-- footer-area-end -->
            <!-- Modal -->
            <jsp:include page="common/modal.jsp"></jsp:include>
            <!-- Modal end -->






        <!-- all js here -->
        <!-- jquery latest version -->
        <script src="${pageContext.request.contextPath}/js/vendor/jquery-1.12.4.min.js"></script>

        <!-- modernizr css -->
        <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3.min.js"></script>
        <!-- bootstrap js -->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <!-- owl.carousel js -->
        <script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>
        <!-- meanmenu js -->
        <script src="${pageContext.request.contextPath}/js/jquery.meanmenu.js"></script>
        <!-- wow js -->
        <script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
        <!-- jquery.parallax-1.1.3.js -->
        <script src="${pageContext.request.contextPath}/js/jquery.parallax-1.1.3.js"></script>
        <!-- jquery.countdown.min.js -->
        <script src="${pageContext.request.contextPath}/js/jquery.countdown.min.js"></script>
        <!-- jquery.flexslider.js -->
        <script src="${pageContext.request.contextPath}/js/jquery.flexslider.js"></script>
        <!-- chosen.jquery.min.js -->
        <script src="${pageContext.request.contextPath}/js/chosen.jquery.min.js"></script>
        <!-- jquery.counterup.min.js -->
        <script src="${pageContext.request.contextPath}/js/jquery.counterup.min.js"></script>
        <!-- waypoints.min.js -->
        <script src="${pageContext.request.contextPath}/js/waypoints.min.js"></script>
        <!-- plugins js -->
        <script src="${pageContext.request.contextPath}/js/plugins.js"></script>
        <!-- main js -->
        <script src="${pageContext.request.contextPath}/js/main.js"></script>
    </body>


</html>
