<%--
  Created by IntelliJ IDEA.
  User: dasazolotuhina
  Date: 2019-12-17
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- подключение css-файла -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">


    <!-- подключение нужной версии jQuery -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
    </script>

    <!-- подключение popper.js, необходимого для корректной работы некоторых плагинов Bootstrap 4 -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
    </script>

    <!-- подключение js-файла -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
            integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous">
    </script>
</head>
<body>
<div class="row justify-content-md-center">
    <h1 class="ml-3 mb-4 mt-2">Poll</h1>
</div>
<div class="row justify-content-md-center">
    <form id="myform" action="/checkAnswers" method="post" class="col-sm-6">
        <div class="form-group">
            <label>${poll.questions[0].question}</label>
            <input type="hidden" name="question1" value="${poll.questions[0].id_question}">
            <input type="text" class="form-control" name="answer1">
            <input type="hidden" name="question2" value="${poll.questions[1].id_question}">
            <label>${poll.questions[1].question}</label>
            <input type="text" class="form-control" name="answer2">
            <input type="hidden" name="question3" value="${poll.questions[2].id_question}">
            <label>${poll.questions[2].question}</label>
            <input type="text" class="form-control" name="answer3">
            <input type="hidden" name="question4" value="${poll.questions[3].id_question}">
            <label>${poll.questions[3].question}</label>
            <input type="text" class="form-control" name="answer4">
            <input type="hidden" name="question5" value="${poll.questions[4].id_question}">
            <label>${poll.questions[4].question}</label>
            <input type="text" class="form-control" name="answer5">
        </div>
        <input type="submit" value="OK">
    </form>
</div>
</body>
</html>
