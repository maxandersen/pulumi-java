// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogzOrganizationPropertiesArgs extends ResourceArgs {

    public static final LogzOrganizationPropertiesArgs Empty = new LogzOrganizationPropertiesArgs();

    /**
     * Name of the Logz organization.
     * 
     */
    @Import(name="companyName")
    private @Nullable Output<String> companyName;

    /**
     * @return Name of the Logz organization.
     * 
     */
    public Optional<Output<String>> companyName() {
        return Optional.ofNullable(this.companyName);
    }

    /**
     * The Id of the Enterprise App used for Single sign on.
     * 
     */
    @Import(name="enterpriseAppId")
    private @Nullable Output<String> enterpriseAppId;

    /**
     * @return The Id of the Enterprise App used for Single sign on.
     * 
     */
    public Optional<Output<String>> enterpriseAppId() {
        return Optional.ofNullable(this.enterpriseAppId);
    }

    /**
     * The login URL specific to this Logz Organization.
     * 
     */
    @Import(name="singleSignOnUrl")
    private @Nullable Output<String> singleSignOnUrl;

    /**
     * @return The login URL specific to this Logz Organization.
     * 
     */
    public Optional<Output<String>> singleSignOnUrl() {
        return Optional.ofNullable(this.singleSignOnUrl);
    }

    private LogzOrganizationPropertiesArgs() {}

    private LogzOrganizationPropertiesArgs(LogzOrganizationPropertiesArgs $) {
        this.companyName = $.companyName;
        this.enterpriseAppId = $.enterpriseAppId;
        this.singleSignOnUrl = $.singleSignOnUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogzOrganizationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogzOrganizationPropertiesArgs $;

        public Builder() {
            $ = new LogzOrganizationPropertiesArgs();
        }

        public Builder(LogzOrganizationPropertiesArgs defaults) {
            $ = new LogzOrganizationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param companyName Name of the Logz organization.
         * 
         * @return builder
         * 
         */
        public Builder companyName(@Nullable Output<String> companyName) {
            $.companyName = companyName;
            return this;
        }

        /**
         * @param companyName Name of the Logz organization.
         * 
         * @return builder
         * 
         */
        public Builder companyName(String companyName) {
            return companyName(Output.of(companyName));
        }

        /**
         * @param enterpriseAppId The Id of the Enterprise App used for Single sign on.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseAppId(@Nullable Output<String> enterpriseAppId) {
            $.enterpriseAppId = enterpriseAppId;
            return this;
        }

        /**
         * @param enterpriseAppId The Id of the Enterprise App used for Single sign on.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseAppId(String enterpriseAppId) {
            return enterpriseAppId(Output.of(enterpriseAppId));
        }

        /**
         * @param singleSignOnUrl The login URL specific to this Logz Organization.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnUrl(@Nullable Output<String> singleSignOnUrl) {
            $.singleSignOnUrl = singleSignOnUrl;
            return this;
        }

        /**
         * @param singleSignOnUrl The login URL specific to this Logz Organization.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnUrl(String singleSignOnUrl) {
            return singleSignOnUrl(Output.of(singleSignOnUrl));
        }

        public LogzOrganizationPropertiesArgs build() {
            return $;
        }
    }

}
