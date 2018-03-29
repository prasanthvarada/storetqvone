/*==========================================================
    Author      : Ranjithprabhu K
    Date Created: 13 Jan 2016
    Description : Controller to handle Contact page
    Change Log
    s.no      date    author     description     


 ===========================================================*/

dashboard.controller("ByStoreController", ['$rootScope', '$scope', '$state', '$location', 'dashboardService', 'Flash', '$http', 'sharedProperties',
function ($rootScope, $scope, $state, $location, dashboardService, Flash, $http, sharedProperties) {
    var vm = this;

    vm.message = {};

    vm.submitForm = function () {
        console.log(vm.message);
		sharedProperties.setProperty($scope.DEPT_NUM,$scope.GROUPS,$scope.PAGE);
/*         var request = $http({
            method: "post",
            url: "contact.php",
            data: vm.message,
            headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
        });

        request.success(function (data) {
            console.log(data);
            if (data == "success") {
                Flash.create('success', 'Message Sent Succesfully', 'large-text');
                vm.message = {};
                vm.contactForm.$pristine();
                vm.contactForm.$setUntouched();

            }
        }); */
		
$state.go('app.searchresults');
console.log("inside state change");
    };
    console.log("coming to Contact controller");
}]);

