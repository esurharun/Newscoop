package tol.unicoded;

public class tableB extends table{
        public tableB(){
off=0xB000;
    }

    public String getChar(int idx){
        System.out.println("idx-off"+(idx-off));
        System.out.println("uc length"+uc.length);
        return uc[idx-off];
    }

    final static String uc[]={
"\uB000","\uB001","\uB002","\uB003","\uB004","\uB005","\uB006","\uB007","\uB008","\uB009","\uB00A","\uB00B","\uB00C","\uB00D","\uB00E","\uB00F"
,"\uB010","\uB011","\uB012","\uB013","\uB014","\uB015","\uB016","\uB017","\uB018","\uB019","\uB01A","\uB01B","\uB01C","\uB01D","\uB01E","\uB01F"
,"\uB020","\uB021","\uB022","\uB023","\uB024","\uB025","\uB026","\uB027","\uB028","\uB029","\uB02A","\uB02B","\uB02C","\uB02D","\uB02E","\uB02F"
,"\uB030","\uB031","\uB032","\uB033","\uB034","\uB035","\uB036","\uB037","\uB038","\uB039","\uB03A","\uB03B","\uB03C","\uB03D","\uB03E","\uB03F"
,"\uB040","\uB041","\uB042","\uB043","\uB044","\uB045","\uB046","\uB047","\uB048","\uB049","\uB04A","\uB04B","\uB04C","\uB04D","\uB04E","\uB04F"
,"\uB050","\uB051","\uB052","\uB053","\uB054","\uB055","\uB056","\uB057","\uB058","\uB059","\uB05A","\uB05B","\uB05C","\uB05D","\uB05E","\uB05F"
,"\uB060","\uB061","\uB062","\uB063","\uB064","\uB065","\uB066","\uB067","\uB068","\uB069","\uB06A","\uB06B","\uB06C","\uB06D","\uB06E","\uB06F"
,"\uB070","\uB071","\uB072","\uB073","\uB074","\uB075","\uB076","\uB077","\uB078","\uB079","\uB07A","\uB07B","\uB07C","\uB07D","\uB07E","\uB07F"
,"\uB080","\uB081","\uB082","\uB083","\uB084","\uB085","\uB086","\uB087","\uB088","\uB089","\uB08A","\uB08B","\uB08C","\uB08D","\uB08E","\uB08F"
,"\uB090","\uB091","\uB092","\uB093","\uB094","\uB095","\uB096","\uB097","\uB098","\uB099","\uB09A","\uB09B","\uB09C","\uB09D","\uB09E","\uB09F"
,"\uB0A0","\uB0A1","\uB0A2","\uB0A3","\uB0A4","\uB0A5","\uB0A6","\uB0A7","\uB0A8","\uB0A9","\uB0AA","\uB0AB","\uB0AC","\uB0AD","\uB0AE","\uB0AF"
,"\uB0B0","\uB0B1","\uB0B2","\uB0B3","\uB0B4","\uB0B5","\uB0B6","\uB0B7","\uB0B8","\uB0B9","\uB0BA","\uB0BB","\uB0BC","\uB0BD","\uB0BE","\uB0BF"
,"\uB0C0","\uB0C1","\uB0C2","\uB0C3","\uB0C4","\uB0C5","\uB0C6","\uB0C7","\uB0C8","\uB0C9","\uB0CA","\uB0CB","\uB0CC","\uB0CD","\uB0CE","\uB0CF"
,"\uB0D0","\uB0D1","\uB0D2","\uB0D3","\uB0D4","\uB0D5","\uB0D6","\uB0D7","\uB0D8","\uB0D9","\uB0DA","\uB0DB","\uB0DC","\uB0DD","\uB0DE","\uB0DF"
,"\uB0E0","\uB0E1","\uB0E2","\uB0E3","\uB0E4","\uB0E5","\uB0E6","\uB0E7","\uB0E8","\uB0E9","\uB0EA","\uB0EB","\uB0EC","\uB0ED","\uB0EE","\uB0EF"
,"\uB0F0","\uB0F1","\uB0F2","\uB0F3","\uB0F4","\uB0F5","\uB0F6","\uB0F7","\uB0F8","\uB0F9","\uB0FA","\uB0FB","\uB0FC","\uB0FD","\uB0FE","\uB0FF"
,"\uB100","\uB101","\uB102","\uB103","\uB104","\uB105","\uB106","\uB107","\uB108","\uB109","\uB10A","\uB10B","\uB10C","\uB10D","\uB10E","\uB10F"
,"\uB110","\uB111","\uB112","\uB113","\uB114","\uB115","\uB116","\uB117","\uB118","\uB119","\uB11A","\uB11B","\uB11C","\uB11D","\uB11E","\uB11F"
,"\uB120","\uB121","\uB122","\uB123","\uB124","\uB125","\uB126","\uB127","\uB128","\uB129","\uB12A","\uB12B","\uB12C","\uB12D","\uB12E","\uB12F"
,"\uB130","\uB131","\uB132","\uB133","\uB134","\uB135","\uB136","\uB137","\uB138","\uB139","\uB13A","\uB13B","\uB13C","\uB13D","\uB13E","\uB13F"
,"\uB140","\uB141","\uB142","\uB143","\uB144","\uB145","\uB146","\uB147","\uB148","\uB149","\uB14A","\uB14B","\uB14C","\uB14D","\uB14E","\uB14F"
,"\uB150","\uB151","\uB152","\uB153","\uB154","\uB155","\uB156","\uB157","\uB158","\uB159","\uB15A","\uB15B","\uB15C","\uB15D","\uB15E","\uB15F"
,"\uB160","\uB161","\uB162","\uB163","\uB164","\uB165","\uB166","\uB167","\uB168","\uB169","\uB16A","\uB16B","\uB16C","\uB16D","\uB16E","\uB16F"
,"\uB170","\uB171","\uB172","\uB173","\uB174","\uB175","\uB176","\uB177","\uB178","\uB179","\uB17A","\uB17B","\uB17C","\uB17D","\uB17E","\uB17F"
,"\uB180","\uB181","\uB182","\uB183","\uB184","\uB185","\uB186","\uB187","\uB188","\uB189","\uB18A","\uB18B","\uB18C","\uB18D","\uB18E","\uB18F"
,"\uB190","\uB191","\uB192","\uB193","\uB194","\uB195","\uB196","\uB197","\uB198","\uB199","\uB19A","\uB19B","\uB19C","\uB19D","\uB19E","\uB19F"
,"\uB1A0","\uB1A1","\uB1A2","\uB1A3","\uB1A4","\uB1A5","\uB1A6","\uB1A7","\uB1A8","\uB1A9","\uB1AA","\uB1AB","\uB1AC","\uB1AD","\uB1AE","\uB1AF"
,"\uB1B0","\uB1B1","\uB1B2","\uB1B3","\uB1B4","\uB1B5","\uB1B6","\uB1B7","\uB1B8","\uB1B9","\uB1BA","\uB1BB","\uB1BC","\uB1BD","\uB1BE","\uB1BF"
,"\uB1C0","\uB1C1","\uB1C2","\uB1C3","\uB1C4","\uB1C5","\uB1C6","\uB1C7","\uB1C8","\uB1C9","\uB1CA","\uB1CB","\uB1CC","\uB1CD","\uB1CE","\uB1CF"
,"\uB1D0","\uB1D1","\uB1D2","\uB1D3","\uB1D4","\uB1D5","\uB1D6","\uB1D7","\uB1D8","\uB1D9","\uB1DA","\uB1DB","\uB1DC","\uB1DD","\uB1DE","\uB1DF"
,"\uB1E0","\uB1E1","\uB1E2","\uB1E3","\uB1E4","\uB1E5","\uB1E6","\uB1E7","\uB1E8","\uB1E9","\uB1EA","\uB1EB","\uB1EC","\uB1ED","\uB1EE","\uB1EF"
,"\uB1F0","\uB1F1","\uB1F2","\uB1F3","\uB1F4","\uB1F5","\uB1F6","\uB1F7","\uB1F8","\uB1F9","\uB1FA","\uB1FB","\uB1FC","\uB1FD","\uB1FE","\uB1FF"
,"\uB200","\uB201","\uB202","\uB203","\uB204","\uB205","\uB206","\uB207","\uB208","\uB209","\uB20A","\uB20B","\uB20C","\uB20D","\uB20E","\uB20F"
,"\uB210","\uB211","\uB212","\uB213","\uB214","\uB215","\uB216","\uB217","\uB218","\uB219","\uB21A","\uB21B","\uB21C","\uB21D","\uB21E","\uB21F"
,"\uB220","\uB221","\uB222","\uB223","\uB224","\uB225","\uB226","\uB227","\uB228","\uB229","\uB22A","\uB22B","\uB22C","\uB22D","\uB22E","\uB22F"
,"\uB230","\uB231","\uB232","\uB233","\uB234","\uB235","\uB236","\uB237","\uB238","\uB239","\uB23A","\uB23B","\uB23C","\uB23D","\uB23E","\uB23F"
,"\uB240","\uB241","\uB242","\uB243","\uB244","\uB245","\uB246","\uB247","\uB248","\uB249","\uB24A","\uB24B","\uB24C","\uB24D","\uB24E","\uB24F"
,"\uB250","\uB251","\uB252","\uB253","\uB254","\uB255","\uB256","\uB257","\uB258","\uB259","\uB25A","\uB25B","\uB25C","\uB25D","\uB25E","\uB25F"
,"\uB260","\uB261","\uB262","\uB263","\uB264","\uB265","\uB266","\uB267","\uB268","\uB269","\uB26A","\uB26B","\uB26C","\uB26D","\uB26E","\uB26F"
,"\uB270","\uB271","\uB272","\uB273","\uB274","\uB275","\uB276","\uB277","\uB278","\uB279","\uB27A","\uB27B","\uB27C","\uB27D","\uB27E","\uB27F"
,"\uB280","\uB281","\uB282","\uB283","\uB284","\uB285","\uB286","\uB287","\uB288","\uB289","\uB28A","\uB28B","\uB28C","\uB28D","\uB28E","\uB28F"
,"\uB290","\uB291","\uB292","\uB293","\uB294","\uB295","\uB296","\uB297","\uB298","\uB299","\uB29A","\uB29B","\uB29C","\uB29D","\uB29E","\uB29F"
,"\uB2A0","\uB2A1","\uB2A2","\uB2A3","\uB2A4","\uB2A5","\uB2A6","\uB2A7","\uB2A8","\uB2A9","\uB2AA","\uB2AB","\uB2AC","\uB2AD","\uB2AE","\uB2AF"
,"\uB2B0","\uB2B1","\uB2B2","\uB2B3","\uB2B4","\uB2B5","\uB2B6","\uB2B7","\uB2B8","\uB2B9","\uB2BA","\uB2BB","\uB2BC","\uB2BD","\uB2BE","\uB2BF"
,"\uB2C0","\uB2C1","\uB2C2","\uB2C3","\uB2C4","\uB2C5","\uB2C6","\uB2C7","\uB2C8","\uB2C9","\uB2CA","\uB2CB","\uB2CC","\uB2CD","\uB2CE","\uB2CF"
,"\uB2D0","\uB2D1","\uB2D2","\uB2D3","\uB2D4","\uB2D5","\uB2D6","\uB2D7","\uB2D8","\uB2D9","\uB2DA","\uB2DB","\uB2DC","\uB2DD","\uB2DE","\uB2DF"
,"\uB2E0","\uB2E1","\uB2E2","\uB2E3","\uB2E4","\uB2E5","\uB2E6","\uB2E7","\uB2E8","\uB2E9","\uB2EA","\uB2EB","\uB2EC","\uB2ED","\uB2EE","\uB2EF"
,"\uB2F0","\uB2F1","\uB2F2","\uB2F3","\uB2F4","\uB2F5","\uB2F6","\uB2F7","\uB2F8","\uB2F9","\uB2FA","\uB2FB","\uB2FC","\uB2FD","\uB2FE","\uB2FF"
,"\uB300","\uB301","\uB302","\uB303","\uB304","\uB305","\uB306","\uB307","\uB308","\uB309","\uB30A","\uB30B","\uB30C","\uB30D","\uB30E","\uB30F"
,"\uB310","\uB311","\uB312","\uB313","\uB314","\uB315","\uB316","\uB317","\uB318","\uB319","\uB31A","\uB31B","\uB31C","\uB31D","\uB31E","\uB31F"
,"\uB320","\uB321","\uB322","\uB323","\uB324","\uB325","\uB326","\uB327","\uB328","\uB329","\uB32A","\uB32B","\uB32C","\uB32D","\uB32E","\uB32F"
,"\uB330","\uB331","\uB332","\uB333","\uB334","\uB335","\uB336","\uB337","\uB338","\uB339","\uB33A","\uB33B","\uB33C","\uB33D","\uB33E","\uB33F"
,"\uB340","\uB341","\uB342","\uB343","\uB344","\uB345","\uB346","\uB347","\uB348","\uB349","\uB34A","\uB34B","\uB34C","\uB34D","\uB34E","\uB34F"
,"\uB350","\uB351","\uB352","\uB353","\uB354","\uB355","\uB356","\uB357","\uB358","\uB359","\uB35A","\uB35B","\uB35C","\uB35D","\uB35E","\uB35F"
,"\uB360","\uB361","\uB362","\uB363","\uB364","\uB365","\uB366","\uB367","\uB368","\uB369","\uB36A","\uB36B","\uB36C","\uB36D","\uB36E","\uB36F"
,"\uB370","\uB371","\uB372","\uB373","\uB374","\uB375","\uB376","\uB377","\uB378","\uB379","\uB37A","\uB37B","\uB37C","\uB37D","\uB37E","\uB37F"
,"\uB380","\uB381","\uB382","\uB383","\uB384","\uB385","\uB386","\uB387","\uB388","\uB389","\uB38A","\uB38B","\uB38C","\uB38D","\uB38E","\uB38F"
,"\uB390","\uB391","\uB392","\uB393","\uB394","\uB395","\uB396","\uB397","\uB398","\uB399","\uB39A","\uB39B","\uB39C","\uB39D","\uB39E","\uB39F"
,"\uB3A0","\uB3A1","\uB3A2","\uB3A3","\uB3A4","\uB3A5","\uB3A6","\uB3A7","\uB3A8","\uB3A9","\uB3AA","\uB3AB","\uB3AC","\uB3AD","\uB3AE","\uB3AF"
,"\uB3B0","\uB3B1","\uB3B2","\uB3B3","\uB3B4","\uB3B5","\uB3B6","\uB3B7","\uB3B8","\uB3B9","\uB3BA","\uB3BB","\uB3BC","\uB3BD","\uB3BE","\uB3BF"
,"\uB3C0","\uB3C1","\uB3C2","\uB3C3","\uB3C4","\uB3C5","\uB3C6","\uB3C7","\uB3C8","\uB3C9","\uB3CA","\uB3CB","\uB3CC","\uB3CD","\uB3CE","\uB3CF"
,"\uB3D0","\uB3D1","\uB3D2","\uB3D3","\uB3D4","\uB3D5","\uB3D6","\uB3D7","\uB3D8","\uB3D9","\uB3DA","\uB3DB","\uB3DC","\uB3DD","\uB3DE","\uB3DF"
,"\uB3E0","\uB3E1","\uB3E2","\uB3E3","\uB3E4","\uB3E5","\uB3E6","\uB3E7","\uB3E8","\uB3E9","\uB3EA","\uB3EB","\uB3EC","\uB3ED","\uB3EE","\uB3EF"
,"\uB3F0","\uB3F1","\uB3F2","\uB3F3","\uB3F4","\uB3F5","\uB3F6","\uB3F7","\uB3F8","\uB3F9","\uB3FA","\uB3FB","\uB3FC","\uB3FD","\uB3FE","\uB3FF"
,"\uB400","\uB401","\uB402","\uB403","\uB404","\uB405","\uB406","\uB407","\uB408","\uB409","\uB40A","\uB40B","\uB40C","\uB40D","\uB40E","\uB40F"
,"\uB410","\uB411","\uB412","\uB413","\uB414","\uB415","\uB416","\uB417","\uB418","\uB419","\uB41A","\uB41B","\uB41C","\uB41D","\uB41E","\uB41F"
,"\uB420","\uB421","\uB422","\uB423","\uB424","\uB425","\uB426","\uB427","\uB428","\uB429","\uB42A","\uB42B","\uB42C","\uB42D","\uB42E","\uB42F"
,"\uB430","\uB431","\uB432","\uB433","\uB434","\uB435","\uB436","\uB437","\uB438","\uB439","\uB43A","\uB43B","\uB43C","\uB43D","\uB43E","\uB43F"
,"\uB440","\uB441","\uB442","\uB443","\uB444","\uB445","\uB446","\uB447","\uB448","\uB449","\uB44A","\uB44B","\uB44C","\uB44D","\uB44E","\uB44F"
,"\uB450","\uB451","\uB452","\uB453","\uB454","\uB455","\uB456","\uB457","\uB458","\uB459","\uB45A","\uB45B","\uB45C","\uB45D","\uB45E","\uB45F"
,"\uB460","\uB461","\uB462","\uB463","\uB464","\uB465","\uB466","\uB467","\uB468","\uB469","\uB46A","\uB46B","\uB46C","\uB46D","\uB46E","\uB46F"
,"\uB470","\uB471","\uB472","\uB473","\uB474","\uB475","\uB476","\uB477","\uB478","\uB479","\uB47A","\uB47B","\uB47C","\uB47D","\uB47E","\uB47F"
,"\uB480","\uB481","\uB482","\uB483","\uB484","\uB485","\uB486","\uB487","\uB488","\uB489","\uB48A","\uB48B","\uB48C","\uB48D","\uB48E","\uB48F"
,"\uB490","\uB491","\uB492","\uB493","\uB494","\uB495","\uB496","\uB497","\uB498","\uB499","\uB49A","\uB49B","\uB49C","\uB49D","\uB49E","\uB49F"
,"\uB4A0","\uB4A1","\uB4A2","\uB4A3","\uB4A4","\uB4A5","\uB4A6","\uB4A7","\uB4A8","\uB4A9","\uB4AA","\uB4AB","\uB4AC","\uB4AD","\uB4AE","\uB4AF"
,"\uB4B0","\uB4B1","\uB4B2","\uB4B3","\uB4B4","\uB4B5","\uB4B6","\uB4B7","\uB4B8","\uB4B9","\uB4BA","\uB4BB","\uB4BC","\uB4BD","\uB4BE","\uB4BF"
,"\uB4C0","\uB4C1","\uB4C2","\uB4C3","\uB4C4","\uB4C5","\uB4C6","\uB4C7","\uB4C8","\uB4C9","\uB4CA","\uB4CB","\uB4CC","\uB4CD","\uB4CE","\uB4CF"
,"\uB4D0","\uB4D1","\uB4D2","\uB4D3","\uB4D4","\uB4D5","\uB4D6","\uB4D7","\uB4D8","\uB4D9","\uB4DA","\uB4DB","\uB4DC","\uB4DD","\uB4DE","\uB4DF"
,"\uB4E0","\uB4E1","\uB4E2","\uB4E3","\uB4E4","\uB4E5","\uB4E6","\uB4E7","\uB4E8","\uB4E9","\uB4EA","\uB4EB","\uB4EC","\uB4ED","\uB4EE","\uB4EF"
,"\uB4F0","\uB4F1","\uB4F2","\uB4F3","\uB4F4","\uB4F5","\uB4F6","\uB4F7","\uB4F8","\uB4F9","\uB4FA","\uB4FB","\uB4FC","\uB4FD","\uB4FE","\uB4FF"
,"\uB500","\uB501","\uB502","\uB503","\uB504","\uB505","\uB506","\uB507","\uB508","\uB509","\uB50A","\uB50B","\uB50C","\uB50D","\uB50E","\uB50F"
,"\uB510","\uB511","\uB512","\uB513","\uB514","\uB515","\uB516","\uB517","\uB518","\uB519","\uB51A","\uB51B","\uB51C","\uB51D","\uB51E","\uB51F"
,"\uB520","\uB521","\uB522","\uB523","\uB524","\uB525","\uB526","\uB527","\uB528","\uB529","\uB52A","\uB52B","\uB52C","\uB52D","\uB52E","\uB52F"
,"\uB530","\uB531","\uB532","\uB533","\uB534","\uB535","\uB536","\uB537","\uB538","\uB539","\uB53A","\uB53B","\uB53C","\uB53D","\uB53E","\uB53F"
,"\uB540","\uB541","\uB542","\uB543","\uB544","\uB545","\uB546","\uB547","\uB548","\uB549","\uB54A","\uB54B","\uB54C","\uB54D","\uB54E","\uB54F"
,"\uB550","\uB551","\uB552","\uB553","\uB554","\uB555","\uB556","\uB557","\uB558","\uB559","\uB55A","\uB55B","\uB55C","\uB55D","\uB55E","\uB55F"
,"\uB560","\uB561","\uB562","\uB563","\uB564","\uB565","\uB566","\uB567","\uB568","\uB569","\uB56A","\uB56B","\uB56C","\uB56D","\uB56E","\uB56F"
,"\uB570","\uB571","\uB572","\uB573","\uB574","\uB575","\uB576","\uB577","\uB578","\uB579","\uB57A","\uB57B","\uB57C","\uB57D","\uB57E","\uB57F"
,"\uB580","\uB581","\uB582","\uB583","\uB584","\uB585","\uB586","\uB587","\uB588","\uB589","\uB58A","\uB58B","\uB58C","\uB58D","\uB58E","\uB58F"
,"\uB590","\uB591","\uB592","\uB593","\uB594","\uB595","\uB596","\uB597","\uB598","\uB599","\uB59A","\uB59B","\uB59C","\uB59D","\uB59E","\uB59F"
,"\uB5A0","\uB5A1","\uB5A2","\uB5A3","\uB5A4","\uB5A5","\uB5A6","\uB5A7","\uB5A8","\uB5A9","\uB5AA","\uB5AB","\uB5AC","\uB5AD","\uB5AE","\uB5AF"
,"\uB5B0","\uB5B1","\uB5B2","\uB5B3","\uB5B4","\uB5B5","\uB5B6","\uB5B7","\uB5B8","\uB5B9","\uB5BA","\uB5BB","\uB5BC","\uB5BD","\uB5BE","\uB5BF"
,"\uB5C0","\uB5C1","\uB5C2","\uB5C3","\uB5C4","\uB5C5","\uB5C6","\uB5C7","\uB5C8","\uB5C9","\uB5CA","\uB5CB","\uB5CC","\uB5CD","\uB5CE","\uB5CF"
,"\uB5D0","\uB5D1","\uB5D2","\uB5D3","\uB5D4","\uB5D5","\uB5D6","\uB5D7","\uB5D8","\uB5D9","\uB5DA","\uB5DB","\uB5DC","\uB5DD","\uB5DE","\uB5DF"
,"\uB5E0","\uB5E1","\uB5E2","\uB5E3","\uB5E4","\uB5E5","\uB5E6","\uB5E7","\uB5E8","\uB5E9","\uB5EA","\uB5EB","\uB5EC","\uB5ED","\uB5EE","\uB5EF"
,"\uB5F0","\uB5F1","\uB5F2","\uB5F3","\uB5F4","\uB5F5","\uB5F6","\uB5F7","\uB5F8","\uB5F9","\uB5FA","\uB5FB","\uB5FC","\uB5FD","\uB5FE","\uB5FF"
,"\uB600","\uB601","\uB602","\uB603","\uB604","\uB605","\uB606","\uB607","\uB608","\uB609","\uB60A","\uB60B","\uB60C","\uB60D","\uB60E","\uB60F"
,"\uB610","\uB611","\uB612","\uB613","\uB614","\uB615","\uB616","\uB617","\uB618","\uB619","\uB61A","\uB61B","\uB61C","\uB61D","\uB61E","\uB61F"
,"\uB620","\uB621","\uB622","\uB623","\uB624","\uB625","\uB626","\uB627","\uB628","\uB629","\uB62A","\uB62B","\uB62C","\uB62D","\uB62E","\uB62F"
,"\uB630","\uB631","\uB632","\uB633","\uB634","\uB635","\uB636","\uB637","\uB638","\uB639","\uB63A","\uB63B","\uB63C","\uB63D","\uB63E","\uB63F"
,"\uB640","\uB641","\uB642","\uB643","\uB644","\uB645","\uB646","\uB647","\uB648","\uB649","\uB64A","\uB64B","\uB64C","\uB64D","\uB64E","\uB64F"
,"\uB650","\uB651","\uB652","\uB653","\uB654","\uB655","\uB656","\uB657","\uB658","\uB659","\uB65A","\uB65B","\uB65C","\uB65D","\uB65E","\uB65F"
,"\uB660","\uB661","\uB662","\uB663","\uB664","\uB665","\uB666","\uB667","\uB668","\uB669","\uB66A","\uB66B","\uB66C","\uB66D","\uB66E","\uB66F"
,"\uB670","\uB671","\uB672","\uB673","\uB674","\uB675","\uB676","\uB677","\uB678","\uB679","\uB67A","\uB67B","\uB67C","\uB67D","\uB67E","\uB67F"
,"\uB680","\uB681","\uB682","\uB683","\uB684","\uB685","\uB686","\uB687","\uB688","\uB689","\uB68A","\uB68B","\uB68C","\uB68D","\uB68E","\uB68F"
,"\uB690","\uB691","\uB692","\uB693","\uB694","\uB695","\uB696","\uB697","\uB698","\uB699","\uB69A","\uB69B","\uB69C","\uB69D","\uB69E","\uB69F"
,"\uB6A0","\uB6A1","\uB6A2","\uB6A3","\uB6A4","\uB6A5","\uB6A6","\uB6A7","\uB6A8","\uB6A9","\uB6AA","\uB6AB","\uB6AC","\uB6AD","\uB6AE","\uB6AF"
,"\uB6B0","\uB6B1","\uB6B2","\uB6B3","\uB6B4","\uB6B5","\uB6B6","\uB6B7","\uB6B8","\uB6B9","\uB6BA","\uB6BB","\uB6BC","\uB6BD","\uB6BE","\uB6BF"
,"\uB6C0","\uB6C1","\uB6C2","\uB6C3","\uB6C4","\uB6C5","\uB6C6","\uB6C7","\uB6C8","\uB6C9","\uB6CA","\uB6CB","\uB6CC","\uB6CD","\uB6CE","\uB6CF"
,"\uB6D0","\uB6D1","\uB6D2","\uB6D3","\uB6D4","\uB6D5","\uB6D6","\uB6D7","\uB6D8","\uB6D9","\uB6DA","\uB6DB","\uB6DC","\uB6DD","\uB6DE","\uB6DF"
,"\uB6E0","\uB6E1","\uB6E2","\uB6E3","\uB6E4","\uB6E5","\uB6E6","\uB6E7","\uB6E8","\uB6E9","\uB6EA","\uB6EB","\uB6EC","\uB6ED","\uB6EE","\uB6EF"
,"\uB6F0","\uB6F1","\uB6F2","\uB6F3","\uB6F4","\uB6F5","\uB6F6","\uB6F7","\uB6F8","\uB6F9","\uB6FA","\uB6FB","\uB6FC","\uB6FD","\uB6FE","\uB6FF"
,"\uB700","\uB701","\uB702","\uB703","\uB704","\uB705","\uB706","\uB707","\uB708","\uB709","\uB70A","\uB70B","\uB70C","\uB70D","\uB70E","\uB70F"
,"\uB710","\uB711","\uB712","\uB713","\uB714","\uB715","\uB716","\uB717","\uB718","\uB719","\uB71A","\uB71B","\uB71C","\uB71D","\uB71E","\uB71F"
,"\uB720","\uB721","\uB722","\uB723","\uB724","\uB725","\uB726","\uB727","\uB728","\uB729","\uB72A","\uB72B","\uB72C","\uB72D","\uB72E","\uB72F"
,"\uB730","\uB731","\uB732","\uB733","\uB734","\uB735","\uB736","\uB737","\uB738","\uB739","\uB73A","\uB73B","\uB73C","\uB73D","\uB73E","\uB73F"
,"\uB740","\uB741","\uB742","\uB743","\uB744","\uB745","\uB746","\uB747","\uB748","\uB749","\uB74A","\uB74B","\uB74C","\uB74D","\uB74E","\uB74F"
,"\uB750","\uB751","\uB752","\uB753","\uB754","\uB755","\uB756","\uB757","\uB758","\uB759","\uB75A","\uB75B","\uB75C","\uB75D","\uB75E","\uB75F"
,"\uB760","\uB761","\uB762","\uB763","\uB764","\uB765","\uB766","\uB767","\uB768","\uB769","\uB76A","\uB76B","\uB76C","\uB76D","\uB76E","\uB76F"
,"\uB770","\uB771","\uB772","\uB773","\uB774","\uB775","\uB776","\uB777","\uB778","\uB779","\uB77A","\uB77B","\uB77C","\uB77D","\uB77E","\uB77F"
,"\uB780","\uB781","\uB782","\uB783","\uB784","\uB785","\uB786","\uB787","\uB788","\uB789","\uB78A","\uB78B","\uB78C","\uB78D","\uB78E","\uB78F"
,"\uB790","\uB791","\uB792","\uB793","\uB794","\uB795","\uB796","\uB797","\uB798","\uB799","\uB79A","\uB79B","\uB79C","\uB79D","\uB79E","\uB79F"
,"\uB7A0","\uB7A1","\uB7A2","\uB7A3","\uB7A4","\uB7A5","\uB7A6","\uB7A7","\uB7A8","\uB7A9","\uB7AA","\uB7AB","\uB7AC","\uB7AD","\uB7AE","\uB7AF"
,"\uB7B0","\uB7B1","\uB7B2","\uB7B3","\uB7B4","\uB7B5","\uB7B6","\uB7B7","\uB7B8","\uB7B9","\uB7BA","\uB7BB","\uB7BC","\uB7BD","\uB7BE","\uB7BF"
,"\uB7C0","\uB7C1","\uB7C2","\uB7C3","\uB7C4","\uB7C5","\uB7C6","\uB7C7","\uB7C8","\uB7C9","\uB7CA","\uB7CB","\uB7CC","\uB7CD","\uB7CE","\uB7CF"
,"\uB7D0","\uB7D1","\uB7D2","\uB7D3","\uB7D4","\uB7D5","\uB7D6","\uB7D7","\uB7D8","\uB7D9","\uB7DA","\uB7DB","\uB7DC","\uB7DD","\uB7DE","\uB7DF"
,"\uB7E0","\uB7E1","\uB7E2","\uB7E3","\uB7E4","\uB7E5","\uB7E6","\uB7E7","\uB7E8","\uB7E9","\uB7EA","\uB7EB","\uB7EC","\uB7ED","\uB7EE","\uB7EF"
,"\uB7F0","\uB7F1","\uB7F2","\uB7F3","\uB7F4","\uB7F5","\uB7F6","\uB7F7","\uB7F8","\uB7F9","\uB7FA","\uB7FB","\uB7FC","\uB7FD","\uB7FE","\uB7FF"
,"\uB800","\uB801","\uB802","\uB803","\uB804","\uB805","\uB806","\uB807","\uB808","\uB809","\uB80A","\uB80B","\uB80C","\uB80D","\uB80E","\uB80F"
,"\uB810","\uB811","\uB812","\uB813","\uB814","\uB815","\uB816","\uB817","\uB818","\uB819","\uB81A","\uB81B","\uB81C","\uB81D","\uB81E","\uB81F"
,"\uB820","\uB821","\uB822","\uB823","\uB824","\uB825","\uB826","\uB827","\uB828","\uB829","\uB82A","\uB82B","\uB82C","\uB82D","\uB82E","\uB82F"
,"\uB830","\uB831","\uB832","\uB833","\uB834","\uB835","\uB836","\uB837","\uB838","\uB839","\uB83A","\uB83B","\uB83C","\uB83D","\uB83E","\uB83F"
,"\uB840","\uB841","\uB842","\uB843","\uB844","\uB845","\uB846","\uB847","\uB848","\uB849","\uB84A","\uB84B","\uB84C","\uB84D","\uB84E","\uB84F"
,"\uB850","\uB851","\uB852","\uB853","\uB854","\uB855","\uB856","\uB857","\uB858","\uB859","\uB85A","\uB85B","\uB85C","\uB85D","\uB85E","\uB85F"
,"\uB860","\uB861","\uB862","\uB863","\uB864","\uB865","\uB866","\uB867","\uB868","\uB869","\uB86A","\uB86B","\uB86C","\uB86D","\uB86E","\uB86F"
,"\uB870","\uB871","\uB872","\uB873","\uB874","\uB875","\uB876","\uB877","\uB878","\uB879","\uB87A","\uB87B","\uB87C","\uB87D","\uB87E","\uB87F"
,"\uB880","\uB881","\uB882","\uB883","\uB884","\uB885","\uB886","\uB887","\uB888","\uB889","\uB88A","\uB88B","\uB88C","\uB88D","\uB88E","\uB88F"
,"\uB890","\uB891","\uB892","\uB893","\uB894","\uB895","\uB896","\uB897","\uB898","\uB899","\uB89A","\uB89B","\uB89C","\uB89D","\uB89E","\uB89F"
,"\uB8A0","\uB8A1","\uB8A2","\uB8A3","\uB8A4","\uB8A5","\uB8A6","\uB8A7","\uB8A8","\uB8A9","\uB8AA","\uB8AB","\uB8AC","\uB8AD","\uB8AE","\uB8AF"
,"\uB8B0","\uB8B1","\uB8B2","\uB8B3","\uB8B4","\uB8B5","\uB8B6","\uB8B7","\uB8B8","\uB8B9","\uB8BA","\uB8BB","\uB8BC","\uB8BD","\uB8BE","\uB8BF"
,"\uB8C0","\uB8C1","\uB8C2","\uB8C3","\uB8C4","\uB8C5","\uB8C6","\uB8C7","\uB8C8","\uB8C9","\uB8CA","\uB8CB","\uB8CC","\uB8CD","\uB8CE","\uB8CF"
,"\uB8D0","\uB8D1","\uB8D2","\uB8D3","\uB8D4","\uB8D5","\uB8D6","\uB8D7","\uB8D8","\uB8D9","\uB8DA","\uB8DB","\uB8DC","\uB8DD","\uB8DE","\uB8DF"
,"\uB8E0","\uB8E1","\uB8E2","\uB8E3","\uB8E4","\uB8E5","\uB8E6","\uB8E7","\uB8E8","\uB8E9","\uB8EA","\uB8EB","\uB8EC","\uB8ED","\uB8EE","\uB8EF"
,"\uB8F0","\uB8F1","\uB8F2","\uB8F3","\uB8F4","\uB8F5","\uB8F6","\uB8F7","\uB8F8","\uB8F9","\uB8FA","\uB8FB","\uB8FC","\uB8FD","\uB8FE","\uB8FF"
,"\uB900","\uB901","\uB902","\uB903","\uB904","\uB905","\uB906","\uB907","\uB908","\uB909","\uB90A","\uB90B","\uB90C","\uB90D","\uB90E","\uB90F"
,"\uB910","\uB911","\uB912","\uB913","\uB914","\uB915","\uB916","\uB917","\uB918","\uB919","\uB91A","\uB91B","\uB91C","\uB91D","\uB91E","\uB91F"
,"\uB920","\uB921","\uB922","\uB923","\uB924","\uB925","\uB926","\uB927","\uB928","\uB929","\uB92A","\uB92B","\uB92C","\uB92D","\uB92E","\uB92F"
,"\uB930","\uB931","\uB932","\uB933","\uB934","\uB935","\uB936","\uB937","\uB938","\uB939","\uB93A","\uB93B","\uB93C","\uB93D","\uB93E","\uB93F"
,"\uB940","\uB941","\uB942","\uB943","\uB944","\uB945","\uB946","\uB947","\uB948","\uB949","\uB94A","\uB94B","\uB94C","\uB94D","\uB94E","\uB94F"
,"\uB950","\uB951","\uB952","\uB953","\uB954","\uB955","\uB956","\uB957","\uB958","\uB959","\uB95A","\uB95B","\uB95C","\uB95D","\uB95E","\uB95F"
,"\uB960","\uB961","\uB962","\uB963","\uB964","\uB965","\uB966","\uB967","\uB968","\uB969","\uB96A","\uB96B","\uB96C","\uB96D","\uB96E","\uB96F"
,"\uB970","\uB971","\uB972","\uB973","\uB974","\uB975","\uB976","\uB977","\uB978","\uB979","\uB97A","\uB97B","\uB97C","\uB97D","\uB97E","\uB97F"
,"\uB980","\uB981","\uB982","\uB983","\uB984","\uB985","\uB986","\uB987","\uB988","\uB989","\uB98A","\uB98B","\uB98C","\uB98D","\uB98E","\uB98F"
,"\uB990","\uB991","\uB992","\uB993","\uB994","\uB995","\uB996","\uB997","\uB998","\uB999","\uB99A","\uB99B","\uB99C","\uB99D","\uB99E","\uB99F"
,"\uB9A0","\uB9A1","\uB9A2","\uB9A3","\uB9A4","\uB9A5","\uB9A6","\uB9A7","\uB9A8","\uB9A9","\uB9AA","\uB9AB","\uB9AC","\uB9AD","\uB9AE","\uB9AF"
,"\uB9B0","\uB9B1","\uB9B2","\uB9B3","\uB9B4","\uB9B5","\uB9B6","\uB9B7","\uB9B8","\uB9B9","\uB9BA","\uB9BB","\uB9BC","\uB9BD","\uB9BE","\uB9BF"
,"\uB9C0","\uB9C1","\uB9C2","\uB9C3","\uB9C4","\uB9C5","\uB9C6","\uB9C7","\uB9C8","\uB9C9","\uB9CA","\uB9CB","\uB9CC","\uB9CD","\uB9CE","\uB9CF"
,"\uB9D0","\uB9D1","\uB9D2","\uB9D3","\uB9D4","\uB9D5","\uB9D6","\uB9D7","\uB9D8","\uB9D9","\uB9DA","\uB9DB","\uB9DC","\uB9DD","\uB9DE","\uB9DF"
,"\uB9E0","\uB9E1","\uB9E2","\uB9E3","\uB9E4","\uB9E5","\uB9E6","\uB9E7","\uB9E8","\uB9E9","\uB9EA","\uB9EB","\uB9EC","\uB9ED","\uB9EE","\uB9EF"
,"\uB9F0","\uB9F1","\uB9F2","\uB9F3","\uB9F4","\uB9F5","\uB9F6","\uB9F7","\uB9F8","\uB9F9","\uB9FA","\uB9FB","\uB9FC","\uB9FD","\uB9FE","\uB9FF"
,"\uBA00","\uBA01","\uBA02","\uBA03","\uBA04","\uBA05","\uBA06","\uBA07","\uBA08","\uBA09","\uBA0A","\uBA0B","\uBA0C","\uBA0D","\uBA0E","\uBA0F"
,"\uBA10","\uBA11","\uBA12","\uBA13","\uBA14","\uBA15","\uBA16","\uBA17","\uBA18","\uBA19","\uBA1A","\uBA1B","\uBA1C","\uBA1D","\uBA1E","\uBA1F"
,"\uBA20","\uBA21","\uBA22","\uBA23","\uBA24","\uBA25","\uBA26","\uBA27","\uBA28","\uBA29","\uBA2A","\uBA2B","\uBA2C","\uBA2D","\uBA2E","\uBA2F"
,"\uBA30","\uBA31","\uBA32","\uBA33","\uBA34","\uBA35","\uBA36","\uBA37","\uBA38","\uBA39","\uBA3A","\uBA3B","\uBA3C","\uBA3D","\uBA3E","\uBA3F"
,"\uBA40","\uBA41","\uBA42","\uBA43","\uBA44","\uBA45","\uBA46","\uBA47","\uBA48","\uBA49","\uBA4A","\uBA4B","\uBA4C","\uBA4D","\uBA4E","\uBA4F"
,"\uBA50","\uBA51","\uBA52","\uBA53","\uBA54","\uBA55","\uBA56","\uBA57","\uBA58","\uBA59","\uBA5A","\uBA5B","\uBA5C","\uBA5D","\uBA5E","\uBA5F"
,"\uBA60","\uBA61","\uBA62","\uBA63","\uBA64","\uBA65","\uBA66","\uBA67","\uBA68","\uBA69","\uBA6A","\uBA6B","\uBA6C","\uBA6D","\uBA6E","\uBA6F"
,"\uBA70","\uBA71","\uBA72","\uBA73","\uBA74","\uBA75","\uBA76","\uBA77","\uBA78","\uBA79","\uBA7A","\uBA7B","\uBA7C","\uBA7D","\uBA7E","\uBA7F"
,"\uBA80","\uBA81","\uBA82","\uBA83","\uBA84","\uBA85","\uBA86","\uBA87","\uBA88","\uBA89","\uBA8A","\uBA8B","\uBA8C","\uBA8D","\uBA8E","\uBA8F"
,"\uBA90","\uBA91","\uBA92","\uBA93","\uBA94","\uBA95","\uBA96","\uBA97","\uBA98","\uBA99","\uBA9A","\uBA9B","\uBA9C","\uBA9D","\uBA9E","\uBA9F"
,"\uBAA0","\uBAA1","\uBAA2","\uBAA3","\uBAA4","\uBAA5","\uBAA6","\uBAA7","\uBAA8","\uBAA9","\uBAAA","\uBAAB","\uBAAC","\uBAAD","\uBAAE","\uBAAF"
,"\uBAB0","\uBAB1","\uBAB2","\uBAB3","\uBAB4","\uBAB5","\uBAB6","\uBAB7","\uBAB8","\uBAB9","\uBABA","\uBABB","\uBABC","\uBABD","\uBABE","\uBABF"
,"\uBAC0","\uBAC1","\uBAC2","\uBAC3","\uBAC4","\uBAC5","\uBAC6","\uBAC7","\uBAC8","\uBAC9","\uBACA","\uBACB","\uBACC","\uBACD","\uBACE","\uBACF"
,"\uBAD0","\uBAD1","\uBAD2","\uBAD3","\uBAD4","\uBAD5","\uBAD6","\uBAD7","\uBAD8","\uBAD9","\uBADA","\uBADB","\uBADC","\uBADD","\uBADE","\uBADF"
,"\uBAE0","\uBAE1","\uBAE2","\uBAE3","\uBAE4","\uBAE5","\uBAE6","\uBAE7","\uBAE8","\uBAE9","\uBAEA","\uBAEB","\uBAEC","\uBAED","\uBAEE","\uBAEF"
,"\uBAF0","\uBAF1","\uBAF2","\uBAF3","\uBAF4","\uBAF5","\uBAF6","\uBAF7","\uBAF8","\uBAF9","\uBAFA","\uBAFB","\uBAFC","\uBAFD","\uBAFE","\uBAFF"
,"\uBB00","\uBB01","\uBB02","\uBB03","\uBB04","\uBB05","\uBB06","\uBB07","\uBB08","\uBB09","\uBB0A","\uBB0B","\uBB0C","\uBB0D","\uBB0E","\uBB0F"
,"\uBB10","\uBB11","\uBB12","\uBB13","\uBB14","\uBB15","\uBB16","\uBB17","\uBB18","\uBB19","\uBB1A","\uBB1B","\uBB1C","\uBB1D","\uBB1E","\uBB1F"
,"\uBB20","\uBB21","\uBB22","\uBB23","\uBB24","\uBB25","\uBB26","\uBB27","\uBB28","\uBB29","\uBB2A","\uBB2B","\uBB2C","\uBB2D","\uBB2E","\uBB2F"
,"\uBB30","\uBB31","\uBB32","\uBB33","\uBB34","\uBB35","\uBB36","\uBB37","\uBB38","\uBB39","\uBB3A","\uBB3B","\uBB3C","\uBB3D","\uBB3E","\uBB3F"
,"\uBB40","\uBB41","\uBB42","\uBB43","\uBB44","\uBB45","\uBB46","\uBB47","\uBB48","\uBB49","\uBB4A","\uBB4B","\uBB4C","\uBB4D","\uBB4E","\uBB4F"
,"\uBB50","\uBB51","\uBB52","\uBB53","\uBB54","\uBB55","\uBB56","\uBB57","\uBB58","\uBB59","\uBB5A","\uBB5B","\uBB5C","\uBB5D","\uBB5E","\uBB5F"
,"\uBB60","\uBB61","\uBB62","\uBB63","\uBB64","\uBB65","\uBB66","\uBB67","\uBB68","\uBB69","\uBB6A","\uBB6B","\uBB6C","\uBB6D","\uBB6E","\uBB6F"
,"\uBB70","\uBB71","\uBB72","\uBB73","\uBB74","\uBB75","\uBB76","\uBB77","\uBB78","\uBB79","\uBB7A","\uBB7B","\uBB7C","\uBB7D","\uBB7E","\uBB7F"
,"\uBB80","\uBB81","\uBB82","\uBB83","\uBB84","\uBB85","\uBB86","\uBB87","\uBB88","\uBB89","\uBB8A","\uBB8B","\uBB8C","\uBB8D","\uBB8E","\uBB8F"
,"\uBB90","\uBB91","\uBB92","\uBB93","\uBB94","\uBB95","\uBB96","\uBB97","\uBB98","\uBB99","\uBB9A","\uBB9B","\uBB9C","\uBB9D","\uBB9E","\uBB9F"
,"\uBBA0","\uBBA1","\uBBA2","\uBBA3","\uBBA4","\uBBA5","\uBBA6","\uBBA7","\uBBA8","\uBBA9","\uBBAA","\uBBAB","\uBBAC","\uBBAD","\uBBAE","\uBBAF"
,"\uBBB0","\uBBB1","\uBBB2","\uBBB3","\uBBB4","\uBBB5","\uBBB6","\uBBB7","\uBBB8","\uBBB9","\uBBBA","\uBBBB","\uBBBC","\uBBBD","\uBBBE","\uBBBF"
,"\uBBC0","\uBBC1","\uBBC2","\uBBC3","\uBBC4","\uBBC5","\uBBC6","\uBBC7","\uBBC8","\uBBC9","\uBBCA","\uBBCB","\uBBCC","\uBBCD","\uBBCE","\uBBCF"
,"\uBBD0","\uBBD1","\uBBD2","\uBBD3","\uBBD4","\uBBD5","\uBBD6","\uBBD7","\uBBD8","\uBBD9","\uBBDA","\uBBDB","\uBBDC","\uBBDD","\uBBDE","\uBBDF"
,"\uBBE0","\uBBE1","\uBBE2","\uBBE3","\uBBE4","\uBBE5","\uBBE6","\uBBE7","\uBBE8","\uBBE9","\uBBEA","\uBBEB","\uBBEC","\uBBED","\uBBEE","\uBBEF"
,"\uBBF0","\uBBF1","\uBBF2","\uBBF3","\uBBF4","\uBBF5","\uBBF6","\uBBF7","\uBBF8","\uBBF9","\uBBFA","\uBBFB","\uBBFC","\uBBFD","\uBBFE","\uBBFF"
,"\uBC00","\uBC01","\uBC02","\uBC03","\uBC04","\uBC05","\uBC06","\uBC07","\uBC08","\uBC09","\uBC0A","\uBC0B","\uBC0C","\uBC0D","\uBC0E","\uBC0F"
,"\uBC10","\uBC11","\uBC12","\uBC13","\uBC14","\uBC15","\uBC16","\uBC17","\uBC18","\uBC19","\uBC1A","\uBC1B","\uBC1C","\uBC1D","\uBC1E","\uBC1F"
,"\uBC20","\uBC21","\uBC22","\uBC23","\uBC24","\uBC25","\uBC26","\uBC27","\uBC28","\uBC29","\uBC2A","\uBC2B","\uBC2C","\uBC2D","\uBC2E","\uBC2F"
,"\uBC30","\uBC31","\uBC32","\uBC33","\uBC34","\uBC35","\uBC36","\uBC37","\uBC38","\uBC39","\uBC3A","\uBC3B","\uBC3C","\uBC3D","\uBC3E","\uBC3F"
,"\uBC40","\uBC41","\uBC42","\uBC43","\uBC44","\uBC45","\uBC46","\uBC47","\uBC48","\uBC49","\uBC4A","\uBC4B","\uBC4C","\uBC4D","\uBC4E","\uBC4F"
,"\uBC50","\uBC51","\uBC52","\uBC53","\uBC54","\uBC55","\uBC56","\uBC57","\uBC58","\uBC59","\uBC5A","\uBC5B","\uBC5C","\uBC5D","\uBC5E","\uBC5F"
,"\uBC60","\uBC61","\uBC62","\uBC63","\uBC64","\uBC65","\uBC66","\uBC67","\uBC68","\uBC69","\uBC6A","\uBC6B","\uBC6C","\uBC6D","\uBC6E","\uBC6F"
,"\uBC70","\uBC71","\uBC72","\uBC73","\uBC74","\uBC75","\uBC76","\uBC77","\uBC78","\uBC79","\uBC7A","\uBC7B","\uBC7C","\uBC7D","\uBC7E","\uBC7F"
,"\uBC80","\uBC81","\uBC82","\uBC83","\uBC84","\uBC85","\uBC86","\uBC87","\uBC88","\uBC89","\uBC8A","\uBC8B","\uBC8C","\uBC8D","\uBC8E","\uBC8F"
,"\uBC90","\uBC91","\uBC92","\uBC93","\uBC94","\uBC95","\uBC96","\uBC97","\uBC98","\uBC99","\uBC9A","\uBC9B","\uBC9C","\uBC9D","\uBC9E","\uBC9F"
,"\uBCA0","\uBCA1","\uBCA2","\uBCA3","\uBCA4","\uBCA5","\uBCA6","\uBCA7","\uBCA8","\uBCA9","\uBCAA","\uBCAB","\uBCAC","\uBCAD","\uBCAE","\uBCAF"
,"\uBCB0","\uBCB1","\uBCB2","\uBCB3","\uBCB4","\uBCB5","\uBCB6","\uBCB7","\uBCB8","\uBCB9","\uBCBA","\uBCBB","\uBCBC","\uBCBD","\uBCBE","\uBCBF"
,"\uBCC0","\uBCC1","\uBCC2","\uBCC3","\uBCC4","\uBCC5","\uBCC6","\uBCC7","\uBCC8","\uBCC9","\uBCCA","\uBCCB","\uBCCC","\uBCCD","\uBCCE","\uBCCF"
,"\uBCD0","\uBCD1","\uBCD2","\uBCD3","\uBCD4","\uBCD5","\uBCD6","\uBCD7","\uBCD8","\uBCD9","\uBCDA","\uBCDB","\uBCDC","\uBCDD","\uBCDE","\uBCDF"
,"\uBCE0","\uBCE1","\uBCE2","\uBCE3","\uBCE4","\uBCE5","\uBCE6","\uBCE7","\uBCE8","\uBCE9","\uBCEA","\uBCEB","\uBCEC","\uBCED","\uBCEE","\uBCEF"
,"\uBCF0","\uBCF1","\uBCF2","\uBCF3","\uBCF4","\uBCF5","\uBCF6","\uBCF7","\uBCF8","\uBCF9","\uBCFA","\uBCFB","\uBCFC","\uBCFD","\uBCFE","\uBCFF"
,"\uBD00","\uBD01","\uBD02","\uBD03","\uBD04","\uBD05","\uBD06","\uBD07","\uBD08","\uBD09","\uBD0A","\uBD0B","\uBD0C","\uBD0D","\uBD0E","\uBD0F"
,"\uBD10","\uBD11","\uBD12","\uBD13","\uBD14","\uBD15","\uBD16","\uBD17","\uBD18","\uBD19","\uBD1A","\uBD1B","\uBD1C","\uBD1D","\uBD1E","\uBD1F"
,"\uBD20","\uBD21","\uBD22","\uBD23","\uBD24","\uBD25","\uBD26","\uBD27","\uBD28","\uBD29","\uBD2A","\uBD2B","\uBD2C","\uBD2D","\uBD2E","\uBD2F"
,"\uBD30","\uBD31","\uBD32","\uBD33","\uBD34","\uBD35","\uBD36","\uBD37","\uBD38","\uBD39","\uBD3A","\uBD3B","\uBD3C","\uBD3D","\uBD3E","\uBD3F"
,"\uBD40","\uBD41","\uBD42","\uBD43","\uBD44","\uBD45","\uBD46","\uBD47","\uBD48","\uBD49","\uBD4A","\uBD4B","\uBD4C","\uBD4D","\uBD4E","\uBD4F"
,"\uBD50","\uBD51","\uBD52","\uBD53","\uBD54","\uBD55","\uBD56","\uBD57","\uBD58","\uBD59","\uBD5A","\uBD5B","\uBD5C","\uBD5D","\uBD5E","\uBD5F"
,"\uBD60","\uBD61","\uBD62","\uBD63","\uBD64","\uBD65","\uBD66","\uBD67","\uBD68","\uBD69","\uBD6A","\uBD6B","\uBD6C","\uBD6D","\uBD6E","\uBD6F"
,"\uBD70","\uBD71","\uBD72","\uBD73","\uBD74","\uBD75","\uBD76","\uBD77","\uBD78","\uBD79","\uBD7A","\uBD7B","\uBD7C","\uBD7D","\uBD7E","\uBD7F"
,"\uBD80","\uBD81","\uBD82","\uBD83","\uBD84","\uBD85","\uBD86","\uBD87","\uBD88","\uBD89","\uBD8A","\uBD8B","\uBD8C","\uBD8D","\uBD8E","\uBD8F"
,"\uBD90","\uBD91","\uBD92","\uBD93","\uBD94","\uBD95","\uBD96","\uBD97","\uBD98","\uBD99","\uBD9A","\uBD9B","\uBD9C","\uBD9D","\uBD9E","\uBD9F"
,"\uBDA0","\uBDA1","\uBDA2","\uBDA3","\uBDA4","\uBDA5","\uBDA6","\uBDA7","\uBDA8","\uBDA9","\uBDAA","\uBDAB","\uBDAC","\uBDAD","\uBDAE","\uBDAF"
,"\uBDB0","\uBDB1","\uBDB2","\uBDB3","\uBDB4","\uBDB5","\uBDB6","\uBDB7","\uBDB8","\uBDB9","\uBDBA","\uBDBB","\uBDBC","\uBDBD","\uBDBE","\uBDBF"
,"\uBDC0","\uBDC1","\uBDC2","\uBDC3","\uBDC4","\uBDC5","\uBDC6","\uBDC7","\uBDC8","\uBDC9","\uBDCA","\uBDCB","\uBDCC","\uBDCD","\uBDCE","\uBDCF"
,"\uBDD0","\uBDD1","\uBDD2","\uBDD3","\uBDD4","\uBDD5","\uBDD6","\uBDD7","\uBDD8","\uBDD9","\uBDDA","\uBDDB","\uBDDC","\uBDDD","\uBDDE","\uBDDF"
,"\uBDE0","\uBDE1","\uBDE2","\uBDE3","\uBDE4","\uBDE5","\uBDE6","\uBDE7","\uBDE8","\uBDE9","\uBDEA","\uBDEB","\uBDEC","\uBDED","\uBDEE","\uBDEF"
,"\uBDF0","\uBDF1","\uBDF2","\uBDF3","\uBDF4","\uBDF5","\uBDF6","\uBDF7","\uBDF8","\uBDF9","\uBDFA","\uBDFB","\uBDFC","\uBDFD","\uBDFE","\uBDFF"
,"\uBE00","\uBE01","\uBE02","\uBE03","\uBE04","\uBE05","\uBE06","\uBE07","\uBE08","\uBE09","\uBE0A","\uBE0B","\uBE0C","\uBE0D","\uBE0E","\uBE0F"
,"\uBE10","\uBE11","\uBE12","\uBE13","\uBE14","\uBE15","\uBE16","\uBE17","\uBE18","\uBE19","\uBE1A","\uBE1B","\uBE1C","\uBE1D","\uBE1E","\uBE1F"
,"\uBE20","\uBE21","\uBE22","\uBE23","\uBE24","\uBE25","\uBE26","\uBE27","\uBE28","\uBE29","\uBE2A","\uBE2B","\uBE2C","\uBE2D","\uBE2E","\uBE2F"
,"\uBE30","\uBE31","\uBE32","\uBE33","\uBE34","\uBE35","\uBE36","\uBE37","\uBE38","\uBE39","\uBE3A","\uBE3B","\uBE3C","\uBE3D","\uBE3E","\uBE3F"
,"\uBE40","\uBE41","\uBE42","\uBE43","\uBE44","\uBE45","\uBE46","\uBE47","\uBE48","\uBE49","\uBE4A","\uBE4B","\uBE4C","\uBE4D","\uBE4E","\uBE4F"
,"\uBE50","\uBE51","\uBE52","\uBE53","\uBE54","\uBE55","\uBE56","\uBE57","\uBE58","\uBE59","\uBE5A","\uBE5B","\uBE5C","\uBE5D","\uBE5E","\uBE5F"
,"\uBE60","\uBE61","\uBE62","\uBE63","\uBE64","\uBE65","\uBE66","\uBE67","\uBE68","\uBE69","\uBE6A","\uBE6B","\uBE6C","\uBE6D","\uBE6E","\uBE6F"
,"\uBE70","\uBE71","\uBE72","\uBE73","\uBE74","\uBE75","\uBE76","\uBE77","\uBE78","\uBE79","\uBE7A","\uBE7B","\uBE7C","\uBE7D","\uBE7E","\uBE7F"
,"\uBE80","\uBE81","\uBE82","\uBE83","\uBE84","\uBE85","\uBE86","\uBE87","\uBE88","\uBE89","\uBE8A","\uBE8B","\uBE8C","\uBE8D","\uBE8E","\uBE8F"
,"\uBE90","\uBE91","\uBE92","\uBE93","\uBE94","\uBE95","\uBE96","\uBE97","\uBE98","\uBE99","\uBE9A","\uBE9B","\uBE9C","\uBE9D","\uBE9E","\uBE9F"
,"\uBEA0","\uBEA1","\uBEA2","\uBEA3","\uBEA4","\uBEA5","\uBEA6","\uBEA7","\uBEA8","\uBEA9","\uBEAA","\uBEAB","\uBEAC","\uBEAD","\uBEAE","\uBEAF"
,"\uBEB0","\uBEB1","\uBEB2","\uBEB3","\uBEB4","\uBEB5","\uBEB6","\uBEB7","\uBEB8","\uBEB9","\uBEBA","\uBEBB","\uBEBC","\uBEBD","\uBEBE","\uBEBF"
,"\uBEC0","\uBEC1","\uBEC2","\uBEC3","\uBEC4","\uBEC5","\uBEC6","\uBEC7","\uBEC8","\uBEC9","\uBECA","\uBECB","\uBECC","\uBECD","\uBECE","\uBECF"
,"\uBED0","\uBED1","\uBED2","\uBED3","\uBED4","\uBED5","\uBED6","\uBED7","\uBED8","\uBED9","\uBEDA","\uBEDB","\uBEDC","\uBEDD","\uBEDE","\uBEDF"
,"\uBEE0","\uBEE1","\uBEE2","\uBEE3","\uBEE4","\uBEE5","\uBEE6","\uBEE7","\uBEE8","\uBEE9","\uBEEA","\uBEEB","\uBEEC","\uBEED","\uBEEE","\uBEEF"
,"\uBEF0","\uBEF1","\uBEF2","\uBEF3","\uBEF4","\uBEF5","\uBEF6","\uBEF7","\uBEF8","\uBEF9","\uBEFA","\uBEFB","\uBEFC","\uBEFD","\uBEFE","\uBEFF"
,"\uBF00","\uBF01","\uBF02","\uBF03","\uBF04","\uBF05","\uBF06","\uBF07","\uBF08","\uBF09","\uBF0A","\uBF0B","\uBF0C","\uBF0D","\uBF0E","\uBF0F"
,"\uBF10","\uBF11","\uBF12","\uBF13","\uBF14","\uBF15","\uBF16","\uBF17","\uBF18","\uBF19","\uBF1A","\uBF1B","\uBF1C","\uBF1D","\uBF1E","\uBF1F"
,"\uBF20","\uBF21","\uBF22","\uBF23","\uBF24","\uBF25","\uBF26","\uBF27","\uBF28","\uBF29","\uBF2A","\uBF2B","\uBF2C","\uBF2D","\uBF2E","\uBF2F"
,"\uBF30","\uBF31","\uBF32","\uBF33","\uBF34","\uBF35","\uBF36","\uBF37","\uBF38","\uBF39","\uBF3A","\uBF3B","\uBF3C","\uBF3D","\uBF3E","\uBF3F"
,"\uBF40","\uBF41","\uBF42","\uBF43","\uBF44","\uBF45","\uBF46","\uBF47","\uBF48","\uBF49","\uBF4A","\uBF4B","\uBF4C","\uBF4D","\uBF4E","\uBF4F"
,"\uBF50","\uBF51","\uBF52","\uBF53","\uBF54","\uBF55","\uBF56","\uBF57","\uBF58","\uBF59","\uBF5A","\uBF5B","\uBF5C","\uBF5D","\uBF5E","\uBF5F"
,"\uBF60","\uBF61","\uBF62","\uBF63","\uBF64","\uBF65","\uBF66","\uBF67","\uBF68","\uBF69","\uBF6A","\uBF6B","\uBF6C","\uBF6D","\uBF6E","\uBF6F"
,"\uBF70","\uBF71","\uBF72","\uBF73","\uBF74","\uBF75","\uBF76","\uBF77","\uBF78","\uBF79","\uBF7A","\uBF7B","\uBF7C","\uBF7D","\uBF7E","\uBF7F"
,"\uBF80","\uBF81","\uBF82","\uBF83","\uBF84","\uBF85","\uBF86","\uBF87","\uBF88","\uBF89","\uBF8A","\uBF8B","\uBF8C","\uBF8D","\uBF8E","\uBF8F"
,"\uBF90","\uBF91","\uBF92","\uBF93","\uBF94","\uBF95","\uBF96","\uBF97","\uBF98","\uBF99","\uBF9A","\uBF9B","\uBF9C","\uBF9D","\uBF9E","\uBF9F"
,"\uBFA0","\uBFA1","\uBFA2","\uBFA3","\uBFA4","\uBFA5","\uBFA6","\uBFA7","\uBFA8","\uBFA9","\uBFAA","\uBFAB","\uBFAC","\uBFAD","\uBFAE","\uBFAF"
,"\uBFB0","\uBFB1","\uBFB2","\uBFB3","\uBFB4","\uBFB5","\uBFB6","\uBFB7","\uBFB8","\uBFB9","\uBFBA","\uBFBB","\uBFBC","\uBFBD","\uBFBE","\uBFBF"
,"\uBFC0","\uBFC1","\uBFC2","\uBFC3","\uBFC4","\uBFC5","\uBFC6","\uBFC7","\uBFC8","\uBFC9","\uBFCA","\uBFCB","\uBFCC","\uBFCD","\uBFCE","\uBFCF"
,"\uBFD0","\uBFD1","\uBFD2","\uBFD3","\uBFD4","\uBFD5","\uBFD6","\uBFD7","\uBFD8","\uBFD9","\uBFDA","\uBFDB","\uBFDC","\uBFDD","\uBFDE","\uBFDF"
,"\uBFE0","\uBFE1","\uBFE2","\uBFE3","\uBFE4","\uBFE5","\uBFE6","\uBFE7","\uBFE8","\uBFE9","\uBFEA","\uBFEB","\uBFEC","\uBFED","\uBFEE","\uBFEF"
,"\uBFF0","\uBFF1","\uBFF2","\uBFF3","\uBFF4","\uBFF5","\uBFF6","\uBFF7","\uBFF8","\uBFF9","\uBFFA","\uBFFB","\uBFFC","\uBFFD","\uBFFE","\uBFFF"
    };
    
}