<%-- 
    Document   : details
    Created on : Jul 11, 2020, 9:48:16 AM
    Author     : Hoang Pham
--%>

<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Headphones Guru</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body,
            h1,
            h2,
            h3,
            h4,
            h5,
            h6 {
                font-family: "Raleway", sans-serif
            }
        </style>
    </head>
    <body class="w3-light-grey w3-content" style="max-width:1600px">
        <x:parse var="doc" doc="${requestScope.INFO}"/>
        <!-- !PAGE CONTENT! -->
        <div class="w3-main">
            <div class="w3-container sub-content">
                <h1><b>Headphones Guru</b></h1>
                <div class="w3-section w3-bottombar w3-padding-16">
                </div>
            </div>
            <!-- Images of Me -->
            <div class="w3-row-padding w3-padding-16" id="about">
                <div>
                    <img src="<x:out select="$doc/productDetailsDto/imgUrl"/>" alt="product's image" style="width:50%; display: block; margin-left: auto; margin-right: auto;">
                </div>
            </div>

            <div class="w3-container w3-padding-large" style="margin-bottom:32px">
                <h3><b>Product details</b></h3>
                <h4><b><x:out select="$doc/productDetailsDto/name"/></b></h4>
                <p>Price: $<x:out select="$doc/productDetailsDto/price"/></p>
                <p>Description: <x:out select="$doc/productDetailsDto/description"/></p>
                <hr/>
                <h4>Sound signature</h4>
                <p>Signature: <x:out select="$doc/productDetailsDto/signature"/></p>
                <p>Recommend genres: <x:out select="$doc/productDetailsDto/genreList"/></p>
            </div>

            <!-- Footer -->
            <!-- <footer class="w3-container w3-padding-32 w3-dark-grey">
            </footer> -->

            <div class="w3-black w3-center w3-padding-24">Powered by <a href="https://www.w3schools.com/w3css/default.asp"
                                                                        title="W3.CSS" target="_blank" class="w3-hover-opacity">w3.css</a></div>

            <!-- End page content -->
        </div>
    </body>
</html>
