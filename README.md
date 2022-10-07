# gulimall-api
## 谷粒商城后台Api
### nacos启动命令： 
```shell
startup.cmd -m standalone
```
### git push timeout 
```shell
# 先设置这两个参数
git config --global http.sslBackend "openssl" 
git config --global http.sslVerify "false"
# 运行这两个就可以了
git config --global --unset http.proxy
git config --global --unset https.proxy

```
### Web server failed to start. Port 10000 was already in use
``` shell
netstat -ano|findstr 10000
tasklist|findstr 11808
taskkill /f /t /im yundetectservice.exe
```