// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense {
    /**
     * @return A flag indicating whether test devices can use the license.
     * 
     */
    private final @Nullable Boolean allowTestDevices;
    /**
     * @return The begin date of license.
     * 
     */
    private final @Nullable String beginDate;
    /**
     * @return Specifies that the content key ID is in the PlayReady header.
     * 
     */
    private final @Nullable Boolean contentKeyLocationFromHeaderEnabled;
    /**
     * @return The content key ID. Specifies that the content key ID is specified in the PlayReady configuration.
     * 
     */
    private final @Nullable String contentKeyLocationFromKeyId;
    /**
     * @return The PlayReady content type. Supported values are `UltraVioletDownload`, `UltraVioletStreaming` or `Unspecified`.
     * 
     */
    private final @Nullable String contentType;
    /**
     * @return The expiration date of license.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * @return The grace period of license.
     * 
     */
    private final @Nullable String gracePeriod;
    /**
     * @return The license type. Supported values are `NonPersistent` or `Persistent`.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * @return A `play_right` block as defined above.
     * 
     */
    private final @Nullable ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight playRight;
    /**
     * @return The relative begin date of license.
     * 
     */
    private final @Nullable String relativeBeginDate;
    /**
     * @return The relative expiration date of license.
     * 
     */
    private final @Nullable String relativeExpirationDate;

    @CustomType.Constructor
    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense(
        @CustomType.Parameter("allowTestDevices") @Nullable Boolean allowTestDevices,
        @CustomType.Parameter("beginDate") @Nullable String beginDate,
        @CustomType.Parameter("contentKeyLocationFromHeaderEnabled") @Nullable Boolean contentKeyLocationFromHeaderEnabled,
        @CustomType.Parameter("contentKeyLocationFromKeyId") @Nullable String contentKeyLocationFromKeyId,
        @CustomType.Parameter("contentType") @Nullable String contentType,
        @CustomType.Parameter("expirationDate") @Nullable String expirationDate,
        @CustomType.Parameter("gracePeriod") @Nullable String gracePeriod,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("playRight") @Nullable ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight playRight,
        @CustomType.Parameter("relativeBeginDate") @Nullable String relativeBeginDate,
        @CustomType.Parameter("relativeExpirationDate") @Nullable String relativeExpirationDate) {
        this.allowTestDevices = allowTestDevices;
        this.beginDate = beginDate;
        this.contentKeyLocationFromHeaderEnabled = contentKeyLocationFromHeaderEnabled;
        this.contentKeyLocationFromKeyId = contentKeyLocationFromKeyId;
        this.contentType = contentType;
        this.expirationDate = expirationDate;
        this.gracePeriod = gracePeriod;
        this.licenseType = licenseType;
        this.playRight = playRight;
        this.relativeBeginDate = relativeBeginDate;
        this.relativeExpirationDate = relativeExpirationDate;
    }

    /**
     * @return A flag indicating whether test devices can use the license.
     * 
     */
    public Optional<Boolean> allowTestDevices() {
        return Optional.ofNullable(this.allowTestDevices);
    }
    /**
     * @return The begin date of license.
     * 
     */
    public Optional<String> beginDate() {
        return Optional.ofNullable(this.beginDate);
    }
    /**
     * @return Specifies that the content key ID is in the PlayReady header.
     * 
     */
    public Optional<Boolean> contentKeyLocationFromHeaderEnabled() {
        return Optional.ofNullable(this.contentKeyLocationFromHeaderEnabled);
    }
    /**
     * @return The content key ID. Specifies that the content key ID is specified in the PlayReady configuration.
     * 
     */
    public Optional<String> contentKeyLocationFromKeyId() {
        return Optional.ofNullable(this.contentKeyLocationFromKeyId);
    }
    /**
     * @return The PlayReady content type. Supported values are `UltraVioletDownload`, `UltraVioletStreaming` or `Unspecified`.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * @return The expiration date of license.
     * 
     */
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * @return The grace period of license.
     * 
     */
    public Optional<String> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * @return The license type. Supported values are `NonPersistent` or `Persistent`.
     * 
     */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * @return A `play_right` block as defined above.
     * 
     */
    public Optional<ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight> playRight() {
        return Optional.ofNullable(this.playRight);
    }
    /**
     * @return The relative begin date of license.
     * 
     */
    public Optional<String> relativeBeginDate() {
        return Optional.ofNullable(this.relativeBeginDate);
    }
    /**
     * @return The relative expiration date of license.
     * 
     */
    public Optional<String> relativeExpirationDate() {
        return Optional.ofNullable(this.relativeExpirationDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowTestDevices;
        private @Nullable String beginDate;
        private @Nullable Boolean contentKeyLocationFromHeaderEnabled;
        private @Nullable String contentKeyLocationFromKeyId;
        private @Nullable String contentType;
        private @Nullable String expirationDate;
        private @Nullable String gracePeriod;
        private @Nullable String licenseType;
        private @Nullable ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight playRight;
        private @Nullable String relativeBeginDate;
        private @Nullable String relativeExpirationDate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTestDevices = defaults.allowTestDevices;
    	      this.beginDate = defaults.beginDate;
    	      this.contentKeyLocationFromHeaderEnabled = defaults.contentKeyLocationFromHeaderEnabled;
    	      this.contentKeyLocationFromKeyId = defaults.contentKeyLocationFromKeyId;
    	      this.contentType = defaults.contentType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.licenseType = defaults.licenseType;
    	      this.playRight = defaults.playRight;
    	      this.relativeBeginDate = defaults.relativeBeginDate;
    	      this.relativeExpirationDate = defaults.relativeExpirationDate;
        }

        public Builder allowTestDevices(@Nullable Boolean allowTestDevices) {
            this.allowTestDevices = allowTestDevices;
            return this;
        }
        public Builder beginDate(@Nullable String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public Builder contentKeyLocationFromHeaderEnabled(@Nullable Boolean contentKeyLocationFromHeaderEnabled) {
            this.contentKeyLocationFromHeaderEnabled = contentKeyLocationFromHeaderEnabled;
            return this;
        }
        public Builder contentKeyLocationFromKeyId(@Nullable String contentKeyLocationFromKeyId) {
            this.contentKeyLocationFromKeyId = contentKeyLocationFromKeyId;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder playRight(@Nullable ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRight playRight) {
            this.playRight = playRight;
            return this;
        }
        public Builder relativeBeginDate(@Nullable String relativeBeginDate) {
            this.relativeBeginDate = relativeBeginDate;
            return this;
        }
        public Builder relativeExpirationDate(@Nullable String relativeExpirationDate) {
            this.relativeExpirationDate = relativeExpirationDate;
            return this;
        }        public ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense build() {
            return new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense(allowTestDevices, beginDate, contentKeyLocationFromHeaderEnabled, contentKeyLocationFromKeyId, contentType, expirationDate, gracePeriod, licenseType, playRight, relativeBeginDate, relativeExpirationDate);
        }
    }
}
