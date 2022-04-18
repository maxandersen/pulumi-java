// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub BaiduCredential.
 * 
 */
public final class BaiduCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final BaiduCredentialResponse Empty = new BaiduCredentialResponse();

    /**
     * Baidu Api Key.
     * 
     */
    @Import(name="baiduApiKey")
      private final @Nullable String baiduApiKey;

    public Optional<String> baiduApiKey() {
        return this.baiduApiKey == null ? Optional.empty() : Optional.ofNullable(this.baiduApiKey);
    }

    /**
     * Baidu Endpoint.
     * 
     */
    @Import(name="baiduEndPoint")
      private final @Nullable String baiduEndPoint;

    public Optional<String> baiduEndPoint() {
        return this.baiduEndPoint == null ? Optional.empty() : Optional.ofNullable(this.baiduEndPoint);
    }

    /**
     * Baidu Secret Key
     * 
     */
    @Import(name="baiduSecretKey")
      private final @Nullable String baiduSecretKey;

    public Optional<String> baiduSecretKey() {
        return this.baiduSecretKey == null ? Optional.empty() : Optional.ofNullable(this.baiduSecretKey);
    }

    public BaiduCredentialResponse(
        @Nullable String baiduApiKey,
        @Nullable String baiduEndPoint,
        @Nullable String baiduSecretKey) {
        this.baiduApiKey = baiduApiKey;
        this.baiduEndPoint = baiduEndPoint;
        this.baiduSecretKey = baiduSecretKey;
    }

    private BaiduCredentialResponse() {
        this.baiduApiKey = null;
        this.baiduEndPoint = null;
        this.baiduSecretKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaiduCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baiduApiKey;
        private @Nullable String baiduEndPoint;
        private @Nullable String baiduSecretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BaiduCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baiduApiKey = defaults.baiduApiKey;
    	      this.baiduEndPoint = defaults.baiduEndPoint;
    	      this.baiduSecretKey = defaults.baiduSecretKey;
        }

        public Builder baiduApiKey(@Nullable String baiduApiKey) {
            this.baiduApiKey = baiduApiKey;
            return this;
        }
        public Builder baiduEndPoint(@Nullable String baiduEndPoint) {
            this.baiduEndPoint = baiduEndPoint;
            return this;
        }
        public Builder baiduSecretKey(@Nullable String baiduSecretKey) {
            this.baiduSecretKey = baiduSecretKey;
            return this;
        }        public BaiduCredentialResponse build() {
            return new BaiduCredentialResponse(baiduApiKey, baiduEndPoint, baiduSecretKey);
        }
    }
}
