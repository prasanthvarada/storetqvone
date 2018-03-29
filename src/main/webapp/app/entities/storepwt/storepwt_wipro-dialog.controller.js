(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('StorepwtWiproDialogController', StorepwtWiproDialogController);

    StorepwtWiproDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'Storepwt'];

    function StorepwtWiproDialogController ($timeout, $scope, $stateParams, $uibModalInstance, entity, Storepwt) {
        var vm = this;

        vm.storepwt = entity;
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
            if (vm.storepwt.id !== null) {
                Storepwt.update(vm.storepwt, onSaveSuccess, onSaveError);
            } else {
                Storepwt.save(vm.storepwt, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('storetqvoneApp:storepwtUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }


    }
})();
