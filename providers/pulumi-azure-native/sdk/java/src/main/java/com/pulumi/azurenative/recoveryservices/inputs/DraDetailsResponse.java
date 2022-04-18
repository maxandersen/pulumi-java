// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * DRA details.
 * 
 */
public final class DraDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DraDetailsResponse Empty = new DraDetailsResponse();

    /**
     * The health of the DRA.
     * 
     */
    @Import(name="health", required=true)
      private final String health;

    public String health() {
        return this.health;
    }

    /**
     * The health errors.
     * 
     */
    @Import(name="healthErrors", required=true)
      private final List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }

    /**
     * The DRA Id.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The last heartbeat received from the DRA.
     * 
     */
    @Import(name="lastHeartbeatUtc", required=true)
      private final String lastHeartbeatUtc;

    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * The DRA name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The DRA version.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    public DraDetailsResponse(
        String health,
        List<HealthErrorResponse> healthErrors,
        String id,
        String lastHeartbeatUtc,
        String name,
        String version) {
        this.health = Objects.requireNonNull(health, "expected parameter 'health' to be non-null");
        this.healthErrors = Objects.requireNonNull(healthErrors, "expected parameter 'healthErrors' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private DraDetailsResponse() {
        this.health = null;
        this.healthErrors = List.of();
        this.id = null;
        this.lastHeartbeatUtc = null;
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DraDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String id;
        private String lastHeartbeatUtc;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DraDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public DraDetailsResponse build() {
            return new DraDetailsResponse(health, healthErrors, id, lastHeartbeatUtc, name, version);
        }
    }
}
