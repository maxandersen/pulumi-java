// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListEdgeModuleProvisioningTokenResult {
    /**
     * The expiration date of the registration token. The Azure Video Analyzer IoT edge module must be initialized and connected to the Internet prior to the token expiration date.
     * 
     */
    private final String expirationDate;
    /**
     * The token blob to be provided to the Azure Video Analyzer IoT edge module through the Azure IoT Edge module twin properties.
     * 
     */
    private final String token;

    @CustomType.Constructor
    private ListEdgeModuleProvisioningTokenResult(
        @CustomType.Parameter("expirationDate") String expirationDate,
        @CustomType.Parameter("token") String token) {
        this.expirationDate = expirationDate;
        this.token = token;
    }

    /**
     * The expiration date of the registration token. The Azure Video Analyzer IoT edge module must be initialized and connected to the Internet prior to the token expiration date.
     * 
    */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * The token blob to be provided to the Azure Video Analyzer IoT edge module through the Azure IoT Edge module twin properties.
     * 
    */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListEdgeModuleProvisioningTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ListEdgeModuleProvisioningTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.token = defaults.token;
        }

        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public ListEdgeModuleProvisioningTokenResult build() {
            return new ListEdgeModuleProvisioningTokenResult(expirationDate, token);
        }
    }
}
