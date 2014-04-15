import com.sun.org.apache.xerces.internal.util.URI;

/**
 * Created with IntelliJ IDEA.
 * User: DELL
 * Date: 2/25/14
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) throws URI.MalformedURIException {
        final String mess1 = "P)P,?;STYR'?Z('-LY;PO';Z'VYZ-'LMZ(;';SP':PN(,T;?4QZN(:PO'MWLNV SZYPAML,NPWZYL\n" +
                "': LTYASP,P'L;'XZMTWP'-Z,WO'NZYR,P::\n" +
                "':TWPY;'NT,NWP'LYO'RPPV: SZYP'SL)P'U(:;'LYYZ(YNPO'XZ,P'OP;LTW:'ZY';SP'MWLNV SZYP\n" +
                "'L' SZYP'QZN(:PO'ZY':PN(,T;?'LYO' ,T)LN?\"'9MWLNV SZYP9':PPX:';Z'MP'MZ;S'L' ,ZO(N;'LYO'L'NZX LY?\n" +
                "'L:'TY';SP'NZX LY?'MWLNV SZYP'-TWW' ,Z)TOP'( OL;P:'LYO':(  Z,;'QZ,';SP' ,ZO(N;'MWLNV SZYP\"'SL)TYR'MPPY'NZQZ(YOPO'M?' STW'$TXXP,XLY\n" +
                "';SP'N,PL;Z,'ZQ' R 'P4XLTW'PYN,? ;TZY\n" +
                "';SP'NZX LY?'SL:';ZY:'ZQ':PN(,T;?';LWPY;\"'MWLNV SZYP'-L:'LYYZ(YNPO'LMZ(;'L'XZY;S'LRZ\n" +
                "'M(;';ST:'T:';SP'QT,:;';TXP'-P8,P'RP;;TYR'OP;LTW:'ZY'U(:;'-SL;';SP'MWLNV SZYP'T:'LYO'SZ-'T;'-Z,V:\"";

        final String mess2 = "NFEEPO IE OOPPPSSTE.ELSST KNASONPL ETO  WA  ICEGRAFC ESNR S  WDSBOY,CY-EI'TTORE I EULVL H\n" +
                "OPNSO KER OMVSEEORE\n" +
                "FT  RKEMV SAIC RGERP- AAEESOE  KCETTGSSRCAPP Y TR ";

        final String mess3 = "I\" L'0N 0QVWI0\"880WI3XX0'\",'! 606X\"3'90 XQ0I\"3LQ\"3X0LNX' 4W0:VT0'N:WQ\"3X$EXWWX30'N:WQ\"3X0QN!8L0I\"BX0IX81XL0WIX0,N'WJ0E!W0WIX0'N:WQ\"3X0I\"' 4W07I\" 6XL0,!7IR$$E\"37X8N \"J0'1\"V $QIV8X0WIX06\"8\"TF0'H0Q\"'0X\"'V8F0WIX0,N'W0V,1N3W\" W0WIV 60\"  N! 7XL0\"W0'\",'! 64'0,NEV8X0QN38L07N 63X''013X''0XBX WJ0WIX07N,1\" F0\"8'N0'INQXL0N::0WI3XX0 XQ0',\"3W0Q\"W7IX'R0'\",'! 60LX,NXL0WIX06X\"30)J0WIX06X\"30)0 XNJ0\" L0WIX06X\"30:VWR0WIX0(6\"8\"TF(0E3\" LV 60V'06N X0EX7\"!'X0WIX0Q\"W7IX'0 N08N 6X303! 0\" L3NVLDWIXF4BX0'QVW7IXL0WN0'\",'! 64'0WV2X 0N'R";

        final String mess4 = "$ )\"TM-Q\"( \";T !\"$ ):\"! :W\"R :\"Q-Q:$\",)Q;(U Z\n" +
                "\"UR\"$ )\"; X-Q\"(TQ\".: NXQY\"BAN$\"TMZPA0\"$ )\"TM-Q\"( \"Q?.XMUZ\"T !\"$ )\"; X-QP\"(TQ\".: NXQY\n" +
                "\"UR\"$ )\"!: (QBM\".: S:MY\"( \"; X-Q\"(TQ\".: NXQY0\"$ )\"TM-Q\"( \";)NYU(\"$ ):\"; ):OQ\"O PQ\"!U(TBMZ\"Q?.XMZM(U Z\" R\"T !\"$ )\");QP\"U(\"( \"; X-Q\"(TQ\".: NXQY\n" +
                "\"$ )\"Y);(\"!:U(Q\"B$ ):\" !Z\".: S:MY;1\"$ )\"OMZZ (\"P !ZX MP\"; R(!M:Q\"R: Y\"(TQ\"UZ(Q:ZQ(\" :\"BAN :: !A\"; ):OQ\"O PQ\"R: Y\" (TQ:\";()PQZ(;\n" +
                "\".XMSUM:U;Y\":)XQ;\"!UXX\"NQ\"M..XUQPB-Q:$\";(:UO(X$\"UZ\"(TQ\"YM:WUZS\" R\"(TU;\"M;;USZYQZ(\n";

        final String mess5 = "R;F\n" +
                "CR6T44)DZ4ZZ8439(EIZ?B8K\"WYQK\")OK'MR$H$30AJJKS,B0;9ASLW;5WHZI.LU 8PD44-0PB36Z\n" +
                "LM3C(-ONTO)\n" +
                "C9\"9L-2CXP WY;\"!-)5;F7\n" +
                "I!E0\":D\"R0!;SWHX,9')NF4 ;6,LO 'U0\"K\n" +
                "G4YLS\"U)IOP3C:!$PPMVJGCPBR0D4A!B98FZ19\n" +
                "M7DA3P3!Z\".J-0ZH\"1-9GX29CZQ(I37$DIZDH:ESXSJJSW9;4Q7410,!XZ)PKK597MA2,'(9KLMIY.62QI.AD\n" +
                "IEB03MDWOY?LG1.YZ;JQC;Y)UHW788Z3WU$ M04 TY4A7VM\n" +
                "S.Y8AC195R)57IXL)',?7,.G?O'9$TA FB UA)M'F5IG4QFE5W,2DE7XDR12Q66WO;SK!(7GQ 92: 3(JUNHOE;2S8I3-\n" +
                "3OF6X.\n" +
                ",G2VXM!2HYHK\"523E\n" +
                ";1\"(19R9AUY 95.?UG1)B5F9$9U?-D8I)CU4GQXZR5Z.YU288S\n" +
                "MZ09(YVZU?AO7)Y72N))ADJ6O?NHWD;XB!6Y)3V\"LR!'((?NH SJZ(9$2(DLI(E0VEOW$LKGU?FZ";

        final String mess6 = "QWDHKANSR\n" +
                "ITJANDKFJ\n" +
                "IRJAMDNF4\n" +
                "PORNAKS2X\n" +
                "ALSKDJEFH\n" +
                "MF1JDTURB\n";

        final String mess7 = "G5U1U?'JOY51VBT0J\"YW0JDU'C1JB0JVJ\"CVTT0?'0JU?JRYD0JRU1$V1UY?RXJ0RO0\"UVTTFJGC0?J$RU?'JWV1VJ1FO0RJR$\"CJVRJTY?'XJB0\"V$R0J1C0JRU!0JY;JRYD0J1FO0RJDVFJ3V5FJW0O0?WU?'JY?JVJ?$DB05JY;J;V\"1Y5RXJR$\"CJVRJ1C0JGY5WJRU!0J.M SBU1JY5J(ASBU1\n" +
                "XJ1C0JYO05V1U?'JRFR10DRJV?WJ1C0J\"YDOUT05J$R0WJ1YJ\"YDOUT0J1C0JRY$5\"0J\"YW0-JY?0JRYT$1UY?J1YJ1CURJO5YBT0DJURJ1YJU?\"T$W0J1C0JR1WU?1-CJC0VW05J;UT0XJVRJRCYG?JU?J1C0J;YTTYGU?'J09VDOT0-";

        final String mess8 = "Y28M1!C-(A446?LLC1\"TI481Y$-OGM?\n" +
                "CYX8PO;WX53MM)P)ZF2X6EW7OI 6:?8DE\"X:PKX!:;;MITU;-U7U2SA,8PCC NZ9231RR9 MX\"O8W\"LD090-))K7Y.?8;W.4EKLNQ!,6(SLRR:UKC.1P-7'LP:D3T$6C3!?2RQCXDJ\n" +
                ";WU\"J TX8;;,M831W )$J'-C9XFY52R?:,N9O\n" +
                ";IVTV.(-2FEO\"HF8K-X( .0\n" +
                "GYVPB.!.OF;ZJNI9MNL$P\"UTG6(4K35\n" +
                "L02LP;P\"?,MQ,WGXJ!1\n" +
                "49;70W$R;NKOQ12O2U:1JF( C?R:\"2P.IYC)HW'UM!DM'T1XA:3'0U2JPZYP\n" +
                "P.4\n" +
                "LOUA$5D(M3RK00-?J64GPIK0XF.HQ:S4OB?NT(.AG 362?RB)DA82AWE \"JLE!MC\n" +
                "\",E).B:2);?S.CUB\n" +
                "MV1P\"!U IPVF0TKCRD95N9RZE;U)XHFH-ZN?Q$UD2Y5OEC-55U\n" +
                "OKR.E! K580I1TL-V\"74\"(?UZP5,YG::K?H78.VA5IA(QC50W.B83V(;YDANBH0\n" +
                "FYO-6DOWTC,N0Q.20B!PU5$DA7QIT1(,ZLRVJ)AFSJJQ53T\n" +
                "VISKNKB8HR4\"L3H524S.TKGP()LA6D:WSV\n" +
                ",,NK8J;\"7T\"ZV'T3\"RF((ZO)1T;QH92K4X'$PV'K277,('SVU 9.N7X2)5D2BM$E)BGCX;\"710\"M$YW?D!7M:)6 ,2E4TA9T:V3FNR$4!AQ: N'PD;06NW0SVBX;0\n" +
                "NJC5X-\n" +
                "TZ2AG-H.'XQ,0?AB4R)T9M)GC53ZM-)$0S'LEWH5X47A0BO3 1!7ZJ,5':6;E8)Y31C6PXDXYF$:I?0Y'X\"T!?.1(8!BZB$PE43NKXE9R9\n" +
                "E\"G1:4K1\n" +
                "4TSHL)-OHD!U68L44IEFWI)!(Y$Y6CGD,6?K.ATYQMNFSA?8GCA$H'')5'QG0UY)IC,IC\n" +
                "(2I( SOI0SKJVQ;R8Q7GDYRB.F6.SZY:NIGJ?68AMK!KKLS,LB;:3)NZ2\"RHBHX'K\"I\"'1E1-C9J7:UBPPP9P 2;M:O-W9\"!R\n" +
                "?205-F7Z?E\"\n" +
                "V$RYJ4,??KU39Y-O.NMD0.A?WQNXEBL ,LSGHSQ\n" +
                " 36XX\"21O?J7-C)M9:ZQR\"1C(WDFX2?C$NY2P 7-MV9.3;RY(7-BFM66-X0 \"K03R3YX!D\"GGW92O.PP6XGUIJAH(RE?V9P-6FS'7?ZGVO-A(-R4J5KP7''\"W$:ERA$X.NFP.RTN\n" +
                "O;VBR Y$ICF,DUI4W(2;.EQ!;I;O'ZHD\n" +
                "1S?YT$T' T9F1J;?DT46.3E-'ACR;2$P9P\n" +
                "R3.,,.!\"WOBCTK72795-Q4DJ8V(SRT N7STUF)ESBCRQGO 3;BW2!DR\"!ON('6:5,0!SVZEYER(HAK\n" +
                "13\"D\"W8:S?3M$)R)!N7Q)9''W0?FJL4.6QY:HR\"0,$C-U!0P863UV\",QB:0E(QB61.,9\n" +
                ";6T84))\n" +
                "?RDS-90N\"0)$WAYEBY!U\n" +
                "TJBKPHWGB-$Q5K -O!$HZF8,PRV:TQBE2\"NZ7MIX;'XR5TZE)AWTZLSD80\",J.8Q5R 5EMZ3$9:G'PS8X,T5ZCC10Q;;J 6\n" +
                "VF0Y,,LXRQX.KPHD;RAYB4H- 71Y\n" +
                "866HL4TB:5(RJ$?NQPJ8KFGMWUEL92Q3M2\n" +
                "HK)IJ\";6OUB3L:QX0FJ,V'\"O) 7F(V73;V42;\n" +
                "H75$8ZTMY$?N\"7\n" +
                "ZW1(M5KH5,6Q)H8ABAF9WLLNMS) Y:72(X?GFIV04.V!6:!\"M ,J-K 6J4)94BNJ4-BB6SP5MHIR9 H8X.IZ\n" +
                "HPZ0 IC97ULWTAHDM\")Z5JVWC)L YA1)7WUZL F )7M.75:VAU2MUC)\n" +
                "GY:F):E-\n" +
                "' S4UPM47F(N?FY\n" +
                "IO\n" +
                "OITV8SR\n" +
                ")9;'5FT'$:E-RPO9Z:VBMQCCLIW4,!!9)C6;.IYJ?BE3J482:B92A4(DY?D7H;A P6\n" +
                "-OZX67JLSLCOV0)'JR5\"RF;;9PZWH08WR.3I;9SFR\n" +
                "\n" +
                "'T97)'XU.Q0-T\"$.NH7 ";

        final String mess9 = "$YZ?3Z?3R3YZ;$3RS('$3:?XN4GR,X(!Z$Y:63X!Z,,V3TZ)YV!G,V;X$Y3(W3),RZ;$V0$63O3TYR!RT$V!?38(;V3\n" +
                "(!U3(;,19";

        final String mess10 = "$2J!LGE-:Z5O82\"58.50'\n" +
                "J!4BB'.1A\"ZJ V1RZ1H:GKMMTK9KNI9W';XS9'H,P3E)CPH:GFE00)K4NIC03OP-!4)YIK?V1FXL?7V 04P9L;BZOA)$('GKW9SLQ6Q?-DU(UGR6RUYSJ C0M'4U23!T0;JHLZC;UG.K\"5S";
        final String mess11 = "YN(XF(SJJYS(JXL(TIH:Y(TMRXFJ(6FI6(W(JFJ-YJ(W(TUJJYW(SXR(JX)NMU(T(NQG(GJY(JWU(Y";
        final String mess12 = "MXN(SNYWXNLRXFJY(JWU)GY(JXLX6(S(7FJWQYI(M:FJHRQRSF:N(TJXSJ((TJ:Z.Q(JFQ(TIH:YN)";

        final String mess8key3 = "YV 2'N8K7M2S17T!7UC,F-()('EASS4VB4UC6 R?9QL.GLNOC7 1X3\"2;T)BI5W4D282!1BDYMR$$\"-E!O)OGBNMG(?C'\n" +
                "X6C;:Y\"5X7,810P0!O\"S;MVW$ZXYE5WY3?EMDRM!()7HPMA):KZ)\n" +
                "F612 3X,\"62DEE\"W4W7T8OA:I9S T?6:3:VM?3$8F)DNRER)\"$!X4N:!7PAQKQ)X:9! ':N';'W;P0MD?I;FT0JU6L;N4-W.U067SQUVY2B:SXHA;R,0\"8\n" +
                "0PN,CJ$CCC 5-NXUZ-!9\n" +
                "02TP3Z8126RA3RGU9-V H\"M.,X'Q\"XBOQ:8,0W0E\"?(LAQDBB0469R10).-T,)99)M\n" +
                "K);7G6YCT.58?348Z);M)W-\n" +
                ".)?4$RE0DKSSL'-NL9QE0!WN,H\"650(X)S4$L7WRAAR0Y:BEUOBK3YC !.1U1!\n" +
                "P7T-ZJ7JB',KL5PP'H::WD6G3;BTE-$8$6)QCY533K!1 ?C-26ORP!QX$CDHXXZDYFJF8\n" +
                "$,;:PWIRU?V\"0:JYT 'QTXBX\"E8T2;!\";?N,.ZM178(M38I1!XWB; Z')BX$$RJP5'ET-4ZC3E9N)XKAFXWYET59Z2RLR9S?\n" +
                "D:E8,\"0NG\"91,O:J\n" +
                "4.;K8I1QV\n" +
                "5T4RVT .S5(HE-LM2)ZF-3EO$OH9\"D:H!GFU'86PK8S-L8X4X(4, IT.E50FZ\n" +
                "WCGICY)1V!0P(QBY;.$;!YJ.6 OC6FG\n" +
                ";DVZ,FJ60N?YIK,9.,MALNTXLYR$QQPMX\"N.UFKTSPGAH6?D(8;4GRKCA3AY5$B\n" +
                "H4L'H0'-2) L57P'1;QYPG\n" +
                "\"08?U6,Y6M)HQIL,C4W,TGIBXC:J\n" +
                "5!((12R\n" +
                "IJ4($9 ?;SN7OQ0IPW0J$S8RKK;JFNVGKQMO;WQRU18E2QLO792G2UDQ:Y31RMJB2F.\n" +
                "(FH 6KC.)?SIRZJ:Y\"\":;2N6PIO.GUIJBY?3C6L)8:HAQWMX'K0U!FMKJ!K,DLVMS'',\"TLO1B)X; A:7:3F3)('NV0Z7U232\";JRVPH4ZB2YH;PX\n" +
                "\n" +
                "'HPK7.\"54I$\n" +
                "\"8L'ZO1TUEMA1Y$-$5C?D9N(J\"M773:\n" +
                "RUZKBW0P10P(-PM?95JPK6 H425G;,PM6I:QKO)0-HXW8F9A.\"BH!AQRF:\n" +
                "9S?W42LO0LB5N?-MNFST7)(Z .?YAE:G\"7 \n" +
                "23V(6$X2R??YGRJFB4I),VD?0A?48K.2UVA3!W96EY: -!\"O\"J.MLN EM,!DJM0-C.K\n" +
                "A \"?6,WJEQ4)N).X9BE4:BB2LN) J;,4?L-SSB.GBCH6USSBQP\n" +
                "\n" +
                "5M MV3H16IPXR\"X9!\" U2H 18IOXP?.VJIF7Z0-\n" +
                "TCHK)PCMZR90D: 9ZI5QCNR99\"7R1UZCLE(W;WTUDA)FHXXDH2MF?\"HC)-$ZZN5NYJ?2VQPW$ CU7)D-L2M YVY59AO.1E3)C;7-RW5YU5(ZU7L\n" +
                "- OBFKF RM).67E6M!-. X7K055 :8\"V0KAI0U132TRML3U-YCVX)\"!\n" +
                "7DG4\"Y\"G:(GF?W)U9:Z2EPO-5.\n" +
                ",P'YP G6S:X4:GUKUP?IMHJ47A78HF.((VRNAE?5?FIVYA9\n" +
                "(PIQ-OC6\n" +
                "5FO0SIW'T.7VB?88ZS3GRVV\n" +
                "(O);-9YA;D('A-5NRFB4THJ'05$\n" +
                "K:FPEY7-O'R-'P6\"ODW9O$ZW::TEVCRB,AMN$Q0XCQ.C.NL2FI0PWB.4!R,PT!UN!5\n" +
                "9$O)D;CAV67B;QR.I ITYY1$J(I?,CBZFEL,3RDJVU4JI8)42AW:F(BS29J;2J.AQE45Q(3!DT;Y\n" +
                "I?V;DIO7S'HKZ;NHAKD B\n" +
                "P816HS\n" +
                "R?-4YO\"TZL$X3T6H'75 J2TL49SSFL.1CTJOK;VG?0PD)(T')4JL6RA.563\"DER:-FW';SA;VC9\n" +
                "RP,;Z,2WN$HKP0898JPW;\n" +
                "R\"R.733T.I\",;Z,9V.S'!FT\"R3W\n" +
                "\"O\n" +
                "RB'FCT(T9(K7Z7)O2')7X19UT5.;-QQQ0H4-9DT2J\"K8$4V.X(N'SH$R7PT";

//        Initiate instances
        Caesar caesar = new Caesar();
        ColumnarTransposition ct = new ColumnarTransposition();
        Vernam vernam = new Vernam();
        RandomSubtitution rs = new RandomSubtitution();
        Grille grinlle = new Grille();

        /*Message 1*/
        System.out.println("Message 1");
        System.out.println(mess1.length());
        caesar.decryptionWithoutKey(mess1, "src\\TextFile\\Mess1.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 2*/
        System.out.println("Message 2");
        System.out.println(mess2.length());
        ct.decryptionWithoutKey(mess2, "src\\TextFile\\Mess2.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 3*/
        System.out.println("Message 3");
        System.out.println(mess3.length());
        rs.countChar(mess3, "src\\TextFile\\Mess3.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 4*/
        System.out.println("Message 4");
        System.out.println(mess4.length());
        caesar.decryption(mess4, 12, "src\\TextFile\\Mess4.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 5*/
//        This for loop is used to check all the result of message 5
        System.out.println("Message 5");
        System.out.println(mess5.length());
        String cut = mess8key3.substring(101, 101 + mess5.length());
        vernam.decryption(mess5, cut, "src\\TextFile\\Mess5.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 6*/
        System.out.println("Message 6");
        System.out.println(mess6.length());
        grinlle.displayWord("src\\TextFile\\Mess6.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 7*/
        System.out.println("Message 7");
        System.out.println(mess7.length());
        rs.countChar(mess7, "src\\TextFile\\Mess7.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 8*/
        System.out.println("Message 8");
        System.out.println(mess8.length());
        ct.decryptionWithoutKey(mess8, "src\\TextFile\\Mess8.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 9*/
        System.out.println("Message 9");
        System.out.println(mess9.length());
        caesar.decryptionWithoutKey(mess9, "src\\TextFile\\Mess9.txt");
        System.out.println("--------------------------------------------------------------\n");

        /*Message 11 + 12*/
        System.out.println("Message 11 + 12");
        System.out.println(mess11.length());
        System.out.println(mess12.length());
        String s2 = "";
        //For loop to interleave 2 encrypted message into 1 encrypted message
        for (int i = 0; i < mess11.length(); i++) {
            s2 += mess11.charAt(i);
            s2 += mess12.charAt(i);
        }

        System.out.println(s2);
        caesar.decryptionWithoutKey(s2, "src\\TextFile\\Mess1112.txt");
        System.out.println("--------------------------------------------------------------\n");

//          /*Message 10*/
//        System.out.println("Message 10");
//        System.out.println(mess10.length());
////        This for loop is used to check the all cases in order to get the decrypted message
//        for (int i = 0; i < mess8key3.length() - mess10.length(); i++) {
//            String cut2 = mess8key3.substring(i, i + mess10.length());
//            String sr = vernam.decryption(mess10, cut2, "src\\TextFile\\Mess10.txt");
//            System.out.println(i);
//            System.out.println(cut);
//            System.out.println(sr);
//        }
//        System.out.println("--------------------------------------------------------------\n");
    }
}
