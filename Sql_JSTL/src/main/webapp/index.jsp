<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>all  are :</h1>
		<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/donor" user="root" password="" var="ds"></sql:setDataSource>
		<sql:query dataSource ="${ds}" var="res">Select fname from donors</sql:query>
		<table>
				<tr>
					<td>User Name</td>
					
				</tr>
				
				<c:forEach var ="e" items="${res.rows}">
					<tr>${e.fname}</tr><br>
				</c:forEach>
				
		</table>
	</body>
</html>