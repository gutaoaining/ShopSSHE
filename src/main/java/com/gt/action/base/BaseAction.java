package com.gt.action.base;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.gt.model.FileImage;
import com.gt.services.base.AccountServiceI;
import com.gt.services.base.BusOrderServiceI;
import com.gt.services.base.CategoryServiceI;
import com.gt.services.base.ProductServiceI;
import com.gt.services.base.SorderServiceI;
import com.gt.util.UploadFile;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("basePackage")
@Namespace("/")
public class BaseAction<T> extends ActionSupport implements RequestAware,SessionAware,ApplicationAware,ModelDriven<T> {
    protected T model;
	protected Map<String, Object> request;
    protected Map<String, Object> session;
    protected Map<String, Object> application;
    
    protected Integer page;
    protected Integer rows;
    protected FileImage fileImage;
    /**
     * 通过前台提交的ids字符串，用字符串的形式接收处理
     * */
    protected String ids;
    protected InputStream inputStream;
    
    
    

	public FileImage getFileImage() {
		return fileImage;
	}

	public void setFileImage(FileImage fileImage) {
		this.fileImage = fileImage;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

   /**
    * 通过前台提交的数据（$.param序列化）直接用ArrayList接受
    */
	protected ArrayList<Integer> idArray;
     


	public ArrayList<Integer> getIdArray() {
		return idArray;
	}

	public void setIdArray(ArrayList<Integer> idArray) {
		this.idArray = idArray;
	}


	protected Map<String, Object> map = null;
    
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}


	@Autowired
    protected AccountServiceI accountService;
	@Autowired
    protected CategoryServiceI categoryService;
	@Autowired
	protected ProductServiceI productService;
    @Autowired
    protected UploadFile uploadFile;
    @Autowired
    protected SorderServiceI sorderService;
    @Autowired
    protected BusOrderServiceI busOrderService;
    
	public void WriteJson(Object obj){
 
      try {
    	ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(obj);
        ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
        System.out.println(json);
		ServletActionContext.getResponse().getWriter().write(json);
		ServletActionContext.getResponse().getWriter().flush();
		ServletActionContext.getResponse().getWriter().close();
	} catch (IOException e) {
		e.printStackTrace();
	}
    }

	@Override
	public T getModel() {
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		Class clazz = (Class)type.getActualTypeArguments()[0];
		try {
			model = (T) clazz.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request  = request;
	} 
}
