(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .controller('AceConfigurationController', AceConfigurationController);

    AceConfigurationController.$inject = ['$filter','AceConfigurationService'];

    function AceConfigurationController (filter,AceConfigurationService) {
        var vm = this;

        vm.allConfiguration = null;
        vm.configuration = null;

        AceConfigurationService.get().then(function(configuration) {
            vm.configuration = configuration;
        });
        AceConfigurationService.getEnv().then(function (configuration) {
            vm.allConfiguration = configuration;
        });
    }
})();
