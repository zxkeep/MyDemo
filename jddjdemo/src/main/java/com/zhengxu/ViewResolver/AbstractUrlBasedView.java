/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.zhengxu.ViewResolver;
 
import java.util.Locale;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.servlet.view.AbstractView;

public abstract class AbstractUrlBasedView extends AbstractView implements
		InitializingBean {
	private String url;
 
	protected AbstractUrlBasedView() {
	}
 
	protected AbstractUrlBasedView(String url) {
		this.url = url;
	}
 
	public void setUrl(String url) {
		this.url = url;
	}
 
	public String getUrl() {
		return this.url;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if ((isUrlRequired()) && (getUrl() == null))
			throw new IllegalArgumentException("Property 'url' is required");
	}
 
	protected boolean isUrlRequired() {
		return true;
	}
 
	public boolean checkResource(Locale locale) throws Exception {
		return true;
	}

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("; URL [").append(getUrl()).append("]");
		return sb.toString();
	}
}