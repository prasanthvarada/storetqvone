(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StoreparentWiproDetailController', StoreparentWiproDetailController);

    StoreparentWiproDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Storeparent'];

    function StoreparentWiproDetailController($scope, $rootScope, $stateParams, previousState, entity, Storeparent) {
        var vm = this;

        vm.storeparent = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('storetqvoneApp:storeparentUpdate', function(event, result) {
            vm.storeparent = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
