// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalVpnGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalVpnGatewayArgs Empty = new GetExternalVpnGatewayArgs();

    @Import(name="externalVpnGateway", required=true)
      private final String externalVpnGateway;

    public String externalVpnGateway() {
        return this.externalVpnGateway;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetExternalVpnGatewayArgs(
        String externalVpnGateway,
        @Nullable String project) {
        this.externalVpnGateway = Objects.requireNonNull(externalVpnGateway, "expected parameter 'externalVpnGateway' to be non-null");
        this.project = project;
    }

    private GetExternalVpnGatewayArgs() {
        this.externalVpnGateway = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalVpnGateway;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExternalVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalVpnGateway = defaults.externalVpnGateway;
    	      this.project = defaults.project;
        }

        public Builder externalVpnGateway(String externalVpnGateway) {
            this.externalVpnGateway = Objects.requireNonNull(externalVpnGateway);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetExternalVpnGatewayArgs build() {
            return new GetExternalVpnGatewayArgs(externalVpnGateway, project);
        }
    }
}
