package com.troy.trade.exchange.okex.client.config;


import com.troy.trade.exchange.okex.client.constant.APIConstants;
import com.troy.trade.exchange.okex.client.enums.I18nEnum;

/**
 * API configuration information
 *
 * @author Tony Tian
 * @version 1.0.0
 * @date 2018/3/8 14:29
 */
public class APIConfiguration {

    /**
     * The user's api key provided by OKEx.
     */
    private String apiKey;
    /**
     * The user's secret key provided by OKEx. The secret key used to sign your request data.
     */
    private String secretKey;
    /**
     * The Passphrase will be provided by you to further secure your API access.
     */
    private String passphrase;
    /**
     * Rest api endpoint url.
     */
    private String endpoint = "https://www.okex.com/";

    /**
     * Host connection timeout.
     */
    private long connectTimeout;
    /**
     * The host reads the information timeout.
     */
    private long readTimeout;
    /**
     * The host writes the information timeout.
     */
    private long writeTimeout;
    /**
     * Failure reconnection, default true.
     */
    private boolean retryOnConnectionFailure;

    /**
     * The print api information.
     */
    private boolean print;

    /**
     * internationalization
     */
    private I18nEnum i18n;

    public APIConfiguration() {
        this.endpoint = endpoint;
        this.connectTimeout = APIConstants.TIMEOUT;
        this.readTimeout = APIConstants.TIMEOUT;
        this.writeTimeout = APIConstants.TIMEOUT;
        this.retryOnConnectionFailure = true;
        this.print = false;
        this.i18n = I18nEnum.ENGLISH;
    }

    public APIConfiguration(String apiKey,String secretKey,String passphrase) {
        super();
//        this.apiKey = "1817d36f-58f0-4b4c-b120-749bc6f58778";
//        this.secretKey = "50D1F86C77D17FEE1FA7A70CC784C4F5";
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.passphrase = passphrase;
        this.endpoint = endpoint;
        this.connectTimeout = APIConstants.TIMEOUT;
        this.readTimeout = APIConstants.TIMEOUT;
        this.writeTimeout = APIConstants.TIMEOUT;
        this.retryOnConnectionFailure = true;
        this.print = false;
        this.i18n = I18nEnum.ENGLISH;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public long getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(long connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public long getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(long readTimeout) {
        this.readTimeout = readTimeout;
    }

    public long getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(long writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public boolean isRetryOnConnectionFailure() {
        return retryOnConnectionFailure;
    }

    public void setRetryOnConnectionFailure(boolean retryOnConnectionFailure) {
        this.retryOnConnectionFailure = retryOnConnectionFailure;
    }

    public boolean isPrint() {
        return print;
    }

    public void setPrint(boolean print) {
        this.print = print;
    }

    public I18nEnum getI18n() {
        return i18n;
    }

    public void setI18n(I18nEnum i18n) {
        this.i18n = i18n;
    }
}
