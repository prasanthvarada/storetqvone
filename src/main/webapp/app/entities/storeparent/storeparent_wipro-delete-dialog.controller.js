(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StoreparentWiproDeleteController',StoreparentWiproDeleteController);

    StoreparentWiproDeleteController.$inject = ['$uibModalInstance', 'entity', 'Storeparent'];

    function StoreparentWiproDeleteController($uibModalInstance, entity, Storeparent) {
        var vm = this;

        vm.storeparent = entity;
        vm.clear = clear;
        vm.confirmDelete = confirmDelete;

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function confirmDelete (id) {
            Storeparent.delete({id: id},
                function () {
                    $uibModalInstance.close(true);
                });
        }
    }
})();
