// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the health state to alert on and the corresponding severity
 * 
 */
public final class HealthStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final HealthStateResponse Empty = new HealthStateResponse();

    /**
     * Health state name
     * 
     */
    @Import(name="healthStateName", required=true)
      private final String healthStateName;

    public String healthStateName() {
        return this.healthStateName;
    }

    /**
     * Severity of alert fired
     * 
     */
    @Import(name="severity", required=true)
      private final Double severity;

    public Double severity() {
        return this.severity;
    }

    public HealthStateResponse(
        String healthStateName,
        Double severity) {
        this.healthStateName = Objects.requireNonNull(healthStateName, "expected parameter 'healthStateName' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
    }

    private HealthStateResponse() {
        this.healthStateName = null;
        this.severity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String healthStateName;
        private Double severity;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthStateName = defaults.healthStateName;
    	      this.severity = defaults.severity;
        }

        public Builder healthStateName(String healthStateName) {
            this.healthStateName = Objects.requireNonNull(healthStateName);
            return this;
        }
        public Builder severity(Double severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }        public HealthStateResponse build() {
            return new HealthStateResponse(healthStateName, severity);
        }
    }
}
