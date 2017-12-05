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
        <li><span>${page.pageNum}</span></li>
        <li><a href="${pageurl}?pageNum=${page.pageNum-1}">上一页</a></li>
        <#assign x=0>
        <#list page.pageNum-5 .. page.pageNum+5 as y>
            <#if (y<=0) >
                <#--记录需要补的数量-->
            <#assign x=x+1/>
            <#else>
                <li><a href="${pageurl}?pageNum=${y}">${y}</a></li>
            </#if>
        </#list>
        <p>需要补的数量为${x}</p>

        <#if (x>0)>
            <#--起始要+1，终止的要减1-->
            <#list page.pageNum+5+1 .. page.pageNum+5-1+x as n>
                <li><a href="${pageurl}?pageNum=${n}">${n}</a></li>
            </#list>
        </#if>

        <li><a href="${pageurl}?pageNum=${page.pageNum+1}">下一页</a></li>
    </ul><br>


</#macro>