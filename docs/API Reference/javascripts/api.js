var panel
;(function () {
  if (!$('.documentation-page').length) return false

  var sidebar = $('.documentation-page .site-sidebar')
  var sidebarInner = $('.site-sidebar .scrollable')
  var currentTitle = sidebarInner.find('a.active:first-child')
  var footer = $('.site-footer')
  var w = $(window)
  var titles = sidebar.find('dl > dd > a')


  var initHashScroll = function () {
    // first time scroll
    var hash = window.location.hash.toLowerCase()
    if (!!hash) {
      window.location.hash = ''
      setTimeout(function () {
        window.history.pushState(null, null, hash)
        scrollTo($(hash))
      }, 1)
    }

    // click #hash to scroll
    $('a[href^="#"]').click(function (e) {
      e.preventDefault()
      var target = $(this)
      // if(!target.hasClass('trigger')){
        var hash = target.attr('href').toLowerCase()
        scrollTo($(hash), function() {
          window.history.pushState(null, null, hash)
        })
      // }
    })
    var openHashTag = function(hash, callback){
      if(hash.indexOf('_inline') < 0){
        hash += '_inline'
      }
      var targetModuleDom = $('a[href="' + hash + '"]')
      function doClick(){
        setTimeout(
            function(){
              targetModuleDom.click()
            }, 400
          )
      }
      if(targetModuleDom && targetModuleDom.length > 0){
        var preDocs = targetModuleDom.parents('.inline-doc')
        if(preDocs && preDocs.length > 0){
          var preId = preDocs.eq(0).attr('id')
          openHashTag('#' + preId, doClick)
        }else{
          doClick()
          callback && callback()
        }
      }
    }
    openHashTag(hash)
    $(window).bind('hashchange', function(e){
      var hash = window.location.hash.toLowerCase()
      openHashTag(hash)
    })
  }

  var initSidebar = function () {
    // fix & resize sidebar
    window.addEventListener('scroll', function () {
      if (w.scrollTop() > 60) {
        sidebar.addClass('fixed')
      } else if (sidebar.hasClass('fixed')) {
        sidebar.removeClass('fixed')
      }
      resizeSidebar()
    }, false)
    window.addEventListener('resize', function () {
      resizeSidebar()
    }, false)
    resizeSidebar()
  }

  var initSubMenuClick = function () {
    // sub menu toggle click event
    $('.site-sidebar .sub-toggle').on('click', function (e) {
      var target = $(this)
      if (target.hasClass('active')) {
        target.removeClass('active')
      } else {
        //titles.find('.sub-toggle').removeClass('active')
        target.addClass('active')
        var href = target.attr('data-href')
        if(href){
          window.location.href = href
        }
      }
    })
  }

  // init sidebar scroll poistion to active title
  var initSidebarScroll = function () {
    if(currentTitle.length > 0){
      currentTitle = currentTitle.eq(0)
    }else{
      var mainTitles = $('.sub-toggle')
      for(var i = 0; i < mainTitles.length; i++){
        if(location.href.endsWith(mainTitles.eq(i).attr('data-href'))){
          currentTitle = mainTitles.eq(i)
          currentTitle.addClass('active')
          break
        }
      }
    }

    var parentMainTitles = currentTitle.parents('.sub-menu')
    for(var i = 0; i < parentMainTitles.length; i++){
      var parentSubTitle = parentMainTitles.eq(i).siblings('.sub-toggle')
      if(parentSubTitle){
        parentSubTitle.addClass('active')
      }
    }
    if (currentTitle[0] == sidebarInner.find('a')[0]) return false;
    var top = sidebarInner.scrollTop() + currentTitle.position().top - sidebarInner.position().top
    setTimeout(function () {
      sidebarInner.scrollTop(top)
    }, 0)
  }

  // make .article table scrollable
  var initArticleTable = function () {
    var table = $('.article table').not('.highlight table')
    table.wrap('<div class="table-wrap"></div>')
  }

  // helpers
  var resizeSidebar = function() {
    // vertical height
    var marginB = 40
    var winScroll = w.scrollTop()
    var newH = 0
    var winHeight = w.height()
    var docHeight = $('.documentation-page .site-main').height()
    var footerArise = winHeight - (footer.position().top - winScroll)
    if (document.documentElement.scrollHeight < document.documentElement.clientHeight) {
      newH = $('body').height() - sidebarInner.position.top - marginB
    } else {
      if (sidebar.hasClass('fixed')) {
        newH = winHeight - sidebarInner.position().top - sidebar.position().top - marginB
      } else {
        newH = winHeight - sidebarInner.position().top + winScroll - marginB
      }
      if (footerArise >= 0) {
        newH -= footerArise
      }
    }
    sidebarInner.css({
      height: newH
    })

    // horizontal position
    if (sidebar.hasClass('fixed')) {
      sidebar.css({
        transform: 'translateX(-'+w.scrollLeft()+'px)'
      })
    } else {
      sidebar.css({
        transform: 'translateX(0px)'
      })
    }
  }

  var scrollTo = function (target, cb) {
    if(target.length > 0) {
      cb = cb || function() {}
      $('html, body').stop().animate({scrollTop: Math.ceil($(target).offset().top - 50)}, cb);
    }
  }

  function placeholder() {
    if ($('<input type="text">')[0].placeholder !== undefined) return;

    $('#search-label').click(function() {
        $('#search').focus();
        $('#search-label').hide();
    });

    $('#search').focus(function() {
        $('#search-label').hide();
    });
    $('#search').blur(function() {
        this.value == '' && $('#search-label').show()
    });

    $('#search')[0].value == '' && $('#search-label').show();
  }
  function getUrlParam(name){
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null && r != 'undefined') return unescape(r[2]); return null; //返回参数值
  }

  $(function() {
      placeholder();
      var tree = [];
      // var searchKey = getUrlParam('search')
      $('#links').hide();
      panel = new Searchdoc.Panel($('#panel'), search_data, tree, top.frames[1]);
      $('#search').focus();

      // var s = window.parent.location.search.match(/\?q=([^&]+)/);
      var s = getUrlParam('search'), index = parseInt(getUrlParam('i'))
      if (s) {
          // s = decodeURIComponent(s[1]).replace(/\+/g, ' ');
          if (s.length > 0)
          {
            $('#search').val(s);
            panel.search(s, false, index);
          }
      }
      setTimeout(function(){
        initHashScroll()
      }, 300)
      $('.clean-search').on('click', function(){
        $('#search').val('');
        panel.search('', false, 0);
      })
  })

  // sidebarInner.css({ height: 0 })

  initSubMenuClick()
  // initSidebar()
   initSidebarScroll()
  // initArticleTable()
})()


;(function() {
  // // tigger to open target dom
  $('.trigger').each(function(idx, trigger) {
    $(trigger).on('click', function (e) {
      e.preventDefault()
      var targetId = this.getAttribute('href'),
          target = $(targetId)
      target.css('display') == 'block' ? target.slideUp() : target.slideDown()
    })
  })
})()
