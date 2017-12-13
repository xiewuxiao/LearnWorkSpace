<#--定义了一个叫paging的宏，page为对象变量-->
<#macro paging page pageurl>
<#--<nav aria-label="Page navigation">-->
<#--<ul class="pagination justify-content-end">-->
<#--<li class="page-item disabled">-->
<#--<a class="page-link" href="javascript:trueToPage(this);" tabindex="-1">Previous</a>-->
<#--</li>-->
<#--<li class="page-item"><a class="page-link" href="javascript:trueToPage(this);">1</a></li>-->
<#--<li class="page-item"><a class="page-link" href="javascript:trueToPage(this);">2</a></li>-->
<#--<li class="page-item"><a class="page-link" href="javascript:trueToPage(this);">3</a></li>-->
<#--<li class="page-item">-->
<#--<a class="page-link" href="javascript:trueToPage(this);">Next</a>-->
<#--当前页数为第<input type="text" value=${page.pageNum}>页，一共有&nbsp;&nbsp;${page.totalRecord}&nbsp;页-->
<#--</li>-->
<#--</ul>-->
<#--</nav>-->

    <ul class="pagination pagination">
        <li><a href="javascript:turnToPage(1)" class="pageTD">首页</a></li>
        <li><a href="${pageurl}?pageNum=${(page.pageNum-1>0)?string((page.pageNum-1)+"","1")}">上一页</a></li>
        <#--<#assign x=0>-->
        <#--<#list page.pageNum-4 .. page.pageNum+4 as y>-->
            <#--<#if (y<=0) >-->
                <#--&lt;#&ndash;记录需要补的数量&ndash;&gt;-->
            <#--<#assign x=x+1/>-->
            <#--<#else>-->
                <#--<li>-->
                    <#--&lt;#&ndash;<a href="${pageurl}?pageNum=${y}" class="pageTD"&ndash;&gt;-->
                    <#--<a href="javascript:turnToPage(${y});" class="pageTD"-->
                    <#--<#if y==page.pageNum> style="border:0;"</#if>-->

                    <#-->${y}-->
                    <#--</a></li>-->
            <#--</#if>-->
        <#--</#list>-->
            <#--<#list 0 .. x as n>-->
                <#--<#if (n>0)>-->
                    <#--<li><a href="javascript:turnToPage(${page.pageNum+4+n});" class="pageTD"-->
                    <#-->${page.pageNum+4+n}</a></li>-->
                <#--</#if>-->
            <#--</#list>-->
        <li><a href="javascript:turnToPage(${(page.pageNum)})" class="pageTD">${(page.pageNum)}</a></li>
        <li><a href="javascript:turnToPage(${(page.pageNum+1<page.totalPage)?string((page.pageNum+1)+"",page.totalPage+"")})" class="pageTD">下一页</a></li>
        <li><a href="javascript:turnToPage(${page.totalPage?c})" class="pageTD">尾页</a></li>
        <li>共有${page.totalPage}页</li>
    </ul><br>
<style>
.pageTD{
    margin-left: 12px !important;
}
</style>
<script type="application/javascript">
    function turnToPage(pageNum){
        $("#pageNum").val(pageNum)
        document.theForm.submit();
    }
</script>

</#macro>