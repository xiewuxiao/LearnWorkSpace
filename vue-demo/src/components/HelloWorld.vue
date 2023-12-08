<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      For a guide and recipes on how to configure / customize this project,<br>
      check out the
      <a href="https://cli.vuejs.org" target="_blank" rel="noopener">vue-cli documentation</a>.
    </p>
    <h3>Installed CLI Plugins</h3>
    <ul>
      <li><a href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-babel" target="_blank" rel="noopener">babel</a></li>
      <li><a href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-eslint" target="_blank" rel="noopener">eslint</a></li>
    </ul>
    <h3>Essential Links</h3>
    <ul>
      <li><a href="https://vuejs.org" target="_blank" rel="noopener">Core Docs</a></li>
      <li><a href="https://forum.vuejs.org" target="_blank" rel="noopener">Forum</a></li>
      <li><a href="https://chat.vuejs.org" target="_blank" rel="noopener">Community Chat</a></li>
      <li><a href="https://twitter.com/vuejs" target="_blank" rel="noopener">Twitter</a></li>
      <li><a href="https://news.vuejs.org" target="_blank" rel="noopener">News</a></li>
    </ul>
    <h3>Ecosystem</h3>
    <ul>
      <li><a href="https://router.vuejs.org" target="_blank" rel="noopener">vue-router</a></li>
      <li><a href="https://vuex.vuejs.org" target="_blank" rel="noopener">vuex</a></li>
      <li><a href="https://github.com/vuejs/vue-devtools#vue-devtools" target="_blank" rel="noopener">vue-devtools</a></li>
      <li><a href="https://vue-loader.vuejs.org" target="_blank" rel="noopener">vue-loader</a></li>
      <li><a href="https://github.com/vuejs/awesome-vue" target="_blank" rel="noopener">awesome-vue</a></li>
    </ul>
    <h3>zip文件下载测试</h3>
    <ul>
      <button @click="downloadPz1">下载凭证数据</button>
    </ul>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods: {
    downloadPz() {//这种方式是可以的
      let data = JSON.stringify({
        "parameters": "eyJsaXN0IjpbeyJEWlJYTUNaIjpudWxsLCJaQ19KRSI6NTAwMCwiU1pfVFlQRSI6InpjIiwiRFpSSUREVyI6IjBkODQxODY5ZmRkNTU3NTBjOTdmMjUwYmJjYTQzMjI4IiwiRFpSUURXIjoiMjAyMy0xMi0wNiIsIkNBUkRNT05USCI6IjA1LTExIiwiU0ZZRFpEVyI6IjIiLCJEV0RaSEZEVyI6IjIwMjMtMTItMDYg5bey56Gu6K6k5a+56LSm44CCIiwiSllfSkUiOjUwMDAsIklEIjoiM2RmMTFhNTRjNzc4NDYyYmI1MGNhYTQzZTZhNDM0ODQiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDAzIiwiU1JfSkUiOjAsIlVOSVRJRCI6IjNiYmFlYzBiOTJiNzJlMjNmZGZlNTUwYTQ5NWEwZjk4IiwiRFpSUUNaIjpudWxsLCJEWlJYTURXIjoi5Zub5bed55yB6LWE5Lit5Y6/56ys5LiA5Lit5a2mIiwiU0ZZRFpDWiI6bnVsbCwiWkgiOiI4ODEwMDEyMDAwMjAxNzk4NSIsIkRaUklEQ1oiOm51bGwsIkRXRFpIRkNaIjpudWxsLCJDQVJEWUVBUiI6MjAyMywiQUdFTkNZX05BTUUiOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuIDkuK3lraYiLCJUSVRMRSI6IuS7o+euoe+8iOmAgOeJueW7uuadkeaPkOeBjOermemhueebruaKleagh+S/neivgemHke+8iSIsIkZJTlRfVFlQRSI6IjMiLCJGRFRNX1lXUlEiOiIyMDIzLTA1LTExIiwiX1hfUk9XX0tFWSI6InJvd18xMTUifSx7IkRaUlhNQ1oiOm51bGwsIlpDX0pFIjo1MDAwLCJTWl9UWVBFIjoiemMiLCJEWlJJRERXIjoiMGQ4NDE4NjlmZGQ1NTc1MGM5N2YyNTBiYmNhNDMyMjgiLCJEWlJRRFciOiIyMDIzLTEyLTA2IiwiQ0FSRE1PTlRIIjoiMDUtMTEiLCJTRllEWkRXIjoiMiIsIkRXRFpIRkRXIjoiMjAyMy0xMi0wNiDlt7Lnoa7orqTlr7notKbjgIIiLCJKWV9KRSI6NTAwMCwiSUQiOiI5YTcxM2E4MWY0ZDY0ZGNjYjM2YjVkOWEyMDEzODVkNyIsIlJFTUFSSyI6bnVsbCwiQUdFTkNZX0NPREUiOiIyMDYwMDMiLCJTUl9KRSI6MCwiVU5JVElEIjoiM2JiYWVjMGI5MmI3MmUyM2ZkZmU1NTBhNDk1YTBmOTgiLCJEWlJRQ1oiOm51bGwsIkRaUlhNRFciOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuIDkuK3lraYiLCJTRllEWkNaIjpudWxsLCJaSCI6Ijg4MTAwMTIwMDAyMDE3OTg1IiwiRFpSSURDWiI6bnVsbCwiRFdEWkhGQ1oiOm51bGwsIkNBUkRZRUFSIjoyMDIzLCJBR0VOQ1lfTkFNRSI6IuWbm+W3neecgei1hOS4reWOv+esrOS4gOS4reWtpiIsIlRJVExFIjoi5Luj566h77yI6YCA54m55bu65p2R5o+Q54GM56uZ6aG555uu5oqV5qCH5L+d6K+B6YeR77yJIiwiRklOVF9UWVBFIjoiMyIsIkZEVE1fWVdSUSI6IjIwMjMtMDUtMTEiLCJfWF9ST1dfS0VZIjoicm93XzExNiJ9LHsiRFpSWE1DWiI6bnVsbCwiWkNfSkUiOjEyOTAwLCJTWl9UWVBFIjoiemMiLCJEWlJJRERXIjoiMGQ4NDE4NjlmZGQ1NTc1MGM5N2YyNTBiYmNhNDMyMjgiLCJEWlJRRFciOiIyMDIzLTEyLTA2IiwiQ0FSRE1PTlRIIjoiMDUtMTEiLCJTRllEWkRXIjoiMiIsIkRXRFpIRkRXIjoiMjAyMy0xMi0wNiDlt7Lnoa7orqTlr7notKbjgIIiLCJKWV9KRSI6MTI5MDAsIklEIjoiZGZiMjJiYzhiMDIwNDdjYmI1NTU5NmQ5OWJlMGNjMmUiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDAzIiwiU1JfSkUiOjAsIlVOSVRJRCI6IjNiYmFlYzBiOTJiNzJlMjNmZGZlNTUwYTQ5NWEwZjk4IiwiRFpSUUNaIjpudWxsLCJEWlJYTURXIjoi5Zub5bed55yB6LWE5Lit5Y6/56ys5LiA5Lit5a2mIiwiU0ZZRFpDWiI6bnVsbCwiWkgiOiI4ODEwMDEyMDAwMjAxNzk4NSIsIkRaUklEQ1oiOm51bGwsIkRXRFpIRkNaIjpudWxsLCJDQVJEWUVBUiI6MjAyMywiQUdFTkNZX05BTUUiOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuIDkuK3lraYiLCJUSVRMRSI6IuS7o+euoe+8iOmAgDIwMjLlubTmipfml7HmsLTmupDlt6XnqIvmsJHlt6Xlt6XotYTkv53or4Hph5HvvIkiLCJGSU5UX1RZUEUiOiIzIiwiRkRUTV9ZV1JRIjoiMjAyMy0wNS0xMSIsIl9YX1JPV19LRVkiOiJyb3dfMTE3In0seyJEWlJYTUNaIjpudWxsLCJaQ19KRSI6MCwiU1pfVFlQRSI6InNyIiwiRFpSSUREVyI6ImUxZTAzOTYzM2U5Mjg0NDliYjkzNDViMzJiZWZhOTFlIiwiRFpSUURXIjoiMjAyMy0xMi0wNiIsIkNBUkRNT05USCI6IjA1LTExIiwiU0ZZRFpEVyI6IjIiLCJEV0RaSEZEVyI6IjIwMjMtMTItMDYg5bey56Gu6K6k5a+56LSm44CCIiwiSllfSkUiOjIyNDAsIklEIjoiMDM5NzRiMWZhOTMzNGQ3MTk2YzRjMTRmNmQyODc5NWYiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDA0IiwiU1JfSkUiOjIyNDAsIlVOSVRJRCI6ImU5MGVmOWFlYWZkNzE3YTk2YzlmZjBhOWE2Nzc4ZmZlIiwiRFpSUUNaIjpudWxsLCJEWlJYTURXIjoi5Zub5bed55yB6LWE5Lit5Y6/56ys5LqM5Lit5a2mIiwiU0ZZRFpDWiI6bnVsbCwiWkgiOiI1MTAwMTY4NzIwODA1MDA3OTQwOSIsIkRaUklEQ1oiOm51bGwsIkRXRFpIRkNaIjpudWxsLCJDQVJEWUVBUiI6MjAyMywiQUdFTkNZX05BTUUiOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuozkuK3lraYiLCJUSVRMRSI6Iui1hOS4reWOv+awtOWNl+mVh+WHieawtOS6leadkTIwMjPlubTotKLmlL/ooZTmjqXmjqjov5vkuaHmnZHmjK/lhbTooaXliqnotYTph5Hln7rnoYDorr7mlr3pobnnm64t5pW05rK75bGx5Z2q5aGY5bel56iL6aG555uu5oqV5qCH5L+d6K+B6YeRIiwiRklOVF9UWVBFIjoiMyIsIkZEVE1fWVdSUSI6bnVsbCwiX1hfUk9XX0tFWSI6InJvd18xMTgifSx7IkRaUlhNQ1oiOm51bGwsIlpDX0pFIjowLCJTWl9UWVBFIjoic3IiLCJEWlJJRERXIjoiZTFlMDM5NjMzZTkyODQ0OWJiOTM0NWIzMmJlZmE5MWUiLCJEWlJRRFciOiIyMDIzLTEyLTA2IiwiQ0FSRE1PTlRIIjoiMDUtMTEiLCJTRllEWkRXIjoiMiIsIkRXRFpIRkRXIjoiMjAyMy0xMi0wNiDlt7Lnoa7orqTlr7notKbjgIIiLCJKWV9KRSI6MTYxMy41MiwiSUQiOiJiMWRjMDllMzc5ODA0YTFjYjUxMjVlNGU1NWE5ZTc3MiIsIlJFTUFSSyI6bnVsbCwiQUdFTkNZX0NPREUiOiIyMDYwMDQiLCJTUl9KRSI6MTYxMy41MiwiVU5JVElEIjoiZTkwZWY5YWVhZmQ3MTdhOTZjOWZmMGE5YTY3NzhmZmUiLCJEWlJRQ1oiOm51bGwsIkRaUlhNRFciOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuozkuK3lraYiLCJTRllEWkNaIjpudWxsLCJaSCI6IjUxMDAxNjg3MjA4MDUwMDc5NDA5IiwiRFpSSURDWiI6bnVsbCwiRFdEWkhGQ1oiOm51bGwsIkNBUkRZRUFSIjoyMDIzLCJBR0VOQ1lfTkFNRSI6IuWbm+W3neecgei1hOS4reWOv+esrOS6jOS4reWtpiIsIlRJVExFIjoiMjAyMzAzMTbkuqTnvZrmuIXliIYiLCJGSU5UX1RZUEUiOiIzIiwiRkRUTV9ZV1JRIjpudWxsLCJfWF9ST1dfS0VZIjoicm93XzExOSJ9LHsiRFpSWE1DWiI6bnVsbCwiWkNfSkUiOjAsIlNaX1RZUEUiOiJzciIsIkRaUklERFciOiJlMWUwMzk2MzNlOTI4NDQ5YmI5MzQ1YjMyYmVmYTkxZSIsIkRaUlFEVyI6IjIwMjMtMTItMDYiLCJDQVJETU9OVEgiOiIwNS0xMSIsIlNGWURaRFciOiIyIiwiRFdEWkhGRFciOiIyMDIzLTEyLTA2IOW3suehruiupOWvuei0puOAgiIsIkpZX0pFIjo4MDAsIklEIjoiZjBiOGFlNDIyMTliNDFiYzkyODdkNTUwNGNlM2QwMDMiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDA0IiwiU1JfSkUiOjgwMCwiVU5JVElEIjoiZTkwZWY5YWVhZmQ3MTdhOTZjOWZmMGE5YTY3NzhmZmUiLCJEWlJRQ1oiOm51bGwsIkRaUlhNRFciOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuozkuK3lraYiLCJTRllEWkNaIjpudWxsLCJaSCI6IjUxMDAxNjg3MjA4MDUwMDc5NDA5IiwiRFpSSURDWiI6bnVsbCwiRFdEWkhGQ1oiOm51bGwsIkNBUkRZRUFSIjoyMDIzLCJBR0VOQ1lfTkFNRSI6IuWbm+W3neecgei1hOS4reWOv+esrOS6jOS4reWtpiIsIlRJVExFIjoi6a2P5piO6Iux5pqC5omj5Yiw6LSi5pS/5LiT5YKo77yI5bu66KGM77yJIiwiRklOVF9UWVBFIjoiMyIsIkZEVE1fWVdSUSI6bnVsbCwiX1hfUk9XX0tFWSI6InJvd18xMjAifV19"
      });
      let config = {
        method: 'post',
        maxBodyLength: Infinity,
        url: '/bpic/xml/pzExport',
        headers: {'Access-Control-Allow-Origin':'*',
          'content-Type': 'application/json',
          'X-Access-Token':'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3MDE5MTQyOTEsInVzZXJuYW1lIjoicm9vdC1kZ3pqIn0.3WRU31KqeNmjSHZr81XXMJe8rK7p4b0PZrN3L_qADOg'},
        responseType: 'blob',
        data: data
      };
      axios.request(config)
          .then((res) => {
            // const blob = new Blob([res.data]);
            let blob = new Blob([res.data], { type: "application/zip" });
            const url = window.URL.createObjectURL(blob);
            const elink = document.createElement("a");
            elink.download = "凭证.zip";
            elink.style.display = "none";
            elink.href = url;
            document.body.appendChild(elink);
            elink.click();
            window.URL.revokeObjectURL(elink.href); // 释放URL 对象
            document.body.removeChild(elink);

          })
          .catch((error) => {

            console.log(error);
          });
    },
    downloadPz1(){
      let data = JSON.stringify({
        "parameters": "eyJsaXN0IjpbeyJEWlJYTUNaIjpudWxsLCJaQ19KRSI6NTAwMCwiU1pfVFlQRSI6InpjIiwiRFpSSUREVyI6IjBkODQxODY5ZmRkNTU3NTBjOTdmMjUwYmJjYTQzMjI4IiwiRFpSUURXIjoiMjAyMy0xMi0wNiIsIkNBUkRNT05USCI6IjA1LTExIiwiU0ZZRFpEVyI6IjIiLCJEV0RaSEZEVyI6IjIwMjMtMTItMDYg5bey56Gu6K6k5a+56LSm44CCIiwiSllfSkUiOjUwMDAsIklEIjoiM2RmMTFhNTRjNzc4NDYyYmI1MGNhYTQzZTZhNDM0ODQiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDAzIiwiU1JfSkUiOjAsIlVOSVRJRCI6IjNiYmFlYzBiOTJiNzJlMjNmZGZlNTUwYTQ5NWEwZjk4IiwiRFpSUUNaIjpudWxsLCJEWlJYTURXIjoi5Zub5bed55yB6LWE5Lit5Y6/56ys5LiA5Lit5a2mIiwiU0ZZRFpDWiI6bnVsbCwiWkgiOiI4ODEwMDEyMDAwMjAxNzk4NSIsIkRaUklEQ1oiOm51bGwsIkRXRFpIRkNaIjpudWxsLCJDQVJEWUVBUiI6MjAyMywiQUdFTkNZX05BTUUiOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuIDkuK3lraYiLCJUSVRMRSI6IuS7o+euoe+8iOmAgOeJueW7uuadkeaPkOeBjOermemhueebruaKleagh+S/neivgemHke+8iSIsIkZJTlRfVFlQRSI6IjMiLCJGRFRNX1lXUlEiOiIyMDIzLTA1LTExIiwiX1hfUk9XX0tFWSI6InJvd18xMTUifSx7IkRaUlhNQ1oiOm51bGwsIlpDX0pFIjo1MDAwLCJTWl9UWVBFIjoiemMiLCJEWlJJRERXIjoiMGQ4NDE4NjlmZGQ1NTc1MGM5N2YyNTBiYmNhNDMyMjgiLCJEWlJRRFciOiIyMDIzLTEyLTA2IiwiQ0FSRE1PTlRIIjoiMDUtMTEiLCJTRllEWkRXIjoiMiIsIkRXRFpIRkRXIjoiMjAyMy0xMi0wNiDlt7Lnoa7orqTlr7notKbjgIIiLCJKWV9KRSI6NTAwMCwiSUQiOiI5YTcxM2E4MWY0ZDY0ZGNjYjM2YjVkOWEyMDEzODVkNyIsIlJFTUFSSyI6bnVsbCwiQUdFTkNZX0NPREUiOiIyMDYwMDMiLCJTUl9KRSI6MCwiVU5JVElEIjoiM2JiYWVjMGI5MmI3MmUyM2ZkZmU1NTBhNDk1YTBmOTgiLCJEWlJRQ1oiOm51bGwsIkRaUlhNRFciOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuIDkuK3lraYiLCJTRllEWkNaIjpudWxsLCJaSCI6Ijg4MTAwMTIwMDAyMDE3OTg1IiwiRFpSSURDWiI6bnVsbCwiRFdEWkhGQ1oiOm51bGwsIkNBUkRZRUFSIjoyMDIzLCJBR0VOQ1lfTkFNRSI6IuWbm+W3neecgei1hOS4reWOv+esrOS4gOS4reWtpiIsIlRJVExFIjoi5Luj566h77yI6YCA54m55bu65p2R5o+Q54GM56uZ6aG555uu5oqV5qCH5L+d6K+B6YeR77yJIiwiRklOVF9UWVBFIjoiMyIsIkZEVE1fWVdSUSI6IjIwMjMtMDUtMTEiLCJfWF9ST1dfS0VZIjoicm93XzExNiJ9LHsiRFpSWE1DWiI6bnVsbCwiWkNfSkUiOjEyOTAwLCJTWl9UWVBFIjoiemMiLCJEWlJJRERXIjoiMGQ4NDE4NjlmZGQ1NTc1MGM5N2YyNTBiYmNhNDMyMjgiLCJEWlJRRFciOiIyMDIzLTEyLTA2IiwiQ0FSRE1PTlRIIjoiMDUtMTEiLCJTRllEWkRXIjoiMiIsIkRXRFpIRkRXIjoiMjAyMy0xMi0wNiDlt7Lnoa7orqTlr7notKbjgIIiLCJKWV9KRSI6MTI5MDAsIklEIjoiZGZiMjJiYzhiMDIwNDdjYmI1NTU5NmQ5OWJlMGNjMmUiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDAzIiwiU1JfSkUiOjAsIlVOSVRJRCI6IjNiYmFlYzBiOTJiNzJlMjNmZGZlNTUwYTQ5NWEwZjk4IiwiRFpSUUNaIjpudWxsLCJEWlJYTURXIjoi5Zub5bed55yB6LWE5Lit5Y6/56ys5LiA5Lit5a2mIiwiU0ZZRFpDWiI6bnVsbCwiWkgiOiI4ODEwMDEyMDAwMjAxNzk4NSIsIkRaUklEQ1oiOm51bGwsIkRXRFpIRkNaIjpudWxsLCJDQVJEWUVBUiI6MjAyMywiQUdFTkNZX05BTUUiOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuIDkuK3lraYiLCJUSVRMRSI6IuS7o+euoe+8iOmAgDIwMjLlubTmipfml7HmsLTmupDlt6XnqIvmsJHlt6Xlt6XotYTkv53or4Hph5HvvIkiLCJGSU5UX1RZUEUiOiIzIiwiRkRUTV9ZV1JRIjoiMjAyMy0wNS0xMSIsIl9YX1JPV19LRVkiOiJyb3dfMTE3In0seyJEWlJYTUNaIjpudWxsLCJaQ19KRSI6MCwiU1pfVFlQRSI6InNyIiwiRFpSSUREVyI6ImUxZTAzOTYzM2U5Mjg0NDliYjkzNDViMzJiZWZhOTFlIiwiRFpSUURXIjoiMjAyMy0xMi0wNiIsIkNBUkRNT05USCI6IjA1LTExIiwiU0ZZRFpEVyI6IjIiLCJEV0RaSEZEVyI6IjIwMjMtMTItMDYg5bey56Gu6K6k5a+56LSm44CCIiwiSllfSkUiOjIyNDAsIklEIjoiMDM5NzRiMWZhOTMzNGQ3MTk2YzRjMTRmNmQyODc5NWYiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDA0IiwiU1JfSkUiOjIyNDAsIlVOSVRJRCI6ImU5MGVmOWFlYWZkNzE3YTk2YzlmZjBhOWE2Nzc4ZmZlIiwiRFpSUUNaIjpudWxsLCJEWlJYTURXIjoi5Zub5bed55yB6LWE5Lit5Y6/56ys5LqM5Lit5a2mIiwiU0ZZRFpDWiI6bnVsbCwiWkgiOiI1MTAwMTY4NzIwODA1MDA3OTQwOSIsIkRaUklEQ1oiOm51bGwsIkRXRFpIRkNaIjpudWxsLCJDQVJEWUVBUiI6MjAyMywiQUdFTkNZX05BTUUiOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuozkuK3lraYiLCJUSVRMRSI6Iui1hOS4reWOv+awtOWNl+mVh+WHieawtOS6leadkTIwMjPlubTotKLmlL/ooZTmjqXmjqjov5vkuaHmnZHmjK/lhbTooaXliqnotYTph5Hln7rnoYDorr7mlr3pobnnm64t5pW05rK75bGx5Z2q5aGY5bel56iL6aG555uu5oqV5qCH5L+d6K+B6YeRIiwiRklOVF9UWVBFIjoiMyIsIkZEVE1fWVdSUSI6bnVsbCwiX1hfUk9XX0tFWSI6InJvd18xMTgifSx7IkRaUlhNQ1oiOm51bGwsIlpDX0pFIjowLCJTWl9UWVBFIjoic3IiLCJEWlJJRERXIjoiZTFlMDM5NjMzZTkyODQ0OWJiOTM0NWIzMmJlZmE5MWUiLCJEWlJRRFciOiIyMDIzLTEyLTA2IiwiQ0FSRE1PTlRIIjoiMDUtMTEiLCJTRllEWkRXIjoiMiIsIkRXRFpIRkRXIjoiMjAyMy0xMi0wNiDlt7Lnoa7orqTlr7notKbjgIIiLCJKWV9KRSI6MTYxMy41MiwiSUQiOiJiMWRjMDllMzc5ODA0YTFjYjUxMjVlNGU1NWE5ZTc3MiIsIlJFTUFSSyI6bnVsbCwiQUdFTkNZX0NPREUiOiIyMDYwMDQiLCJTUl9KRSI6MTYxMy41MiwiVU5JVElEIjoiZTkwZWY5YWVhZmQ3MTdhOTZjOWZmMGE5YTY3NzhmZmUiLCJEWlJRQ1oiOm51bGwsIkRaUlhNRFciOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuozkuK3lraYiLCJTRllEWkNaIjpudWxsLCJaSCI6IjUxMDAxNjg3MjA4MDUwMDc5NDA5IiwiRFpSSURDWiI6bnVsbCwiRFdEWkhGQ1oiOm51bGwsIkNBUkRZRUFSIjoyMDIzLCJBR0VOQ1lfTkFNRSI6IuWbm+W3neecgei1hOS4reWOv+esrOS6jOS4reWtpiIsIlRJVExFIjoiMjAyMzAzMTbkuqTnvZrmuIXliIYiLCJGSU5UX1RZUEUiOiIzIiwiRkRUTV9ZV1JRIjpudWxsLCJfWF9ST1dfS0VZIjoicm93XzExOSJ9LHsiRFpSWE1DWiI6bnVsbCwiWkNfSkUiOjAsIlNaX1RZUEUiOiJzciIsIkRaUklERFciOiJlMWUwMzk2MzNlOTI4NDQ5YmI5MzQ1YjMyYmVmYTkxZSIsIkRaUlFEVyI6IjIwMjMtMTItMDYiLCJDQVJETU9OVEgiOiIwNS0xMSIsIlNGWURaRFciOiIyIiwiRFdEWkhGRFciOiIyMDIzLTEyLTA2IOW3suehruiupOWvuei0puOAgiIsIkpZX0pFIjo4MDAsIklEIjoiZjBiOGFlNDIyMTliNDFiYzkyODdkNTUwNGNlM2QwMDMiLCJSRU1BUksiOm51bGwsIkFHRU5DWV9DT0RFIjoiMjA2MDA0IiwiU1JfSkUiOjgwMCwiVU5JVElEIjoiZTkwZWY5YWVhZmQ3MTdhOTZjOWZmMGE5YTY3NzhmZmUiLCJEWlJRQ1oiOm51bGwsIkRaUlhNRFciOiLlm5vlt53nnIHotYTkuK3ljr/nrKzkuozkuK3lraYiLCJTRllEWkNaIjpudWxsLCJaSCI6IjUxMDAxNjg3MjA4MDUwMDc5NDA5IiwiRFpSSURDWiI6bnVsbCwiRFdEWkhGQ1oiOm51bGwsIkNBUkRZRUFSIjoyMDIzLCJBR0VOQ1lfTkFNRSI6IuWbm+W3neecgei1hOS4reWOv+esrOS6jOS4reWtpiIsIlRJVExFIjoi6a2P5piO6Iux5pqC5omj5Yiw6LSi5pS/5LiT5YKo77yI5bu66KGM77yJIiwiRklOVF9UWVBFIjoiMyIsIkZEVE1fWVdSUSI6bnVsbCwiX1hfUk9XX0tFWSI6InJvd18xMjAifV19"
      });
      let config = {
        method: 'post',
        maxBodyLength: Infinity,
        url: '/bpic/xml/pzExport',
        headers: {'Access-Control-Allow-Origin':'*',
          'content-Type': 'application/json',
          'X-Access-Token':'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3MDE5MTQyOTEsInVzZXJuYW1lIjoicm9vdC1kZ3pqIn0.3WRU31KqeNmjSHZr81XXMJe8rK7p4b0PZrN3L_qADOg'},
        responseType: 'json',
        data: data
      };
      axios.request(config)
          .then((res) => {
            // const blob = new Blob([res.data]);
            let blob = new Blob([res.data], { type: "application/zip" });
            const url = window.URL.createObjectURL(blob);
            const elink = document.createElement("a");
            elink.download = "凭证.zip";
            elink.style.display = "none";
            elink.href = url;
            document.body.appendChild(elink);
            elink.click();
            window.URL.revokeObjectURL(elink.href); // 释放URL 对象
            document.body.removeChild(elink);

          })
          .catch((error) => {

            console.log(error);
          });
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
