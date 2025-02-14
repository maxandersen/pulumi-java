// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BatchEndpointResponse {
    /**
     * @return [Required] Inference endpoint authentication mode type
     * 
     */
    private final @Nullable String authMode;
    /**
     * @return Description of the inference endpoint.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return Endpoint URI.
     * 
     */
    private final String scoringUri;
    /**
     * @return Endpoint Swagger URI.
     * 
     */
    private final String swaggerUri;
    /**
     * @return Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    private final @Nullable Map<String,Integer> traffic;

    @CustomType.Constructor
    private BatchEndpointResponse(
        @CustomType.Parameter("authMode") @Nullable String authMode,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("scoringUri") String scoringUri,
        @CustomType.Parameter("swaggerUri") String swaggerUri,
        @CustomType.Parameter("traffic") @Nullable Map<String,Integer> traffic) {
        this.authMode = authMode;
        this.description = description;
        this.properties = properties;
        this.scoringUri = scoringUri;
        this.swaggerUri = swaggerUri;
        this.traffic = traffic;
    }

    /**
     * @return [Required] Inference endpoint authentication mode type
     * 
     */
    public Optional<String> authMode() {
        return Optional.ofNullable(this.authMode);
    }
    /**
     * @return Description of the inference endpoint.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Endpoint URI.
     * 
     */
    public String scoringUri() {
        return this.scoringUri;
    }
    /**
     * @return Endpoint Swagger URI.
     * 
     */
    public String swaggerUri() {
        return this.swaggerUri;
    }
    /**
     * @return Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    public Map<String,Integer> traffic() {
        return this.traffic == null ? Map.of() : this.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authMode;
        private @Nullable String description;
        private @Nullable Map<String,String> properties;
        private String scoringUri;
        private String swaggerUri;
        private @Nullable Map<String,Integer> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMode = defaults.authMode;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.scoringUri = defaults.scoringUri;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.traffic = defaults.traffic;
        }

        public Builder authMode(@Nullable String authMode) {
            this.authMode = authMode;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder scoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }
        public Builder swaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }
        public Builder traffic(@Nullable Map<String,Integer> traffic) {
            this.traffic = traffic;
            return this;
        }        public BatchEndpointResponse build() {
            return new BatchEndpointResponse(authMode, description, properties, scoringUri, swaggerUri, traffic);
        }
    }
}
