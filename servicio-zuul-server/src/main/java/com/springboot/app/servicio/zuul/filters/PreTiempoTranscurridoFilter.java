package com.springboot.app.servicio.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreTiempoTranscurridoFilter extends ZuulFilter {

	private Logger log = LoggerFactory.getLogger(PreTiempoTranscurridoFilter.class);

	@Override
	public boolean shouldFilter() { // Contiene la lógica que determina cuándo ejecutar este filtro (este filtro en
									// particular siempre se ejecuta).
		return true;
	}

	@Override
	public Object run() throws ZuulException { // Contiene la funcionalidad del filtro. si shouldFilter es true, siempre
												// se ejecuta

		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		request.setAttribute("tiempoInicio", System.currentTimeMillis());

		log.info(String.format("%s request enrutado a %s", request.getMethod(), request.getRequestURL().toString()));

		return null;
	}

	@Override
	public String filterType() { // tipo de filtros pre - post -put (son las palabras clave que hay que retornar
									// en cada caso)
		return "pre";
	}

	@Override
	public int filterOrder() { // orden del filtro
		return 1;
	}

}
