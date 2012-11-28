package br.com.soneca.iptj.web;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.soneca.iptj.entity.Item;



/**
 * This class responding all xhr requests
 * @author soneca
 *
 */
@Controller
public class AjaxController {
	
	@RequestMapping("/xhr/top")
	public @ResponseBody String top(HttpServletRequest request, HttpServletResponse response){
		this.setXhr(request, response);
		Item item = new Item(10L, "teste", "descricao", Calendar.getInstance().getTime(), null, null);
		return item.toString();
	} 
	
	
	/**
	 * This method set response headers to json and set encoding to UTF-8
	 * @param request
	 * @param response
	 */
	protected void setXhr(HttpServletRequest request, HttpServletResponse response){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
	}
	
}
