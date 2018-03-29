(function() {
    'use strict';

    angular
        .module('storetqvoneApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider
        .state('storepwt_wipro', {
            parent: 'entity',
            url: '/storepwt_wipro',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Storepwts'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/storepwt/storepwts_wipro.html',
                    controller: 'StorepwtWiproController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
            }
        })
        .state('storepwt_wipro-detail', {
            parent: 'storepwt_wipro',
            url: '/storepwt_wipro/{id}',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Storepwt'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/storepwt/storepwt_wipro-detail.html',
                    controller: 'StorepwtWiproDetailController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
                entity: ['$stateParams', 'Storepwt', function($stateParams, Storepwt) {
                    return Storepwt.get({id : $stateParams.id}).$promise;
                }],
                previousState: ["$state", function ($state) {
                    var currentStateData = {
                        name: $state.current.name || 'storepwt_wipro',
                        params: $state.params,
                        url: $state.href($state.current.name, $state.params)
                    };
                    return currentStateData;
                }]
            }
        })
        .state('storepwt_wipro-detail.edit', {
            parent: 'storepwt_wipro-detail',
            url: '/detail/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storepwt/storepwt_wipro-dialog.html',
                    controller: 'StorepwtWiproDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['Storepwt', function(Storepwt) {
                            return Storepwt.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('^', {}, { reload: false });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('storepwt_wipro.new', {
            parent: 'storepwt_wipro',
            url: '/new',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storepwt/storepwt_wipro-dialog.html',
                    controller: 'StorepwtWiproDialogController',
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
                                workuid: null,
                                ordinalkey: null,
                                strnum: null,
                                dcnum: null,
                                zonenum: null,
                                ssratturn: null,
                                currentots: null,
                                totactualsales: null,
                                totplndsales: null,
                                twinvt: null,
                                invtplndend: null,
                                twsales: null,
                                wtddist: null,
                                origots: null,
                                otsadj: null,
                                salesago: null,
                                lwsales: null,
                                salesplnd: null,
                                salesplndwktwo: null,
                                salesplndbal: null,
                                otsweeks: null,
                                lwdistreg: null,
                                invtplnd: null,
                                lwinvt: null,
                                origpct: null,
                                id: null
                            };
                        }
                    }
                }).result.then(function() {
                    $state.go('storepwt_wipro', null, { reload: 'storepwt_wipro' });
                }, function() {
                    $state.go('storepwt_wipro');
                });
            }]
        })
        .state('storepwt_wipro.edit', {
            parent: 'storepwt_wipro',
            url: '/{id}/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storepwt/storepwt_wipro-dialog.html',
                    controller: 'StorepwtWiproDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['Storepwt', function(Storepwt) {
                            return Storepwt.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('storepwt_wipro', null, { reload: 'storepwt_wipro' });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('storepwt_wipro.delete', {
            parent: 'storepwt_wipro',
            url: '/{id}/delete',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/storepwt/storepwt_wipro-delete-dialog.html',
                    controller: 'StorepwtWiproDeleteController',
                    controllerAs: 'vm',
                    size: 'md',
                    resolve: {
                        entity: ['Storepwt', function(Storepwt) {
                            return Storepwt.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('storepwt_wipro', null, { reload: 'storepwt_wipro' });
                }, function() {
                    $state.go('^');
                });
            }]
        });
    }

})();
