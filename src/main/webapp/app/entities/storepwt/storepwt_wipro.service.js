(function() {
    'use strict';
    angular
        .module('storetqvoneApp')
        .factory('Storepwt', Storepwt);

    Storepwt.$inject = ['$resource'];

    function Storepwt ($resource) {
        var resourceUrl =  'api/storepwts/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
