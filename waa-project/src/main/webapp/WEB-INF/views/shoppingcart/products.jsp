<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="container">
    <div ng-app="productsApp">
        <div ng-controller="productsCtrl" ng-init="init()">
            <!-- Search criteria -->
            <div class="row" >
                <div class="form-group">
                    <select ng-model="selCategory" ng-options="item.id as item.name for item in categories">
                        <option value="all">All</option>
                    </select>
                    <input class="form-control" placeholder="User Name" name='j_username' type="text">
                </div>
            </div>

            <div class="row" >
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px" ng-repeat="item in dto">
                    <div class="thumbnail">Test
                        <img ng-src='resources/images/P1234.jpg' alt="image"  style = "width:100%"/>
                        <div class="caption">
                            <h3>{{item.name}}</h3>
                            <p>{{item.description}}</p>
                            <p>{{item.unitPrice}} USD</p>
                            <p>Available {{item.unitsInStock}} units in stock</p>
                            <p>
                                <a ng-href="products/product?id={{item.productId}}" class="btn btn-primary">
                                    <span class="glyphicon-info-sign glyphicon">
                                        Details
                                    </span>
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="<spring:url value="/resources/js/shoppingCart/products.js" />"></script>
</div>