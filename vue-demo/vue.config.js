// const { defineConfig } = require('@vue/cli-service')
// module.exports = defineConfig({
//   transpileDependencies: true
// })
module.exports = {
    publicPath: "",
    productionSourceMap: false,
    devServer: {
        historyApiFallback: true,
        allowedHosts: 'all',
        open: false,
        // host: '127.0.0.1',
        // port: 3000,
        proxy: {
            "/myserver": {
                target: "http://localhost:8080",
                changeOrigin: true,
                pathRewrite: {
                    "^/myserver": ''
                }
            },
            "/bpic": {
                target: "http://192.168.1.193:3000",
                changeOrigin: true,
            }
        }
    }
}