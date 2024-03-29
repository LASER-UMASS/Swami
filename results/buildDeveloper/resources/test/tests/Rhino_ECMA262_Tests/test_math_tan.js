/*
* This file is automatically generated by Swami
*
* 2019-01-09 23:18:58.011909
*/




startTest();

/*
*
*	ABSTRACT FUNCTIONS IMPELEMTED USING DESCRIPTION FROM ECMA-262 
*
*/

function RequireObjectCoercible(argument){
        if (typeof argument == "undefined" || typeof argument == "null")
                throw new TypeError("TypeError in RequireObjectCoercible")
        else
                return argument
}

function ToString(argument){
        if (typeof argument == "undefined")
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
        if (typeof argument == 'undefined' || typeof argument == 'null')
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
function Get(argument, property){
	return argument
}
function SameValueZero(x,y){
	return x===y
}
/*TEST TEMPLATE GENERATED AUTOMATICALLY*/
function test_math_tan(x){
	if (Object.is( x,NaN )){
		var output = Math.tan(x);
		new TestCase("math_tan", "math_tan", NaN, output);
		test();
		return;
		}
	if (Object.is( x,+ 0 )){
		var output = Math.tan(x);
		new TestCase("math_tan", "math_tan", + 0, output);
		test();
		return;
		}
	if (Object.is( x,-0 )){
		var output = Math.tan(x);
		new TestCase("math_tan", "math_tan", -0, output);
		test();
		return;
		}
	if (( x === + Infinity || x === -Infinity )){
		var output = Math.tan(x);
		new TestCase("math_tan", "math_tan", NaN, output);
		test();
		return;
		}
}



/*TESTS GENERATED AUTOMATICALLY*/
test_math_tan(/[\u0400-\u04FF]+/g);
test_math_tan(1.166588619184714e+308);
test_math_tan(true);
test_math_tan("JHVBTPT");
test_math_tan(-0);
test_math_tan("BF1F");
test_math_tan(4.645493645396766e+307);
test_math_tan("LE6U8Z2");
test_math_tan(-829);
test_math_tan(-479);
test_math_tan(/ab+c/);
test_math_tan(false);
test_math_tan("HDR4JW");
test_math_tan(-559);
test_math_tan(-401);
test_math_tan(/(\w+)\s(\w+)/);
test_math_tan(1.3293589959717833e+308);
test_math_tan("KQILDSAVK0");
test_math_tan("93E7LTVK8D");
test_math_tan("CZX5V");
test_math_tan(-517);
test_math_tan(NaN);
test_math_tan(-995);
test_math_tan(6.138915720043134e+307);
test_math_tan(-255);
test_math_tan(/yes[^]*day/);
test_math_tan(6.549448150680319e+307);
test_math_tan("9GO4TECWCU");
test_math_tan(5.095945007306349e+306);
test_math_tan("2BZ9U2R");
test_math_tan(-549);
test_math_tan(1.585425637413021e+308);
test_math_tan(4.669661964136691e+307);
test_math_tan(/[^.]+/);
test_math_tan(undefined);
test_math_tan(Infinity);
test_math_tan(-703);
test_math_tan("S9T2H");
test_math_tan(/foo/g);
test_math_tan(-293);
test_math_tan(1.3402083824203812e+308);
test_math_tan(3.5594020151903053e+307);
test_math_tan(7.836604541537887e+307);
test_math_tan(6.257434756176901e+307);
test_math_tan("0H7IAVDZ");
test_math_tan(-67);
test_math_tan(7.268982540998348e+307);
test_math_tan(1.1172540709468551e+308);
test_math_tan(1.1473424739374408e+308);
test_math_tan(3.28847282268423e+307);
test_math_tan(7.208866046391898e+307);
test_math_tan(-361);
test_math_tan(918);
test_math_tan(1.6953621443169694e+308);
test_math_tan(/\r\n|\r|\n/);
test_math_tan("VVTHR");
test_math_tan("94EWEOP");
test_math_tan(1.6102400521130127e+308);
test_math_tan("G6B");
test_math_tan(+0);
test_math_tan(-671);
test_math_tan(null);
test_math_tan("OZ9TG");
test_math_tan(7.687010150767957e+307);
test_math_tan("WGJXDK79M1");
test_math_tan(-371);
test_math_tan("SR4");
test_math_tan(-739);
test_math_tan(8.169887658769667e+307);
test_math_tan(-927);
test_math_tan(1.415948494207206e+308);
test_math_tan("WJC4");
test_math_tan(1.4567982549678835e+308);
test_math_tan(5.053206976817573e+307);
test_math_tan("F95W7");
test_math_tan(-381);
test_math_tan(7.489647264173387e+307);
test_math_tan(/yes.*day/);
test_math_tan(1.0372740238091263e+308);
test_math_tan("UCX3FXDQ");
test_math_tan(-247);
test_math_tan("IOE");
test_math_tan(-359);
test_math_tan(-321);
test_math_tan(-835);
test_math_tan(-41);
test_math_tan(-941);
test_math_tan("X48");
test_math_tan(1.482628214809087e+308);
test_math_tan(8.072704255644744e+307);
test_math_tan(4.243804940469231e+307);
test_math_tan(-825);
test_math_tan("15QA69MB");
test_math_tan("RHH1LF7FG6");
test_math_tan("PW97FT5UZ");
test_math_tan("L84NUI");
test_math_tan(1.449205179628893e+307);
test_math_tan(-749);
test_math_tan(1.0676585052469385e+308);
test_math_tan("KI9VZUZ");
test_math_tan(1.0797349453730453e+308);
test_math_tan(-343);
test_math_tan(-615);
test_math_tan(-81);
test_math_tan(9.588487383235034e+307);
test_math_tan(-59);
test_math_tan(8.918024090091083e+306);
test_math_tan("KNQM");
test_math_tan(6.0553677422833204e+305);
test_math_tan("9J8JHEY22");
test_math_tan(1.4909033506880522e+308);
test_math_tan(-921);
test_math_tan(-757);
test_math_tan(-323);
test_math_tan("JMGT91A");
test_math_tan(-127);
test_math_tan(-495);
test_math_tan(-777);
test_math_tan(-267);
test_math_tan(5.384581817445654e+307);
test_math_tan(3.5208203004046344e+307);
test_math_tan(1.6308246902091725e+308);
test_math_tan(-75);
test_math_tan(9.48069428446716e+307);
test_math_tan("22XW");
test_math_tan(9.892145549181994e+307);
test_math_tan(1.0192185611414364e+308);
test_math_tan(6.459675849485601e+307);
test_math_tan(7.229461607107324e+307);
test_math_tan(7.263944080518914e+306);
test_math_tan("WC4MX5Y987");
test_math_tan("DAWA");
test_math_tan(6.102670382614265e+307);
test_math_tan(1.1006251221544445e+308);
test_math_tan(-7);
test_math_tan(1.4326158474163782e+307);
test_math_tan("28OKE230I");
test_math_tan(1.5315492066532168e+308);
test_math_tan(-23);
test_math_tan(2.3389415230399806e+307);
test_math_tan(-869);
test_math_tan(-441);
test_math_tan(9.236341625939945e+307);
test_math_tan(4.073094512182833e+307);
test_math_tan(1.1765572375226573e+308);
test_math_tan(1.336353576310251e+308);
test_math_tan(1.6473655800586165e+308);
test_math_tan("VUF936");
test_math_tan(1.2237169319551013e+308);
test_math_tan("1N01FLZ");
test_math_tan(9.28009588492083e+306);
test_math_tan(1.5534189964542386e+308);
test_math_tan(1.3827876830230255e+308);
test_math_tan(7.098339823696581e+306);
test_math_tan(-581);
test_math_tan("LV0");
test_math_tan("T38GGLF3E");
test_math_tan(-521);
test_math_tan(-663);
test_math_tan(-179);
test_math_tan("5H48GVVG5");
test_math_tan("7APV3VI96");
test_math_tan(-529);
test_math_tan("6F7LGRDN");
test_math_tan("LQ4ZFP3C");
test_math_tan("2D69T8T5");
test_math_tan(6.105108215599906e+307);
test_math_tan(-789);
test_math_tan(5.633420228161057e+307);
test_math_tan("81VOF");
test_math_tan("1B8D2");
test_math_tan("651HS41ZK6");
test_math_tan(-235);
test_math_tan("EPJH31V8");
test_math_tan(-823);
test_math_tan("O7822N511");
test_math_tan("ZSU25");
test_math_tan(-833);
test_math_tan(-351);
test_math_tan(-675);
test_math_tan("7LBVFJ");
test_math_tan(-115);
test_math_tan(9.446760888372823e+307);
test_math_tan("TWWEUC");
test_math_tan("UHX3Z8S");
test_math_tan(-867);
test_math_tan(3.449498084637893e+307);
test_math_tan(1.4572763105614473e+308);
test_math_tan(-977);
test_math_tan("BH4");
test_math_tan("6QXXQ6F");
test_math_tan(4.2939174449178624e+307);
test_math_tan(4.042764397832677e+307);
test_math_tan("2ESDC");
test_math_tan(6.72384563016586e+307);
test_math_tan("7WJVKS5");
test_math_tan("Z2M2E20");
test_math_tan(4.706977067157905e+307);
test_math_tan(1.293506629651331e+308);
test_math_tan("KBSO");
test_math_tan(-125);
test_math_tan("8W66");
test_math_tan(9.882538315165222e+307);
test_math_tan("I6O20ROG");
test_math_tan("WNTEF");
test_math_tan("3DYVO");
test_math_tan(-1);
test_math_tan(-209);
test_math_tan("RNRIOG1A");
test_math_tan(-583);
test_math_tan(-475);
test_math_tan(-891);
test_math_tan("IXKS9");
test_math_tan("YVSFW");
test_math_tan(320);
test_math_tan(-339);
test_math_tan("KU5K");
test_math_tan(1.4402264709009097e+308);
test_math_tan("N77XDV5E9");
test_math_tan("5K94D");
test_math_tan(1.409389006406736e+307);
test_math_tan(-539);
test_math_tan(1.5537563442455932e+307);
test_math_tan(-489);
test_math_tan("AD33C");
test_math_tan(-153);
test_math_tan(-503);
test_math_tan(1.2929182575409388e+308);
test_math_tan(1.7907295729494868e+308);
test_math_tan("KIYR");
test_math_tan("U80YA3I");
test_math_tan(-437);
test_math_tan(1.5220476628890492e+308);
test_math_tan(1.659884423218689e+307);
test_math_tan(-509);
test_math_tan(-997);
test_math_tan(6.919457750773467e+307);
test_math_tan("MKHO");
test_math_tan(1.5121946374714766e+308);
test_math_tan(-481);
test_math_tan(8.030871296031762e+307);
test_math_tan("WPDL3EA");
test_math_tan(1.2888864090491333e+307);
test_math_tan(1.6906880469477192e+308);
test_math_tan("SKBSTT5FVJ");
test_math_tan("RYR");
test_math_tan(-297);
test_math_tan(1.0412675733977561e+308);
test_math_tan(5.037663335132278e+307);
test_math_tan(-715);
test_math_tan(-933);
test_math_tan(1.7143341498681772e+308);
test_math_tan(-289);
test_math_tan("UHUCEQOGF");
test_math_tan("LP8KC0BKY");
test_math_tan(-5);
test_math_tan(4.157267221048687e+307);
test_math_tan(2.2821427879318693e+306);
test_math_tan(-915);
test_math_tan(1.695479384463776e+308);
test_math_tan(9.490197333822653e+307);
test_math_tan("HUOM323S");
test_math_tan(-729);
test_math_tan(-159);
test_math_tan(-79);
test_math_tan("84I9EU");
test_math_tan(3.525189092469116e+307);
test_math_tan("P7QQ2ST1D7");
test_math_tan("4RG23");
test_math_tan("R57X7U0");
test_math_tan(-783);
test_math_tan(-431);
test_math_tan(-607);
test_math_tan(1.1752202159436012e+308);
test_math_tan(9.270254864755564e+307);
test_math_tan("P0XJ3D4P3");
test_math_tan(1.4042834525679737e+308);
test_math_tan("89GPY");
test_math_tan("K4D4KR");
test_math_tan(-387);
test_math_tan("FRPWXF");
test_math_tan(3.7234994672728497e+307);
test_math_tan(-545);
test_math_tan(-423);
test_math_tan(9.19949963434163e+307);
test_math_tan(1.4629207334131007e+308);
test_math_tan(-77);
test_math_tan(1.1186840688179181e+307);
test_math_tan("O27P4D0Q");
test_math_tan("E7J669FL7V");
test_math_tan(1.0426976198828847e+308);
test_math_tan(-51);
test_math_tan("LCQ4NO4D");
test_math_tan(1.3350394614785132e+308);
test_math_tan("J7XP5GS");
test_math_tan("D7XRR4");
test_math_tan("TQDLFI");
test_math_tan("8BAYS1T0");
test_math_tan("8PCOQ7XE4");
test_math_tan(1.738742924844469e+308);
test_math_tan(1.2668489801029592e+308);
test_math_tan(5.372879814609048e+307);
test_math_tan(7.601246992588298e+307);
test_math_tan("P7XNNED");
test_math_tan(-813);
test_math_tan(4.900193282524473e+307);
test_math_tan(1.9600454121840585e+307);
test_math_tan(4.623131711644497e+307);
test_math_tan("YJ7USNQ");
test_math_tan("RCB098I3A");
test_math_tan("UBCN");
test_math_tan("LRVDA1FA");
test_math_tan("D0GDEGJC");
test_math_tan(1.3111162020616677e+308);
test_math_tan(-341);
test_math_tan(-29);
test_math_tan(-499);
test_math_tan(-391);
test_math_tan(-33);
test_math_tan("RX4CO");
test_math_tan(-149);
test_math_tan(5.451902193577286e+307);
test_math_tan("UBUH1L0");
test_math_tan(4.1027999395005385e+307);
test_math_tan(-465);
test_math_tan(1.4615107615759908e+308);
test_math_tan("8U4");
test_math_tan(7.03087996404905e+307);
test_math_tan("IXGSHLD");
test_math_tan(1.3308308111845128e+308);
test_math_tan(1.0950820426898535e+306);
test_math_tan(1.0132382647617108e+308);
test_math_tan(1.7108741138436894e+307);
test_math_tan("6LFB7WT7");
test_math_tan(-839);
test_math_tan("DH6");
test_math_tan("29DU");
test_math_tan(-111);
test_math_tan(-979);
test_math_tan("TNI70X");
test_math_tan(-273);
test_math_tan(-269);
test_math_tan(1.6967827770489744e+308);
test_math_tan(1.2213269162966886e+308);
test_math_tan(-147);
test_math_tan(-169);
test_math_tan(-919);
test_math_tan(1.3166055941587496e+308);
test_math_tan("RJ2S2RMF");
test_math_tan(-593);
test_math_tan("LZL7N0");
test_math_tan(-25);
test_math_tan("C9N");
test_math_tan("0OOPK");
test_math_tan(-257);
test_math_tan("CWI");
test_math_tan(1.52702409183523e+308);
test_math_tan(-97);
test_math_tan(1.038178746023227e+308);
test_math_tan(1.0906401072621013e+307);
test_math_tan(2.399528082413426e+307);
test_math_tan("92ZM3");
test_math_tan("SC1YP");
test_math_tan("EIF1RKG");
test_math_tan("Q9UWA26ED");
test_math_tan("9YQZKK");
test_math_tan(8.69368738593385e+307);
test_math_tan(1.716457397616908e+308);
test_math_tan(-735);
test_math_tan("B5I6");
test_math_tan(-505);
test_math_tan(-787);
test_math_tan("A1E1PGAI8X");
test_math_tan(1.5822312958377707e+308);
test_math_tan(-385);
test_math_tan("JSXYWIC");
test_math_tan("L4L");
test_math_tan("T2BSRFCN2Q");
test_math_tan(1.2475057801991575e+308);
test_math_tan(1.0728454549352193e+308);
test_math_tan(1.1856972623116017e+308);
test_math_tan("BS5DHH");
test_math_tan(-17);
test_math_tan(-961);
test_math_tan(1.146173794715892e+308);
test_math_tan("J6NU8");
test_math_tan(1.1718200638436705e+308);
test_math_tan(-667);
test_math_tan("GPH8JPA");
test_math_tan(1.307573101208012e+308);
test_math_tan(-185);
test_math_tan("II9009YQKJ");
test_math_tan(1.364951990167278e+308);
test_math_tan("I6CY");
test_math_tan(7.700352580672103e+307);
test_math_tan(-245);
test_math_tan(6.010726947317933e+307);
test_math_tan(-751);
test_math_tan(7.089474589649852e+307);
test_math_tan("4F7T0G46");
test_math_tan(-357);
test_math_tan("KR6XP");
test_math_tan(-137);
test_math_tan(1.651657778647528e+306);
test_math_tan(4.218944434029448e+307);
test_math_tan("URMM98S4CF");
test_math_tan(1.5142011589368184e+308);
test_math_tan(1.2913550284891314e+308);
test_math_tan("X3MUOQS9");
test_math_tan("RAJRR");
test_math_tan("DSYS");
test_math_tan(-471);
test_math_tan(1.41700879006757e+308);
test_math_tan(4.0565889869150674e+307);
test_math_tan(-795);
test_math_tan(6.414532930963004e+307);
test_math_tan(6.382358948855278e+307);
test_math_tan(-303);
test_math_tan(1.1423665401789645e+306);
test_math_tan("I9VXLQDBY");
test_math_tan("M1YR5L");
test_math_tan("ZT8I");
test_math_tan(-537);
test_math_tan("1MZI347AI5");
test_math_tan("Q3YGY7FI5");
test_math_tan(9.567377288226325e+307);
test_math_tan("9GKOQX7K");
test_math_tan(-799);
test_math_tan("JVV");
test_math_tan(4.4414807065666133e+307);
test_math_tan("BH4RQENS");
test_math_tan("DPIUDM");
test_math_tan(3.355353010547214e+307);
test_math_tan("8AARQ2J83Y");
test_math_tan(-765);
test_math_tan("IIZKR");
test_math_tan("2NZ9OK3TW");
test_math_tan(3.0814260954847475e+306);
test_math_tan(1.1492904374027254e+308);
test_math_tan(1.2053959238845503e+306);
test_math_tan("ZIT");
test_math_tan(1.0575143226766134e+308);
test_math_tan(1.7536455750292887e+308);
test_math_tan(5.11384200999163e+307);
test_math_tan(-87);
test_math_tan(3.9220642262219443e+307);
test_math_tan(1.1280338860641664e+308);
test_math_tan("138HMA");
test_math_tan("MQFB8K51J6");
test_math_tan(-89);
test_math_tan(-603);
test_math_tan("55X7W5T");
test_math_tan("A0L");
test_math_tan(-19);
test_math_tan("76Z9");
test_math_tan(3.134776118160841e+307);
test_math_tan(1.539347818763023e+308);
test_math_tan("Q5LF");
test_math_tan("MRG");
test_math_tan(-429);
test_math_tan("T4U367QRM");
test_math_tan("4WEPVH");
test_math_tan(1.333004755412233e+308);
test_math_tan(2.6057654074645356e+307);
test_math_tan("CXECVII");
test_math_tan(5.528916049301806e+307);
test_math_tan(-415);
test_math_tan(4.715107442913913e+306);
test_math_tan("N3HJ");
test_math_tan("QEE");
test_math_tan(1.7101476083249266e+308);
test_math_tan("Y9M4");
test_math_tan(1.7827776514474622e+308);
test_math_tan(9.061089626376486e+306);
test_math_tan("4MYOSKZV2H");
test_math_tan(9.044529285498832e+307);
test_math_tan(-973);
test_math_tan(4.86561830827774e+307);
test_math_tan(6.311161608914521e+307);
test_math_tan(1.7632805190474184e+308);
test_math_tan(-3);
test_math_tan("D9MUSI7G");
test_math_tan("61CT");
test_math_tan("N34LK65VU");
test_math_tan(1.7362520052373587e+308);
test_math_tan(-141);
test_math_tan("PXMREUJ8W");
test_math_tan(8.823845943191345e+307);
test_math_tan("XDDK");
test_math_tan(-173);
test_math_tan(-865);
test_math_tan(-653);
test_math_tan(5.442683145907198e+307);
test_math_tan(1.7494109723625726e+307);
test_math_tan(6.520824741434637e+307);
test_math_tan(-619);
test_math_tan(-627);
test_math_tan(-913);
test_math_tan(1.5690896207877732e+308);
test_math_tan(1.5219968931014789e+308);
test_math_tan(1.8038229371045465e+307);
test_math_tan(-809);
test_math_tan(-881);
test_math_tan("DO29");
test_math_tan("V2IOW");
test_math_tan(-803);
test_math_tan(-743);
test_math_tan(2.1970161519535685e+307);
test_math_tan(3.147784401430412e+307);
test_math_tan("HL8RR");
test_math_tan(4.6316587085404e+307);
test_math_tan(9.259270642536849e+307);
test_math_tan(-491);
test_math_tan("HU4AK");
test_math_tan("N878Q");
test_math_tan(1.7945721429371351e+308);
test_math_tan(3.4575465005473927e+307);
test_math_tan(6.3044487224525e+307);
test_math_tan("DSKGCUJZO");
test_math_tan(1.050321378933551e+308);
test_math_tan(1.0961867688301942e+308);
test_math_tan("4OL6NW1MY");
test_math_tan("TGL");
test_math_tan("EYVRH0");
test_math_tan(-847);
test_math_tan(-887);
test_math_tan(-263);
test_math_tan(-325);
test_math_tan(2.281912473231081e+307);
test_math_tan("2ZX6FE");
test_math_tan(7.476472793602736e+307);
test_math_tan("0N35");
test_math_tan("EL8HQODB");
test_math_tan(9.866429383431194e+306);
test_math_tan(1.6230615695468356e+308);
test_math_tan(7.483108488469014e+307);
test_math_tan(6.7220823619723935e+307);
test_math_tan("IOWMZI9XP");
test_math_tan(1.378892826728625e+308);
test_math_tan("G6UYN");
test_math_tan(-271);
test_math_tan(1.244315300108748e+308);
test_math_tan(-877);
test_math_tan("4P126WCJIK");
test_math_tan(8.465999520023355e+306);
test_math_tan("U53MI5T");
test_math_tan("AL42F2N1CZ");
test_math_tan("PUC");
test_math_tan("8N0GGML6");
test_math_tan(1.7589747294258036e+307);
test_math_tan(-937);
test_math_tan(-15);
test_math_tan(7.986670729089977e+307);
test_math_tan(7.548839666874887e+307);
test_math_tan(-827);
test_math_tan(-755);
test_math_tan(1.0245109653165185e+308);
test_math_tan("5FU879PQK8");
test_math_tan(7.405626139696749e+307);
test_math_tan(-719);
test_math_tan("EYGQL");
test_math_tan(6.649537502220293e+307);
test_math_tan(-685);
test_math_tan(1.1226281420877981e+308);
test_math_tan("I8ZK71");
test_math_tan(1.0090892722927994e+308);
test_math_tan(1.5560173354895397e+308);
test_math_tan("XTP");
test_math_tan("ECJDYR");
test_math_tan("YSHU6J953");
test_math_tan("VTS1LCD6P5");
test_math_tan(8.655282237345128e+307);
test_math_tan(1.6214076386400357e+308);
test_math_tan(-531);
test_math_tan(-859);
test_math_tan(7.978654721068469e+307);
test_math_tan(-403);
test_math_tan("JZB0TY5MM");
test_math_tan("LJTX9PLI7G");
test_math_tan(9.78310166192571e+307);
test_math_tan(4.45002133507329e+307);
test_math_tan(6.60875506509087e+307);
test_math_tan(1.6252946469083764e+308);
test_math_tan(1.3195262675432023e+308);
test_math_tan("N1V3");
test_math_tan(9.655890348175138e+307);
test_math_tan("LH9OJ5W2X");
test_math_tan(2.645692929969474e+307);
test_math_tan("FFERDU");
test_math_tan(-923);
test_math_tan(5.192223907666526e+307);
test_math_tan("U0RJL94");
test_math_tan(-633);
test_math_tan(1.0355308853264212e+308);
test_math_tan("LDM");
test_math_tan(-983);
test_math_tan(1.533676869591978e+308);
test_math_tan("K2OPL");
test_math_tan("XTF6X2W9");
test_math_tan(-83);
test_math_tan(8.24195416516995e+307);
test_math_tan(-949);
test_math_tan(-363);
test_math_tan(9.714852468179539e+307);
test_math_tan(7.93467622303997e+307);
test_math_tan(-455);
test_math_tan(-515);
test_math_tan(7.222369205350421e+307);
test_math_tan("ATUZRMV6U");
test_math_tan(-911);
test_math_tan(-677);
test_math_tan(-375);
test_math_tan(-679);
test_math_tan(1.689904790483645e+308);
test_math_tan("LIE5PQOKJA");
test_math_tan("QMW66RGTE");
test_math_tan(1.246389267071233e+308);
test_math_tan(1.2221290407035747e+308);
test_math_tan(-939);
test_math_tan("FEZPAZDY");
test_math_tan(5.094478163673321e+307);
test_math_tan(1.980302820024796e+306);
test_math_tan("TXM");
test_math_tan("17RTSDA");
test_math_tan("5VLE550");
test_math_tan(-287);
test_math_tan(6.742526939739962e+306);
test_math_tan("ZL62S5");
test_math_tan(6.753591433582835e+306);
test_math_tan(2.3343451408871286e+307);
test_math_tan("C88NQU8");
test_math_tan("QOMY2X46EY");
test_math_tan("GK461C88");
test_math_tan(-613);
test_math_tan(8.451133055094689e+307);
test_math_tan(1.2539303252250692e+308);
test_math_tan(4.402680552123203e+307);
test_math_tan(1.6231664120168214e+308);
test_math_tan(1.3128684399338796e+308);
test_math_tan(-649);
test_math_tan(9.480007397980334e+307);
test_math_tan("OTMCBYJ3R");
test_math_tan("AGOMRE3");
test_math_tan("RKE2VW535G");
test_math_tan("3JSQ23THN8");
test_math_tan("1MYMESNA");
test_math_tan(4.205567130388317e+307);
test_math_tan(-551);
test_math_tan(6.303448947638031e+307);
test_math_tan(-345);
test_math_tan("G7P44");
test_math_tan("CSR6");
test_math_tan("VBSYC");
test_math_tan(-129);
test_math_tan(1.0169795636469889e+308);
test_math_tan(6.963047583875914e+307);
test_math_tan(5.077006752487532e+307);
test_math_tan(-645);
test_math_tan("EAI");
test_math_tan("8E3ZMMMG2W");
test_math_tan(6.450105221337796e+307);
test_math_tan(4.8820175957230425e+305);
test_math_tan("3JY3XTK");
test_math_tan(1.0727668852718682e+308);
test_math_tan("L4FRY9");
test_math_tan(1.0724996220271787e+308);
test_math_tan("KRM70MNLLF");
test_math_tan("5DR9WVRM");
test_math_tan("DME6LMHSE");
test_math_tan(-205);
test_math_tan(-301);
test_math_tan(1.581507859608948e+308);
test_math_tan("SYV3R");
test_math_tan(3.1417611467210173e+307);
test_math_tan(1.2471801569258084e+308);
test_math_tan(-165);
test_math_tan(-573);
test_math_tan("MYIZZPYA8");
test_math_tan(-991);
test_math_tan("I4EXLW0");
test_math_tan(-443);
test_math_tan("YC9N0BS2K");
test_math_tan(4.45272345357629e+307);
test_math_tan(-219);
test_math_tan("G8FW");
test_math_tan("M9DPTPRL3");
test_math_tan(-365);
test_math_tan(5.318037650371339e+307);
test_math_tan("Y9MKKPUTQJ");
test_math_tan(4.7512115684519873e+306);
test_math_tan("NLBVKRN1");
test_math_tan(3.499977887750729e+307);
test_math_tan("M4JDKW");
test_math_tan(1.0972205879699604e+308);
test_math_tan("BX1Q18CB");
test_math_tan(-695);
test_math_tan(9.581715221186993e+307);
test_math_tan(6.287433184112969e+307);
test_math_tan(-45);
test_math_tan(-47);
test_math_tan(1.494522988158014e+308);
test_math_tan(6.935208711646262e+307);
test_math_tan(1.4947834684897586e+308);
test_math_tan("7VGCSSF2");
test_math_tan(-905);
test_math_tan(6.379246388428369e+307);
test_math_tan("0KUIG");
test_math_tan(-651);
test_math_tan(-689);
test_math_tan("CMG33");
test_math_tan("8I4");
test_math_tan(4.918514972791149e+307);
test_math_tan("TMCMHP1N");
test_math_tan("VJE52NNC");
test_math_tan(-889);
test_math_tan("0I4IA0I09");
test_math_tan(3.3094335429154805e+307);
test_math_tan("bar");
test_math_tan("9SWNZF0");
test_math_tan(1.1545458782404102e+308);
test_math_tan("02UD2ZB5T");
test_math_tan("PB2H4AX");
test_math_tan(4.424319610929725e+307);
test_math_tan("84HVJN2");
test_math_tan(-487);
test_math_tan("WEO9O");
test_math_tan("D8LGK8UM");
test_math_tan(1.1488865174054703e+308);
test_math_tan("6L52");
test_math_tan(1.6760486036264277e+308);
test_math_tan(1.3399426462444442e+308);
test_math_tan("ZWJNBQ4LA");
test_math_tan("SN5WYO");
test_math_tan(-591);
test_math_tan("ILWE6");
test_math_tan("0CYH72KY");
test_math_tan(1.6783799696718413e+308);
test_math_tan(9.118523336809331e+307);
test_math_tan(3.570426637927148e+307);
test_math_tan(1.0875009157406499e+308);
test_math_tan(-123);
test_math_tan(-211);
test_math_tan(-43);
test_math_tan(2.2929183991502696e+307);
test_math_tan(1.211787924588821e+308);
test_math_tan(5.150270556321279e+307);
test_math_tan(1.3572364596878243e+308);
test_math_tan(1.662776167914608e+308);
test_math_tan(-629);
test_math_tan(-485);
test_math_tan(3.2513240199648984e+307);
test_math_tan(5.215730464833179e+307);
test_math_tan(-771);
test_math_tan("MNYMBW");
test_math_tan(-781);
test_math_tan("GDN6I04O");
test_math_tan("H8DRU");
test_math_tan("VC5CPA");
test_math_tan(-897);
test_math_tan("BQC4E2");
test_math_tan(6.024409182410708e+307);
test_math_tan("DCYOU");
test_math_tan(3.787649478284831e+307);
test_math_tan("CSQMA");
test_math_tan(1.0205453851393491e+308);
test_math_tan(-335);
test_math_tan(-277);
test_math_tan(1.6161544289066117e+308);
test_math_tan(-763);
test_math_tan("K1DNB");
test_math_tan(9.493288976140112e+307);
test_math_tan("7ZLY");
test_math_tan(8.088044851533929e+307);
test_math_tan(9.799630436718645e+307);
test_math_tan(-395);
test_math_tan(-27);
test_math_tan(1.6899384635917644e+308);
test_math_tan(-49);
test_math_tan("INTEMMT");
test_math_tan(1.6415915013482725e+308);
test_math_tan("1MLN8E4U");
test_math_tan(-469);
test_math_tan(3.895934846853867e+307);
test_math_tan(2.5744079132346683e+307);
test_math_tan(1.107833763219592e+308);
test_math_tan(1.6873958026323646e+308);
test_math_tan("HY1RV7");
test_math_tan("R91SF");
test_math_tan(1.7926106178835555e+308);
test_math_tan(1.3593357268711065e+308);
test_math_tan("0E9IA");
test_math_tan(-811);
test_math_tan("FSL2YFD");
test_math_tan(6.118373586393466e+307);
test_math_tan(5.516773561753741e+307);
test_math_tan("DKKP");
test_math_tan("WIC");
test_math_tan(1.3313029684066612e+307);
test_math_tan(1.7055639132960219e+308);
test_math_tan("133C9");
test_math_tan(4.981765615793273e+307);
test_math_tan("9LH2XN");
test_math_tan("QVSO4B");
test_math_tan(8.150240913922138e+307);
test_math_tan(4.261488616556937e+307);
test_math_tan(1.2534482847736035e+308);
test_math_tan(2.3568107991983327e+307);
test_math_tan(6.323959109684737e+307);
test_math_tan(1.18975795180313e+308);
test_math_tan(-563);
test_math_tan("PRCO9TVR9B");
test_math_tan("Z5XSOD2I8W");
test_math_tan("PVU898UE");
test_math_tan(-849);
test_math_tan(2.6280751152565914e+307);
test_math_tan("Q85D5");
test_math_tan(7.442971873184785e+307);
test_math_tan(5.086821908062182e+307);
test_math_tan(1.1289454296721947e+307);
test_math_tan(8.537071182948281e+307);
test_math_tan("HDXX1T");
test_math_tan("WAIK32G");
test_math_tan(1.3234408183828803e+308);
test_math_tan(-543);
test_math_tan(-547);
test_math_tan(2.3513923695309414e+306);
test_math_tan("9SVH5");
test_math_tan("HHJ");
test_math_tan(7.180765453488579e+307);
test_math_tan(8.138035596419637e+307);
test_math_tan(5.082015292332729e+307);
test_math_tan(9.492142301512788e+307);
test_math_tan("MQWV1BT");
test_math_tan(4.336644774514989e+307);
test_math_tan("DZ8PJ5J0");
test_math_tan(5.032116016423777e+307);
test_math_tan(1.107583830796239e+308);
test_math_tan(2.036698082181106e+307);
test_math_tan(7.902152569408313e+307);
test_math_tan(1.4915758398712452e+308);
test_math_tan(1.6529948373776351e+308);
test_math_tan(-315);
test_math_tan(-417);
test_math_tan(1.1893058450738243e+308);
test_math_tan(4.4350214449082813e+307);
test_math_tan(1.5160280937147838e+307);
test_math_tan(1.2492614433650078e+308);
test_math_tan(2.536739765067592e+307);
test_math_tan(1.6891819432113514e+308);
test_math_tan(1.4432302660444516e+308);
test_math_tan(-53);
test_math_tan("YL9QV8");
test_math_tan(1.7443901603394487e+308);
test_math_tan(-369);
test_math_tan("W1OI83NE");
test_math_tan(2.6283833902781037e+307);
test_math_tan(-987);
test_math_tan(2.5752873341815373e+307);
test_math_tan(2.582150122452372e+307);
test_math_tan("ENC2J6IY");
test_math_tan(5.155451430459079e+307);
test_math_tan("J99339HS");
test_math_tan(5.600416774974982e+307);
test_math_tan(1.6017407839602106e+308);
test_math_tan(-331);
test_math_tan("JIK7MH8");
test_math_tan(1.4641877644179223e+308);
test_math_tan(9.159361066566212e+307);
test_math_tan(1.3629311450581588e+308);
test_math_tan(5.757189514371198e+307);
test_math_tan(3.989551339849537e+307);
test_math_tan("LAIFCQY7");
test_math_tan(-807);
test_math_tan("WP5JP2R9");
test_math_tan("X4F");
test_math_tan(8.510459623224113e+307);
test_math_tan(-683);
test_math_tan(6.037055721024025e+307);
test_math_tan("F9MS6Z7W84");
test_math_tan(6.814292544410638e+307);
test_math_tan("4BKMXPSJTG");
test_math_tan(-187);
test_math_tan(-965);
test_math_tan("B0HH");
test_math_tan(1.1167674874462462e+308);
test_math_tan(4.858359615940955e+307);
test_math_tan("ACQ");
test_math_tan(-731);
test_math_tan(-241);
test_math_tan(4.751291434658816e+306);
test_math_tan("K2C3AIA");
test_math_tan("92ACG7LY7");
test_math_tan("CMPM");
test_math_tan(-239);
test_math_tan(-55);
test_math_tan("LIUZ8");
test_math_tan("BC20K0E");
test_math_tan(-989);
test_math_tan(-319);
test_math_tan("IW6O7OPR");
test_math_tan(8.923433244627597e+307);
test_math_tan("NNH5SWIIE");
test_math_tan(-473);
test_math_tan("67RJZHC");
test_math_tan(-691);
test_math_tan("QWV4ANH");
test_math_tan(8.652380146937962e+307);
test_math_tan(-483);
test_math_tan("LHV");
test_math_tan(1.6307867466935952e+308);
test_math_tan(-981);
test_math_tan(1.0477006257853509e+308);
test_math_tan(-587);
test_math_tan(1.0933678583177387e+308);
test_math_tan("7U1RB1KA4");
test_math_tan("SKCECI");
test_math_tan(-533);
test_math_tan(1.3833076118150095e+308);
test_math_tan("JZ4H");
test_math_tan(1.5443498278676043e+308);
test_math_tan("XZTR");
test_math_tan("OS2VX1NX");
test_math_tan(1.0349756349552728e+308);
test_math_tan(1.12457996685865e+308);
test_math_tan("CYG4");
test_math_tan(1.0661225477242217e+308);
test_math_tan(1.7662345444217874e+308);
test_math_tan(1.7137425889690476e+308);
test_math_tan(1.4208286537388033e+308);
test_math_tan(1.2741209352076505e+307);
test_math_tan("1MAUI78C");
test_math_tan("84I1M8JHS");
test_math_tan(1.4584714213206646e+308);
test_math_tan(2.964111300371471e+307);
test_math_tan(-883);
test_math_tan("7KWWSCS4");
test_math_tan(2.0889715505062517e+307);
test_math_tan(1.0960956204481425e+308);
test_math_tan(1.5477404776235765e+307);
test_math_tan(-901);
test_math_tan(1.575109604660881e+308);
test_math_tan(8.407932119239918e+307);
test_math_tan("YPTYCFXD1");
test_math_tan(3.1749269972556273e+307);
test_math_tan(5.27287350323137e+307);
test_math_tan("NVT019OLEL");
test_math_tan("CG2");
test_math_tan(4.4543877532808465e+307);
test_math_tan("L2DTGI0NG");
test_math_tan(1.0172323781373474e+308);
test_math_tan(-131);
test_math_tan(7.569809303217047e+307);
test_math_tan("ADN2AS3VOQ");
test_math_tan(1.553947108656851e+308);
test_math_tan(1.092746019738505e+308);
test_math_tan("X0OQ7B");
test_math_tan(4.038772490437855e+307);
test_math_tan("0T7DDUC5");
test_math_tan("IJR97");
test_math_tan(1.0995346112924073e+308);
test_math_tan(3.1502906125620525e+307);
test_math_tan(1.1494215380563252e+308);
test_math_tan("BIGM2LVO");
test_math_tan("GCZW");
test_math_tan(-377);
test_math_tan(1.6291768694999487e+308);
test_math_tan(1.5927067429732048e+308);
test_math_tan("8TTACTREI");
test_math_tan(5.982854175670259e+307);
test_math_tan(1.7921653538649835e+308);
test_math_tan("2MTG3DHNI7");
test_math_tan("W54SNMT14");
test_math_tan("S77");
test_math_tan(1.4840984883698712e+308);
test_math_tan(-585);
test_math_tan(1.4809522764999239e+308);
test_math_tan(4.219225586664949e+307);
test_math_tan("FOIT2");
test_math_tan(1.5359037525255389e+308);
test_math_tan("QGMP7O0QA");
test_math_tan("CGI");
test_math_tan(1.8425308377910122e+307);
test_math_tan("UKEMGWXL");
test_math_tan("CQW");
test_math_tan("DHH7KOP");
test_math_tan(9.895204783826321e+307);
test_math_tan(-61);
test_math_tan(7.689099818450906e+307);
test_math_tan(-259);
test_math_tan("E3SEMTB");
test_math_tan(1.1723841353365705e+308);
test_math_tan(3.85939828688931e+307);
test_math_tan("HU55");
test_math_tan(5.014306447291998e+307);
test_math_tan(3.160413862067405e+307);
test_math_tan(1.6833318098178693e+308);
test_math_tan(5.155365214741131e+307);
test_math_tan(1.1588943790140664e+308);
test_math_tan(-655);
test_math_tan("1VE");
