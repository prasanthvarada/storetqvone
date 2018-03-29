(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider
        .state('storeparent_wipro', {
            parent: 'entity',
            url: '/storeparent_wipro',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Storeparents'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/storeparent/storeparents_wipro.html',
                    controller: 'StoreparentWiproController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
            }
        })
        .state('storeparent_wipro-detail', {
            parent: 'storeparent_wipro',
            url: '/storeparent_wipro/{id}',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Storeparent'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/storeparent/storeparent_wipro-detail.html',
                    controller: 'StoreparentWiproDetailController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
                entity: ['$stateParams', 'Storeparent', function($stateParams, Storeparent) {
                    return Storeparent.get({id : $stateParams.id}).$promise;
                }],
                previousState: ["$state", function ($state) {
                    var currentStateData = {
                        name: $state.current.name || 'storeparent_wipro',
                        params: $state.params,
                        url: $state.href($state.current.name, $state.params)
                    };
                    return currentStateData;
                }]
            }
        })
        .state('storeparent_wipro-detail.edit', {
            parent: 'storeparent_wipro-detail',
            url: '/detail/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storeparent/storeparent_wipro-dialog.html',
                    controller: 'StoreparentWiproDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['Storeparent', function(Storeparent) {
                            return Storeparent.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('^', {}, { reload: false });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('storeparent_wipro.new', {
            parent: 'storeparent_wipro',
            url: '/new',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storeparent/storeparent_wipro-dialog.html',
                    controller: 'StoreparentWiproDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: function () {
                            return {
                                deptnum: null,
                                divnum: null,
                                groups: null,
                                pages: null,
                                transitional: null,
                                postonlyind: null,
                                catgnumone: null,
                                catgnumtwo: null,
                                catgnumthree: null,
                                catgnumfour: null,
                                blndotsdep: null,
                                blndotsgrp: null,
                                blndotspage: null,
                                catgnumfive: null,
                                plandesc: null,
                                id: null
                            };
                        }
                    }
                }).result.then(function() {
                    $state.go('storeparent_wipro', null, { reload: 'storeparent_wipro' });
                }, function() {
                    $state.go('storeparent_wipro');
                });
            }]
        })
        .state('storeparent_wipro.edit', {
            parent: 'storeparent_wipro',
            url: '/{id}/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storeparent/storeparent_wipro-dialog.html',
                    controller: 'StoreparentWiproDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['Storeparent', function(Storeparent) {
                            return Storeparent.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('storeparent_wipro', null, { reload: 'storeparent_wipro' });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('storeparent_wipro.delete', {
            parent: 'storeparent_wipro',
            url: '/{id}/delete',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storeparent/storeparent_wipro-delete-dialog.html',
                    controller: 'StoreparentWiproDeleteController',
                    controllerAs: 'vm',
                    size: 'md',
                    resolve: {
                        entity: ['Storeparent', function(Storeparent) {
                            return Storeparent.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('storeparent_wipro', null, { reload: 'storeparent_wipro' });
                }, function() {
                    $state.go('^');
                });
            }]
        });
    }

})();
