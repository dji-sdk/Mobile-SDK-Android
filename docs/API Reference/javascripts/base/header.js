(function() {
  new Vue({
    el: '#site-header',
    data: {
      loggedIn: false,
      user: {
        username: ''
      }
    },
    ready: function() {
      var currentUser = Cookie.get('_email');
      if (currentUser) {
        this.user.username = decodeURIComponent(currentUser.split('@')[0]);
        this.loggedIn = true;
      }
      var enLink = $('footer .languages .lang-en');
      var enHref = enLink.attr('href');
      var cnLink = $('footer .languages .lang-cn');
      var cnHref = cnLink.attr('href');
      var search = window.location.search;
      var hash = window.location.hash;
      enLink.attr('href', enHref + search + hash);
      cnLink.attr('href', cnHref + search + hash);
    },
    methods: {
      logout: function() {
        var _this = this;
        AjaxManager.logout().done(function () {
          _this.loggedIn = false;
          _this.user.username = '';
          authRouter.run()
        });
      }
    }
  })
})();
