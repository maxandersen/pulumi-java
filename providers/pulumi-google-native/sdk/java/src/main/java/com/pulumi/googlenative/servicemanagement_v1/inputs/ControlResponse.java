// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Selects and configures the service controller used by the service. The service controller handles two things: - **What is allowed:** for each API request, Chemist checks the project status, activation status, abuse status, billing status, service status, location restrictions, VPC Service Controls, SuperQuota, and other policies. - **What has happened:** for each API response, Chemist reports the telemetry data to analytics, auditing, billing, eventing, logging, monitoring, sawmill, and tracing. Chemist also accepts telemetry data not associated with API traffic, such as billing metrics. Example: control: environment: servicecontrol.googleapis.com
 * 
 */
public final class ControlResponse extends com.pulumi.resources.InvokeArgs {

    public static final ControlResponse Empty = new ControlResponse();

    /**
     * The service controller environment to use. If empty, no control plane feature (like quota and billing) will be enabled. The recommended value for most services is servicecontrol.googleapis.com
     * 
     */
    @Import(name="environment", required=true)
      private final String environment;

    public String environment() {
        return this.environment;
    }

    public ControlResponse(String environment) {
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
    }

    private ControlResponse() {
        this.environment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environment;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
        }

        public Builder environment(String environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }        public ControlResponse build() {
            return new ControlResponse(environment);
        }
    }
}
