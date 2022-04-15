// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A site for the Direct Line channel
 * 
 */
public final class DirectLineSiteResponse extends io.pulumi.resources.InvokeArgs {

    public static final DirectLineSiteResponse Empty = new DirectLineSiteResponse();

    /**
     * Whether this site is enabled for block user upload.
     * 
     */
    @Import(name="isBlockUserUploadEnabled")
      private final @Nullable Boolean isBlockUserUploadEnabled;

    public Optional<Boolean> isBlockUserUploadEnabled() {
        return this.isBlockUserUploadEnabled == null ? Optional.empty() : Optional.ofNullable(this.isBlockUserUploadEnabled);
    }

    /**
     * Whether this site is enabled for DirectLine channel.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this site is enabled for authentication with Bot Framework.
     * 
     */
    @Import(name="isSecureSiteEnabled")
      private final @Nullable Boolean isSecureSiteEnabled;

    public Optional<Boolean> isSecureSiteEnabled() {
        return this.isSecureSiteEnabled == null ? Optional.empty() : Optional.ofNullable(this.isSecureSiteEnabled);
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @Import(name="isV1Enabled", required=true)
      private final Boolean isV1Enabled;

    public Boolean isV1Enabled() {
        return this.isV1Enabled;
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @Import(name="isV3Enabled", required=true)
      private final Boolean isV3Enabled;

    public Boolean isV3Enabled() {
        return this.isV3Enabled;
    }

    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key2", required=true)
      private final String key2;

    public String key2() {
        return this.key2;
    }

    /**
     * Site Id
     * 
     */
    @Import(name="siteId", required=true)
      private final String siteId;

    public String siteId() {
        return this.siteId;
    }

    /**
     * Site name
     * 
     */
    @Import(name="siteName", required=true)
      private final String siteName;

    public String siteName() {
        return this.siteName;
    }

    /**
     * List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
     */
    @Import(name="trustedOrigins")
      private final @Nullable List<String> trustedOrigins;

    public List<String> trustedOrigins() {
        return this.trustedOrigins == null ? List.of() : this.trustedOrigins;
    }

    public DirectLineSiteResponse(
        @Nullable Boolean isBlockUserUploadEnabled,
        Boolean isEnabled,
        @Nullable Boolean isSecureSiteEnabled,
        Boolean isV1Enabled,
        Boolean isV3Enabled,
        String key,
        String key2,
        String siteId,
        String siteName,
        @Nullable List<String> trustedOrigins) {
        this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isSecureSiteEnabled = isSecureSiteEnabled;
        this.isV1Enabled = Objects.requireNonNull(isV1Enabled, "expected parameter 'isV1Enabled' to be non-null");
        this.isV3Enabled = Objects.requireNonNull(isV3Enabled, "expected parameter 'isV3Enabled' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.key2 = Objects.requireNonNull(key2, "expected parameter 'key2' to be non-null");
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
        this.trustedOrigins = trustedOrigins;
    }

    private DirectLineSiteResponse() {
        this.isBlockUserUploadEnabled = null;
        this.isEnabled = null;
        this.isSecureSiteEnabled = null;
        this.isV1Enabled = null;
        this.isV3Enabled = null;
        this.key = null;
        this.key2 = null;
        this.siteId = null;
        this.siteName = null;
        this.trustedOrigins = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isBlockUserUploadEnabled;
        private Boolean isEnabled;
        private @Nullable Boolean isSecureSiteEnabled;
        private Boolean isV1Enabled;
        private Boolean isV3Enabled;
        private String key;
        private String key2;
        private String siteId;
        private String siteName;
        private @Nullable List<String> trustedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSiteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isBlockUserUploadEnabled = defaults.isBlockUserUploadEnabled;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isSecureSiteEnabled = defaults.isSecureSiteEnabled;
    	      this.isV1Enabled = defaults.isV1Enabled;
    	      this.isV3Enabled = defaults.isV3Enabled;
    	      this.key = defaults.key;
    	      this.key2 = defaults.key2;
    	      this.siteId = defaults.siteId;
    	      this.siteName = defaults.siteName;
    	      this.trustedOrigins = defaults.trustedOrigins;
        }

        public Builder isBlockUserUploadEnabled(@Nullable Boolean isBlockUserUploadEnabled) {
            this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isSecureSiteEnabled(@Nullable Boolean isSecureSiteEnabled) {
            this.isSecureSiteEnabled = isSecureSiteEnabled;
            return this;
        }
        public Builder isV1Enabled(Boolean isV1Enabled) {
            this.isV1Enabled = Objects.requireNonNull(isV1Enabled);
            return this;
        }
        public Builder isV3Enabled(Boolean isV3Enabled) {
            this.isV3Enabled = Objects.requireNonNull(isV3Enabled);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key2(String key2) {
            this.key2 = Objects.requireNonNull(key2);
            return this;
        }
        public Builder siteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public Builder siteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }
        public Builder trustedOrigins(@Nullable List<String> trustedOrigins) {
            this.trustedOrigins = trustedOrigins;
            return this;
        }
        public Builder trustedOrigins(String... trustedOrigins) {
            return trustedOrigins(List.of(trustedOrigins));
        }        public DirectLineSiteResponse build() {
            return new DirectLineSiteResponse(isBlockUserUploadEnabled, isEnabled, isSecureSiteEnabled, isV1Enabled, isV3Enabled, key, key2, siteId, siteName, trustedOrigins);
        }
    }
}
