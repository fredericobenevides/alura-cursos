function ativaScrollSuave(selector) {
  $(selector).click(function(event) {
    event.preventDefault();
    // var target = this.href;
    var target = $(this).attr('href');

    $('html, body').animate({
      scrollTop: $(target).offset().top
    }, 1000);
  });
}

ativaScrollSuave('a[href*=PanelAbout]');
ativaScrollSuave('a[href*=PanelSpeakers]');
ativaScrollSuave('a[href*=PanelForm]');
