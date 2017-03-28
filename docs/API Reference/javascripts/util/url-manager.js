;(function(exports){
  var namespace = Config.api_host + '/api/web/';

  var urls = {
    login: 'user/login',
    register: 'user/signup',
    logout: 'user/logout',
    profile: 'user/profile',
    userStatus: 'user/status',
    acvivationMail: 'user/activate_email',
    resetPasswordMail: 'user/reset_password_email',
    resetPassword: 'user/reset_password',
    applyDeveloper: 'developers',
    applySdk: 'developer/sdks',
    getDeveloper: 'developer',
    updateDeveloper: 'developer',
    upload: 'upload',
    upgradeApp: 'apps/:id/activation_quota',
    changePassword: 'user/change_password',
    contests: 'contests',
    applyContest: '/contest/:slug/apply',
    reapplyContest: '/contest/:slug/reapply',
    contestsTeam: 'contests/:slug/team',
    contestsStages: 'contests/:slug/stages',
    contestsApps: 'contests/:slug/apps',
    createContestsApp: 'contests/:slug/apps',
    submitContestFile: 'contests/:slug/submit_file',
    confirmContestSubmission: 'contests/:slug/confirm_submission',
    getFileById: 'resource/files/:id',
    countries: 'countries',
    applyHistory: 'developer/history',
    isEmailUsed: 'user/is_email_used',
    createApp: 'apps',
    getApps: 'apps',
    getApp: 'apps/:id',
    updateApp: 'apps/:id',
    deleteApp: 'apps/:id',
    resendActivateAppMail: 'apps/:id/re_email',
    getNotices: 'notices',
    readNotice: 'notices/:id',
    readAllNotices: 'notices/mark_all_read',
    terms: 'terms/:id',
    applyMfi: 'apps/:id/mfi',
    searchDoc: 'search'
  };

  exports.UrlManager = {
    get: function (key, options) {
      var url = namespace + urls[key];
      for (key in options) {
        url = url.replace(':' + key, options[key]);
      }
      return url;
    }
  };
})(window);
