$(document).ready(function () {
    $('.login-info-box').fadeOut();
    $('.login-show').addClass('show-log-panel');
});

function fadeRegistrar(){ 
        $('.register-info-box').fadeOut();
        $('.login-info-box').fadeIn();
        
        $('.white-panel').addClass('right-log');
        $('.register-show').addClass('show-log-panel');
        $('.login-show').removeClass('show-log-panel');
};

function fadeLogar(){ 
        $('.register-info-box').fadeIn();
        $('.login-info-box').fadeOut();
        
        $('.white-panel').removeClass('right-log');        
        $('.login-show').addClass('show-log-panel');
        $('.register-show').removeClass('show-log-panel');
};