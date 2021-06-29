echo #######################
echo ##### begin copy ######
echo #######################

echo ###### copy hanying_admin ########
copy .\conf\prod\hanying_admin\application.yml ..\..\hanying_admin\src\main\resources\
copy .\conf\prod\hanying_admin\bootstrap.yml ..\..\hanying_admin\src\main\resources\


echo ###### copy hanying_gateway ########
copy .\conf\prod\hanying_gateway\application.yml ..\..\hanying_gateway\src\main\resources\
copy .\conf\prod\hanying_gateway\bootstrap.yml ..\..\hanying_gateway\src\main\resources\


echo ###### copy hanying_monitor ########
copy .\conf\prod\hanying_monitor\application.yml ..\..\hanying_monitor\src\main\resources\
copy .\conf\prod\hanying_monitor\bootstrap.yml ..\..\hanying_monitor\src\main\resources\


echo ###### copy hanying_picture ########
copy .\conf\prod\hanying_picture\application.yml ..\..\hanying_picture\src\main\resources\
copy .\conf\prod\hanying_picture\bootstrap.yml ..\..\hanying_picture\src\main\resources\


echo ###### copy hanying_search ########
copy .\conf\prod\hanying_search\application.yml ..\..\hanying_search\src\main\resources\
copy .\conf\prod\hanying_search\bootstrap.yml ..\..\hanying_search\src\main\resources\


echo ###### copy hanying_sms ########
copy .\conf\prod\hanying_sms\application.yml ..\..\hanying_sms\src\main\resources\
copy .\conf\prod\hanying_sms\bootstrap.yml ..\..\hanying_sms\src\main\resources\


echo ###### copy hanying_spider ########
copy .\conf\prod\hanying_spider\application.yml ..\..\hanying_spider\src\main\resources\
copy .\conf\prod\hanying_spider\bootstrap.yml ..\..\hanying_spider\src\main\resources\


echo ###### copy hanying_web ########
copy .\conf\prod\hanying_web\application.yml ..\..\hanying_web\src\main\resources\
copy .\conf\prod\hanying_web\bootstrap.yml ..\..\hanying_web\src\main\resources\
