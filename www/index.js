var exec = require('cordova/exec');

/**
 * @namespace cordova.plugins
 * @exports Album
 */
var Album = {};

Album.getImages = function(successCallback, errorCallback) {
  exec(successCallback, errorCallback, "Album", "getImages", []);
};

module.exports = Album;
