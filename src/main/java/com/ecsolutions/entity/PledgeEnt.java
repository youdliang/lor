package com.ecsolutions.entity;


import com.fasterxml.jackson.annotation.JsonInclude;

/**
* Created by tim on 2017/6/27.
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PledgeEnt extends BaseEnt {


    private String line_no                        ;
    private String custcod                        ;
    private String ID                             ;
    private Integer Mode1;
    private String AmountCCY                      ;
    private Integer Amount                         ;
    private String ValueCCY                       ;
    private Integer Value                          ;
    private String ContractNumber                 ;
    private String SignedDate                     ;
    private String BankAccountName                ;
    private String BankAccountType                ;
    private String BankName                       ;
    private String BankAccount                    ;
    private String BankAccountCCY                 ;
    private Integer BankAccountBalance             ;
    private Integer BankAccountIsTrust             ;
    private String BankPledgeName                 ;
    private Integer BankPledgeOwnerType            ;
    private String BankPledgeEffectiveDate        ;
    private String BankPledgeLastDate             ;
    private Integer BankIsFreezed                  ;
    private String Ethnic                         ;
    private String pIdTypeId                      ;
    private String pIdNo                          ;
    private String MortgagorName                  ;
    private String ContactAddress                 ;
    private String ContactPhone                   ;
    private String CerOrg                         ;
    private String CerCustomer                    ;
    private String CerNO                          ;
    private Integer CerAccount                     ;
    private String CerEffectiveDate               ;
    private String CerLastDate                    ;
    private String CerAmount                      ;
    private String CDName                         ;
    private Integer CDType                         ;
    private String CDNO                           ;
    private String CDAccount                      ;
    private String CDBank                         ;
    private Integer CDIsSelfBank                   ;
    private String CDAmount                       ;
    private String CDIsStopPay                    ;
    private String NotesType                      ;
    private String NotesNO                        ;
    private Integer NotesAmount                    ;
    private String NotesBank                      ;
    private String NotesSignedDate                ;
    private String NotesLastDate                  ;
    private String NotesAddress                   ;
    private String WrOwner                        ;
    private String WrOrg                          ;
    private String WrNo                           ;
    private String WrName                         ;
    private String WrStandard                     ;
    private String WrUnit                         ;
    private Integer WrNumber                       ;
    private String WrDeliveryStaff                ;
    private String WrAcceptanceStaff              ;
    private Integer WrGoodsValue                   ;
    private Integer WrStorageCosts                 ;
    private Integer WrHaveInsurance                ;
    private String WrInsuranceBeginDate           ;
    private String WrInsuranceEndDate             ;
    private String LadOrg                         ;
    private String LadNo                          ;
    private String LadContractNo                  ;
    private String LadCommodityCoding             ;
    private String LadShippingUnit                ;
    private String LadGoods                       ;
    private String LadRule                        ;
    private String LadCharacter                   ;
    private Integer LadDeliveryNumber              ;
    private String LadDeliveryAddress             ;
    private String LadDrawer                      ;
    private String StockOwnerName                 ;
    private Integer StockNumber                    ;
    private String StockNo                        ;
    private String StockNature                    ;
    private String StockHoldersName               ;
    private String StockSecuritiesAccountNo       ;
    private String StockInstitutions              ;
    private String StockRegNo                     ;
    private String StockInvestorsAccount          ;
    private String StockCode                      ;
    private String StockPledgeRef                 ;
    private String StockPledgeNumber              ;
    private String StockPledgeRegDate             ;
    private Integer IntProType                     ;
    private String IntProOwnerName                ;
    private Integer IntProProveOrg                 ;
    private String IntProPatentNumber             ;
    private String IntProRegOrg                   ;
    private String IntProRegDate                  ;
    private String IntProtedDate                  ;
    private String IntProProveDate                ;
    private String IntProPledgeNo                 ;
    private String IntProOrg                      ;
    private String ChargeOrg                      ;
    private String ChargeLicenceNo                ;
    private String ChargeLastDate                 ;
    private String ChargeRegOrg                   ;
    private String AccRecProvePerson              ;
    private String AccRecOwner                    ;
    private String AccRecAmountCCY                ;
    private Integer AccRecAmount;
    private String CarProvePerson                 ;
    private String CarProduction                  ;
    private String CarNo                          ;
    private String CarBrand                       ;
    private String CarType                        ;
    private String CarEngineNo                    ;
    private String CarChassisNo                   ;
    private Integer CarPrice                       ;
    private String Remark                         ;
    private String ChargeProject                  ;
    private String PledgeCustCod                  ;
    private Integer ND_Kind                        ;
    private String ND_ID                          ;
    private Float ND_Rate                        ;
    private float ND_Deadline                    ;
    private float NDAmount;
    private String ND_Bank                        ;
    private String ND_BeginDate                   ;
    private String ND_EndDate                     ;
    private String ND_Address                     ;
    private String Other_Name                     ;
    private String Other_Unit                     ;
    private Integer Other_Number                   ;
    private String Other_Address                  ;
    private String SerialNumber                   ;
    private String action;

    public String   getline_no                   (){  return   line_no                     ;}
    public String   getcustcod                   (){  return   custcod                     ;}
    public String   getID                        (){  return   ID                          ;}
    public Integer getMode1(){  return Mode1;}
    public String   getAmountCCY                 (){  return   AmountCCY                   ;}
    public Integer  getAmount                    (){  return    Amount                     ;}
    public String   getValueCCY                  (){  return   ValueCCY                    ;}
    public Integer  getValue                     (){  return    Value                      ;}
    public String   getContractNumber            (){  return   ContractNumber              ;}
    public String   getSignedDate                (){  return   SignedDate                  ;}
    public String   getBankAccountName           (){  return   BankAccountName             ;}
    public String   getBankAccountType           (){  return   BankAccountType             ;}
    public String   getBankName                  (){  return   BankName                    ;}
    public String   getBankAccount               (){  return   BankAccount                 ;}
    public String   getBankAccountCCY            (){  return   BankAccountCCY              ;}
    public Integer  getBankAccountBalance        (){  return    BankAccountBalance         ;}
    public Integer  getBankAccountIsTrust        (){  return    BankAccountIsTrust         ;}
    public String   getBankPledgeName            (){  return   BankPledgeName              ;}
    public Integer  getBankPledgeOwnerType       (){  return    BankPledgeOwnerType        ;}
    public String   getBankPledgeEffectiveDate   (){  return   BankPledgeEffectiveDate     ;}
    public String   getBankPledgeLastDate        (){  return   BankPledgeLastDate          ;}
    public Integer  getBankIsFreezed             (){  return    BankIsFreezed              ;}
    public String   getEthnic                    (){  return   Ethnic                      ;}
    public String   getpIdTypeId                 (){  return   pIdTypeId                   ;}
    public String   getpIdNo                     (){  return   pIdNo                       ;}
    public String   getMortgagorName             (){  return   MortgagorName               ;}
    public String   getContactAddress            (){  return   ContactAddress              ;}
    public String   getContactPhone              (){  return   ContactPhone                ;}
    public String   getCerOrg                    (){  return   CerOrg                      ;}
    public String   getCerCustomer               (){  return   CerCustomer                 ;}
    public String   getCerNO                     (){  return   CerNO                       ;}
    public Integer  getCerAccount               (){  return    CerAccount                 ;}
    public String   getCerEffectiveDate          (){  return   CerEffectiveDate            ;}
    public String   getCerLastDate               (){  return   CerLastDate                 ;}
    public String   getCerAmount                 (){  return   CerAmount                   ;}
    public String   getCDName                    (){  return   CDName                      ;}
    public Integer  getCDType                    (){  return    CDType                     ;}
    public String   getCDNO                      (){  return   CDNO                        ;}
    public String   getCDAccount                 (){  return   CDAccount                   ;}
    public String   getCDBank                    (){  return   CDBank                      ;}
    public Integer  getCDIsSelfBank             (){  return    CDIsSelfBank               ;}
    public String   getCDAmount                  (){  return   CDAmount                    ;}
    public String   getCDIsStopPay               (){  return   CDIsStopPay                 ;}
    public String   getNotesType                 (){  return   NotesType                   ;}
    public String   getNotesNO                   (){  return   NotesNO                     ;}
    public Integer  getNotesAmount               (){  return    NotesAmount                ;}
    public String   getNotesBank                 (){  return   NotesBank                   ;}
    public String   getNotesSignedDate           (){  return   NotesSignedDate             ;}
    public String   getNotesLastDate             (){  return   NotesLastDate               ;}
    public String   getNotesAddress              (){  return   NotesAddress                ;}
    public String   getWrOwner                   (){  return   WrOwner                     ;}
    public String   getWrOrg                     (){  return   WrOrg                       ;}
    public String   getWrNo                      (){  return   WrNo                        ;}
    public String   getWrName                    (){  return   WrName                      ;}
    public String   getWrStandard                (){  return   WrStandard                  ;}
    public String   getWrUnit                    (){  return   WrUnit                      ;}
    public Integer  getWrNumber                  (){  return    WrNumber                   ;}
    public String   getWrDeliveryStaff           (){  return   WrDeliveryStaff             ;}
    public String   getWrAcceptanceStaff         (){  return   WrAcceptanceStaff           ;}
    public Integer  getWrGoodsValue              (){  return    WrGoodsValue               ;}
    public Integer  getWrStorageCosts            (){  return    WrStorageCosts             ;}
    public Integer  getWrHaveInsurance           (){  return    WrHaveInsurance            ;}
    public String   getWrInsuranceBeginDate      (){  return   WrInsuranceBeginDate        ;}
    public String   getWrInsuranceEndDate        (){  return   WrInsuranceEndDate          ;}
    public String   getLadOrg                    (){  return   LadOrg                      ;}
    public String   getLadNo                     (){  return   LadNo                       ;}
    public String   getLadContractNo             (){  return   LadContractNo               ;}
    public String   getLadCommodityCoding        (){  return   LadCommodityCoding          ;}
    public String   getLadShippingUnit           (){  return   LadShippingUnit             ;}
    public String   getLadGoods                  (){  return   LadGoods                    ;}
    public String   getLadRule                   (){  return   LadRule                     ;}
    public String   getLadCharacter              (){  return   LadCharacter                ;}
    public Integer  getLadDeliveryNumber         (){  return    LadDeliveryNumber          ;}
    public String   getLadDeliveryAddress        (){  return   LadDeliveryAddress          ;}
    public String   getLadDrawer                 (){  return   LadDrawer                   ;}
    public String   getStockOwnerName            (){  return   StockOwnerName              ;}
    public Integer  getStockNumber               (){  return    StockNumber                ;}
    public String   getStockNo                   (){  return   StockNo                     ;}
    public String   getStockNature               (){  return   StockNature                 ;}
    public String   getStockHoldersName          (){  return   StockHoldersName            ;}
    public String   getStockSecuritiesAccountNo  (){  return   StockSecuritiesAccountNo    ;}
    public String   getStockInstitutions         (){  return   StockInstitutions           ;}
    public String   getStockRegNo                (){  return   StockRegNo                  ;}
    public String   getStockInvestorsAccount     (){  return   StockInvestorsAccount       ;}
    public String   getStockCode                 (){  return   StockCode                   ;}
    public String   getStockPledgeRef            (){  return   StockPledgeRef              ;}
    public String   getStockPledgeNumber         (){  return   StockPledgeNumber           ;}
    public String   getStockPledgeRegDate        (){  return   StockPledgeRegDate          ;}
    public Integer  getIntProType                (){  return    IntProType                 ;}
    public String   getIntProOwnerName           (){  return   IntProOwnerName             ;}
    public Integer  getIntProProveOrg            (){  return    IntProProveOrg             ;}
    public String   getIntProPatentNumber        (){  return   IntProPatentNumber          ;}
    public String   getIntProRegOrg              (){  return   IntProRegOrg                ;}
    public String   getIntProRegDate             (){  return   IntProRegDate               ;}
    public String   getIntProtedDate             (){  return   IntProtedDate               ;}
    public String   getIntProProveDate           (){  return   IntProProveDate             ;}
    public String   getIntProPledgeNo            (){  return   IntProPledgeNo              ;}
    public String   getIntProOrg                 (){  return   IntProOrg                   ;}
    public String   getChargeOrg                 (){  return   ChargeOrg                   ;}
    public String   getChargeLicenceNo           (){  return   ChargeLicenceNo             ;}
    public String   getChargeLastDate            (){  return   ChargeLastDate              ;}
    public String   getChargeRegOrg              (){  return   ChargeRegOrg                ;}
    public String   getAccRecProvePerson         (){  return   AccRecProvePerson           ;}
    public String   getAccRecOwner               (){  return   AccRecOwner                 ;}
    public String   getAccRecAmountCCY           (){  return   AccRecAmountCCY             ;}
    public Integer   getAccRecAmount              (){  return   AccRecAmount;}
    public String   getCarProvePerson            (){  return   CarProvePerson              ;}
    public String   getCarProduction             (){  return   CarProduction               ;}
    public String   getCarNo                     (){  return   CarNo                       ;}
    public String   getCarBrand                  (){  return   CarBrand                    ;}
    public String   getCarType                   (){  return   CarType                     ;}
    public String   getCarEngineNo               (){  return   CarEngineNo                 ;}
    public String   getCarChassisNo              (){  return   CarChassisNo                ;}
    public Integer  getCarPrice                  (){  return    CarPrice                   ;}
    public String   getRemark                    (){  return   Remark                      ;}
    public String   getChargeProject             (){  return   ChargeProject               ;}
    public String   getPledgeCustCod             (){  return   PledgeCustCod               ;}
    public Integer  getND_Kind                   (){  return    ND_Kind                    ;}
    public String   getND_ID                     (){  return   ND_ID                       ;}
    public Float    getND_Rate                   (){  return   ND_Rate                     ;}
    public float    getND_Deadline               (){  return   ND_Deadline                 ;}
    public float    getNDAmount                 (){  return NDAmount;}
    public String   getND_Bank                   (){  return   ND_Bank                     ;}
    public String   getND_BeginDate              (){  return   ND_BeginDate                ;}
    public String   getND_EndDate                (){  return   ND_EndDate                  ;}
    public String   getND_Address                (){  return   ND_Address                  ;}
    public String   getOther_Name                (){  return   Other_Name                  ;}
    public String   getOther_Unit                (){  return   Other_Unit                  ;}
    public Integer  getOther_Number              (){  return    Other_Number               ;}
    public String   getOther_Address             (){  return   Other_Address               ;}
    public String   getSerialNumber              (){  return   SerialNumber                ;}

    public String   getAction             (){  return   action                ;}

    public void  setline_no                   (String  tmpline_no                   ){    line_no                   =tmpline_no                   ;}
    public void  setcustcod                   (String  tmpcustcod                   ){    custcod                   =tmpcustcod                   ;}
    public void  setID                        (String  tmpID                        ){    ID                        =tmpID                        ;}
    public void setMode1(Integer tmpMode                      ){     Mode1 =tmpMode                      ;}
    public void  setAmountCCY                 (String  tmpAmountCCY                 ){    AmountCCY                 =tmpAmountCCY                 ;}
    public void  setAmount                    (Integer tmpAmount                    ){     Amount                   =tmpAmount                    ;}
    public void  setValueCCY                  (String  tmpValueCCY                  ){    ValueCCY                  =tmpValueCCY                  ;}
    public void  setValue                     (Integer tmpValue                     ){     Value                    =tmpValue                     ;}
    public void  setContractNumber            (String  tmpContractNumber            ){    ContractNumber            =tmpContractNumber            ;}
    public void  setSignedDate                (String  tmpSignedDate                ){    SignedDate                =tmpSignedDate                ;}
    public void  setBankAccountName           (String  tmpBankAccountName           ){    BankAccountName           =tmpBankAccountName           ;}
    public void  setBankAccountType           (String  tmpBankAccountType           ){    BankAccountType           =tmpBankAccountType           ;}
    public void  setBankName                  (String  tmpBankName                  ){    BankName                  =tmpBankName                  ;}
    public void  setBankAccount               (String  tmpBankAccount               ){    BankAccount               =tmpBankAccount               ;}
    public void  setBankAccountCCY            (String  tmpBankAccountCCY            ){    BankAccountCCY            =tmpBankAccountCCY            ;}
    public void  setBankAccountBalance        (Integer tmpBankAccountBalance        ){     BankAccountBalance       =tmpBankAccountBalance        ;}
    public void  setBankAccountIsTrust        (Integer tmpBankAccountIsTrust        ){     BankAccountIsTrust       =tmpBankAccountIsTrust        ;}
    public void  setBankPledgeName            (String  tmpBankPledgeName            ){    BankPledgeName            =tmpBankPledgeName            ;}
    public void  setBankPledgeOwnerType       (Integer tmpBankPledgeOwnerType       ){     BankPledgeOwnerType      =tmpBankPledgeOwnerType       ;}
    public void  setBankPledgeEffectiveDate   (String  tmpBankPledgeEffectiveDate   ){    BankPledgeEffectiveDate   =tmpBankPledgeEffectiveDate   ;}
    public void  setBankPledgeLastDate        (String  tmpBankPledgeLastDate        ){    BankPledgeLastDate        =tmpBankPledgeLastDate        ;}
    public void  setBankIsFreezed             (Integer tmpBankIsFreezed             ){     BankIsFreezed            =tmpBankIsFreezed             ;}
    public void  setEthnic                    (String  tmpEthnic                    ){    Ethnic                    =tmpEthnic                    ;}
    public void  setpIdTypeId                 (String  tmppIdTypeId                 ){    pIdTypeId                 =tmppIdTypeId                 ;}
    public void  setpIdNo                     (String  tmppIdNo                     ){    pIdNo                     =tmppIdNo                     ;}
    public void  setMortgagorName             (String  tmpMortgagorName             ){    MortgagorName             =tmpMortgagorName             ;}
    public void  setContactAddress            (String  tmpContactAddress            ){    ContactAddress            =tmpContactAddress            ;}
    public void  setContactPhone              (String  tmpContactPhone              ){    ContactPhone              =tmpContactPhone              ;}
    public void  setCerOrg                    (String  tmpCerOrg                    ){    CerOrg                    =tmpCerOrg                    ;}
    public void  setCerCustomer               (String  tmpCerCustomer               ){    CerCustomer               =tmpCerCustomer               ;}
    public void  setCerNO                     (String  tmpCerNO                     ){    CerNO                     =tmpCerNO                     ;}
    public void  setCerAccount               (Integer tmpCerAccount               ){     CerAccount               =tmpCerAccount               ;}
    public void  setCerEffectiveDate          (String  tmpCerEffectiveDate          ){    CerEffectiveDate          =tmpCerEffectiveDate          ;}
    public void  setCerLastDate               (String  tmpCerLastDate               ){    CerLastDate               =tmpCerLastDate               ;}
    public void  setCerAmount                 (String  tmpCerAmount                 ){    CerAmount                 =tmpCerAmount                 ;}
    public void  setCDName                    (String  tmpCDName                    ){    CDName                    =tmpCDName                    ;}
    public void  setCDType                    (Integer tmpCDType                    ){     CDType                   =tmpCDType                    ;}
    public void  setCDNO                      (String  tmpCDNO                      ){    CDNO                      =tmpCDNO                      ;}
    public void  setCDAccount                 (String  tmpCDAccount                 ){    CDAccount                 =tmpCDAccount                 ;}
    public void  setCDBank                    (String  tmpCDBank                    ){    CDBank                    =tmpCDBank                    ;}
    public void  setCDIsSelfBank             (Integer tmpCDIsSelfBank             ){     CDIsSelfBank             =tmpCDIsSelfBank             ;}
    public void  setCDAmount                  (String  tmpCDAmount                  ){    CDAmount                  =tmpCDAmount                  ;}
    public void  setCDIsStopPay               (String  tmpCDIsStopPay               ){    CDIsStopPay               =tmpCDIsStopPay               ;}
    public void  setNotesType                 (String  tmpNotesType                 ){    NotesType                 =tmpNotesType                 ;}
    public void  setNotesNO                   (String  tmpNotesNO                   ){    NotesNO                   =tmpNotesNO                   ;}
    public void  setNotesAmount               (Integer tmpNotesAmount               ){     NotesAmount              =tmpNotesAmount               ;}
    public void  setNotesBank                 (String  tmpNotesBank                 ){    NotesBank                 =tmpNotesBank                 ;}
    public void  setNotesSignedDate           (String  tmpNotesSignedDate           ){    NotesSignedDate           =tmpNotesSignedDate           ;}
    public void  setNotesLastDate             (String  tmpNotesLastDate             ){    NotesLastDate             =tmpNotesLastDate             ;}
    public void  setNotesAddress              (String  tmpNotesAddress              ){    NotesAddress              =tmpNotesAddress              ;}
    public void  setWrOwner                   (String  tmpWrOwner                   ){    WrOwner                   =tmpWrOwner                   ;}
    public void  setWrOrg                     (String  tmpWrOrg                     ){    WrOrg                     =tmpWrOrg                     ;}
    public void  setWrNo                      (String  tmpWrNo                      ){    WrNo                      =tmpWrNo                      ;}
    public void  setWrName                    (String  tmpWrName                    ){    WrName                    =tmpWrName                    ;}
    public void  setWrStandard                (String  tmpWrStandard                ){    WrStandard                =tmpWrStandard                ;}
    public void  setWrUnit                    (String  tmpWrUnit                    ){    WrUnit                    =tmpWrUnit                    ;}
    public void  setWrNumber                  (Integer tmpWrNumber                  ){     WrNumber                 =tmpWrNumber                  ;}
    public void  setWrDeliveryStaff           (String  tmpWrDeliveryStaff           ){    WrDeliveryStaff           =tmpWrDeliveryStaff           ;}
    public void  setWrAcceptanceStaff         (String  tmpWrAcceptanceStaff         ){    WrAcceptanceStaff         =tmpWrAcceptanceStaff         ;}
    public void  setWrGoodsValue              (Integer tmpWrGoodsValue              ){     WrGoodsValue             =tmpWrGoodsValue              ;}
    public void  setWrStorageCosts            (Integer tmpWrStorageCosts            ){     WrStorageCosts           =tmpWrStorageCosts            ;}
    public void  setWrHaveInsurance           (Integer tmpWrHaveInsurance           ){     WrHaveInsurance          =tmpWrHaveInsurance           ;}
    public void  setWrInsuranceBeginDate      (String  tmpWrInsuranceBeginDate      ){    WrInsuranceBeginDate      =tmpWrInsuranceBeginDate      ;}
    public void  setWrInsuranceEndDate        (String  tmpWrInsuranceEndDate        ){    WrInsuranceEndDate        =tmpWrInsuranceEndDate        ;}
    public void  setLadOrg                    (String  tmpLadOrg                    ){    LadOrg                    =tmpLadOrg                    ;}
    public void  setLadNo                     (String  tmpLadNo                     ){    LadNo                     =tmpLadNo                     ;}
    public void  setLadContractNo             (String  tmpLadContractNo             ){    LadContractNo             =tmpLadContractNo             ;}
    public void  setLadCommodityCoding        (String  tmpLadCommodityCoding        ){    LadCommodityCoding        =tmpLadCommodityCoding        ;}
    public void  setLadShippingUnit           (String  tmpLadShippingUnit           ){    LadShippingUnit           =tmpLadShippingUnit           ;}
    public void  setLadGoods                  (String  tmpLadGoods                  ){    LadGoods                  =tmpLadGoods                  ;}
    public void  setLadRule                   (String  tmpLadRule                   ){    LadRule                   =tmpLadRule                   ;}
    public void  setLadCharacter              (String  tmpLadCharacter              ){    LadCharacter              =tmpLadCharacter              ;}
    public void  setLadDeliveryNumber         (Integer tmpLadDeliveryNumber         ){     LadDeliveryNumber        =tmpLadDeliveryNumber         ;}
    public void  setLadDeliveryAddress        (String  tmpLadDeliveryAddress        ){    LadDeliveryAddress        =tmpLadDeliveryAddress        ;}
    public void  setLadDrawer                 (String  tmpLadDrawer                 ){    LadDrawer                 =tmpLadDrawer                 ;}
    public void  setStockOwnerName            (String  tmpStockOwnerName            ){    StockOwnerName            =tmpStockOwnerName            ;}
    public void  setStockNumber               (Integer tmpStockNumber               ){     StockNumber              =tmpStockNumber               ;}
    public void  setStockNo                   (String  tmpStockNo                   ){    StockNo                   =tmpStockNo                   ;}
    public void  setStockNature               (String  tmpStockNature               ){    StockNature               =tmpStockNature               ;}
    public void  setStockHoldersName          (String  tmpStockHoldersName          ){    StockHoldersName          =tmpStockHoldersName          ;}
    public void  setStockSecuritiesAccountNo  (String  tmpStockSecuritiesAccountNo  ){    StockSecuritiesAccountNo  =tmpStockSecuritiesAccountNo  ;}
    public void  setStockInstitutions         (String  tmpStockInstitutions         ){    StockInstitutions         =tmpStockInstitutions         ;}
    public void  setStockRegNo                (String  tmpStockRegNo                ){    StockRegNo                =tmpStockRegNo                ;}
    public void  setStockInvestorsAccount     (String  tmpStockInvestorsAccount     ){    StockInvestorsAccount     =tmpStockInvestorsAccount     ;}
    public void  setStockCode                 (String  tmpStockCode                 ){    StockCode                 =tmpStockCode                 ;}
    public void  setStockPledgeRef            (String  tmpStockPledgeRef            ){    StockPledgeRef            =tmpStockPledgeRef            ;}
    public void  setStockPledgeNumber         (String  tmpStockPledgeNumber         ){    StockPledgeNumber         =tmpStockPledgeNumber         ;}
    public void  setStockPledgeRegDate        (String  tmpStockPledgeRegDate        ){    StockPledgeRegDate        =tmpStockPledgeRegDate        ;}
    public void  setIntProType                (Integer tmpIntProType                ){     IntProType               =tmpIntProType                ;}
    public void  setIntProOwnerName           (String  tmpIntProOwnerName           ){    IntProOwnerName           =tmpIntProOwnerName           ;}
    public void  setIntProProveOrg            (Integer tmpIntProProveOrg            ){     IntProProveOrg           =tmpIntProProveOrg            ;}
    public void  setIntProPatentNumber        (String  tmpIntProPatentNumber        ){    IntProPatentNumber        =tmpIntProPatentNumber        ;}
    public void  setIntProRegOrg              (String  tmpIntProRegOrg              ){    IntProRegOrg              =tmpIntProRegOrg              ;}
    public void  setIntProRegDate             (String  tmpIntProRegDate             ){    IntProRegDate             =tmpIntProRegDate             ;}
    public void  setIntProtedDate             (String  tmpIntProtedDate             ){    IntProtedDate             =tmpIntProtedDate             ;}
    public void  setIntProProveDate           (String  tmpIntProProveDate           ){    IntProProveDate           =tmpIntProProveDate           ;}
    public void  setIntProPledgeNo            (String  tmpIntProPledgeNo            ){    IntProPledgeNo            =tmpIntProPledgeNo            ;}
    public void  setIntProOrg                 (String  tmpIntProOrg                 ){    IntProOrg                 =tmpIntProOrg                 ;}
    public void  setChargeOrg                 (String  tmpChargeOrg                 ){    ChargeOrg                 =tmpChargeOrg                 ;}
    public void  setChargeLicenceNo           (String  tmpChargeLicenceNo           ){    ChargeLicenceNo           =tmpChargeLicenceNo           ;}
    public void  setChargeLastDate            (String  tmpChargeLastDate            ){    ChargeLastDate            =tmpChargeLastDate            ;}
    public void  setChargeRegOrg              (String  tmpChargeRegOrg              ){    ChargeRegOrg              =tmpChargeRegOrg              ;}
    public void  setAccRecProvePerson         (String  tmpAccRecProvePerson         ){    AccRecProvePerson         =tmpAccRecProvePerson         ;}
    public void  setAccRecOwner               (String  tmpAccRecOwner               ){    AccRecOwner               =tmpAccRecOwner               ;}
    public void  setAccRecAmountCCY           (String  tmpAccRecAmountCCY           ){    AccRecAmountCCY           =tmpAccRecAmountCCY           ;}
    public void  setAccRecAmount              (Integer  tmpAccRecAmount              ){    AccRecAmount=tmpAccRecAmount              ;}
    public void  setCarProvePerson            (String  tmpCarProvePerson            ){    CarProvePerson            =tmpCarProvePerson            ;}
    public void  setCarProduction             (String  tmpCarProduction             ){    CarProduction             =tmpCarProduction             ;}
    public void  setCarNo                     (String  tmpCarNo                     ){    CarNo                     =tmpCarNo                     ;}
    public void  setCarBrand                  (String  tmpCarBrand                  ){    CarBrand                  =tmpCarBrand                  ;}
    public void  setCarType                   (String  tmpCarType                   ){    CarType                   =tmpCarType                   ;}
    public void  setCarEngineNo               (String  tmpCarEngineNo               ){    CarEngineNo               =tmpCarEngineNo               ;}
    public void  setCarChassisNo              (String  tmpCarChassisNo              ){    CarChassisNo              =tmpCarChassisNo              ;}
    public void  setCarPrice                  (Integer tmpCarPrice                  ){     CarPrice                 =tmpCarPrice                  ;}
    public void  setRemark                    (String  tmpRemark                    ){    Remark                    =tmpRemark                    ;}
    public void  setChargeProject             (String  tmpChargeProject             ){    ChargeProject             =tmpChargeProject             ;}
    public void  setPledgeCustCod             (String  tmpPledgeCustCod             ){    PledgeCustCod             =tmpPledgeCustCod             ;}
    public void  setND_Kind                   (Integer tmpND_Kind                   ){     ND_Kind                  =tmpND_Kind                   ;}
    public void  setND_ID                     (String  tmpND_ID                     ){    ND_ID                     =tmpND_ID                     ;}
    public void  setND_Rate                   (Float   tmpND_Rate                   ){    ND_Rate                   =tmpND_Rate                   ;}
    public void  setND_Deadline               (float   tmpND_Deadline               ){    ND_Deadline               =tmpND_Deadline               ;}
    public void setNDAmount(float   tmpND_Amount                 ){    NDAmount =tmpND_Amount                 ;}
    public void  setND_Bank                   (String  tmpND_Bank                   ){    ND_Bank                   =tmpND_Bank                   ;}
    public void  setND_BeginDate              (String  tmpND_BeginDate              ){    ND_BeginDate              =tmpND_BeginDate              ;}
    public void  setND_EndDate                (String  tmpND_EndDate                ){    ND_EndDate                =tmpND_EndDate                ;}
    public void  setND_Address                (String  tmpND_Address                ){    ND_Address                =tmpND_Address                ;}
    public void  setOther_Name                (String  tmpOther_Name                ){    Other_Name                =tmpOther_Name                ;}
    public void  setOther_Unit                (String  tmpOther_Unit                ){    Other_Unit                =tmpOther_Unit                ;}
    public void  setOther_Number              (Integer tmpOther_Number              ){     Other_Number             =tmpOther_Number              ;}
    public void  setOther_Address             (String  tmpOther_Address             ){    Other_Address             =tmpOther_Address             ;}
    public void  setSerialNumber              (String  tmpSerialNumber              ){    SerialNumber              =tmpSerialNumber              ;}

    public void  setAction              (String  tmpAction              ){    action              =tmpAction              ;}

}
