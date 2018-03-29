(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StoreparentWiproController', StoreparentWiproController);

    StoreparentWiproController.$inject = ['Storeparent', 'ParseLinks', 'AlertService', 'paginationConstants'];

    function StoreparentWiproController(Storeparent, ParseLinks, AlertService, paginationConstants) {
        var vm = this;

        vm.storeparents = [];

        loadAll();

        function loadAll() {
            Storeparent.query(function(result) {
                vm.storeparents = result;
                vm.searchQuery = null;
            });
        }
    }
})();
