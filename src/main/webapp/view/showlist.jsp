<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/9/2023
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="showlist.css">
</head>
<body>
<div class="container">
    <div class="search-box">
        <form method="get">
        <input type="text" name ="key" value="${key}">
            <button type="submit">Search</button>
            <button><a href="/student?action=add">Add Student</a></button>
        <div class="search-icon">
            <i class="fas fa-search"></i>
        </div>
        <div class="cancel-icon">
            <i class="fas fa-times"></i>
        </div>
        <div class="search-data">
        </div>
        </form>
    </div>

    <div class="row">
        <div class="col-lg-12">
            <div class="main-box clearfix">
                <div class="table-responsive">
                    <table class="table user-list">
                        <thead>
                        <tr>
                            <th><span>#</span></th>
                            <th><span>name</span></th>
                            <th><span>DateOfBirt</span></th>
                            <th><span>Email</span></th>
                            <th><span>Address</span></th>
                            <th><span>Phone</span></th>
                            <th><span>ClassRoom</span></th>
                            <th><span>Action</span></th>
                            <th><span></span></th>
                            <th>&nbsp;</th>
                        </tr>

                        </thead>
                        <tbody>
                         <c:forEach items="${studentList}" var="student">
                        <tr>
                            <td>
                                ${student.getId()}
                            </td>
                            <td>
                                ${student.getName()}
                            </td>
                            <td class="text-center">
                                <span class="label label-default">${student.getDateOfBirt()}</span>
                            </td>
                            <td class="email">
                                ${student.getEmail()}
                            </td>
                            <td>
                                    ${student.getAddress()}
                            </td>
                            <td>
                                    ${student.getPhone()}
                            </td>
                            <td>
                                    ${student.getClassroom()}
                            </td>
                            <td>
                                <button><a href="/student?action=edit&id=${student.getId()}" class="table-link">
									<span class="fa-stack">
										<i class="fa fa-square fa-stack-2x"></i>
										<i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
									</span>
                                Edit</a></button>
                                <button><a  href="/student?action=delete&id=${student.getId()}" class="table-link danger",>
									<span class="fa-stack">
										<i class="fa fa-square fa-stack-2x"></i>
										<i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
									</span>
                                Delete</a></button>

                            </td>
                        </tr>
                        <tr>
                            </c:forEach>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
