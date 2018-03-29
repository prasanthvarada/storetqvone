(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StorepwtWiproController', StorepwtWiproController);

    StorepwtWiproController.$inject = ['Storepwt', 'ParseLinks', 'AlertService', 'paginationConstants'];

    function StorepwtWiproController(Storepwt, ParseLinks, AlertService, paginationConstants) {
        var vm = this;

        vm.storepwts = [];

        loadAll();

        function loadAll() {
            Storepwt.query(function(result) {
                vm.storepwts = result;
                vm.searchQuery = null;
            });
        }
    }
})();
