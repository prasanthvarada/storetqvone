/*==========================================================
    Author      : Ranjithprabhu K
    Date Created: 24 Dec 2015
    Description : Base for Dashboard Application module
    
    Change Log
    s.no      date    author     description     
    

 ===========================================================*/

var dashboard = angular.module('dashboard', ['ui.router', 'ngAnimate','ngMaterial']);

dashboard.config(["$stateProvider", function ($stateProvider) {

    $stateProvider.state('app.dashboard', {
        url: '/dashboard',
        templateUrl: 'app/modules/dashboard/views/home.html',
        controller: 'HomeController',
        controllerAs: 'vm',
        data: {
            pageTitle: 'Home'
        }
    });

    //skills page state
    $stateProvider.state('app.skills', {
        url: '/skills',
        templateUrl: 'app/modules/dashboard/views/skills.html',
        controller: 'SkillController',
        controllerAs: 'vm',
        data: {
            pageTitle: 'Skills'
        }
    });

    //Contact page state
    $stateProvider.state('app.contact', {
        url: '/contact',
        templateUrl: 'app/modules/dashboard/views/contact.html',
        controller: 'ContactController',
        controllerAs: 'vm',
        data: {
            pageTitle: 'Contact Me'
        }
    });

    //Search page state
    $stateProvider.state('app.search', {
        url: '/search',
        templateUrl: 'app/modules/dashboard/views/search.html',
        controller: 'appCtrl',
        controllerAs: 'vm',
        data: {
            pageTitle: 'Search'
        }
    });
	
	    $stateProvider.state('app.bystore', {
        url: '/bystore',
        templateUrl: 'app/modules/dashboard/views/bystore.html',
        controller: 'ByStoreController', 
        controllerAs: 'vm',
        data: {
            pageTitle: 'By Store'
        }
    });
	
	 $stateProvider.state('app.searchresults', {
        url: '/searchresults',
        templateUrl: 'app/modules/dashboard/views/searchresults.html',
        controller: 'SearchResultsController',
        controllerAs: 'vm',
        data: {
            pageTitle: 'Search Results'
        }
    });
	
}]);

