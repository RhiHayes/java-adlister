<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/1/21
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<%@include file="partials/navbar.jsp"%>

<form method="POST" action="/pizza-order">

    <label for="address">Address</label>
    <input type="text" name="address" id="address" placeholder="input your delivery address">
    <br>

    <select name="crust_pref" id="crust_pref">
        <option value="hand-tossed">Hand Tossed</option>
        <option value="crispy-thin">Crispy Thin</option>
    </select>
    <br>

    <select name="sauce_amount_pref" id="sauce_amount_pref">
        <option value="light">Light</option>
        <option value="normal">Normal</option>
        <option value="extra">Extra</option>
        <option value="double">Double</option>
    </select>
    <br>

    <select name="sauce_type_pref" id="sauce_type_pref">
        <option value="marinara">Marinara Sauce</option>
        <option value="bbq">BBQ Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
    </select>
    <br>

    <label for="meat_top1"><input type="checkbox" id="meat_top1" name="meat_top" value="Meatballs">
        Meatballs</label><br>

    <input type="checkbox" id="meat_top2" name="meat_top" value="Bacon">
    <label for="meat_top2"> Bacon</label><br>

    <input type="checkbox" id="meat_top3" name="meat_top" value="Chicken">
    <label for="meat_top3"> Chicken</label><br>

    <input type="checkbox" id="veg_top1" name="veg_top" value="Mushrooms">
    <label for="veg_top1"> Mushrooms</label><br>

    <input type="checkbox" id="veg_top2" name="veg_top" value="Pineapple">
    <label for="veg_top2"> Pineapple</label><br>

    <input type="checkbox" id="veg_top3" name="veg_top" value="Onions">
    <label for="veg_top3"> Onions</label><br>
    <br>

    <select name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br>



    <input type="submit">
</form>


</p>

</body>
</html>
