package za.co.minusone.kafkademo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DemoDTO {
    private String scenarios;
    private String Id;
    private String caseId;
    private String intent1;
    private String intent2;
    private String intent3;
    private String cdeStatus;
    private String loanStatus;
    private String declineDate;
    private String applicationDate;
    private String loanTakeUpDate;
    private String disbursementDate;
    private String loanAmount;
}
