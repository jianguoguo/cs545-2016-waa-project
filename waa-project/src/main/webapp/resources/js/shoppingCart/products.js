/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var cartApp = angular.module('productsApp', []);
 
productsApp.controller('productsCtrl',  function ($scope, $http) {

    $scope.getCategories = function () {
        $http.get($scope.appName + '/category/all')
                .success(function (data) {
                    $scope.categories = data;
                });
    };
    
    $scope.init = function () {
        $scope.appName = '/' + waaAppName;
        
        $scope.categories = [];
        $scope.selCategory = null;
        
        $scope.getCategories();
    };
});

