;(function() {
  new Vue({
    el: '#site-footer',
    data: function () {
      return {
        lang: window.config.locale
      }
    },
    watch: {
      lang: function (value) {
        this.switchLang()
      }
    },
    ready: function () {
      // console.log(this.lang)
    },
    methods: {
      switchLang: function () {
        var href = window.location.href
        var pathname = window.location.pathname
        var newPathname = (this.lang == 'en' ? '' : '/' + this.lang) + pathname.replace(/^\/(en|cn|jp)/, '')
        window.location.pathname = newPathname
      }
    }
  })
})();
