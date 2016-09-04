angular.module('minhasDiretivas', [])
  .directive('meuPainel', function() {
    var ddo = {};

    ddo.restric = "AE";

    ddo.scope = {
      // titulo: '@titulo'
      titulo: '@' // são iguais, não precisa especificar @titulo
    }

    ddo.transclude = true;

    ddo.templateUrl = 'js/directives/meu-painel.html';

    // ddo.template =
    //             '<div class="panel panel-default">'
    //         +   '   <div class="panel-heading">'
    //         +   '        <h3 class="panel-title text-center">{{titulo}}</h3> '
    //         +   '   </div>'
    //         +   '   <div class="panel-body" ng-transclude>'
    //         +   '   </div>'
    //         +   '</div>'

    return ddo;
  }).directive('minhaFoto', function() {
    var ddo = {};

    ddo.restrict = "AE";

    ddo.scope = {
      titulo: '@',
      url: '@'
    }

    ddo.template = '<img class="img-responsive center-block" src="{{url}}" alt="{{titulo}}"/>';

    return ddo;
  });
