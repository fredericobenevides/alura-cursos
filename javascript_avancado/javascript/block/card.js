// var $cardColors = document.querySelectorAll('.card-colors');

// for (var index = 0; index < $cardColors.length; index++) {
//   $cardColors[index].addEventListener('click', function() {
//     var $card = this.parentNode.parentNode.parentNode;

//     for (var position = 0; position < $cardColors.length; position++) {
//       $cardColors[position].classList.remove('isActive');
//     }
//     $card.dataset.color = this.dataset.color;
//     this.classList.add('isActive');
//   });
// }

// var $cards = document.querySelectorAll('.card');


// for (var index = 0; index < $cards.length; index++) {
//   $cards[index].addEventListener('click', function(event) {
//     var $this = event.target;
//     var $card = this;
//     var $cardContent = $card.querySelector('.card-content');

//     // if ($this.classList.contains('card-options')) {
//     if ($this.dataset.color) {

//       $card.dataset.color = $this.dataset.color;
//       $this.classList.add('isActive');

//       var $cardOptions = document.querySelectorAll('.card-options');
//       for (var position = 0; position < $cardOptions.length; position++) {
//         $cardOptions[position].classList.remove('isActive');
//       }
//     }

//     if ($this.classList.contains('card_delete')) {
//       $card.remove();
//     }

//     if ($this.classList.contains('card_edit')) {
//       if ($cardContent.getAttribute('contenteditable') == 'false') {
//         $cardContent.setAttribute('contenteditable', 'true');
//         $cardContent.focus();
//         $this.classList.add('isActive');
//       } else {
//         $cardContent.setAttribute('contenteditable', 'false');
//         $cardContent.blur();
//         $this.classList.remove('isActive');
//       }
//     }
//   });
// }

var $wrapCards = document.querySelectorAll('.wrap-card');

$wrapCard[index].addEventListener('click', function(event) {
  var $this = event.target;
  var $card = this;
  var $cardContent = $card.querySelector('.card-content');

  if ($this.dataset.color) {
    $card.dataset.color = $this.dataset.color;

    for (var position = 0; position < $cardOptions.length; position++) {
      $cardOptions[position].classList.remove('isActive');
    }

    $this.classList.add('isActive');
  }

  if ($this.classList.contains('card_delete')) {
    $card.remove();
  }

  if ($this.classList.contains('card_edit')) {
    if ($cardContent.getAttribute('contenteditable') == 'false') {
      $cardContent.setAttribute('contenteditable', 'true');
      $cardContent.focus();
      $this.classList.add('isActive');
    } else {
      $cardContent.setAttribute('contenteditable', 'false');
      $cardContent.blur();
      $this.classList.remove('isActive');
    }
  }
});
