<#-- 参数说明：pageNo当前的页码，totalPage总页数， showPages显示的页码个数，callFunName回调方法名（需在js中自己定义）-->
<#macro paging page>
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-end">
        <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
            当前页数为第<input type="text" value=${page.pageNum}>页，一共有&nbsp;&nbsp;${page.totalRecord}&nbsp;页
        </li>
    </ul>
</nav>

</#macro>