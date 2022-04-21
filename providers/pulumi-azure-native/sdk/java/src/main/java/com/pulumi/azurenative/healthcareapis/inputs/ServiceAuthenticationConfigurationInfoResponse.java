// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class ServiceAuthenticationConfigurationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceAuthenticationConfigurationInfoResponse Empty = new ServiceAuthenticationConfigurationInfoResponse();

    /**
     * The audience url for the service
     * 
     */
    @Import(name="audience")
    private @Nullable String audience;

    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * The authority url for the service
     * 
     */
    @Import(name="authority")
    private @Nullable String authority;

    public Optional<String> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @Import(name="smartProxyEnabled")
    private @Nullable Boolean smartProxyEnabled;

    public Optional<Boolean> smartProxyEnabled() {
        return Optional.ofNullable(this.smartProxyEnabled);
    }

    private ServiceAuthenticationConfigurationInfoResponse() {}

    private ServiceAuthenticationConfigurationInfoResponse(ServiceAuthenticationConfigurationInfoResponse $) {
        this.audience = $.audience;
        this.authority = $.authority;
        this.smartProxyEnabled = $.smartProxyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAuthenticationConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAuthenticationConfigurationInfoResponse $;

        public Builder() {
            $ = new ServiceAuthenticationConfigurationInfoResponse();
        }

        public Builder(ServiceAuthenticationConfigurationInfoResponse defaults) {
            $ = new ServiceAuthenticationConfigurationInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder audience(@Nullable String audience) {
            $.audience = audience;
            return this;
        }

        public Builder authority(@Nullable String authority) {
            $.authority = authority;
            return this;
        }

        public Builder smartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            $.smartProxyEnabled = smartProxyEnabled;
            return this;
        }

        public ServiceAuthenticationConfigurationInfoResponse build() {
            return $;
        }
    }

}
