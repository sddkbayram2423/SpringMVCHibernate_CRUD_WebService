<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@ page session="false"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Müşteri Liste</title>
</head>

<body>
	<br>
	<div class="container">
		<div class="col-md-4">
			<div class="alert alert-info">
				<font color="red">MÜŞTERİ</font>
			</div>
			<div class="alert alert-secondary">
				<a href="newMusteri">Ekle</a> | <a href="findAllMusteri">Listele</a>
			</div>
		</div>
	</div>
	<hr/>
	<c:if test="${empty musteriList}">
	<font color="red">Henüz Kayıt Yok</font>
	</c:if>
	
	<c:if test="${not empty musteriList}">
	
	<div class="container">
		<div class="col-md-4">

			<form role="form" action="searchMusteri">
				<div class="form-group">
					<label for="searchAdi" >Müşteri Adı:</label> 
					<input type="text"  id="searchAdi" name="searchAdi"
						class="form-control" placeholder="Musteri numarasi giriniz">
				</div>
				<button type="submit" class="btn btn-primary" value="Ara">Ara</button><br>
			</form>
		</div>
	</div>
	
	
	<div class="container">
		<div class="col-md-4">
		<table class="table table-hover">
		<thead>
			<tr>
				<td><strong>ID</strong></td>
				<td><strong>ADI</strong></td>
				<td><strong>SOYADI</strong></td>
				<td><strong>NUMARA</strong></td>
				<td><strong>DÜZENLE</strong></td>
				<td><strong>SİL</strong></td>
			</tr>			
		</thead>
		<tbody>
		<c:forEach items="${musteriList}" var="musteri">
			<tr>
				<td><c:out value="${musteri.musteriId}"></c:out> </td>
				<td><c:out value="${musteri.musteriAdi}"></c:out> </td>
				<td><c:out value="${musteri.musteriSoyadi}"></c:out> </td>
				<td><c:out value="${musteri.musteriNo}"></c:out> </td>
				<td><a href="editMusteri?musteriId=  <c:out value="${musteri.musteriId}"/>  ">Düzenle</a></td>
				<td><a href="deleteMusteri?musteriId=  <c:out value="${musteri.musteriId}"/>  ">Sil</a></td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	
	</c:if>
</body>
</html>