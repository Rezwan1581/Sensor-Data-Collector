package com.example.sensorgpsservice.ui.tnc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class tncViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public tncViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("\nThe Services and use of the Site are provided to you subject to the terms and conditions set forth in these Terms of Use (\"Terms of Use\" or \"Agreement\") and our Privacy Policy, and any other rules and policies set forth on this Site. The terms and conditions below and any other rules or policies set forth on this Site comprise the entire agreement between you and SensorDataAnalysis and supersede all prior agreements between us.\n" +
                "\n" +
                "1. ACKNOWLEDGMENT AND ACCEPTANCE.\n" +
                "\nPLEASE READ THE FOLLOWING TERMS OF THIS AGREEMENT CAREFULLY. BY COMPLETING THE REGISTRATION PROCESS, YOU ACCEPT AND AGREE TO ALL OF THE TERMS AND CONDITIONS SET FORTH IN THIS AGREEMENT AND IN OUR PRIVACY POLICY. YOU HEREBY ACKNOWLEDGE THAT YOU ARE 15 YEARS OF AGE OR OLDER.\n" +
                "\n" +
                "2. USER RESPONSIBILITIES.\n" +
                "\nThese Terms of Use give you important obligations. You agree to the following responsibilities:\n" +
                "\n" +
                "Compliance with our Anti-Spam policy. Please see Section below.\n" +
                "Lawful use of the Services only. Please see Section below.\n" +
                "Creation and maintenance of all content in the account including but not limited to survey content, email content, address books and current billing and contact information.\n" +
                "Email list and Address Book maintenance including opt-out contact information and immediate removal of opt-outs and bounces from email lists and the address book.\n" +
                "Payment of all agreed subscription fees.\n" +
                "Full responsibility for all activity associated with your use of our Site and Services.\n" +
                "Compliance with all other obligations set forth in these Terms of Use.\n" +
                "We reserve the right to deactivate your account(s) as we deem appropriate or necessary, without notice. You enter and use the Site and the Services at your own risk. \"Sensor Data Analysis\" is not responsible for your activities, surveys, content, results or questions from respondents, other data, or any other matter concerning your use of the Site or the Services. We recommend that you keep track of your survey results and other data in your own personal records, as we reserve the right to discontinue your account(s) or terminate the Services at any time. We are not responsible for the deletion of any data that is in or has been added to your account(s). If a User account remains inactive for a period of 18 months, we will deactivate the account.\n" +
                "\n" +
                "3. MODIFICATION TO SERVICES PROVIDED; TERMS OF USE.\n" +
                "\nYou acknowledge and agree that we may, with or without notice, modify or terminate the Services and/or the app and site. Further, we may modify these Terms of Use from time to time, including the fees we charge for Services. Modifications of the Service may include, without limitation, changes in the maximum allowable memory space, number of entries allowed in the Email List Manager, number of survey respondents, number of surveys, and number of survey questions that may be created, saved, sent or used through the Site.\n" +
                "\n" +
                "We will notify you of changes we make by posting a notice on our Site, or, if we choose, by sending you an email. If you do not accept the changes, you must terminate your subscription or other use at that time. Your use of the Site or the Services after the notice is posted (or we send you the email) shall be deemed to be acceptance of the modification or termination of the Services or these Terms of Use.\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}