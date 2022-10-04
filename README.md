# gulimall-api
## 谷粒商城后台Api
### nacos启动命令： 
startup.cmd -m standalone
### git push timeout 
```shell
# 先设置这两个参数
git config --global http.sslBackend "openssl" 
git config --global http.sslVerify "false"
# 以后运行这两个就可以了
git config --global --unset http.proxy
git config --global --unset https.proxy

```