// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.CollectorBodyAgentSpnPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CollectorAgentPropertiesResponse {
    private final String id;
    private final String lastHeartbeatUtc;
    private final @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails;
    private final String version;

    @CustomType.Constructor
    private CollectorAgentPropertiesResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastHeartbeatUtc") String lastHeartbeatUtc,
        @CustomType.Parameter("spnDetails") @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails,
        @CustomType.Parameter("version") String version) {
        this.id = id;
        this.lastHeartbeatUtc = lastHeartbeatUtc;
        this.spnDetails = spnDetails;
        this.version = version;
    }

    public String id() {
        return this.id;
    }
    public String lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    public Optional<CollectorBodyAgentSpnPropertiesResponse> spnDetails() {
        return Optional.ofNullable(this.spnDetails);
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorAgentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String lastHeartbeatUtc;
        private @Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorAgentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.spnDetails = defaults.spnDetails;
    	      this.version = defaults.version;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }
        public Builder spnDetails(@Nullable CollectorBodyAgentSpnPropertiesResponse spnDetails) {
            this.spnDetails = spnDetails;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public CollectorAgentPropertiesResponse build() {
            return new CollectorAgentPropertiesResponse(id, lastHeartbeatUtc, spnDetails, version);
        }
    }
}
