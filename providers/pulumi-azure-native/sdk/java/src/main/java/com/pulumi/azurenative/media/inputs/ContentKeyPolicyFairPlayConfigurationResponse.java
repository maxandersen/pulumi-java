// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a configuration for FairPlay licenses.
 * 
 */
public final class ContentKeyPolicyFairPlayConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyFairPlayConfigurationResponse Empty = new ContentKeyPolicyFairPlayConfigurationResponse();

    /**
     * The key that must be used as FairPlay Application Secret key.
     * 
     */
    @Import(name="ask", required=true)
      private final String ask;

    public String ask() {
        return this.ask;
    }

    /**
     * The Base64 representation of FairPlay certificate in PKCS 12 (pfx) format (including private key).
     * 
     */
    @Import(name="fairPlayPfx", required=true)
      private final String fairPlayPfx;

    public String fairPlayPfx() {
        return this.fairPlayPfx;
    }

    /**
     * The password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     * 
     */
    @Import(name="fairPlayPfxPassword", required=true)
      private final String fairPlayPfxPassword;

    public String fairPlayPfxPassword() {
        return this.fairPlayPfxPassword;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Offline rental policy
     * 
     */
    @Import(name="offlineRentalConfiguration")
      private final @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration;

    public Optional<ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse> offlineRentalConfiguration() {
        return this.offlineRentalConfiguration == null ? Optional.empty() : Optional.ofNullable(this.offlineRentalConfiguration);
    }

    /**
     * The rental and lease key type.
     * 
     */
    @Import(name="rentalAndLeaseKeyType", required=true)
      private final String rentalAndLeaseKeyType;

    public String rentalAndLeaseKeyType() {
        return this.rentalAndLeaseKeyType;
    }

    /**
     * The rental duration. Must be greater than or equal to 0.
     * 
     */
    @Import(name="rentalDuration", required=true)
      private final Double rentalDuration;

    public Double rentalDuration() {
        return this.rentalDuration;
    }

    public ContentKeyPolicyFairPlayConfigurationResponse(
        String ask,
        String fairPlayPfx,
        String fairPlayPfxPassword,
        String odataType,
        @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration,
        String rentalAndLeaseKeyType,
        Double rentalDuration) {
        this.ask = Objects.requireNonNull(ask, "expected parameter 'ask' to be non-null");
        this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx, "expected parameter 'fairPlayPfx' to be non-null");
        this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword, "expected parameter 'fairPlayPfxPassword' to be non-null");
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
        this.offlineRentalConfiguration = offlineRentalConfiguration;
        this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType, "expected parameter 'rentalAndLeaseKeyType' to be non-null");
        this.rentalDuration = Objects.requireNonNull(rentalDuration, "expected parameter 'rentalDuration' to be non-null");
    }

    private ContentKeyPolicyFairPlayConfigurationResponse() {
        this.ask = null;
        this.fairPlayPfx = null;
        this.fairPlayPfxPassword = null;
        this.odataType = null;
        this.offlineRentalConfiguration = null;
        this.rentalAndLeaseKeyType = null;
        this.rentalDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ask;
        private String fairPlayPfx;
        private String fairPlayPfxPassword;
        private String odataType;
        private @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration;
        private String rentalAndLeaseKeyType;
        private Double rentalDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ask = defaults.ask;
    	      this.fairPlayPfx = defaults.fairPlayPfx;
    	      this.fairPlayPfxPassword = defaults.fairPlayPfxPassword;
    	      this.odataType = defaults.odataType;
    	      this.offlineRentalConfiguration = defaults.offlineRentalConfiguration;
    	      this.rentalAndLeaseKeyType = defaults.rentalAndLeaseKeyType;
    	      this.rentalDuration = defaults.rentalDuration;
        }

        public Builder ask(String ask) {
            this.ask = Objects.requireNonNull(ask);
            return this;
        }
        public Builder fairPlayPfx(String fairPlayPfx) {
            this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx);
            return this;
        }
        public Builder fairPlayPfxPassword(String fairPlayPfxPassword) {
            this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder offlineRentalConfiguration(@Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration) {
            this.offlineRentalConfiguration = offlineRentalConfiguration;
            return this;
        }
        public Builder rentalAndLeaseKeyType(String rentalAndLeaseKeyType) {
            this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType);
            return this;
        }
        public Builder rentalDuration(Double rentalDuration) {
            this.rentalDuration = Objects.requireNonNull(rentalDuration);
            return this;
        }        public ContentKeyPolicyFairPlayConfigurationResponse build() {
            return new ContentKeyPolicyFairPlayConfigurationResponse(ask, fairPlayPfx, fairPlayPfxPassword, odataType, offlineRentalConfiguration, rentalAndLeaseKeyType, rentalDuration);
        }
    }
}
