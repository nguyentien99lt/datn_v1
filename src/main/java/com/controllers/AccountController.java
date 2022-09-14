package datn.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import datn.store.entity.Accounts;
import datn.store.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accSer;

	@RequestMapping("/accounts/index")
	public String index(Model model) {
		System.out.println("Tuấn vẫn ngu như thường");
		List<Accounts> acc = accSer.findAll();
		model.addAttribute("acc", acc);
		return "admin/accounts/index";
	}

	@RequestMapping(value = "/accounts/add")
	public String create(Model model) {
		model.addAttribute("accounts", new Accounts());
		return "admin/accounts/add";
	}

	@RequestMapping(value = "/accounts/edit", method = RequestMethod.GET)
	public String edit(@RequestParam("id") Integer id, Model model) {
		Optional<Accounts> accA = accSer.findById(id);
		accA.ifPresent(acc -> model.addAttribute("acc", acc));
		return "admin/accounts/edit";
	}

	@RequestMapping(value = "/accounts/save", method = RequestMethod.POST)
	public String save(Accounts acc) {
		accSer.save(acc);
		return "redirect:/accounts/index";
	}

	@RequestMapping(value = "/accounts/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id") Integer id, Model model) {
		accSer.delete(id);
		return "redirect:/accounts/index";
	}

}
