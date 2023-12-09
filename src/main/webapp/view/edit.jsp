<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/9/2023
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container h-100">
    <div class="row h-100">
        <div class="col-sm-10 col-md-8 col-lg-6 mx-auto d-table h-100">
            <div class="d-table-cell align-middle">

                <div class="text-center mt-4">
                    <h1 class="h2">Edit Student</h1>
                </div>

                <div class="card">
                    <div class="card-body">
                        <div class="m-sm-4">
                            <form method="post">
                                <div class="form-group">
                                    <label>Id</label>
                                    <input class="form-control form-control-lg" type="text" name="id" value="${student.getId()}" style="display: none;">
                                </div>
                                <div class="form-group">
                                    <label>Name</label>
                                    <input class="form-control form-control-lg" type="text" name="name" value="${student.getName()}">
                                </div>
                                <div class="form-group">
                                    <label>Email</label>
                                    <input class="form-control form-control-lg" type="text" name="email" value="${student.getEmail()}">
                                </div>
                                <div class="form-group">
                                    <label>DateOfBirt</label>
                                    <input class="form-control form-control-lg" type="text" name="DateOfBirt" value="${student.getDateOfBirt()}">
                                </div>
                                <div class="form-group">
                                    <label>Address</label>
                                    <input class="form-control form-control-lg" type="text" name="address" value="${student.getAddress()}">
                                </div>
                                <div class="form-group">
                                    <label>Phone</label>
                                    <input class="form-control form-control-lg" type="text" name="phone" value="${student.getPhone()}">
                                </div>
                                <div class="form-group">
                                    <label>Class</label>
                                    <input class="form-control form-control-lg" type="text" name="classroom" value="${student.getClassroom()}">
                                </div>
                                <div class="text-center mt-3">
                                    <button type="submit" class="btn btn-primary"><a href="/student">Submit</a></button>

                                    <!-- <button type="submit" class="btn btn-lg btn-primary">Sign up</button> -->
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>
</body>
</html>
