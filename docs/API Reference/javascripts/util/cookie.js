;(function(window) {
  var Cookie = {
    parse: function() {
      var result = {}
      var cookieArr = document.cookie.split(';')
      for (var i = 0, length = cookieArr.length; i < length; i++) {
        var kv = cookieArr[i].trim().split('=')
        result[kv[0]] = kv[1]
      }
      return result
    },
    get: function(key) {
      var cookie = this.parse()
      if (cookie[key]) {
        return cookie[key]
      } else {
        // console.log('Can not get cookie: %s', key)
        return null
      }
    },
    set: function(key, value, days) {
      days = days || 30
      var date = new Date()
      date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000))
      var expires = '; expires=' + date.toGMTString()
      document.cookie = key + '=' + value + expires + '; path=/'
    },
    remove: function(key) {
      document.cookie = key + '=;expires=Thu, 01 Jan 1970 00:00:01 GMT;';
    }
  }
  window.Cookie = Cookie
})(window)