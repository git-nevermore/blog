/**
 * 背景图片刷新/点击更换
 * 
 */
var pub_img_current_image;

function backgroundImage() {
	var pub_img_path = 'images/dota2';
	var pub_img_num = 10;

	var pub_img_current_no = function() {
		return Math.floor(Math.random() * pub_img_num + 1);
	};

	var pub_img_url = function() {
		return pub_img_path + '/' + pub_img_current_no() + '.jpg';
	};

	if (pub_img_current_image === undefined)
		pub_img_current_image = pub_img_url();

	if ('querySelector' in document) {
		var body = document.querySelector('body').style;
	} else {
		var body = document.body.style;
	}
	body.backgroundSize = 'cover';
	body.backgroundRepeat = 'no-repeat';
	body.backgroundImage = 'url(' + pub_img_current_image + ')';
	var span = document.getElementById('img_placer');
	span.innerHTML = '<span style="background-image: url('
			+ (pub_img_current_image = pub_img_url())
			+ ');width: 0px;height: 0px;display: inline;"></span>';
}
backgroundImage();

/*
var up = document.getElementById('up-arrow');
var upStatus = 0;

up.addEventListener('click',function() {
	if (upStatus === 0) {
		var container = document
				.getElementById('container');
		container.setAttribute('class', 'folded');
		up.style.backgroundImage = 'url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABcAAAAYCAYAAAARfGZ1AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAN1wAADdcBQiibeAAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAHZSURBVEiJ7ZQ/ixpRFMXPeY6za7IEbbS1EGysUk0TkFjkI1imShFIioVASJsqW2wT8gW2TSsypBCLBLExEBgQ2cxodDdYKBhHDZv5c1Ooi4juGsIWCXvhNo97fu+++857FBHcVKgbI9/C/z84ROQyAahMJnMvn88fAIgB2AegA4guMrJoiAC4qt2UXPU5yT3DMB6l0+kHmqYpEQkWDTAMw8u6MAxJEiIiSikEQRAdjUY/Go3G8XA4HC/rtLVTXBiG0dR1/XkqlXqo6/rPMAw535cQES67XqxRRCKz2cydTqdPVsHAhpnX6/XTyWTy0nXdLyTvRiKRO0qpGMkYyX0AeyR1klEAmud5F7ZtvyiXy+/XWdz2/AuFwv1sNnsSj8dzMi8iyXBxQkUSnuf5rVbrValUOpYNoK1uqVQqn9vt9tPxePxVKbUcC0SESin4vh82m80jx3HebgJfCQcA0zQ/2bb9zHXdbyRBUiml6Pt+4DjOu06n88ayrF/b9Nf63DTND91u99B13e+apsHzPHEc56TX6722LGtylXbrzNejWCw+TiaTR4PB4GO/3z+sVqtn12l2hudyuYNEImEEQdCs1Wrnu2h2hgNzu2y7vL+G/2n8u7/iLXxj/AYhQQQGkT/xPgAAAABJRU5ErkJggg==)';
		up.style.cursor = 's-resize';
	} else {
		var container = document
				.getElementById('container');
		container.removeAttribute('class');
		up.style.backgroundImage = 'url(data:image/gif;base64,R0lGODlhFgAVALMAAGNkZuLi44CBg5SVlru8vPb29tjZ2aioqW1ucIqLjOrq6sXFxgAAAAAAAAAAAAAAACH5BAAHAP8ALAAAAAAWABUAAARBUMlJq7046837LYVnJYlIEQBAmEqQpoEpvIAgHnR6dEb+GpsCwpdChDID4muQWShpi8+ARBUIqKTBkcXter9gUwQAOw==)';
		up.style.cursor = 'n-resize';
	}
	upStatus = ~upStatus;
});
*/