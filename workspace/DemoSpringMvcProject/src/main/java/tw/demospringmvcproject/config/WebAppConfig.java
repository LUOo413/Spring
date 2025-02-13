package tw.demospringmvcproject.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
//@ComponentScan(basePackages = { "tw.demospringmvcproject" })
public class WebAppConfig implements WebMvcConfigurer {

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		ms.setBasename("i18n.message");
		return ms;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("locale");
		registry.addInterceptor(lci).addPathPatterns("/**");

	}

	@Bean
	public SessionLocaleResolver localeResolver() {
		return new SessionLocaleResolver();
	}

	@Override
	// 輸入網址可以找到圖片
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/resources/images/");
		registry.addResourceHandler("/mycss/**").addResourceLocations("/WEB-INF/resources/mycss/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "membersmain.controller"); // 当用户访问 / 路径时，Spring 会进行重定向，将其转到
																			// membersmain.controller，也就是控制器的 URL。通常这个
																			// URL 对应一个控制器方法。
		registry.addViewController("/playforfun.do").setViewName("showResources");// 当用户访问 /playforfun.do 时，Spring 会返回
																					// showResources 视图，通常是一个 JSP 页面。

	}

	@Bean
	public StandardServletMultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}

	@Bean
	public MappingJackson2JsonView jsonView() {
		MappingJackson2JsonView jv = new MappingJackson2JsonView();
		jv.setPrettyPrint(true);
		return jv;
	}

	@Bean
	public ContentNegotiatingViewResolver cnViewResolver() {
		ContentNegotiatingViewResolver cnvr = new ContentNegotiatingViewResolver();

		ArrayList<View> lists = new ArrayList<View>();
		lists.add(jsonView());
		cnvr.setDefaultViews(lists);

		return cnvr;
	}

//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//	}

//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//    	InternalResourceViewResolver irvr1 = new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
//    	irvr1.setOrder(6);
//    	return irvr1;
//    }

}
