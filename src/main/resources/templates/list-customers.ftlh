<!DOCTYPE html>
<html>
<head>
    <title>List Customers</title>
<#--    reference our style sheet-->
    <link type="text/css"
          rel="stylesheet"
    href="/static/css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer RelationShip Manager</h2>
    </div>
</div>
<div id="container">
    <div id="content">
        <!--  add out html table here -->
        <table>
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Email Address</th>
            </tr>
            <#list allCustomers as customer>
                <tr>
                    <th>${customer.firstName}</th>
                    <th>${customer.lastName}</th>
                    <th>${customer.email}</th>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>