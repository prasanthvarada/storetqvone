(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StorepwtWiproDeleteController',StorepwtWiproDeleteController);

    StorepwtWiproDeleteController.$inject = ['$uibModalInstance', 'entity', 'Storepwt'];

    function StorepwtWiproDeleteController($uibModalInstance, entity, Storepwt) {
        var vm = this;

        vm.storepwt = entity;
        vm.clear = clear;
        vm.confirmDelete = confirmDelete;

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function confirmDelete (id) {
            Storepwt.delete({id: id},
                function () {
                    $uibModalInstance.close(true);
                });
        }
    }
})();
