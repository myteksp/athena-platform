package com.github.alexanderwe.bananaj.exceptions;


public class CampaignSettingsException extends Exception {
	private static final long serialVersionUID = -2605298129087994201L;

	public CampaignSettingsException()  {
        super("Invalid email address.");
    }

    public CampaignSettingsException(String message) {
        super(message);
    }

    public CampaignSettingsException(Throwable cause) {
        super(cause);
    }

    public CampaignSettingsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampaignSettingsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
