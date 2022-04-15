// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LinkedServiceReferenceResponse {
    /**
     * Arguments for LinkedService.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Reference LinkedService name.
     * 
     */
    private final String referenceName;
    /**
     * Linked service reference type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LinkedServiceReferenceResponse(
        @CustomType.Parameter("parameters") @Nullable Map<String,Object> parameters,
        @CustomType.Parameter("referenceName") String referenceName,
        @CustomType.Parameter("type") String type) {
        this.parameters = parameters;
        this.referenceName = referenceName;
        this.type = type;
    }

    /**
     * Arguments for LinkedService.
     * 
    */
    public Map<String,Object> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Reference LinkedService name.
     * 
    */
    public String referenceName() {
        return this.referenceName;
    }
    /**
     * Linked service reference type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> parameters;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder referenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LinkedServiceReferenceResponse build() {
            return new LinkedServiceReferenceResponse(parameters, referenceName, type);
        }
    }
}
