class CanteenStarter{
	
	
	public static void main(String[] args){
		
		System.out.println("Starting main in CanteenStarter");
		String[] items=new String[40];
		items[0]="Ladle";
		items[1]="Rod";
		items[2]="pizza cutter";
		items[3]="corkscrew";
		items[4]="bottle opener";
		items[5]="flying pan";
		items[6]="sausepans";
		items[7]="ovenproof dish";
		items[8]="baking sheet";
		items[9]="stirring spoon";
		items[10]="slotted spoon";
		items[11]="spatula";
		items[12]="tongs";
		items[13]="masher";
		items[14]="oven gloves";
		items[15]="pot holders";
		items[16]="bread bin";
		items[17]="kitchen foil";
		items[18]="tea towels";
		items[19]="Knife";	
		items[20]="food thermometer";
		items[21]="pairing Knife";
		items[22]="Bread Cutter";
		items[23]="fork";
		items[24]="Honing";
		items[25]="Chopping board";
		items[26]="scissors";
		items[27]="vegetable Cutter";
		items[28]="garlic press";
		items[29]="Grater";
		items[30]="kitchen scales";
		items[31]="measuring jug";
		items[32]="measuring spoons";
		items[33]="measuring cups";
		items[34]="mixing bowl";
		items[35]="pasta strainer";
		items[36]="Sieve";
		items[37]="Rolling pin";
		items[38]="Can opener";
		items[39]="blender";
				
		
		Canteen canteen=new Canteen("VEG");
		canteen.setUtensils(items);
		canteen.showInfo();
		
		
		System.out.println("Starting main in CanteenStarter");
	}
}