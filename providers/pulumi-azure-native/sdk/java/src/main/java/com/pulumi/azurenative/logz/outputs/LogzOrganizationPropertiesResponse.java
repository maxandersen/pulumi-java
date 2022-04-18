// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogzOrganizationPropertiesResponse {
    /**
     * Name of the Logz organization.
     * 
     */
    private final @Nullable String companyName;
    /**
     * The Id of the Enterprise App used for Single sign on.
     * 
     */
    private final @Nullable String enterpriseAppId;
    /**
     * Id of the Logz organization.
     * 
     */
    private final String id;
    /**
     * The login URL specific to this Logz Organization.
     * 
     */
    private final @Nullable String singleSignOnUrl;

    @CustomType.Constructor
    private LogzOrganizationPropertiesResponse(
        @CustomType.Parameter("companyName") @Nullable String companyName,
        @CustomType.Parameter("enterpriseAppId") @Nullable String enterpriseAppId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("singleSignOnUrl") @Nullable String singleSignOnUrl) {
        this.companyName = companyName;
        this.enterpriseAppId = enterpriseAppId;
        this.id = id;
        this.singleSignOnUrl = singleSignOnUrl;
    }

    /**
     * Name of the Logz organization.
     * 
    */
    public Optional<String> companyName() {
        return Optional.ofNullable(this.companyName);
    }
    /**
     * The Id of the Enterprise App used for Single sign on.
     * 
    */
    public Optional<String> enterpriseAppId() {
        return Optional.ofNullable(this.enterpriseAppId);
    }
    /**
     * Id of the Logz organization.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The login URL specific to this Logz Organization.
     * 
    */
    public Optional<String> singleSignOnUrl() {
        return Optional.ofNullable(this.singleSignOnUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogzOrganizationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String companyName;
        private @Nullable String enterpriseAppId;
        private String id;
        private @Nullable String singleSignOnUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LogzOrganizationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyName = defaults.companyName;
    	      this.enterpriseAppId = defaults.enterpriseAppId;
    	      this.id = defaults.id;
    	      this.singleSignOnUrl = defaults.singleSignOnUrl;
        }

        public Builder companyName(@Nullable String companyName) {
            this.companyName = companyName;
            return this;
        }
        public Builder enterpriseAppId(@Nullable String enterpriseAppId) {
            this.enterpriseAppId = enterpriseAppId;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder singleSignOnUrl(@Nullable String singleSignOnUrl) {
            this.singleSignOnUrl = singleSignOnUrl;
            return this;
        }        public LogzOrganizationPropertiesResponse build() {
            return new LogzOrganizationPropertiesResponse(companyName, enterpriseAppId, id, singleSignOnUrl);
        }
    }
}
