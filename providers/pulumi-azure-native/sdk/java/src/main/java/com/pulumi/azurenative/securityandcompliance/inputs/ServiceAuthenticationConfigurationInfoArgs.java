// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class ServiceAuthenticationConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAuthenticationConfigurationInfoArgs Empty = new ServiceAuthenticationConfigurationInfoArgs();

    /**
     * The audience url for the service
     * 
     */
    @Import(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> audience() {
        return this.audience == null ? Codegen.empty() : this.audience;
    }

    /**
     * The authority url for the service
     * 
     */
    @Import(name="authority")
      private final @Nullable Output<String> authority;

    public Output<String> authority() {
        return this.authority == null ? Codegen.empty() : this.authority;
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @Import(name="smartProxyEnabled")
      private final @Nullable Output<Boolean> smartProxyEnabled;

    public Output<Boolean> smartProxyEnabled() {
        return this.smartProxyEnabled == null ? Codegen.empty() : this.smartProxyEnabled;
    }

    public ServiceAuthenticationConfigurationInfoArgs(
        @Nullable Output<String> audience,
        @Nullable Output<String> authority,
        @Nullable Output<Boolean> smartProxyEnabled) {
        this.audience = audience;
        this.authority = authority;
        this.smartProxyEnabled = smartProxyEnabled;
    }

    private ServiceAuthenticationConfigurationInfoArgs() {
        this.audience = Codegen.empty();
        this.authority = Codegen.empty();
        this.smartProxyEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuthenticationConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audience;
        private @Nullable Output<String> authority;
        private @Nullable Output<Boolean> smartProxyEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuthenticationConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.smartProxyEnabled = defaults.smartProxyEnabled;
        }

        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }
        public Builder audience(@Nullable String audience) {
            this.audience = Codegen.ofNullable(audience);
            return this;
        }
        public Builder authority(@Nullable Output<String> authority) {
            this.authority = authority;
            return this;
        }
        public Builder authority(@Nullable String authority) {
            this.authority = Codegen.ofNullable(authority);
            return this;
        }
        public Builder smartProxyEnabled(@Nullable Output<Boolean> smartProxyEnabled) {
            this.smartProxyEnabled = smartProxyEnabled;
            return this;
        }
        public Builder smartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            this.smartProxyEnabled = Codegen.ofNullable(smartProxyEnabled);
            return this;
        }        public ServiceAuthenticationConfigurationInfoArgs build() {
            return new ServiceAuthenticationConfigurationInfoArgs(audience, authority, smartProxyEnabled);
        }
    }
}
