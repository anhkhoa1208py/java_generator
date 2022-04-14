/*
 * Created on 2022-04-14 ( Time 09:45:05 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package com.vpbank.innovation.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//--- Common classes
import com.vpbank.innovation.web.common.AbstractController;
import com.vpbank.innovation.web.common.FormMode;
import com.vpbank.innovation.web.common.Message;
import com.vpbank.innovation.web.common.MessageType;

//--- Entities
import com.vpbank.innovation.bean.FvUser;

//--- Services 
import com.vpbank.innovation.business.service.FvUserService;


/**
 * Spring MVC controller for 'FvUser' management.
 */
@Controller
@RequestMapping("/fvUser")
public class FvUserController extends AbstractController {

	//--- Variables names ( to be used in JSP with Expression Language )
	private static final String MAIN_ENTITY_NAME = "fvUser";
	private static final String MAIN_LIST_NAME   = "list";

	//--- JSP pages names ( View name in the MVC model )
	private static final String JSP_FORM   = "fvUser/form";
	private static final String JSP_LIST   = "fvUser/list";
	private static final String JSP_DETAIL   = "fvUser/detail";

	//--- SAVE ACTION ( in the HTML form )
	private static final String SAVE_ACTION_CREATE   = "/fvUser/create";
	private static final String SAVE_ACTION_UPDATE   = "/fvUser/update";

	//--- Main entity service
	@Resource
    private FvUserService fvUserService; // Injected by Spring
	//--- Other service(s)

	//--------------------------------------------------------------------------------------
	/**
	 * Default constructor
	 */
	public FvUserController() {
		super(FvUserController.class, MAIN_ENTITY_NAME );
		log("FvUserController created.");
	}

	//--------------------------------------------------------------------------------------
	// Spring MVC model management
	//--------------------------------------------------------------------------------------

	/**
	 * Populates the Spring MVC model with the given entity and eventually other useful data
	 * @param model
	 * @param fvUser
	 */
	private void populateModel(Model model, FvUser fvUser, FormMode formMode) {
		//--- Main entity
		model.addAttribute(MAIN_ENTITY_NAME, fvUser);
		if ( formMode == FormMode.CREATE ) {
			model.addAttribute(MODE, MODE_CREATE); // The form is in "create" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_CREATE); 			
			//--- Other data useful in this screen in "create" mode (all fields)
		}
		else if ( formMode == FormMode.UPDATE ) {
			model.addAttribute(MODE, MODE_UPDATE); // The form is in "update" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_UPDATE); 			
			//--- Other data useful in this screen in "update" mode (only non-pk fields)
		}
	}

	//--------------------------------------------------------------------------------------
	// Request mapping
	//--------------------------------------------------------------------------------------
	/**
	 * Shows a list with all the occurrences of FvUser found in the database
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping()
	public String list(Model model) {
		log("Action 'list'");
		List<FvUser> list = fvUserService.findAll();
		model.addAttribute(MAIN_LIST_NAME, list);		
		return JSP_LIST;
	}

	//--------------------------------------------------------------------------------------
	// Request mapping
	//--------------------------------------------------------------------------------------
	/**
	 * Shows a detail item of selected FvUser found in the database
	 * @param model Spring MVC model
	 * @param id  primary key element
	 * @return
	 */
	@RequestMapping("/detail/{id}")
	public String detail(Model model, @PathVariable("id") BigDecimal id) {
		log("Action 'detail'");
		FvUser fvUser = fvUserService.findById(id);
		//populateProcessDefInfoToModel(model, {id}.toString());
		model.addAttribute(MAIN_ENTITY_NAME, fvUser);		
		return JSP_DETAIL;
	}

	/**
	 * Shows a form page in order to create a new FvUser
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping("/form")
	public String formForCreate(Model model) {
		log("Action 'formForCreate'");
		//--- Populates the model with a new instance
		FvUser fvUser = new FvUser();	
		populateModel( model, fvUser, FormMode.CREATE);
		return JSP_FORM;
	}

	/**
	 * Shows a form page in order to update an existing FvUser
	 * @param model Spring MVC model
	 * @param id  primary key element
	 * @return
	 */
	@RequestMapping(value = "/form/{id}")
	public String formForUpdate(Model model, @PathVariable("id") BigDecimal id ) {
		log("Action 'formForUpdate'");
		//--- Search the entity by its primary key and stores it in the model 
		FvUser fvUser = fvUserService.findById(id);
		populateModel( model, fvUser, FormMode.UPDATE);		
		return JSP_FORM;
	}

	/**
	 * Shows a form page in order to submit item into workflow with an existing FvUser
	 * @param model Spring MVC model
	 * @param id  primary key element
	 * @return
	 */
	@RequestMapping(value = "/submit/{id}")
	public String submit(Model model, @PathVariable("id") BigDecimal id ) {
		log("Action 'submit'");
		//--- Search the entity by its primary key and stores it in the model 
		/*
		FvUser fvUser = fvUserService.findById(id);
		if (fvUser != null && fvUser.getAppIdC() != null)
			fvUserService.submitToWorkflow(fvUser);
        */
		return redirectToList();
	}

	/**
	 * 'CREATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param fvUser  entity to be created
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/create" ) // GET or POST
	public String create(@Valid FvUser fvUser, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'create'");
		try {
			if (!bindingResult.hasErrors()) {
				FvUser fvUserCreated = fvUserService.create(fvUser); 
				model.addAttribute(MAIN_ENTITY_NAME, fvUserCreated);

				//---
				messageHelper.addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"save.ok"));
				return redirectToList();
			} else {
				populateModel( model, fvUser, FormMode.CREATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			log("Action 'create' : Exception - " + e.getMessage() );
			messageHelper.addException(model, "fvUser.error.create", e);
			populateModel( model, fvUser, FormMode.CREATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'UPDATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param fvUser  entity to be updated
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/update" ) // GET or POST
	public String update(@Valid FvUser fvUser, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'update'");
		try {
			if (!bindingResult.hasErrors()) {
				//--- Perform database operations
				FvUser fvUserSaved = fvUserService.update(fvUser);
				model.addAttribute(MAIN_ENTITY_NAME, fvUserSaved);
				//--- Set the result message
				messageHelper.addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"save.ok"));
				log("Action 'update' : update done - redirect");
				return redirectToList();
			} else {
				log("Action 'update' : binding errors");
				populateModel( model, fvUser, FormMode.UPDATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			messageHelper.addException(model, "fvUser.error.update", e);
			log("Action 'update' : Exception - " + e.getMessage() );
			populateModel( model, fvUser, FormMode.UPDATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'DELETE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param redirectAttributes
	 * @param id  primary key element
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}") // GET or POST
	public String delete(RedirectAttributes redirectAttributes, @PathVariable("id") BigDecimal id) {
		log("Action 'delete'" );
		try {
			fvUserService.delete( id );
			//--- Set the result message
			messageHelper.addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"delete.ok"));	
		} catch(Exception e) {
			messageHelper.addException(redirectAttributes, "fvUser.error.delete", e);
		}
		return redirectToList();
	}

}