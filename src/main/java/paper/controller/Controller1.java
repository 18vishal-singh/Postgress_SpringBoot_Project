package paper.controller;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import paper.dao.AccountRepository;
import paper.dao.AddressRepository;
import paper.dao.AdvertisementRepository;
import paper.dao.OwnerRepository;
import paper.dao.PublisherRepository;
import paper.dao.RegionRepository;
import paper.dao.UserRepository;
import paper.dao.VODRepository;
import paper.model.Account;
import paper.model.Address;
import paper.model.Advertisement;
import paper.model.Owner;
import paper.model.Publisher;
import paper.model.Region;
import paper.model.User;
import paper.model.VOD;

@Controller
public class Controller1 {
	Random r = new Random();

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	private RegionRepository regionRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VODRepository vodRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	@Autowired
	private AdvertisementRepository advertisementRepository;

	RedirectView rv = new RedirectView();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showIndexPage(HttpServletRequest request) {
		return "jsp/vlogin.jsp";
	}

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String checkLogin(HttpServletRequest request, @RequestParam("user_name") String name,
			@RequestParam("user_password") String password) {
		if (name.equals("DBA") && password.equals("DBA"))
			return "jsp/selectTables.jsp";
		Iterator<Account> itr = accountRepository.findAll().iterator();
		while (itr.hasNext()) {
			Account a = itr.next();
			if (a.getLogin_name().equals(name) && a.getLogin_pass().equals(password)) {
				String aId = a.getAcc_id();
				Iterator<Publisher> pitr = publisherRepository.findAll().iterator();
				while (pitr.hasNext()) {
					Publisher p = pitr.next();
					if (p.getAcc_id().equals(aId))
						return "jsp/publisherLoggedInPage.jsp";
				}
				Iterator<Owner> oitr = ownerRepository.findAll().iterator();
				while (oitr.hasNext()) {
					Owner o = oitr.next();
					if (o.getAcc_id().equals(aId))
						return "jsp/ownerLoggedInPage.jsp";
				}
				return "jsp/searchVOD.jsp";
			}
		}
		return "jsp/vlogin.jsp";
	}

	@RequestMapping(value = "/noAccount", method = RequestMethod.GET)
	public String noAccount(HttpServletRequest request) {
		return "jsp/wru.jsp";
	}

	@ModelAttribute("listUsers")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	@ModelAttribute("listOwners")
	public List<Owner> getOwner() {
		return (List<Owner>) ownerRepository.findAll();
	}

	@ModelAttribute("listRegions")
	public List<Region> getRegions() {
		return (List<Region>) regionRepository.findAll();
	}

	@ModelAttribute("listAddresses")
	public List<Address> getAddress() {
		return (List<Address>) addressRepository.findAll();
	}

	@ModelAttribute("listAccounts")
	public List<Account> getAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	@ModelAttribute("listVOD")
	public List<VOD> getVOD() {
		return (List<VOD>) vodRepository.findAll();
	}

	@ModelAttribute("listPublisher")
	public List<Publisher> getPublisher() {
		return (List<Publisher>) publisherRepository.findAll();
	}

	@ModelAttribute("listAdvertisements")
	public List<Advertisement> getAdvertisement() {
		return (List<Advertisement>) advertisementRepository.findAll();
	}

//	@ModelAttribute("listSelectedVOD")
//	public List<VOD> getSelectedVOD() {
//		return (List<VOD>) vodRepository.findByName(name);
//	}

	@RequestMapping(value = "/userSearchRedirect", method = RequestMethod.POST)
	public String searchResult(HttpServletRequest request, @RequestParam("inputText") String inputText) {
		System.out.println("Input text is :" + inputText);
		return "jsp/resultVOD.jsp";
	}

	@RequestMapping(value = "/redirectPublisher", method = RequestMethod.POST)
	public String redirectPublisher(HttpServletRequest request, @RequestParam("user") String inputText) {
		System.out.println("Input text is :" + inputText);
		if (inputText.equals("show"))
			return "jsp/tableDetails/advertismentDetails.jsp";
		if (inputText.equals("insert"))
			return "jsp/addInsert.jsp";
		else
			return "jsp/publisherLoggedInPage";
	}

	@RequestMapping(value = "/redirectOwner", method = RequestMethod.POST)
	public String redirectOwner(HttpServletRequest request, @RequestParam("user") String inputText) {
		System.out.println("Input text is :" + inputText);
		if (inputText.equals("show"))
			return "jsp/tableDetails/vodDetails.jsp";
		if (inputText.equals("insert"))
			return "jsp/vodInsert.jsp";
		else
			return "jsp/ownerLoggedInPage.jsp";
	}

	@RequestMapping(value = "/redirectOUP", method = RequestMethod.POST)
	public String redirectUserOrOwner(HttpServletRequest request, @RequestParam("user") String name) {

		System.out.println("inside redirect :" + name);
		if (name.equals("user")) {
			return "jsp/userRegistration.jsp";
		}
		if (name.equals("owner")) {
			return "jsp/ownerRegistration.jsp";
		}
		if (name.equals("publisher")) {
			return "jsp/publisherRegistration.jsp";
		} else {
			return "jsp/login.jsp";
		}

	}

	@RequestMapping(value = "/DBAredirect", method = RequestMethod.POST)
	public String showRespectiveTable(HttpServletRequest request, @RequestParam("selTable") String tableSelected) {

		System.out.println("inside redirect :" + tableSelected);
		if (tableSelected.equals("user")) {
			return "jsp/tableDetails/userDetails.jsp";
		}
		if (tableSelected.equals("owner")) {
			return "jsp/tableDetails/ownerDetails.jsp";
		}
		if (tableSelected.equals("region")) {
			return "jsp/tableDetails/regionDetails.jsp";
		}
		if (tableSelected.equals("account")) {
			return "jsp/tableDetails/accountDetails.jsp";
		}
		if (tableSelected.equals("address")) {
			return "jsp/tableDetails/addressDetails.jsp";
		}
		if (tableSelected.equals("vod")) {
			return "jsp/tableDetails/vodDetails.jsp";
		}
		if (tableSelected.equals("publisher")) {
			return "jsp/tableDetails/publisherDetails.jsp";
		} else {
			return "jsp/tableDetails/login.jsp";
		}

	}

	@RequestMapping(value = "/uRegister", method = RequestMethod.POST)
	public String userRegister(HttpServletRequest request, @RequestParam("uName") String uName,
			@RequestParam("uAge") Date uAge, @RequestParam("uEmail") String uEmail, @RequestParam("city") String city,
			@RequestParam("state") String state, @RequestParam("country") String country,
			@RequestParam("loginName") String loginName, @RequestParam("loginPass") String loginPass) {

		java.util.Date d = new java.util.Date();
		Date dd = new Date(d.getTime());
		String tempUid = "v" + r.nextInt();
		String tempRid = "r" + r.nextInt();
		String tempAid = "a" + r.nextInt();

		Region r = new Region(tempRid, city, state, country);
		regionRepository.save(r);

		Account a = new Account(tempAid, dd, loginName, loginPass);
		accountRepository.save(a);

		User u = new User(tempUid, uName, uEmail, uAge, tempRid, tempAid);
		userRepository.save(u);

		System.out.println("Inserting user------------------------");

		return "jsp/vlogin.jsp";
	}

	@RequestMapping(value = "/oRegister", method = RequestMethod.POST)
	public String ownerRegister(HttpServletRequest request, @RequestParam("oName") String oName,
			@RequestParam("houseNo") String houseNo, @RequestParam("oEmail") String oEmail,
			@RequestParam("city") String city, @RequestParam("state") String state,
			@RequestParam("country") String country, @RequestParam("loginName") String loginName,
			@RequestParam("loginPass") String loginPass, @RequestParam("pincode") String pincode) {

		java.util.Date d = new java.util.Date();
		Date dd = new Date(d.getTime());

		String tempOid = "o" + r.nextInt();
		String tempRid = "r" + r.nextInt();
		String tempAid = "a" + r.nextInt();
		String tempADid = "ad" + r.nextInt();

		Account a = new Account(tempAid, dd, loginName, loginPass);
		accountRepository.save(a);
		Region r = new Region(tempRid, city, state, country);
		regionRepository.save(r);

		Address ad = new Address(tempADid, tempRid, houseNo, Integer.parseInt(pincode));
		addressRepository.save(ad);

		Owner o = new Owner(tempOid, oName, tempADid, oEmail, tempAid);
		ownerRepository.save(o);

		System.out.println("Inserting owner------------------------");
		return "jsp/vlogin.jsp";
	}

	@RequestMapping(value = "/pRegister", method = RequestMethod.POST)
	public String publisherRegister(HttpServletRequest request, @RequestParam("oName") String oName,
			@RequestParam("houseNo") String houseNo, @RequestParam("oEmail") String oEmail,
			@RequestParam("city") String city, @RequestParam("state") String state,
			@RequestParam("country") String country, @RequestParam("loginName") String loginName,
			@RequestParam("loginPass") String loginPass, @RequestParam("pincode") String pincode) {

		java.util.Date d = new java.util.Date();
		Date dd = new Date(d.getTime());

		String tempOid = "o" + r.nextInt();
		String tempRid = "r" + r.nextInt();
		String tempAid = "a" + r.nextInt();
		String tempADid = "ad" + r.nextInt();

		Account a = new Account(tempAid, dd, loginName, loginPass);
		accountRepository.save(a);
		Region r = new Region(tempRid, city, state, country);
		regionRepository.save(r);

		Address ad = new Address(tempADid, tempRid, houseNo, Integer.parseInt(pincode));
		addressRepository.save(ad);

		Publisher p = new Publisher(tempOid, oName, tempADid, oEmail, tempAid);
		publisherRepository.save(p);

		System.out.println("Inserting publisher------------------------");
		return "jsp/vlogin.jsp";
	}

	@RequestMapping(value = "/vodInsert", method = RequestMethod.POST)
	public String vodInsert(HttpServletRequest request, @RequestParam("vidLength") String vidLength,
			@RequestParam("title") String title, @RequestParam("rating") String rating,
			@RequestParam("description") String description, @RequestParam("vidType") String vidType,
			@RequestParam("vidKey") String vidKey) {

		java.util.Date d = new java.util.Date();
		Date dd = new Date(d.getTime());

		String tempVid = "v" + r.nextInt();
		String tempOid = "o" + r.nextInt();

		VOD vid = new VOD(tempVid, Integer.parseInt(vidLength), title, rating, description, dd, tempOid, vidType,
				vidKey);
		vodRepository.save(vid);

		System.out.println("Inserting Video(VOD)------------------------");
		return "jsp/ownerLoggedInPage.jsp";
	}

	@RequestMapping(value = "/adInsert", method = RequestMethod.POST)
	public String adInsert(HttpServletRequest request, @RequestParam("adLength") String adLength,
			@RequestParam("adType") String adType) {

		java.util.Date d = new java.util.Date();
		Date dd = new Date(d.getTime());

		String tempAdid = "ad" + r.nextInt();
		String tempApid = "ap" + r.nextInt();
		String tempRid = "r" + r.nextInt();

		Advertisement ad = new Advertisement(tempAdid,tempApid,adType,tempRid,Integer.parseInt(adLength));
		advertisementRepository.save(ad);

		System.out.println("Inserting Advertisement------------------------");
		return "jsp/publisherLoggedInPage.jsp";
	}
}