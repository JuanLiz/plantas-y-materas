package com.store.Store;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.store.Dto.ClientVO;
import com.store.Dto.CredentialsVO;
import com.store.Dto.IdVO;
import com.store.Dto.ProductVO;
import com.store.Dto.ProviderVO;
import com.store.Dto.ReqStatus;
import com.store.Dto.SaleVO;
import com.store.Dto.Sale_detailVO;
import com.store.Dto.SalesClientVO;
import com.store.Dto.UserVO;
import com.store.Dao.AnalyticsDao;
import com.store.Dao.ClientDao;
import com.store.Dao.ProductDao;
import com.store.Dao.ProviderDao;
import com.store.Dao.SaleDao;
import com.store.Dao.Sale_detailDao;
import com.store.Dao.UserDao;

@Controller
public class ReqController {
		
	//API operations
		
	//Users operations

		//Create user
		@RequestMapping("/create-user")
		public void createuser(UserVO user){
			UserDao dao=new UserDao();
			dao.create(user);
		}
		
		//Read all users
		@RequestMapping("/readall-user")
		public ArrayList<UserVO> readallusers(){
			ArrayList<UserVO> list=new ArrayList<UserVO>();
			UserDao dao=new UserDao();
			list=dao.readall();
			return list;
		}
		
		//Read user
		@RequestMapping("/read-user")
		public ArrayList<UserVO> readuser(Long idusers){
			ArrayList<UserVO> list=new ArrayList<UserVO>();
			UserDao dao=new UserDao();
			list=dao.read(idusers);
			return list;
		}
		
		//Update user
		@RequestMapping("/update-user")
		public void updateuser(UserVO user) {
			UserDao dao=new UserDao();
			dao.update(user);
		}
		
		//Delete user
		@RequestMapping("/delete-user")
		public void deleteuser(Long idusers) {
			UserDao dao=new UserDao();
			dao.delete(idusers);
		}
	
	//End users operations
		
	//Clients operations
		
		//Create client
		@RequestMapping("/create-client")
		public void createclient(ClientVO client){
			ClientDao dao=new ClientDao();
			dao.create(client);
		}
		
		//Read all clients
		@RequestMapping("/readall-client")
		public ArrayList<ClientVO> readallclient(){
			ArrayList<ClientVO> list=new ArrayList<ClientVO>();
			ClientDao dao=new ClientDao();
			list=dao.readall();
			return list;
		}
		
		//Read client
		@RequestMapping("/read-client")
		public ArrayList<ClientVO> readclient(Long idclients){
			ArrayList<ClientVO> list=new ArrayList<ClientVO>();
			ClientDao dao=new ClientDao();
			list=dao.read(idclients);
			return list;
		}
		
		//Update client
		@RequestMapping("/update-client")
		public void updateclient(ClientVO client) {
			ClientDao dao=new ClientDao();
			dao.update(client);
		}
		
		//Delete client
		@RequestMapping("/delete-client")
		public void deleteclient(Long idclients) {
			ClientDao dao=new ClientDao();
			dao.delete(idclients);
		}
		
	//End clients operations
		
	//Providers operations
		
		//Create provider
		@RequestMapping("/create-provider")
		public void createprovider(ProviderVO provider){
			ProviderDao dao=new ProviderDao();
			dao.create(provider);
		}
		
		//Read all providers
		@RequestMapping("/readall-provider")
		public ArrayList<ProviderVO> readallproviders(){
			ArrayList<ProviderVO> list=new ArrayList<ProviderVO>();
			ProviderDao dao=new ProviderDao();
			list=dao.readall();
			return list;
		}
		
		//Read provider
		@RequestMapping("/read-provider")
		public ArrayList<ProviderVO> readprovider(Long idproviders){
			ArrayList<ProviderVO> list=new ArrayList<ProviderVO>();
			ProviderDao dao=new ProviderDao();
			list=dao.read(idproviders);
			return list;
		}
		
		//Update provider
		@RequestMapping("/update-provider")
		public void updateprovider(ProviderVO provider) {
			ProviderDao dao=new ProviderDao();
			dao.update(provider);
		}
		
		//Delete provider
		@RequestMapping("/delete-provider")
		public void deleteprovider(Long idproviders) {
			ProviderDao dao=new ProviderDao();
			dao.delete(idproviders);
		}
	
	//End providers operations		
		
	//Products operations
		
		//Create product
		@RequestMapping("/create-product")
		public void createproduct(ProductVO product){
			ProductDao dao=new ProductDao();
			dao.create(product);
		}
		
		//Read all products
		@RequestMapping("/readall-product")
		public ArrayList<ProductVO> readallproducts(){
			ArrayList<ProductVO> list=new ArrayList<ProductVO>();
			ProductDao dao=new ProductDao();
			list=dao.readall();
			return list;
		}
		
		//Read product
		@RequestMapping("/read-product")
		public ArrayList<ProductVO> readproduct(Long idproducts){
			ArrayList<ProductVO> list=new ArrayList<ProductVO>();
			ProductDao dao=new ProductDao();
			list=dao.read(idproducts);
			return list;
		}
		
		//Update product
		@RequestMapping("/update-product")
		public void updateproduct(ProductVO product) {
			ProductDao dao=new ProductDao();
			dao.update(product);
		}
		
		//Delete product
		@RequestMapping("/delete-product")
		public void deleteproduct(Long idproducts) {
			ProductDao dao=new ProductDao();
			dao.delete(idproducts);
		}
	
	//End products operations		
		
	//Sales operations
		
		//Create sale
		@RequestMapping("/create-sale")
		public void createsale(SaleVO sale){
			SaleDao dao=new SaleDao();
			dao.create(sale);
		}
		
		//Read all sales
		@RequestMapping("/readall-sale")
		public ArrayList<SaleVO> readallsales(){
			ArrayList<SaleVO> list=new ArrayList<SaleVO>();
			SaleDao dao=new SaleDao();
			list=dao.readall();
			return list;
		}
		
		//Read sale
		@RequestMapping("/read-sale")
		public ArrayList<SaleVO> readsale(Long idsales){
			ArrayList<SaleVO> list=new ArrayList<SaleVO>();
			SaleDao dao=new SaleDao();
			list=dao.read(idsales);
			return list;
		}
		
		//Update sale
		@RequestMapping("/update-sale")
		public void updatesale(SaleVO sale) {
			SaleDao dao=new SaleDao();
			dao.update(sale);
		}
		
		//Delete sale
		@RequestMapping("/delete-sale")
		public void deletesale(Long idsales) {
			SaleDao dao=new SaleDao();
			dao.delete(idsales);
		}
	
	//End sales operations		
		
	//Sale details operations
		
		//Create sale details
		@RequestMapping("/create-sale_detail")
		public void createsale_detail(Sale_detailVO sale_detail){
			Sale_detailDao dao=new Sale_detailDao();
			dao.create(sale_detail);
		}
		
		//Read all sale details
		@RequestMapping("/readall-sale_detail")
		public ArrayList<Sale_detailVO> readallsale_details(){
			ArrayList<Sale_detailVO> list=new ArrayList<Sale_detailVO>();
			Sale_detailDao dao=new Sale_detailDao();
			list=dao.readall();
			return list;
		}
		
		//Read sale details
		@RequestMapping("/read-sale_detail")
		public ArrayList<Sale_detailVO> readsale_detail(Long idsale_details){
			ArrayList<Sale_detailVO> list=new ArrayList<Sale_detailVO>();
			Sale_detailDao dao=new Sale_detailDao();
			list=dao.read(idsale_details);
			return list;
		}
		
		//Update sale details
		@RequestMapping("/update-sale_detail")
		public void updatesale_detail(Sale_detailVO sale_detail) {
			Sale_detailDao dao=new Sale_detailDao();
			dao.update(sale_detail);
		}
		
		//Delete sale details
		@RequestMapping("/delete-sale_detail")
		public void deletesale_detail(Long idsale_details) {
			Sale_detailDao dao=new Sale_detailDao();
			dao.delete(idsale_details);
		}
	
	//End sale details operations	
		
	//API operations end
		
	//View operations
		ReqStatus req=new ReqStatus();

		//Login
		
		//Get login
		@GetMapping("/login")
		public String login(Model model) {
			model.addAttribute("credentials", new CredentialsVO());
			if (req.isLoginf()) {
				model.addAttribute("error",true);
			}
			req.setLoginf(false); //Reset fail status for reloading/other user sessions
			return "/index";
		}

		//Post login
		@PostMapping("/login")
		public String login(@ModelAttribute("credentials") CredentialsVO cred) {
			UserDao dao=new UserDao();
			boolean exists=dao.verify(cred);
			if (exists) {
				req.setLoginf(false);
				return "redirect:/admin-home";
			} else {
				req.setLoginf(true);
				return "redirect:/login";
			}
		}
		
		//End Login
		
		//Home page
		
		//Get home page
		@GetMapping("/admin-home")
		public String adminhome(Model model) {
			AnalyticsDao dao=new AnalyticsDao();
			//Count users
			int count_users=dao.count_users();
			model.addAttribute("count_users", count_users);
			//Count providers
			int count_providers=dao.count_providers();
			model.addAttribute("count_providers", count_providers);
			//Count products
			int count_products=dao.count_products();
			model.addAttribute("count_products", count_products);
			//List last 5 products added
			ArrayList <ProductVO> list=new ArrayList<>();
			list=dao.lastproducts();
			model.addAttribute("list", list);
			//Read dates from last 7 days
			ArrayList <String> dates=new ArrayList<>();
			dates=dao.sevendays();
			model.addAttribute("dates", dates);
			//Count last 7 days sales for chart
			ArrayList <Integer> sales=new ArrayList<>();
			sales=dao.lastsales();
			model.addAttribute("sales", sales);

			
			return "/admin-home";
		}
		
		//End Home page

		//Users page
		
		//Get users page 
		@GetMapping("/admin-users")
		public String adminusers(Model model) {
			model.addAttribute("create_user", new UserVO());
			model.addAttribute("update_user", new UserVO());
			model.addAttribute("delete_user", new UserVO());
			//Notifications for operations. usertype for operation type, and success or error trigger
			model.addAttribute("usertype", req.getUsertype());
			if (req.getUserf().equals("1")) {
				//Success notification
				model.addAttribute("successu",true);
			}
			if (req.getUserf().equals("2")) {
				//Error notification
				model.addAttribute("erroru", true);
			}
			req.setUserf("0"); //Reset operation status for other sessions
			//List all users
			ArrayList <UserVO> list=new ArrayList<>();
			UserDao dao=new UserDao();
			list=dao.readall();
			model.addAttribute("list", list);
			return "/admin-users";
		}
		
		//Create users
		@PostMapping("/create-users")
		public String create_user(@ModelAttribute("create_user") UserVO user) {
			UserDao dao=new UserDao();
			req.setUsertype("La creación del usuario");
			String query=dao.create(user);
			if (query.equals("1")) {
				req.setUserf("1");
			} else {
				req.setUserf("2");
			}
			return "redirect:/admin-users";
		}
		
		//Update users
		@PostMapping("/update-users")
		public String update_user(@ModelAttribute("update_user") UserVO user) {
				UserDao dao=new UserDao();
				req.setUsertype("La actualización del usuario");
				String query=dao.update(user);
				if (query.equals("1")) {
					req.setUserf("1");
				} else {
					req.setUserf("2");
				}
				return "redirect:/admin-users";
		
		}
		
		//Delete users
		@PostMapping("/delete-users")
		public String delete_user(@ModelAttribute("delete_user") IdVO idusers) {
				UserDao dao=new UserDao();
				req.setUsertype("El borrado del usuario");
				String query=dao.delete(idusers.getId());
				if (query.equals("1")) {
					req.setUserf("1");
				} else {
					req.setUserf("2");
				}
				return "redirect:/admin-users";
		
		}
		
		//End users page
		
		//Clients page
		
		//Get clients page 
		@GetMapping("/admin-clients")
		public String adminclients(Model model) {
			model.addAttribute("create_client", new ClientVO());
			model.addAttribute("update_client", new ClientVO());
			model.addAttribute("delete_client", new ClientVO());
			//Notifications for operations. clienttype for operation type, and success or error trigger
			model.addAttribute("clienttype", req.getClienttype());
			if (req.getClientf().equals("1")) {
				//Success notification
				model.addAttribute("successc",true);
			}
			if (req.getClientf().equals("2")) {
				//Error notification
				model.addAttribute("errorc", true);
			}
			req.setClientf("0"); //Reset operation status for other sessions
			//List all clients
			ArrayList <ClientVO> list=new ArrayList<>();
			ClientDao dao=new ClientDao();
			list=dao.readall();
			model.addAttribute("list", list);
			return "/admin-clients";
		}
		
		//Create clients
		@PostMapping("/create-clients")
		public String create_client(@ModelAttribute("create_client") ClientVO client) {
			ClientDao dao=new ClientDao();
			req.setClienttype("La creación del cliente");
			String query=dao.create(client);
			if (query.equals("1")) {
				req.setClientf("1");
			} else {
				req.setClientf("2");
			}
			return "redirect:/admin-clients";
		}
		
		//Update clients
		@PostMapping("/update-clients")
		public String update_client(@ModelAttribute("update_client") ClientVO client) {
				ClientDao dao=new ClientDao();
				req.setClienttype("La actualización del cliente");
				String query=dao.update(client);
				if (query.equals("1")) {
					req.setClientf("1");
				} else {
					req.setClientf("2");
				}
				return "redirect:/admin-clients";
		
		}
		
		//Delete clients
		@PostMapping("/delete-clients")
		public String delete_client(@ModelAttribute("delete_client") IdVO idclients) {
				ClientDao dao=new ClientDao();
				req.setClienttype("El borrado del cliente");
				String query=dao.delete(idclients.getId());
				if (query.equals("1")) {
					req.setClientf("1");
				} else {
					req.setClientf("2");
				}
				return "redirect:/admin-clients";
		
		}
		
		//End clients page

		//Providers page
		
		//Get providers page 
		@GetMapping("/admin-providers")
		public String adminproviders(Model model) {
			model.addAttribute("create_provider", new ProviderVO());
			model.addAttribute("update_provider", new ProviderVO());
			model.addAttribute("delete_provider", new ProviderVO());
			//Notifications for operations. providertype for operation type, and success or error trigger
			model.addAttribute("providertype", req.getProvidertype());
			if (req.getProviderf().equals("1")) {
				//Success notification
				model.addAttribute("successp",true);
			}
			if (req.getProviderf().equals("2")) {
				//Error notification
				model.addAttribute("errorp", true);
			}
			req.setProviderf("0"); //Reset operation status for other sessions
			//List all providers
			ArrayList <ProviderVO> list=new ArrayList<>();
			ProviderDao dao=new ProviderDao();
			list=dao.readall();
			model.addAttribute("list", list);
			return "/admin-providers";
		}
		
		//Create providers
		@PostMapping("/create-providers")
		public String create_provider(@ModelAttribute("create_provider") ProviderVO provider) {
			ProviderDao dao=new ProviderDao();
			req.setProvidertype("La creación del proveedor");
			String query=dao.create(provider);
			if (query.equals("1")) {
				req.setProviderf("1");
			} else {
				req.setProviderf("2");
			}
			return "redirect:/admin-providers";
		}
		
		//Update providers
		@PostMapping("/update-providers")
		public String update_provider(@ModelAttribute("update_provider") ProviderVO provider) {
				ProviderDao dao=new ProviderDao();
				req.setProvidertype("La actualiación del proveedor");
				String query=dao.update(provider);
				if (query.equals("1")) {
					req.setProviderf("1");
				} else {
					req.setProviderf("2");
				}
				return "redirect:/admin-providers";
		
		}
		
		//Delete providers
		@PostMapping("/delete-providers")
		public String delete_provider(@ModelAttribute("delete_provider") IdVO idproviders) {
				ProviderDao dao=new ProviderDao();
				req.setProvidertype("El borrado del proveedor");
				String query=dao.delete(idproviders.getId());
				if (query.equals("1")) {
					req.setProviderf("1");
				} else {
					req.setProviderf("2");
				}
				return "redirect:/admin-providers";
		
		}
		
		//End providers page
		
		//Products page

		//Get products page 
		@GetMapping("/admin-products")
		public String adminproducts(Model model) {
			model.addAttribute("producttype", req.getProducttype());
			if (req.getProductf().equals("1")) {
				//Success notification
				model.addAttribute("successpr",true);
			}
			if (req.getProductf().equals("2")) {
				//Error notification
				model.addAttribute("errorpr", true);
			}
			req.setProductf("0"); //Reset operation status for other sessions
			//List all providers
			ArrayList <ProductVO> list=new ArrayList<>();
			ProductDao dao=new ProductDao();
			list=dao.readall();
			model.addAttribute("list", list);
			return "/admin-products";
		}

	    @PostMapping("/upload-products")
	    public String upload_products(@RequestParam("file") MultipartFile file) {
	    	ProductDao dao=new ProductDao();
			req.setProducttype("La carga de productos");
	    	String query = "2";
	        try {
	        	query=dao.upload(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (query.equals("1")) {
				req.setProductf("1");
			} else {
				req.setProductf("2");
			}
	        return "redirect:/admin-products";
	    }

		
		//End products page
	    
	    //Reports page
	    
	    //Get reports page
  		@GetMapping("/admin-reports")
  		public String adminreports(Model model) {
  			AnalyticsDao dao=new AnalyticsDao();
  			//For cards
  			//Count users
  			int count_users=dao.count_users();
  			model.addAttribute("count_users", count_users);
  			//Count clients
  			int count_clients=dao.count_clients();
  			model.addAttribute("count_clients", count_clients);
  			//Count providers
  			int count_providers=dao.count_providers();
  			model.addAttribute("count_providers", count_providers);
  			//Count products
  			int count_products=dao.count_products();
  			model.addAttribute("count_products", count_products);
  			//Count sales
  			int count_sales=dao.count_sales();
  			model.addAttribute("count_sales", count_sales);
  			//Count earnings
  			String count_earnings=Long.toString(dao.count_earnings());
  			model.addAttribute("count_earnings", count_earnings);
  			//For charts
  			//Read dates from last 7 days
  			ArrayList <String> dates=new ArrayList<>();
  			dates=dao.sevendays();
  			model.addAttribute("dates", dates);
  			//Count last 7 days users for chart
  			ArrayList <Integer> lastusers=new ArrayList<>();
  			lastusers=dao.lastusers();
  			model.addAttribute("lastusers", lastusers);
  			//Count last 7 days sales for chart
  			ArrayList <Integer> sales=new ArrayList<>();
  			sales=dao.lastsales();
  			model.addAttribute("sales", sales);
  			//For tables
  			//Read all users
			ArrayList <UserVO> userlist=new ArrayList<>();
			UserDao daouser=new UserDao();
			userlist=daouser.readall();
			model.addAttribute("userlist", userlist);
			//Read all clients
			ArrayList<ClientVO> clientlist=new ArrayList<>();
			ClientDao daoclient=new ClientDao();
			clientlist=daoclient.readall();
			model.addAttribute("clientlist", clientlist);
			//Read all sales per client
			ArrayList<SalesClientVO> salesclient=new ArrayList<>();
			salesclient=dao.sales_per_client();
			model.addAttribute("salesclient",salesclient);
						
  			return "/admin-reports";
  		}
	    
	    //End reports page
		
	//View operations end	
		
}
