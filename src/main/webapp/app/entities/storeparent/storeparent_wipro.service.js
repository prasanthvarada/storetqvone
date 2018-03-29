(function() {
    'use strict';
    angular
        .module('storetqvoneApp')
        .factory('Storeparent', Storeparent);

    Storeparent.$inject = ['$resource'];

    function Storeparent ($resource) {
        var resourceUrl =  'api/storeparents/:id';

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
