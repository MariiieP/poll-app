<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Person List</title>
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
<h1>Polls List</h1>

<br/><br/>
<div>
    <div class="container">
    <div class="row justify-content-md-center">
        <table class="table table-hover patientsTb">
        <tr>
            <th>Id</th>
            <th>Language</th>
            <th>Option</th>
        </tr>
        <c:forEach  items="${polls}" var ="poll">
            <tr>
                <td>${poll.id}</td>
                <td>${poll.language.language}</td>
                <td>${poll.option}</td>
                <td><a href="/generate/${poll.id}"><button>Generate test</button></a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</div>
</div>
</body>

</html>