package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 14:45 2017/6/20.
 * @Descrip
 */
@WebFilter(filterName = "LoginFilter", urlPatterns = {"/*"}, initParams = {
        @WebInitParam(name = "charset", value = "UTF-8", description = "characterEncoding")
})
public class LoginFilter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        String charset = filterConfig.getInitParameter("charset");
        if (charset == null) {
            charset = "UTF-8";
        }

        httpServletRequest.setCharacterEncoding(charset);
        filterChain.doFilter(servletRequest, servletResponse);
        httpServletResponse.setCharacterEncoding(charset);
    }

    @Override
    public void destroy() {

    }
}
