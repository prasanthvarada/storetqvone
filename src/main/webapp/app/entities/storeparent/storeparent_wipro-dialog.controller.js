(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StoreparentWiproDialogController', StoreparentWiproDialogController);

    StoreparentWiproDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'Storeparent'];

    function StoreparentWiproDialogController ($timeout, $scope, $stateParams, $uibModalInstance, entity, Storeparent) {
        var vm = this;

        vm.storeparent = entity;
        vm.clear = clear;
        vm.save = save;

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.storeparent.id !== null) {
                Storeparent.update(vm.storeparent, onSaveSuccess, onSaveError);
            } else {
                Storeparent.save(vm.storeparent, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('storetqvoneApp:storeparentUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }


    }
})();
