// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServicePrincipalProfile represents a service principal profile.
 * 
 */
public final class ServicePrincipalProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalProfileResponse Empty = new ServicePrincipalProfileResponse();

    /**
     * The client ID used for the cluster (immutable).
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> clientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret used for the cluster (immutable).
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> clientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    public ServicePrincipalProfileResponse(
        @Nullable String clientId,
        @Nullable String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    private ServicePrincipalProfileResponse() {
        this.clientId = null;
        this.clientSecret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }        public ServicePrincipalProfileResponse build() {
            return new ServicePrincipalProfileResponse(clientId, clientSecret);
        }
    }
}
