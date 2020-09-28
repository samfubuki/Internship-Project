<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>


<style type="text/css">
.navbar {
	background-color: #232943 !important;
}

.nav-item {
	font-weight: bold;
	color: black;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: #162024;
	color: white;
	text-align: center;
}

ul.breadcrumb {
	padding: 10px 16px;
	list-style: none;
	background-color: #FFFDCA;
}

ul.breadcrumb li {
	display: inline;
	font-size: 18px;
}

ul.breadcrumb li+li:before {
	padding: 8px;
	color: black;
	content: ">\00a0";
}

ul.breadcrumb li a {
	color: #0275d8;
	text-decoration: none;
}

ul.breadcrumb li a:hover {
	color: #01447e;
	text-decoration: underline;
}

.dropdown-submenu {
	position: relative;
}

.dropdown-submenu a::after {
	transform: rotate(-90deg);
	position: absolute;
	right: 6px;
	top: .8em;
}

.dropdown-submenu .dropdown-menu {
	top: 0;
	left: 100%;
	margin-left: .1rem;
	margin-right: .1rem;
}
</style>


</head>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<!-- Brand/logo -->
	<!-- Links -->
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<div style="padding-left: 70px;">
			<ul class="navbar-nav">
				

				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">Masters<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">General
									Master</a>
								<ul class="dropdown-menu">
									<button class="dropdown-item" type="button">Department
										Master</button>
									<button class="dropdown-item" type="button">Consultant
										Specialization Master</button>
									<button class="dropdown-item" type="button">Consultant
										Master</button>
									<button class="dropdown-item" type="button">Consultant
										Sharing Master</button>
									<button class="dropdown-item" type="button">Copy
										Consultant Sharing Master</button>
									<button class="dropdown-item" type="button">Frequency
										Master</button>
									<button class="dropdown-item" type="button">Staff
										Master</button>
									<div class="dropdown-divider"></div>
									<button class="dropdown-item" type="button"  onclick="window.location.href='/casemasterForm'">Case
										Master</button>
									<button class="dropdown-item" type="button" onclick="window.location.href='/billchargegroupForm'">Billing
										Charge Group Master</button>
									<button class="dropdown-item" type="button" onclick="window.location.href='/billchargemasterForm'">Billing
										Charge Master</button>
									<div class="dropdown-divider"></div>
									<button class="dropdown-item" type="button">Organization
										or TPA Master</button>
									<button class="dropdown-item" type="button">Copy Org.
										Rate</button>
									<button class="dropdown-item" type="button">CGHS/ECHS
										Transfer</button>
									<div class="dropdown-divider"></div>
									<button class="dropdown-item" type="button">Group
										Account Master</button>
									<button class="dropdown-item" type="button">Ledger
										Account Master</button>

								</ul></li>
						</ul>
					</li>
				</div>





				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">OPDs<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">Master</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">Prescription
											Master</a></li>

								</ul></li>
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">Transactions</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">Transaction 1</a></li>


								</ul></li>
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">Report</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">Report1</a></li>
									<li><a class="dropdown-item" href="#">Report2</a></li>
									<li><a class="dropdown-item" href="#">Report3</a></li>

								</ul></li>
						</ul>
					</li>
				</div>

				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">IPD<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">Master</a>
								<ul class="dropdown-menu">
									<button class="dropdown-item" type="button" onclick="window.location.href='/roomcategorymasterForm'">Room
								Category Master</button>
							<button class="dropdown-item" type="button" onclick="window.location.href='/nursingstationmasterForm'">Nursing
								Station Master</button>
							<button class="dropdown-item" type="button" onclick="window.location.href='/roommasterForm'">Room Master</button>
							<button class="dropdown-item" type="button">Operation
								Master</button>
							<button class="dropdown-item" type="button">Instruction
								Master</button>
							<button class="dropdown-item" type="button">Discharge
								Card Tamplate Master</button>
							<button class="dropdown-item" type="button">ICDX Master</button>
							<button class="dropdown-item" type="button">Ward
								Procedure Master</button>
							<button class="dropdown-item" type="button">Operation
								Tamplate Master</button>
							<div class="dropdown-divider"></div>
							<button class="dropdown-item" type="button">File Mngt
								Procedure Master</button>
							<button class="dropdown-item" type="button">File Mngt
								Diagnosis Master</button>

								</ul></li>
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">Transactions</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">Transaction 1</a></li>


								</ul></li>
							<li class="dropdown-submenu"><a
								class="dropdown-item dropdown-toggle" href="#">Report</a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">Report1</a></li>
									<li><a class="dropdown-item" href="#">Report2</a></li>
									<li><a class="dropdown-item" href="#">Report3</a></li>

								</ul></li>
						</ul>
							
							
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							
						</div>
					</li>
				</div>


				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">Diagnostics<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
						</div>
					</li>
				</div>

				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">MIS<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
						</div>
					</li>
				</div>


				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">Purchase<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
						</div>
					</li>
				</div>



				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">Pharmacy<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
						</div>
					</li>
				</div>



				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">Finance<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
						</div>
					</li>
				</div>



				<div class="dropdown">
					<li class="nav-item">
						<div></div> <a class="nav-link" class="dropdown-toggle" type=""
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false" href="#" style="padding-right: 30px">Others<i
							style="padding-left: 5px;" class="fa fa-angle-down"
							style="font-size:15px"></i></a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
							<button class="dropdown-item" type="button">Action</button>
						</div>
					</li>
				</div>

			</ul>
		</div>
	</div>


	<div class="form-inline" style="padding-right: 50px; align-self: right">
		<img alt="Account"
			src="https://i2.wp.com/www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png?fit=256%2C256&quality=100&ssl=1"
			style="height: 30px;">
	</div>
</nav>



<script>
	$('.dropdown-menu a.dropdown-toggle').on(
			'click',
			function(e) {
				if (!$(this).next().hasClass('show')) {
					$(this).parents('.dropdown-menu').first().find('.show')
							.removeClass("show");
				}
				var $subMenu = $(this).next(".dropdown-menu");
				$subMenu.toggleClass('show');

				$(this).parents('li.nav-item.dropdown.show').on(
						'hidden.bs.dropdown', function(e) {
							$('.dropdown-submenu .show').removeClass("show");
						});

				return false;
			});
</script>