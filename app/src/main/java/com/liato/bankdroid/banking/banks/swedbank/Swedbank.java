package com.liato.bankdroid.banking.banks.swedbank;

import android.content.Context;

import com.liato.bankdroid.banking.exceptions.BankChoiceException;
import com.liato.bankdroid.banking.exceptions.BankException;
import com.liato.bankdroid.banking.exceptions.LoginException;
import com.liato.bankdroid.provider.IBankTypes;

public class Swedbank extends AbstractSwedbank {

    private static final String TAG = "Swedbank";
    private static final String NAME = "Swedbank";
    private static final String NAME_SHORT = "swedbank";
    private static final int BANKTYPE_ID = IBankTypes.SWEDBANK;

    private static final String APP_ID = "vgmYRMelBJ0Yzujs";

    public Swedbank(Context context) {
        super(context);
        super.TAG = TAG;
        super.NAME = NAME;
        super.NAME_SHORT = NAME_SHORT;
        super.BANKTYPE_ID = BANKTYPE_ID;

    }

    public Swedbank(String username, String password, Context context) throws BankException, LoginException, BankChoiceException {
        this(context);
        this.update(username, password);
    }

    @Override
    protected String getAppId() {
        return APP_ID;
    }
}
