;(function(exports, UrlManger){
  var storage = localStorage;

  var AjaxManager = {
    ajax: function(method, url, data, reload){
      var config = {
                url: url,
                method: method,
                data: data,
                xhrFields: {
                  withCredentials: true
                },
                beforeSend: function(){
                },
                complete: function(){
                }
          },
          def = new $.Deferred(),
          url;

      if(method == "get"){
        url = url + (data ?  $.param(data) : "");
      }

      if(method == "get" && reload && storage[url]){
        setTimeout(function(){
          def.resolve(storage[url]);
        },0);
      }else{
        $.ajax(config).done(function(data){
          //todo
          if(data.status === 0){
            def.resolve(data);
          }else{
            def.reject(data);
          }
        }).fail(function(jqXHR) {
          def.reject(jqXHR);
        });
      }

      return def.promise();
    },
    get: function(url, data, reload){
      if(typeof data == "boolean"){
        reload = data;
        data = null;
      }
      return this.ajax('get', url, data, reload);
    },
    post: function(url, data){
      return this.ajax('post', url, data);
    },
    put: function(url, data){
      return this.ajax('put', url, data);
    },
    del: function(url, data){
      return this.ajax('delete', url, data);
    },
    login: function(data){
      return this.post(UrlManager.get('login'), data);
    },
    register: function(data){
      return this.post(UrlManager.get('register'), data);
    },
    getProfile: function(reload){
      return this.get(UrlManager.get('profile'), reload);
    },
    getDeveloper: function(reload){
      return this.get(UrlManager.get('getDeveloper'), reload);
    },
    updateDeveloper: function(data){
      return this.put(UrlManager.get('updateDeveloper'), data);
    },
    sendActivationMail: function(){
      return this.get(UrlManager.get('acvivationMail'), true);
    },
    getUserStatus: function(reload){
      return this.get(UrlManager.get('userStatus'), reload).done(function(data){
      });
    },
    logout: function(){
      return this.get(UrlManger.get('logout')).done(function(data){
      });
    },
    applyDeveloper: function(data){
      return this.post(UrlManger.get('applyDeveloper'), data);
    },
    applySDk: function(data){
      return this.post(UrlManger.get('applySdk'), data);
    },
    checkEmail: function(data, reload){
      return this.post(UrlManger.get('isEmailUsed'), data, reload);
    },
    getCountries: function(data, reload){
      return this.get(UrlManager.get('countries'), data, reload);
    },
    getApplyHistory: function(){
      return this.get(UrlManager.get('applyHistory'));
    },
    upgradeApp: function(id, data){
      return this.post(UrlManger.get('upgradeApp', {id: id}), data);
    },
    createApp: function(data){
      return this.post(UrlManger.get('createApp'), {app:data});
    },
    getApp: function(id){
      return this.get(UrlManger.get('getApp', {id:id}));
    },
    getApps: function(data){
      return this.get(UrlManger.get('getApps'), data);
    },
    updateApp: function(id, data){
      return this.put(UrlManger.get('updateApp', {id:id}), {app:data});
    },
    deleteApp: function(id, data){
      return this.del(UrlManger.get('deleteApp', {id:id}), data);
    },
    sendResetPasswordMail: function(email){
      return this.post(UrlManger.get('resetPasswordMail'), {email: email});
    },
    resetPassword: function(data){
      return this.post(UrlManger.get('resetPassword'), data);
    },
    changePassword: function(data){
      return this.post(UrlManger.get('changePassword'), data);
    },
    getContests: function() {
      return this.get(UrlManger.get('contests'));
    },
    applyContest: function(slug, data) {
      return this.post(UrlManger.get('applyContest', {slug: slug}), data);
    },
    reapplyContest: function(slug, data) {
      return this.put(UrlManger.get('reapplyContest', {slug: slug}), data);
    },
    getContestTeam: function(slug) {
      return this.get(UrlManger.get('contestsTeam', {slug: slug}));
    },
    getContestStages: function(slug) {
      return this.get(UrlManger.get('contestsStages', {slug: slug}));
    },
    submitContestFile: function(slug, data) {
      return this.post(UrlManger.get('submitContestFile', {slug: slug}), data);
    },
    confirmContestSubmission: function(slug, data) {
      return this.get(UrlManger.get('confirmContestSubmission', {slug: slug}), data);
    },
    getContestApps: function(contest, data){
      return this.get(UrlManger.get('contestsApps', {slug: contest}), data);
    },
    createContestApp: function(contest, data){
      return this.post(UrlManger.get('createContestsApp', {slug: contest}), { app: data });
    },
    getNotices: function(data) {
      return this.get(UrlManger.get('getNotices'), data);
    },
    readNotice: function(id) {
      return this.get(UrlManger.get('readNotice', {id: id}));
    },
    readAllNotices: function() {
      return this.post(UrlManger.get('readAllNotices'));
    },
    resendActivateAppMail: function(data) {
      return this.get(UrlManager.get('resendActivateAppMail', data));
    },
    checkTerms: function(id) {
      return this.get(UrlManger.get('terms', {id: id}));
    },
    readTerms: function(id) {
      return this.post(UrlManger.get('terms', {id: id}));
    },
    applyMfi: function(id, data) {
      return this.post(UrlManger.get('applyMfi', {id: id}), {mfi: data});
    },
    searchDoc: function(data) {
      return this.get(UrlManger.get('searchDoc'), data)
    }
  };
  exports.AjaxManager = AjaxManager;

})(window, window.UrlManager);
