/*
* This file is automatically generated by GenTest
*
* 2018-08-06 15:08:53.910768
*/




startTest();

/*
*
*	ABSTRACT FUNCTIONS IMPLEMENTED USING DESCRIPTION FROM ECMA-262 
*
*/

function RequireObjectCoercible(argument){
        if (argument == undefined || argument == null)
                throw new TypeError("TypeError in RequireObjectCoercible")
        else
                return argument
}

function ToString(argument){
        if (argument == undefined)
                return "undefined"
        else if(argument == null)
                return "null"
        else if(typeof argument == "boolean"){
                if (argument == true)
                        return "true"
                else
                        return "false"

        }
        else if(typeof argument == "string")
                return argument
        else if(typeof argument == "number")
                return Number(argument).toString()
        else if(typeof argument == "symbol")
                throw new TypeError("TypeError in ToString")
        else if(typeof argument == "object")
                return argument.toString()

}

function ToInteger(argument){
        var number = Number(argument)
        if (Object.is(number, NaN)){
                return 0
        }
        if (number == 0 || number == Infinity || number == -Infinity || number == +0 || number== -0){
                return number
        }
        return number-(number%1)
}

function ToUint32(argument){
        var number = Number(argument)
        if (Object.is(number, NaN) || number == 0 || number == Infinity || number == -Infinity || number == +0 || number== -0){
                return 0
        }
        var i = Math.floor(Math.abs(number))
        var int32bit = i%(Math.pow(2,32))
    return int32bit
}

function IsRegExp(argument){
        return (argument instanceof RegExp)
}

function IsCallable(argument){
        if (typeof argument != 'object')
                return false
        if (typeof argument == 'function')
                return true
        return false
}

function ToLength(argument){
        var len = ToInteger(argument);
        if (len <= 0)
                return 0
        return Math.min(len, 2e53-1)
}

function ToObject(argument){
        if (argument == undefined || argument == null)
                throw new TypeError("TypeError in ToObject")
        if (typeof argument == "number")
                return new Number(argument)
        if (typeof argument == "string")
                return new String(argument)
        if (typeof argument == "boolean")
                return new Boolean(argument)
        if (typeof argument == "symbol")
                return new Symbol(argument)
        if (typeof argument == "object")
                return argument
}

function thisNumberValue(argument){
	return Number(argument)
}

function thisTimeValue(argument){
	return Date(argument)
}
/*TEST TEMPLATE GENERATED AUTOMATICALLY*/
function test_math_trunc(x){
	if (Object.is( x,NaN)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", NaN, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===-0)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", -0, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===0)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", 0, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===Infinity)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===-Infinity)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", -Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x > 0  && x < 1)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", 0, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x < 0  && x > -1)){
		var output = Math.trunc(x);
		new TestCase("math_trunc", "math_trunc", -0, output);
		test();
		//console.log("Good Test")
		return
		}
	//console.log("OK Test")
}

/*TESTS GENERATED AUTOMATICALLY*/
test_math_trunc("0XT0NF4AH");
test_math_trunc(+0);
test_math_trunc(false);
test_math_trunc(1.7668387724250143e+308);
test_math_trunc(8.161100986039294e+307);
test_math_trunc(-0);
test_math_trunc(NaN);
test_math_trunc("P30");
test_math_trunc(/yes.*day/);
test_math_trunc(-483);
test_math_trunc(/[^.]+/);
test_math_trunc(818);
test_math_trunc(undefined);
test_math_trunc(3.111113289921513e+307);
test_math_trunc(-523);
test_math_trunc("XU6W0");
test_math_trunc("TQSCU57I");
test_math_trunc("9XYBCVQ8");
test_math_trunc(-685);
test_math_trunc(5.644511507989865e+307);
test_math_trunc(1.4445030540497597e+307);
test_math_trunc(1.741062389105476e+308);
test_math_trunc(/yes[^]*day/);
test_math_trunc(2.7380866568856953e+307);
test_math_trunc(-359);
test_math_trunc(9.194596167815919e+307);
test_math_trunc(9.189324536076104e+307);
test_math_trunc(true);
test_math_trunc(/[\u0400-\u04FF]+/g);
test_math_trunc("CAAD");
test_math_trunc(/(\w+)\s(\w+)/);
test_math_trunc("H5CZ4W2V3");
test_math_trunc("ZSI3");
test_math_trunc("E6VA9T6A4");
test_math_trunc("S8R");
test_math_trunc("PD0X");
test_math_trunc(4.1331072550185283e+307);
test_math_trunc(Infinity);
test_math_trunc("6JW1WC");
test_math_trunc(null);
test_math_trunc(/\r\n|\r|\n/);
test_math_trunc(248);
test_math_trunc("36ZG");
test_math_trunc(1.0313835051268318e+308);
test_math_trunc("YI0H");
test_math_trunc(4.663352055243145e+307);
test_math_trunc(510);
test_math_trunc(784);
test_math_trunc(136);
test_math_trunc(-217);
test_math_trunc(-683);
test_math_trunc("IR11");
test_math_trunc(-741);
test_math_trunc(9.487766450668913e+307);
test_math_trunc("A1KDL");
test_math_trunc(1.7759221353675292e+308);
test_math_trunc("ETMCZDWZ");
test_math_trunc(1.1366686659719508e+308);
test_math_trunc(/foo/g);
test_math_trunc(1.3822599323405254e+308);
test_math_trunc("QEOH5MRHW");
test_math_trunc(216);
test_math_trunc("ND393V6Y");
test_math_trunc(272);
test_math_trunc(462);
test_math_trunc("ERG3ILJ");
test_math_trunc(4.289702724590543e+307);
test_math_trunc(-843);
test_math_trunc(654);
test_math_trunc(/ab+c/);
test_math_trunc(370);
test_math_trunc("TFC");
test_math_trunc(532);
test_math_trunc(24);
test_math_trunc("CZOY");
test_math_trunc(9.821908211062798e+307);
test_math_trunc(1.5597006107707642e+308);
test_math_trunc(3.222319394073992e+307);
test_math_trunc("9CK9");
test_math_trunc("G1X1GTKXI");
test_math_trunc("1PFQ2UNGJ");
test_math_trunc(1.4353432552746246e+308);
test_math_trunc("BMLSNHMIVT");
test_math_trunc("ZW8K977");
test_math_trunc("5IRW2I6EH");
test_math_trunc(-821);
test_math_trunc(-71);
test_math_trunc("I8P");
test_math_trunc("B7GGR6B");
test_math_trunc(560);
test_math_trunc(2.6226946538733653e+307);
test_math_trunc(-511);
test_math_trunc("ZYQAUBHC");
test_math_trunc(-497);
test_math_trunc("W3TBF6YIP");
test_math_trunc(160);
test_math_trunc("34PC2X");
test_math_trunc(794);
test_math_trunc("D7QLCB73");
test_math_trunc("OHD455SXF");
test_math_trunc("JBXJ80DX");
test_math_trunc(-417);
test_math_trunc("O0602");
test_math_trunc(9.982448782323171e+306);
test_math_trunc(1.0508710648023195e+308);
test_math_trunc("UA4QM");
test_math_trunc(1.4803589537227237e+308);
test_math_trunc("24ZD4OM");
test_math_trunc(1.7376718119019819e+308);
test_math_trunc("HYI26B01");
test_math_trunc(130);
test_math_trunc("OR1PRHM8");
test_math_trunc(64);
test_math_trunc(3.9478308505697376e+307);
test_math_trunc(420);
test_math_trunc("7PCVOBI");
test_math_trunc(270);
test_math_trunc("3Q0GR71U");
test_math_trunc(8.662442275591276e+307);
test_math_trunc("N9ZQ");
test_math_trunc("GJAMZ");
test_math_trunc(1.2395675604165778e+308);
test_math_trunc(1.5625299069426202e+308);
test_math_trunc(-987);
test_math_trunc(7.56009997854867e+307);
test_math_trunc("SAX8Q8");
test_math_trunc(5.1647392645773415e+306);
test_math_trunc("RSOKWGURNE");
test_math_trunc(1.753194160466046e+307);
test_math_trunc("OH70R6I");
test_math_trunc(1.5074728703679005e+308);
test_math_trunc(950);
test_math_trunc(8.588021583161297e+307);
test_math_trunc(164);
test_math_trunc("HY0EG487N");
test_math_trunc(-957);
test_math_trunc("YWE9S5VBW");
test_math_trunc("1P0");
test_math_trunc("6V1JZ5FS7B");
test_math_trunc(848);
test_math_trunc(1.1082844247081635e+308);
test_math_trunc("WXLER3");
test_math_trunc("LQHPVFIRS");
test_math_trunc(-889);
test_math_trunc("ACYIES");
test_math_trunc(1.556049577038836e+308);
test_math_trunc("DD01JES");
test_math_trunc("2CBTFI");
test_math_trunc(1.6685523900882583e+308);
test_math_trunc(808);
test_math_trunc("NTJJRUL");
test_math_trunc("QAP");
test_math_trunc("A9Y");
test_math_trunc(918);
test_math_trunc("E72H");
test_math_trunc(1.0868644429675953e+308);
test_math_trunc(7.580395219582481e+306);
test_math_trunc(-335);
test_math_trunc(410);
test_math_trunc("3F5ZEJI");
test_math_trunc(0x1123);
test_math_trunc(726);
test_math_trunc(8.523432229045376e+307);
test_math_trunc(-643);
test_math_trunc(482);
test_math_trunc("9JWI");
test_math_trunc(1.3827676806241132e+308);
test_math_trunc("GQQU");
test_math_trunc(-743);
test_math_trunc("DOR3IJIP0");
test_math_trunc("Y85ME69G2");
test_math_trunc("PP32Q");
test_math_trunc("Q0T0L");
test_math_trunc(-169);
test_math_trunc("9USSFX6VRX");
test_math_trunc(3.0391423718375024e+307);
test_math_trunc(1.4638640241736685e+308);
test_math_trunc("M3JJUS53");
test_math_trunc(458);
test_math_trunc(-3);
test_math_trunc(1.5379439051457824e+308);
test_math_trunc(-963);
test_math_trunc(3.71560676808243e+307);
test_math_trunc("5TTJ0XKX");
test_math_trunc(4.545571209972473e+307);
test_math_trunc(1.5662938490424808e+308);
test_math_trunc(1.076858165336984e+308);
test_math_trunc("TWN3DH58U");
test_math_trunc(9.234750626762454e+307);
test_math_trunc(1.52938041958579e+308);
test_math_trunc(6.51208763291915e+307);
test_math_trunc(2.5237861528660245e+307);
test_math_trunc(-499);
test_math_trunc(1.6967386826121372e+308);
test_math_trunc(922);
test_math_trunc(166);
test_math_trunc(1.2667092243938297e+307);
test_math_trunc(-713);
test_math_trunc("TRH5WJV53M");
test_math_trunc(-647);
test_math_trunc("3C5SDLQYRN");
test_math_trunc("NRXYU5");
test_math_trunc("XDQI0");
test_math_trunc("XSCKH2");
test_math_trunc(-903);
test_math_trunc(738);
test_math_trunc("SQS9R8HKMU");
test_math_trunc(1.7217907524989278e+308);
test_math_trunc(6.569099649117372e+307);
test_math_trunc(382);
test_math_trunc("UT2V04");
test_math_trunc("T96PS5D1");
test_math_trunc(1.2025549206588777e+308);
test_math_trunc(-213);
test_math_trunc(-107);
test_math_trunc(1.3178114721271895e+308);
test_math_trunc("GTZEXZNXF1");
test_math_trunc(1.6199737493459074e+308);
test_math_trunc(1.1771121229752085e+308);
test_math_trunc("PLCNAD97GQ");
test_math_trunc(2.290720068034135e+307);
test_math_trunc(5.429196430622656e+307);
test_math_trunc("K9ZR3SY");
test_math_trunc(-87);
test_math_trunc("DB3H53N");
test_math_trunc(-995);
test_math_trunc(-151);
test_math_trunc(1.0053265477492645e+308);
test_math_trunc(1.030266683642037e+308);
test_math_trunc(8.715124328990999e+307);
test_math_trunc("O7FMVCZ7");
test_math_trunc("Y4PW");
test_math_trunc("II2VV");
test_math_trunc(9.197206460223136e+307);
test_math_trunc("N1DC68RW");
test_math_trunc("QQ97C");
test_math_trunc(0x00111);
test_math_trunc(7.14330216111065e+307);
test_math_trunc(862);
test_math_trunc("9EM");
test_math_trunc(1.4787696692640527e+307);
test_math_trunc("N0P4W1N");
test_math_trunc(1.640361785278994e+308);
test_math_trunc(9.57028965278582e+306);
test_math_trunc(4.135581260956645e+307);
test_math_trunc("9UX");
test_math_trunc(686);
test_math_trunc(-157);
test_math_trunc(952);
test_math_trunc(1.1683432886173644e+308);
test_math_trunc(34);
test_math_trunc("VONV6EB");
test_math_trunc(1.1470605638739403e+308);
test_math_trunc("9FA1QG4JHN");
test_math_trunc(-137);
test_math_trunc(-571);
test_math_trunc(1.3756262630974929e+308);
test_math_trunc(1.0068827703731945e+308);
test_math_trunc(1.7742660134230754e+308);
test_math_trunc(9.250741834670564e+307);
test_math_trunc("76UZLQ6");
test_math_trunc("MADM");
test_math_trunc(9.188189549210038e+307);
test_math_trunc(7.047580746979337e+307);
test_math_trunc(-747);
test_math_trunc(40);
test_math_trunc(1.6585492497010067e+308);
test_math_trunc(-0xF1A7);
test_math_trunc("BGZC4R9AE");
test_math_trunc(1.029403298853159e+308);
test_math_trunc(82);
test_math_trunc("OJZ8X");
test_math_trunc("D3DX00");
test_math_trunc(-95);
test_math_trunc(810);
test_math_trunc("EJD9N9D");
test_math_trunc(-405);
test_math_trunc(6.40753425080583e+307);
test_math_trunc(-919);
test_math_trunc(964);
test_math_trunc(74);
test_math_trunc(878);
test_math_trunc(1.3201308434736377e+308);
test_math_trunc(4.10474366584466e+307);
test_math_trunc("M28");
test_math_trunc(-515);
test_math_trunc(1.5522923360642528e+308);
test_math_trunc("W06B");
test_math_trunc(824);
test_math_trunc("4M0BSSP");
test_math_trunc(-831);
test_math_trunc("9YPYZ0RQC");
test_math_trunc("WWAC3ZF");
test_math_trunc("IOJ3TR7");
test_math_trunc("68545BAG5");
test_math_trunc("9JY3JRNKF");
test_math_trunc(1.2106088610399718e+308);
test_math_trunc(2.6291370314706956e+307);
test_math_trunc(-537);
test_math_trunc(648);
test_math_trunc("CVTTKT4X");
test_math_trunc(1.4593280290765226e+308);
test_math_trunc(126);
test_math_trunc(-347);
test_math_trunc(-367);
test_math_trunc("MQ2WY6");
test_math_trunc("UYBVDVZ");
test_math_trunc(-123);
test_math_trunc("N5KWPI");
test_math_trunc(550);
test_math_trunc(1.152842255517459e+308);
test_math_trunc(7.976115907024914e+307);
test_math_trunc(2.669696816732337e+307);
test_math_trunc("BKLJ");
test_math_trunc("A1TK3KH1");
test_math_trunc("G8LKJ3Z");
test_math_trunc(1.6790748195697328e+308);
test_math_trunc(9.761478169480907e+307);
test_math_trunc(268);
test_math_trunc("KGM");
test_math_trunc(5.147347013334411e+307);
test_math_trunc("B5M6G84C53");
test_math_trunc("MINXE");
test_math_trunc(-183);
test_math_trunc("1J555X7X");
test_math_trunc("QHB");
test_math_trunc(-967);
test_math_trunc(-519);
test_math_trunc(5.273584292353217e+307);
test_math_trunc("CEY0MSF");
test_math_trunc("715XB96IC");
test_math_trunc(2.9829124487013626e+307);
test_math_trunc(-707);
test_math_trunc(-883);
test_math_trunc(-351);
test_math_trunc(7.431595978985482e+307);
test_math_trunc(-179);
test_math_trunc(578);
test_math_trunc(1.7101027701863552e+308);
test_math_trunc(58);
test_math_trunc("BE0SE");
test_math_trunc("FXHAQ");
test_math_trunc(-985);
test_math_trunc(3.336129639165203e+307);
test_math_trunc(1.099194926234796e+308);
test_math_trunc(-599);
test_math_trunc("RM6E62D4JV");
test_math_trunc("IQX3VVUL74");
test_math_trunc("0TJKH");
test_math_trunc(120);
test_math_trunc("C3A34S53CA");
test_math_trunc(944);
test_math_trunc("SWW7B");
test_math_trunc(3.578656012638659e+307);
test_math_trunc(-587);
test_math_trunc("8BHFX");
test_math_trunc(9.716339925466073e+307);
test_math_trunc(4.073304286634555e+307);
test_math_trunc(1.4928190836134416e+308);
test_math_trunc(904);
test_math_trunc(-59);
test_math_trunc(408);
test_math_trunc("RMQDE3IMN");
test_math_trunc(-113);
test_math_trunc(7.430253453598896e+307);
test_math_trunc(4.4366278379955255e+307);
test_math_trunc(150);
test_math_trunc(4.3311218896630285e+307);
test_math_trunc("7PG");
test_math_trunc(184);
test_math_trunc("C2GWWROKF2");
test_math_trunc(-297);
test_math_trunc(-237);
test_math_trunc(888);
test_math_trunc("VC1KP");
test_math_trunc(4.808434055806739e+307);
test_math_trunc(-787);
test_math_trunc(-551);
test_math_trunc("08PB");
test_math_trunc("GB36PPWQ");
test_math_trunc("Y2S91");
test_math_trunc(5.73265385019515e+307);
test_math_trunc(-47);
test_math_trunc(3.473802515858417e+307);
test_math_trunc(-353);
test_math_trunc(7.82810267964317e+307);
test_math_trunc("6MG42ND");
test_math_trunc(6.772545408086938e+307);
test_math_trunc(88);
test_math_trunc(1.6243571439329942e+308);
test_math_trunc(-39);
test_math_trunc(400);
test_math_trunc("P0MWY");
test_math_trunc("9OK85PWL");
test_math_trunc(390);
test_math_trunc(6.767881285995078e+307);
test_math_trunc("UPMV");
test_math_trunc("HFBR");
test_math_trunc(1.6260334178079931e+308);
test_math_trunc("NNNU");
test_math_trunc("RFUEOP4");
test_math_trunc(-545);
test_math_trunc(7.421209302130139e+307);
test_math_trunc(72);
test_math_trunc(-573);
test_math_trunc("Z0RUO");
test_math_trunc(1.0474002910717313e+308);
test_math_trunc(1.7848472070304418e+308);
test_math_trunc("PK17Y");
test_math_trunc("OS6");
test_math_trunc(6.907312354179013e+307);
test_math_trunc(906);
test_math_trunc(3.001370385000412e+307);
test_math_trunc(-189);
test_math_trunc(6.437050272500683e+307);
test_math_trunc(1.629276023012905e+308);
test_math_trunc("3HEQUUR9");
test_math_trunc(4.4384209180590866e+307);
test_math_trunc(1.3529233315415477e+307);
test_math_trunc(1.2478294134476776e+308);
test_math_trunc("0T5PJ");
test_math_trunc("53IOXLG8");
test_math_trunc(1.5246224662809338e+308);
test_math_trunc(1.2822555999257542e+308);
test_math_trunc("MZD7");
test_math_trunc(1);
test_math_trunc("2MFOT");
test_math_trunc(-63);
test_math_trunc("13EF5DOA");
test_math_trunc("279");
test_math_trunc(3.654407944125034e+307);
test_math_trunc(-859);
test_math_trunc(1.3957993323201888e+308);
test_math_trunc("N39C8");
test_math_trunc(-171);
test_math_trunc(1.6644128151561803e+307);
test_math_trunc(3.3222791786917667e+307);
test_math_trunc(-233);
test_math_trunc(4.765501867927955e+307);
test_math_trunc(68);
test_math_trunc(1.458402203166326e+308);
test_math_trunc(816);
test_math_trunc(668);
test_math_trunc("R8I2");
test_math_trunc(-715);
test_math_trunc(364);
test_math_trunc(474);
test_math_trunc(1.6146916141304213e+308);
test_math_trunc(-31);
test_math_trunc(2.250403638039953e+307);
test_math_trunc(5.602941947361849e+307);
test_math_trunc("ZG3");
test_math_trunc(2.647342278819682e+307);
test_math_trunc(776);
test_math_trunc(-7);
test_math_trunc(-41);
test_math_trunc(9.505765739184608e+307);
test_math_trunc("7GNT5");
test_math_trunc("Y3LMIT6G");
test_math_trunc(1.2145552831119144e+308);
test_math_trunc(-393);
test_math_trunc(6.448010257430954e+307);
test_math_trunc(234);
test_math_trunc("29OEA");
test_math_trunc(1.2747378036856447e+308);
test_math_trunc(1.6210757521253885e+308);
test_math_trunc("VUW5YWAABY");
test_math_trunc("ZKR2IVPX");
test_math_trunc(682);
test_math_trunc(-147);
test_math_trunc(-65);
test_math_trunc(1.6656797180409002e+308);
test_math_trunc(-227);
test_math_trunc(-263);
test_math_trunc("UQUONX8H");
test_math_trunc(284);
test_math_trunc(8.574234496159759e+307);
test_math_trunc(1.7145059187195474e+308);
test_math_trunc(1.6457755267597163e+308);
test_math_trunc(-897);
test_math_trunc("JTJ5AVUHRA");
test_math_trunc("5XY2TG8P1");
test_math_trunc(-457);
test_math_trunc(9.648684163964489e+307);
test_math_trunc(1.0980017745187997e+308);
test_math_trunc("5VF66GJS");
test_math_trunc(5.789723783258712e+307);
test_math_trunc("44UDL");
test_math_trunc(-777);
test_math_trunc(1.3809123822810232e+308);
test_math_trunc("NL9T8DEX");
test_math_trunc(9.689437046898682e+307);
test_math_trunc(1.4465874983277832e+308);
test_math_trunc("1ZZ3205GS");
test_math_trunc("P37X");
test_math_trunc(896);
test_math_trunc("1NB41RF");
test_math_trunc(4.69933251635389e+307);
test_math_trunc("F37OX");
test_math_trunc(1.1085933262211766e+308);
test_math_trunc(638);
test_math_trunc(-21);
test_math_trunc("G1T06YUI6");
test_math_trunc(8.51623633262263e+307);
test_math_trunc(1.065547485381525e+307);
test_math_trunc(-363);
test_math_trunc("XNKRMG0RRB");
test_math_trunc(4.204470572961851e+307);
test_math_trunc(-999);
test_math_trunc(3.3280257423904035e+307);
test_math_trunc("L9B6");
test_math_trunc(-953);
test_math_trunc(8.466341792273072e+307);
test_math_trunc(6.650677677442248e+307);
test_math_trunc(614);
test_math_trunc("NPO3PVPU5");
test_math_trunc("EQXAI5BTC7");
test_math_trunc("HL1PCGOEL");
test_math_trunc(104);
test_math_trunc("TUZFQFHDU");
test_math_trunc("GHLA7");
test_math_trunc(1.7229357162149839e+308);
test_math_trunc("JNCA1MFPZJ");
test_math_trunc("MEN6UVSG");
test_math_trunc(-1);
test_math_trunc("WM821W6");
test_math_trunc(1.7661436176587049e+308);
test_math_trunc(-19);
test_math_trunc(1.0995324632968213e+308);
test_math_trunc(704);
test_math_trunc(1.2216099307652191e+308);
test_math_trunc(-253);
test_math_trunc("KAJDSAT");
test_math_trunc(1.5370489685560317e+308);
test_math_trunc(396);
test_math_trunc(1.2637397771276662e+308);
test_math_trunc("ECRWPRN");
test_math_trunc("H38GC9YI");
test_math_trunc("TZ36V1NWP");
test_math_trunc("NN8ZPX");
test_math_trunc(38);
test_math_trunc(3.064509177540692e+307);
test_math_trunc("0DRGL7320");
test_math_trunc(1.027651239562504e+308);
test_math_trunc(-861);
test_math_trunc(3.627147484288187e+307);
test_math_trunc("Y5YQN4");
test_math_trunc(1.138593458228234e+308);
test_math_trunc(1.3411511489440784e+308);
test_math_trunc(1.7857750184800563e+307);
test_math_trunc("O1O7Q7");
test_math_trunc("PW3CD2E6");
test_math_trunc("UXYZN4");
test_math_trunc(894);
test_math_trunc(1.4483533991591756e+308);
test_math_trunc(1.1571378771054568e+308);
test_math_trunc(-567);
test_math_trunc(-625);
test_math_trunc(1.1107141221300028e+308);
test_math_trunc(1.2737208573799233e+308);
test_math_trunc(1.460243415007466e+308);
test_math_trunc("A7X6O");
test_math_trunc("BFZNABOVT");
test_math_trunc(1.6946409355872336e+308);
test_math_trunc(2.2431036917542758e+306);
test_math_trunc(650);
test_math_trunc("PT4C");
test_math_trunc("5DKKN5D4");
test_math_trunc("ETDF");
test_math_trunc(1.3805652889486906e+308);
test_math_trunc("LM8L5VU4WW");
test_math_trunc("Y9R");
test_math_trunc(-641);
test_math_trunc(-759);
test_math_trunc(1.160983668950614e+308);
test_math_trunc("C03R3A1");
test_math_trunc("LK6OD2");
test_math_trunc("IU21W77VL");
test_math_trunc("GB1WN");
test_math_trunc(4);
test_math_trunc("BPWSDS");
test_math_trunc(1.4716084053714779e+308);
test_math_trunc(8.630496225235442e+307);
test_math_trunc(-837);
test_math_trunc(724);
test_math_trunc(6.512732414764592e+307);
test_math_trunc(7.65975044395494e+307);
test_math_trunc("YIN");
test_math_trunc(52);
test_math_trunc("5L0");
test_math_trunc(-505);
test_math_trunc("ZAE6VG5");
test_math_trunc(424);
test_math_trunc(470);
test_math_trunc(4.958796446173574e+307);
test_math_trunc(-701);
test_math_trunc(94);
test_math_trunc(9.2409825437399e+307);
test_math_trunc("DYTXYLSU68");
test_math_trunc("HFU9YMH9");
test_math_trunc(958);
test_math_trunc(-911);
test_math_trunc("EH54");
test_math_trunc("CXTT3GGDP");
test_math_trunc(244);
test_math_trunc(3.573775609150457e+307);
test_math_trunc(5.704805332345956e+307);
test_math_trunc("SGW20NCAJU");
test_math_trunc(9.668311425126628e+307);
test_math_trunc("AA175");
test_math_trunc("ERM7TU17T");
test_math_trunc("30LM");
test_math_trunc("KP7AC139N");
test_math_trunc("8VLV1U6");
test_math_trunc(1.1321842482903422e+308);
test_math_trunc("7W741");
test_math_trunc(354);
test_math_trunc(8.081728925371161e+306);
test_math_trunc(2.945350002375746e+307);
test_math_trunc(1.2691012355584719e+308);
test_math_trunc("73G30W2PSX");
test_math_trunc("0LQ6");
test_math_trunc(1.4751179308524189e+308);
test_math_trunc("UHDFTRE");
test_math_trunc(580);
test_math_trunc("D02C7CL2");
test_math_trunc(6.103679491243833e+307);
test_math_trunc(-959);
test_math_trunc("67LJA652X");
test_math_trunc("CK7");
test_math_trunc(-611);
test_math_trunc("4T5T9VN");
test_math_trunc(1.393972378125582e+308);
test_math_trunc(530);
test_math_trunc(1.1922380480020067e+308);
test_math_trunc("F4CFIWAL");
test_math_trunc(9.672193855907432e+307);
test_math_trunc("R3ROB1GZ3");
test_math_trunc(1.0311513007715414e+308);
test_math_trunc("1JV2");
test_math_trunc("12O3");
test_math_trunc(1.8437373427838648e+307);
test_math_trunc("SJZI26");
test_math_trunc("QETOBW3");
test_math_trunc("DJS");
test_math_trunc("W42JS19BP7");
test_math_trunc(3.4142836436575315e+307);
test_math_trunc("4UQ5");
test_math_trunc(-549);
test_math_trunc(9.727021687340334e+307);
test_math_trunc(1.1067625962848213e+308);
test_math_trunc("4R7W26");
test_math_trunc("Z8E3MRZQ");
test_math_trunc(3.8510349033368437e+307);
test_math_trunc("MQWF8");
test_math_trunc(1.1867359639730251e+308);
test_math_trunc(-733);
test_math_trunc("Q6CT1QO");
test_math_trunc(3.716793804025131e+306);
test_math_trunc(1.248108076008377e+307);
test_math_trunc("8797O9");
test_math_trunc(-649);
test_math_trunc(514);
test_math_trunc(5.628593193930836e+307);
test_math_trunc("R1O7ZRVY9D");
test_math_trunc(1.0439193706817403e+308);
test_math_trunc(-791);
test_math_trunc(1.016287094334452e+308);
test_math_trunc(1.761599745807455e+308);
test_math_trunc("55T");
test_math_trunc(1.6778571063347984e+308);
test_math_trunc(4.1376465835801284e+307);
test_math_trunc("WE7O4HYQ");
test_math_trunc("MAMALOL0R");
test_math_trunc(1.1355271622524624e+308);
test_math_trunc(6.346968459857588e+307);
test_math_trunc(1.3788153269219794e+308);
test_math_trunc("G3U");
test_math_trunc(-913);
test_math_trunc("0LXOCRPW3");
test_math_trunc("U516");
test_math_trunc(8.972856733100049e+307);
test_math_trunc("LVD6");
test_math_trunc("QMCA");
test_math_trunc("N7TOE");
test_math_trunc(4.555729830097629e+307);
test_math_trunc(1.6819637081693133e+308);
test_math_trunc(-887);
test_math_trunc("3GZ7O6KB3F");
test_math_trunc(-17);
test_math_trunc("NT4E4J10OJ");
test_math_trunc(8.680054230043271e+307);
test_math_trunc(3.889102555875403e+307);
test_math_trunc(930);
test_math_trunc(-315);
test_math_trunc("DYP9ZSZWG");
test_math_trunc(884);
test_math_trunc(1.5455964903868252e+307);
test_math_trunc(3.380946764773394e+307);
test_math_trunc(156);
test_math_trunc(1.3651557769261658e+308);
test_math_trunc(3.05001945324391e+307);
test_math_trunc(752);
test_math_trunc(8.251322095749663e+307);
test_math_trunc("3P4OY");
test_math_trunc("EKG");
test_math_trunc(2.4838787794692676e+307);
test_math_trunc(1.6224442719151228e+308);
test_math_trunc("GFAHBVLML");
test_math_trunc("JEEF");
test_math_trunc(240);
test_math_trunc("G6IEIRC");
test_math_trunc(-729);
test_math_trunc(-165);
test_math_trunc(4.617401143789919e+307);
test_math_trunc(3.981593525220612e+307);
test_math_trunc("LNK");
test_math_trunc("A1YT2H");
test_math_trunc(1.6779372388156557e+308);
test_math_trunc(8.056310052161465e+307);
test_math_trunc(546);
test_math_trunc("1PG7B");
test_math_trunc(6.411690194461884e+307);
test_math_trunc("T8JGKOL14");
test_math_trunc("N9MVOCAL4W");
test_math_trunc("FZ0");
test_math_trunc(394);
test_math_trunc(-149);
test_math_trunc(-61);
test_math_trunc(5.924179975118139e+307);
test_math_trunc(6.96514008378847e+307);
test_math_trunc("D7HRZQX");
test_math_trunc(616);
test_math_trunc(3.3079400248669755e+307);
test_math_trunc(-855);
test_math_trunc(2.080555746702048e+307);
test_math_trunc(898);
test_math_trunc(-331);
test_math_trunc(-891);
test_math_trunc(1.6263462725466798e+308);
test_math_trunc(-565);
test_math_trunc(9.404321596422815e+306);
test_math_trunc("MW8PK");
test_math_trunc(9.216886855687165e+307);
test_math_trunc(796);
test_math_trunc("42P2IF");
test_math_trunc(5.492698658602177e+307);
test_math_trunc(1.609463173930912e+308);
test_math_trunc(-325);
test_math_trunc("WTQOXK961K");
test_math_trunc(1.6389932582748384e+308);
test_math_trunc(594);
test_math_trunc(1.588485271840786e+308);
test_math_trunc(-357);
test_math_trunc(6.531094965648098e+307);
test_math_trunc("I66ZXZ");
test_math_trunc(996);
test_math_trunc("YURCUA03N7");
test_math_trunc("VP61");
test_math_trunc(590);
test_math_trunc(928);
test_math_trunc("CPLB309OY");
test_math_trunc("XUG");
test_math_trunc("VVGKSFEDU");
test_math_trunc(5.314212248818946e+307);
test_math_trunc("DTK0B1KO4J");
test_math_trunc(1.3216654325289898e+308);
test_math_trunc("Q4F26T");
test_math_trunc(5.593850319635856e+307);
test_math_trunc("7VOSMH7Q");
test_math_trunc("NMZ5W93F");
test_math_trunc("48P1U");
test_math_trunc("S7AW6");
test_math_trunc(4.61356797086095e+307);
test_math_trunc("QL3");
test_math_trunc(1.434358612207422e+308);
test_math_trunc("MQ31EW");
test_math_trunc(140);
test_math_trunc(2.0016568527746716e+307);
test_math_trunc(-931);
test_math_trunc(5.144117553654409e+307);
test_math_trunc("313NRT0");
test_math_trunc(1.3723569675598901e+308);
test_math_trunc(-241);
test_math_trunc("E0RS6GU078");
test_math_trunc(634);
test_math_trunc(5.1521157999631977e+306);
test_math_trunc("P4D6");
test_math_trunc("TKVM");
test_math_trunc("bar");
test_math_trunc(502);
test_math_trunc(322);
test_math_trunc("AR3OWTQ6VN");
test_math_trunc(1.6240807489107591e+308);
test_math_trunc("JBOKOSLRSD");
test_math_trunc("8WMVWWXG");
test_math_trunc(1.6250572402142985e+308);
test_math_trunc(6.338870595857706e+307);
test_math_trunc("C11HOJYO");
test_math_trunc(9.37829863727499e+307);
test_math_trunc(826);
test_math_trunc("M194TK4");
test_math_trunc("W22");
test_math_trunc("Q5CGOGEMVO");
test_math_trunc("S730MH");
test_math_trunc(-447);
test_math_trunc(1.689875128939091e+308);
test_math_trunc(-239);
test_math_trunc("ROHFBTCY");
test_math_trunc(1.0557036382880976e+308);
test_math_trunc(-879);
test_math_trunc(1.046336459803689e+308);
test_math_trunc(6.274005475432309e+307);
test_math_trunc(-933);
test_math_trunc("CLJ8K05");
test_math_trunc(-321);
test_math_trunc("FCLQDRC1Z");
test_math_trunc(4.756021964040498e+307);
test_math_trunc(362);
test_math_trunc(6.095748506635635e+307);
test_math_trunc("BP9Q");
test_math_trunc("E22C");
test_math_trunc("58GW");
test_math_trunc(3.221837981909409e+307);
test_math_trunc("9AWQEVE084");
test_math_trunc(-153);
test_math_trunc(392);
test_math_trunc(692);
test_math_trunc(7.980265134788032e+307);
test_math_trunc(-453);
test_math_trunc(1.0620494952027833e+308);
test_math_trunc("FP176NR");
test_math_trunc(1.7507711855029374e+308);
test_math_trunc(3.097430381517911e+306);
test_math_trunc(1.7178202652999188e+308);
test_math_trunc(1.7326598576762952e+308);
test_math_trunc(3.9696951464961176e+307);
test_math_trunc(14);
test_math_trunc(1.0851367704875599e+308);
test_math_trunc(-595);
test_math_trunc("NLWJTMH3");
test_math_trunc(1.0870001102835621e+308);
test_math_trunc("8XVD3");
test_math_trunc(3.82664834200003e+307);
test_math_trunc(-455);
test_math_trunc("K4QQS");
test_math_trunc(-805);
test_math_trunc("PPM4C3X9B");
test_math_trunc(842);
test_math_trunc(1.163930269274203e+308);
test_math_trunc(584);
test_math_trunc("TLS");
test_math_trunc(1.6858686880818738e+307);
test_math_trunc(2.577820717844647e+307);
test_math_trunc(334);
test_math_trunc(9.59105368401937e+307);
test_math_trunc("MGZ23NQZEJ");
test_math_trunc(432);
test_math_trunc("FYWA");
test_math_trunc(-591);
test_math_trunc("ODO296");
test_math_trunc(-341);
test_math_trunc(-653);
test_math_trunc(7.732690699990623e+307);
test_math_trunc(442);
test_math_trunc("KUKQ1E");
test_math_trunc("FU3836N7");
test_math_trunc(-761);
test_math_trunc(9.788594794627787e+307);
test_math_trunc(1.4226653428779895e+308);
test_math_trunc(202);
test_math_trunc(632);
test_math_trunc(-441);
test_math_trunc("B2DGHUBRP");
test_math_trunc(1.6881600459327132e+308);
test_math_trunc(566);
test_math_trunc("XCGP");
test_math_trunc(6.078996627702399e+307);
test_math_trunc(1.644542479564559e+308);
test_math_trunc(1.4910765709339525e+308);
test_math_trunc("8RB9MK53");
test_math_trunc("SR2");
test_math_trunc(-795);
test_math_trunc(-639);
test_math_trunc("36Y3");
test_math_trunc(2.3654337468656967e+307);
test_math_trunc(552);
test_math_trunc(-709);
test_math_trunc(8.434225899257914e+307);
test_math_trunc("YUDPRF");
test_math_trunc(330);
test_math_trunc(414);
test_math_trunc(7.23305158674035e+307);
test_math_trunc(490);
test_math_trunc(1.3464403542569639e+308);
test_math_trunc(-117);
test_math_trunc(1.1782297930409767e+308);
test_math_trunc("CS20YI84HD");
test_math_trunc(9.20738186095027e+307);
test_math_trunc("0P28BTXN");
test_math_trunc(1.4167774620282547e+308);
test_math_trunc(1.4771573751511322e+308);
test_math_trunc(1.0518549590630723e+308);
test_math_trunc("John's cat");
test_math_trunc(1.7861534662927304e+308);
test_math_trunc("6Y70TC9O");
test_math_trunc(2.0530395944593687e+307);
test_math_trunc(-75);
test_math_trunc(-399);
test_math_trunc(756);
test_math_trunc("0Q10E");
test_math_trunc(-673);
test_math_trunc("UHKU1EOVKF");
test_math_trunc(1.468106479880434e+308);
test_math_trunc(-669);
test_math_trunc(-667);
test_math_trunc("1PPMSSYIY");
test_math_trunc(2);
test_math_trunc("CZV6TAPVV0");
test_math_trunc("1GF0HJ");
test_math_trunc("TCF4VHR1U6");
test_math_trunc(7.294747092293342e+307);
test_math_trunc("52L");
test_math_trunc("JBO");
test_math_trunc(1.512595695686991e+308);
test_math_trunc(6.36503744647058e+307);
test_math_trunc(1.374088297647724e+308);
test_math_trunc("RG14PWRVYF");
test_math_trunc("3YRJWN6HB");
test_math_trunc(7.525797325458918e+307);
test_math_trunc("9YR43NRW5");
test_math_trunc(-939);
test_math_trunc("C92");
test_math_trunc(-535);
test_math_trunc("M9NKA1S19B");
test_math_trunc("ZSCYP3YBM");
test_math_trunc(-251);
test_math_trunc(-835);
test_math_trunc(180);
test_math_trunc(1.4936383747944427e+308);
test_math_trunc(1.522526020957111e+308);
test_math_trunc(3.4626135144351973e+307);
test_math_trunc(6.482060021392358e+307);
test_math_trunc("55H4UXB");
test_math_trunc("L0IZP");
test_math_trunc(1.0037083406073304e+308);
test_math_trunc(-697);
test_math_trunc(4.137704963444624e+307);
test_math_trunc(1.1086748851142842e+308);
test_math_trunc(1.5926554301166708e+308);
test_math_trunc("EUR530M4");
test_math_trunc(604);
test_math_trunc("AP6");
test_math_trunc(3.4476444532167986e+307);
test_math_trunc("TMCH");
test_math_trunc(9.55325906057301e+307);
test_math_trunc(1.04085211477353e+308);
test_math_trunc(1.5484151293707044e+308);
test_math_trunc(1.4783249452078242e+307);
test_math_trunc(1.4409782903013368e+308);
test_math_trunc("A3Z1IBCGJB");
test_math_trunc("KAOU");
test_math_trunc("E5S1RUP");
test_math_trunc("W1GY");
test_math_trunc("AYLQX");
test_math_trunc(142);
test_math_trunc(9.593657052835947e+307);
test_math_trunc(4.4296763657772206e+306);
test_math_trunc("019M");
test_math_trunc("X0S");
test_math_trunc(4.92780960276812e+307);
test_math_trunc(190);
test_math_trunc(-797);
test_math_trunc(7.67581720812227e+307);
test_math_trunc(288);
test_math_trunc(-15);
test_math_trunc(1.117355463090248e+308);
test_math_trunc("L99");
test_math_trunc("HMAI0");
test_math_trunc(-133);
test_math_trunc("61I");
test_math_trunc("P4D6U0RSD3");
test_math_trunc("NJ6K590F0");
test_math_trunc(4.0530199004422963e+307);
test_math_trunc(1.612982145503096e+308);
test_math_trunc(-273);
test_math_trunc("LXT3I");
test_math_trunc(1.3007840162981014e+308);
test_math_trunc(5.913762304586115e+306);
test_math_trunc(4.280553667960757e+307);
test_math_trunc(5.463593773685196e+307);
test_math_trunc(5.990047473195235e+307);
test_math_trunc(8.160531417198545e+307);
test_math_trunc("3SWX");
test_math_trunc("DWBBU2");
test_math_trunc(1.3019299554298287e+308);
test_math_trunc(1.0937604480932378e+308);
test_math_trunc("UA0QF6USH");
test_math_trunc(3.9855291078333847e+307);
test_math_trunc(-53);
