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
<title>Musteri Ekle</title>
</head>

<body>
	<br>
	<div class="container">
		<div class="col-md-4">

			<div class="alert alert-info">
				<font color="red">MUSTERi</font>
			</div>
			<div class="alert alert-secondary">
				<a href="newMusteri">Ekle</a> | <a href="findAllMusteri">Listele</a>
			</div>

		</div>
	</div>
	
	<hr/>
	<div class="container">
		<div class="col-md-4">

			<form:form id="musteriForm" modelAttribute="musteri" method="post"   action="saveMusteri">
				
				<form:hidden path="musteriId" value="${musteriObject.musteriId}" />
				
				<div class="form-group">
<%-- 					<form:label path="musteriNo">Musteri No:</form:label>  --%>
					<input type="text"  id="musteriNo" name="musteriNo"
						class="form-control" value="${musteriObject.musteriNo}" placeholder="Musteri numarasi giriniz">
						
				</div>
				
				<div class="form-group">
<%-- 					<form:label path="musteriAdi">Musteri Adi:</form:label>  --%>
					<input type="text" id="musteriAdi" name="musteriAdi"
						class="form-control" value="${musteriObject.musteriAdi}"  placeholder="Musteri adi giriniz">
				</div>
				
				<div class="form-group">
<%-- 					<form:label  path="musteriSoyadi">Musteri Soyadi:</form:label>  --%>
<%-- 					 <form:hidden path="musteriid" value="${musteriObject.musteriid}" /> --%>
					<input type="text" id="musteriSoyadi" name="musteriSoyadi"
						class="form-control" value="${musteriObject.musteriSoyadi}"  placeholder="Musteri soyadi giriniz">
				</div>
				
				<button type="submit" id="saveMusteri" class="btn btn-primary">KAYDET</button>
			</form:form>
		</div>
	</div>

</body>
</html>