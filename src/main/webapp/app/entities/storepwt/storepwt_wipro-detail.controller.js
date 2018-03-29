(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StorepwtWiproDetailController', StorepwtWiproDetailController);

    StorepwtWiproDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Storepwt'];

    function StorepwtWiproDetailController($scope, $rootScope, $stateParams, previousState, entity, Storepwt) {
        var vm = this;

        vm.storepwt = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('storetqvoneApp:storepwtUpdate', function(event, result) {
            vm.storepwt = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
